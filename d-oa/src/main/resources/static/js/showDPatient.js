$(function () {
	
	layui.use(['table', 'laydate'], function(){
		var table = layui.table;
		var laydate = layui.laydate;
		laydate.render({
		    elem: '#date'
		  });
		  laydate.render({
		    elem: '#date1'
		    ,type: 'datetime'
		  });
		tableReload(table);
		tableonthis(table);
		statusGet();
		
	});
});

 
function statusGet(){
	 
	$("#querydata").click(function(){
		var table = layui.table;
		tableReload(table)
	})
	
	
}

function  tableReload(table){
	$.ajaxSetup({
		async:false
	})
	var dfdf='0';
	var times=$("#date1").val();
	var thename=$("#thename").val();
	
	var event=$(".layui-form-checked span").text();
	if(event.length==3){
		dfdf='2';
	}else if(event.length==5){
		dfdf='0,2';
	}else if(event.length==2){
		dfdf='0';
	}
	table.reload('idTest', {
		initSort: {
		    field: 'id' //排序字段，对应 cols 设定的各字段名
		    ,type: 'desc' //排序方式  asc: 升序、desc: 降序、null: 默认排序
		  },
		url: '/back/showPatient',
		method:'post',
		page: true,
		limit:10,
		where: {order:'id desc',status:dfdf,times:times,name:thename}, //设定异步数据接口的额外参数
	});
}

function pushApp(id){
	$.ajaxSetup({
		async:false
	})
	
	

    layer.open({
       content:  $("#thetestt")
      
      ,yes: function(){
        layer.closeAll();
      }
    });
	
}			 
function tableonthis(table){
	
	
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



