$(function () {
	layui.use(['table', 'laydate'], function(){
		var table = layui.table;
		var laydate = layui.laydate;
		laydate.render({
		    elem: '#date'
		  });
		  laydate.render({
		    elem: '#date1'
		  });
		tableReload(table);
		tableonthis(table);
		
	});
});

 


function  tableReload(table){
	table.reload('idTest', {
		url: '/dappointmentController/dappointmentbacklisttest',
		method:'post',
		page: true,
		limit:10,
		where: {order:'id asc'}, //设定异步数据接口的额外参数
	});
	 
	
	$(".layui-table-page").css("text-align","center");
}
function tableonsort(table){
	table.on('sort(demo)', function(obj){ //注：tool是工具条事件名，test是table原始容器的属性 lay-filter="对应的值"
		  console.log(obj.field); //当前排序的字段名
		  console.log(obj.type); //当前排序类型：desc（降序）、asc（升序）、null（空对象，默认排序）
		  console.log(this); //当前排序的 th 对象
		  
		  //尽管我们的 table 自带排序功能，但并没有请求服务端。
		  //有些时候，你可能需要根据当前排序的字段，重新向服务端发送请求，从而实现服务端排序，如：
		  table.reload('idTest', {
		    initSort: obj //记录初始排序，如果不设的话，将无法标记表头的排序状态。 layui 2.1.1 新增参数
		    ,where: { //请求参数（注意：这里面的参数可任意定义，并非下面固定的格式）
		      field: obj.field //排序字段
		      ,order: obj.type //排序方式
		    }
		  });
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
}



