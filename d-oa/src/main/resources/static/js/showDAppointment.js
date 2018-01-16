$(function () {
	
	layui.use(['table', 'laydate'], function(){
		var table = layui.table;
		var laydate = layui.laydate;
		 
		  laydate.render({
		    elem: '#date1'
		    	,value:GetDateStr(0)
		  });
		  laydate.render({
			  elem: '#date11'
		  });

		tableReload(table);
		tableonthis(table);
		statusGet();
		
	});
	
});
/**
 * 获取日期
 * @param AddDayCount
 * @returns {String}
 */
function GetDateStr(AddDayCount) { 
	var dd = new Date(); 
	dd.setDate(dd.getDate()+AddDayCount);//获取AddDayCount天后的日期 
	var y = dd.getFullYear(); 
	var m = dd.getMonth()+1;//获取当前月份的日期 
	
	
	var d = dd.getDate(); 
	if(m<10){
		m="0"+m;
	}
	if(d<10){
		d="0"+d;
	}
	return y+"-"+m+"-"+d; 
} 

 
function statusGet(){
	$("#whatstatus").click(function(){
		var table = layui.table;
		tableReload(table)
	})
	 
	$("#querydata").click(function(){
		var table = layui.table;
		tableReload(table)
	})
	
	
}

function  tableReload(table){
	$.ajaxSetup({
		async:false
	})
	var dfdf=null;
	var times=$("#date1").val();
	var thename=$("#thename").val();
	
	var event=$(".layui-form-checked span").text();
	
	if(event=="待结算"){
		dfdf='1';
	}else if(event=="已结算"){
		dfdf='2';
	}else{
		dfdf='1,2';
	}
	table.reload('idTest', {
		initSort: {
		    field: 'id' //排序字段，对应 cols 设定的各字段名
		    ,type: 'desc' //排序方式  asc: 升序、desc: 降序、null: 默认排序
		  },
		url: '/dappointmentController/dappointmentlist',
		method:'post',
		page: true,
		limit:10,
		where: {order:'id desc',status:dfdf,times:times,name:thename}, //设定异步数据接口的额外参数
	});
}
function balances(id,name){
	$.ajaxSetup({
		async:false
	})

	layer.open({
		type: 1
		,title: '结算患者【'+name+"】" //不显示标题栏
		,closeBtn: false
		,shade: 0.8
		,area: '400px;'
		,id: 'LAY_layuipro' //设定一个id，防止重复弹出
		,btn: ['结算', '取消']
		,btnAlign: 'c'
		,moveType: 1 //拖拽模式，0或者1
		,content:$(".balances")

		,yes: function(index, layero){
			var backtime=$("#date11").val();
			var getmoney=$("#allmoney").val();
	        var putmoney=$("#subtractmoney").val();
	        if (getmoney==""){
	            return;
	        }
			layer.open({
				type: 1
				,title: '提醒~' //不显示标题栏
				,closeBtn: false
				,shade: 0.8
				,area: '400px;'
				,id: 'LAY_l' //设定一个id，防止重复弹出
				,btn: ['确定结算', '取消']
				,btnAlign: 'c'
				,moveType: 1 //拖拽模式，0或者1
				,content:'<div style="padding: 20px 100px;">确定结算吗？</div>'
				,yes: function(index){
					 $.post("/dappointmentController/addMoneyAppointment","id="+id+"&getmoney="+getmoney+"&putmoney="+putmoney+"&backtime="+backtime,function(data){
						 
						 layer.open({
								id: 'layerDemo1'+data.code //防止重复弹出
								,content: '<div style="padding: 20px 100px;">'+ data.code +'</div>'
								,btn: '关闭'
									,btnAlign: 'c' //按钮居中
										,shade: 0 //不显示遮罩
										,yes: function(){
											var table = layui.table;
											tableReload(table);
											layer.closeAll();
										}
							});
						 
				       },"JSON")
					 
					layer.close(index);
				}
			});
			

		}
	});
}

function delappointemt(id,name){
	$.ajaxSetup({
		async:false
	})

	layer.open({
		type: 1
		,title: '取消预订【'+name+"】" //不显示标题栏
		,closeBtn: false
		,shade: 0.8
		,area: '400px;'
		,id: 'LAY_laydduipro' //设定一个id，防止重复弹出
		,btn: ['结算', '取消']
		,btnAlign: 'c'
		,moveType: 1 //拖拽模式，0或者1
		,content:'<div style="padding: 20px 100px;">确定取消预约信息【'+name+'】吗?</div>'

		,yes: function(index, layero){
			$.post("/dappointmentController/downMoneyAppointment","id="+id,function(data){
				 layer.open({
						id: 'layerDedmo1'+data.code //防止重复弹出
						,content: '<div style="padding: 20px 100px;">'+ data.code +'</div>'
						,btn: '关闭'
							,btnAlign: 'c' //按钮居中
								,shade: 0 //不显示遮罩
								,yes: function(){
									var table = layui.table;
									tableReload(table);
									layer.closeAll();
								}
					});
				
			},"JSON")
			
			 
			

		}
	});
	
	
	
	
	
	
}

function tableonthis(table){
	table.on('tool(demo)', function(obj){
		var data = obj.data;
		if(obj.event === 'setSign'){
			if(data.backtype!=2){
				layer.open({
					
					type: 1
					,title: false //不显示标题栏
					,closeBtn: false
					,area: ['490px', '400px']
					,shade: 0.8
					,id: 'LAY_layuipro' //设定一个id，防止重复弹出
					,btn: ['完成回访', '取消回访']
					,btnAlign: 'c'
					,moveType: 1 //拖拽模式，0或者1
					,width: 892
					,content: '<div class="layui-form"   ><div class="layui-layer-title" style="cursor: move;">回访患者姓名:【'+data.name+'】</div><div class="layui-form-item layui-form-text" style="margin-top: 10px;"><label class="layui-form-label">回访内容</label><div class="layui-input-block"><textarea  placeholder="请输入内容" style="width:80%;" class="layui-textarea backcomment"></textarea></div></div><div class="layui-form-item layui-form-text"><label class="layui-form-label">回访结果</label><div class="layui-input-block"><textarea placeholder="请输入内容"  style="width:80%;" class="layui-textarea backresult"></textarea></div></div>	            	   </div>',
					yes: function(index, layero){
						var backcomment=$(".backcomment").val();
						var backresult=$(".backresult").val();

						$.post("/dappointmentController/addbackComment","id="+data.id+"&backcomment="+backcomment+"&backresult="+backresult,function(data){
							layer.open({
								id: 'layerDemo'+data.code //防止重复弹出
								,content: '<div style="padding: 20px 100px;">'+ data.code +'</div>'
								,btn: '关闭'
									,btnAlign: 'c' //按钮居中
										,shade: 0 //不显示遮罩
										,yes: function(){
											layer.closeAll();
										}
							});

							tableReload(table);


						},"JSON")
						layer.close(index); 
					}
				});
			}
		}
	});
	
	
	table.on('sort(demo)', function(obj){ //注：tool是工具条事件名，test是table原始容器的属性 lay-filter="对应的值"
		  console.log(obj.field); //当前排序的字段名
		  console.log(obj.type); //当前排序类型：desc（降序）、asc（升序）、null（空对象，默认排序）
		  console.log(this); //当前排序的 th 对象
		  
		  //尽管我们的 table 自带排序功能，但并没有请求服务端。
		  //有些时候，你可能需要根据当前排序的字段，重新向服务端发送请求，从而实现服务端排序，如：
		  table.reload('idTest', {
		    initSort: obj //记录初始排序，如果不设的话，将无法标记表头的排序状态。 layui 2.1.1 新增参数
		    ,where: { //请求参数（注意：这里面的参数可任意定义，并非下面固定的格式）
		      order:obj.field+" "+obj.type //排序方式
		    }
		  });
		});
}



