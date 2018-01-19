$(function () {
	$.ajaxSetup({
		async:false
	})
	
	layui.use(['table', 'laydate'], function(){
		var table = layui.table;
		var laydate = layui.laydate;
		 var datatime=GetDateStr(0)+" - "+GetDateStr(0);
		  laydate.render({
		    elem: '#date1'
		    	,value:datatime
		    	,range: true
		    	,value:datatime
		    	,format: 'yyyy年MM月dd日'
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
	return y+"年"+m+"月"+d+"日"; 
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
	
	
	var data={
		df:1
	}
	ShowDataLoad(data,".balances","jiesuan");
	updateFrom();
	layer.open({
		type: 1
		,title: '结算患者【'+name+"】" //不显示标题栏
		,closeBtn: false
		,shade: 0.8
		,area: ['490px', '380px']
		,id: 'LAY_layuipro' //设定一个id，防止重复弹出
		,btn: ['结算', '取消']
		,btnAlign: 'c'
		,moveType: 1 //拖拽模式，0或者1
		,content:$(".balances")

		,yes: function(index, layero){
			var backtimes=$("#date11").val();
			var getmoney=$("#allmoney").val();
	        var putmoney=$("#subtractmoney").val();
	        var backcomment=$("#backcomment").val();
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
					 $.post("/dappointmentController/addMoneyAppointment","backcomment="+backcomment+"&id="+id+"&getmoney="+getmoney+"&putmoney="+putmoney+"&backtimes="+backtimes,function(data){
						 
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
		,title: '删除预订【'+name+"】" //不显示标题栏
		,closeBtn: false
		,shade: 0.8
		,area: '400px;'
		,id: 'LAY_laydduipro' //设定一个id，防止重复弹出
		,btn: ['确定', '取消']
		,btnAlign: 'c'
		,moveType: 1 //拖拽模式，0或者1
		,content:'<div style="padding: 20px 100px;">确定删除预约信息【'+name+'】吗?</div>'

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

function ShowDataLoad(data, name, temp) {
	var html = template(temp, data);
	$(name).html(html);
}

function updateFrom(){
	var form = layui.form;
	var laydate = layui.laydate;
	form.render();
	   
  laydate.render({
	  elem: '#date11'
  });
  laydate.render({
		elem: '#date21', //需显示日期的元素选择器
		event: 'click', //触发事件
		format: 'yyyy-MM-dd', //日期格式
		istime: false, //是否开启时间选择
		isclear: true, //是否显示清空
		istoday: true, //是否显示今天
		issure: true, //是否显示确认
		festival: true ,//是否显示节日
		fixed: false, //是否固定在可视区域
	});
  laydate.render({
	  elem: '#date31' //需显示日期的元素选择器
	  ,format: 'yyyy-MM-dd HH:mm'//日期格式
		    ,type: 'datetime'
	  
  });
	
}
function findApp(id){
	
	$.post("/dappointmentController/findApp","id="+id,function(data){
		
		 var data={
				 data:data.data
		 };
		 
		ShowDataLoad(data,".balances","balances");
		
		updateFrom();
		addtime();
		$("#backcomment").val(data.data.backcomment);
		
	},"JSON")
	
	
}

function updateApp(id,name){
	$.ajaxSetup({
		async:false
	})
	findApp(id);
	layer.open({
		id: 'layerDemo44',
		title:'修改预约：【'+name+"】"
		,type: 1, 
		shadeClose:true,
		closeBtn: false
		,area: ['600px', '630px']
	,shade: 0.8
	,id: 'LAY_la2345435' //设定一个id，防止重复弹出
		,btn: ['确定修改', '取消']
	,btnAlign: 'c'
		,moveType: 1 //拖拽模式，0或者1
		,content:$(".balances")
		
		,yes: function(index, layero){
			
			
			var type=$(".layui-form-radioed div").html();
			var apptime=$("#endTime").val();
			var comment=$("#thecomments").val();
			var backtimes=$("#date21").val();
			var getmoney=$("#getmoney").val();
			var putmoney=$("#putmoney").val();
			var backcomment=$("#backcomment").val();
			$.post("/dappointmentController/updateApp","id="+id+"&name="+name+"" +
					"&type="+type+"&apptime="+apptime+"" +
							"&comment="+comment+"&backtimes="+backtimes+"&getmoney="+getmoney+"&putmoney" +
									"="+putmoney+"&backcomment="+backcomment,function(data){
				
				layer.open({
					id: 'layerDdfemo'+data.code //防止重复弹出
					,content: '<div style="padding: 20px 100px;">'+ data.code +'</div>'
					,btn: '关闭'
						,btnAlign: 'c' //按钮居中
							,shade: 0 //不显示遮罩
							,yes: function(){
								var table = layui.table;
								tableReload(table)
								layer.closeAll();
							}
				});
				
			},"JSON")
			
			layer.close(index);
			
		}
	});
	
}		

function addtime(){
	$("#addtime").click(function () {

		var starttime=$(".startTime").val();
		var getmin=$(".addme").val();
		if (starttime!=""&&getmin!=""){

			var endtime=judgFailTime(starttime,Number(getmin)).split(" ")[1];
			$("#endTime").val(starttime.split(" ")[0]+" 【"+starttime.split(" ")[1].substring(0,5)+"-"+endtime.substring(0,5)+"】");


		}

	});
	
}


/**
 * 日期加分钟
 */
function judgFailTime(data,minute) {
	var time = new Date(data.replace("-","/"));
	var b = minute; //分钟数
	time.setMinutes(time.getMinutes() + b, time.getSeconds(), 0);
	return dateToString(time)
	//如何将b的分钟数加到上面的时间上？？？？？
}

/**
 * 日期格式转字符串
 * @param now
 * @returns {string}
 */
function dateToString(now){
	var year = now.getFullYear();
	var month =(now.getMonth() + 1).toString();
	var day = (now.getDate()).toString();
	var hour = (now.getHours()).toString();
	var minute = (now.getMinutes()).toString();
	var second = (now.getSeconds()).toString();
	if (month.length == 1) {
		month = "0" + month;
	}
	if (day.length == 1) {
		day = "0" + day;
	}
	if (hour.length == 1) {
		hour = "0" + hour;
	}
	if (minute.length == 1) {
		minute = "0" + minute;
	}
	if (second.length == 1) {
		second = "0" + second;
	}
	var dateTime = year + "-" + month + "-" + day +" "+ hour +":"+minute+":"+second;
	return dateTime;
}



