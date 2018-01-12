<#assign base=request.contextPath />
<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
  <title>测试</title>
  <meta name="renderer" content="webkit">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
  <link rel="stylesheet" href="${base}/static/layui/dist/css/layui.css"  media="all">
  <style>
  
  </style>
  
</head>
<body>
 <div class="layui-col-md10" style="margin: 4%;">
<table lay-filter="demo" class="layui-table" lay-data="{id: 'idTest'}" >
  <thead>
    <tr>
      <th lay-data="{field:'name', width:'8%', templet: '#usernameTpl'}">姓名</th>
      <th lay-data="{field:'comment', width:'8%'}">预约项目</th>
      <th lay-data="{field:'backcomment',width:'20%'}">回访内容</th>
      <th lay-data="{field:'backresult',width:'20%'}">回访结果</th>
      <th lay-data="{field:'apptime', width:'12%', sort: true}">治疗时间</th>
      <th lay-data="{field:'gettime', width:'12%', sort: true}">结算时间</th>
      <th lay-data="{field:'backtime', width:'8%',}">回访时间</th>
      <th style="text-align: center;" lay-data="{field:'',event: 'setSign', templet: '#backtype',style:'text-align: center;background-color: #009688; color: #fff;'}"></th>
    </tr>
  </thead>
</table>

</div>
<div class="layui-form-item">
    <label class="layui-form-label">单选框</label>
    <div class="layui-input-block">
      <input type="radio" name="sex" value="男" title="男" checked="">
      <input type="radio" name="sex" value="女" title="女">
      <input type="radio" name="sex" value="禁" title="禁用" disabled="">
    </div>
  </div>
 
<script type="text/html" id="usernameTpl">
  <a class="layui-table-link" target="_blank">{{ d.name }}</a>
</script>
<script type="text/html" id="backtype">
  {{#  if(d.backtype === 2){ }}
    已回访
  {{#  } else { }}
   	回访
  {{#  } }}
</script>

<script type="text/html" id="barDemo1">
  <a class="layui-btn layui-btn-xs" lay-event="edit">工具性按钮</a>
</script>
              
          
<script src="${base}/static/layui/dist/layui.js" charset="utf-8"></script>
<!-- 注意：如果你直接复制所有代码到本地，上述js路径需要改成你本地的 -->
<script>
layui.use('table', function(){
  var table = layui.table;
  table.reload('idTest', {
	  url: '/dappointmentController/dappointmentbacklisttest',
	  method:'post',
	  where: {order:'id asc'}, //设定异步数据接口的额外参数
	  //,height: 300
	});

	
  table.on('tool(demo)', function(obj){
	    var data = obj.data;
	    if(obj.event === 'setSign'){

	    	layer.open({
	    		type: 1
	            ,title: false //不显示标题栏
	            ,closeBtn: false
	            ,shade: 0.8
	            ,id: 'LAY_layuipro' //设定一个id，防止重复弹出
	            ,btn: ['火速围观', '残忍拒绝']
	            ,btnAlign: 'c'
	            ,moveType: 1 //拖拽模式，0或者1
	            ,content: '',
            	yes: function(index, layero){
                	alert();
            	    //do something
            	    layer.close(index); //如果设定了yes回调，需进行手工关闭
            	  }
	    	});
		    
		    
	      /* layer.prompt({
	        formType: 3
	        ,title: '回访姓名为 ['+ data.name +'] 的患者'
	        ,value: data.name
	      }, function(value, index){

	        layer.close(index);
	        
	        //这里一般是发送修改的Ajax请求
	        
	        //同步更新表格和缓存对应的值
	        obj.update({
		          sign: value
		        });
	        
	      }); */

	      
	    }
	  });

   
	  
   
});
</script>

</body>
</html>