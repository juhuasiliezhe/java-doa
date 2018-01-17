<#assign base=request.contextPath />
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>测试</title>
<meta name="renderer" content="webkit">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
<link rel="stylesheet" href="${base}/static/layui/dist/css/layui.css" media="all">



<style>
h1,legend {
	color: #888;
}
.layui-form-item{
    margin-left: 12%;
}
</style>

</head>

<body>


	<fieldset class="layui-elem-field layui-field-title"
		style="margin-top: 20px;">
		<legend>修改密码</legend>
	</fieldset>


	<div class="layui-form"  >
		<div class="layui-form-item" >
			<div class="layui-inline" >
				<label class="layui-form-label">重复密码：</label>
				<div class="layui-input-block">
					<input type="password" id="data1"    autocomplete="off"class="layui-input">
				</div>
			</div>
			 
		</div>
		 
		<div class="layui-form-item" >
			<div class="layui-inline" >
				<label class="layui-form-label">新密码：</label>
				<div class="layui-input-block">
					<input type="password" id="data2"    autocomplete="off"class="layui-input">
				</div>
			</div>
			 
		</div>
		<div class="layui-form-item" >
			<div class="layui-inline" >
				<label class="layui-form-label">重复密码：</label>
				<div class="layui-input-block">
					<input type="password" id="data3"    autocomplete="off"class="layui-input">
				</div>
			</div>
			 
		</div>

		 
		
		<div class="layui-form-item">
			<label class="layui-form-label"></label>
			<div class="layui-input-block">
				<button type="button" id="submits" class="layui-btn layui-btn-lg ">提交资料</button>
			</div>
		</div>
		 
		  
	</div>
	<script src="${base}/static/jquery/jQuery-2.2.0.min.js"></script>
	<script src="${base}/static/layui/dist/layui.js" charset="utf-8"></script>
 <script>
 $(function () {


	 layui.use(['form'], function(){
			var form = layui.form;
			form.render();
	});

	 

	postdata();
	
})
function postdata(){ 
$("#submits").click(function(){


	

	var data1=$("#data1").val();
	var data2=$("#data2").val();
	var data3=$("#data3").val();

	if(data1!=""&&data2!=""&&data3!=""){
		if(data2!=data3){
			layer.open({
				id: 'layerDemo1' //防止重复弹出
				,content: '<div style="padding: 20px 100px;">两次新密码不一样</div>'
				,btn: '关闭'
					,btnAlign: 'c' //按钮居中
						,shade: 0 //不显示遮罩
						,yes: function(){
							layer.closeAll();
						}
			});
		}else if(data1==data2){
			layer.open({
				id: 'layo1' //防止重复弹出
				,content: '<div style="padding: 20px 100px;">新密码和旧密码不能相同!</div>'
				,btn: '关闭'
					,btnAlign: 'c' //按钮居中
						,shade: 0 //不显示遮罩
						,yes: function(){
							layer.closeAll();
						}
			});

			
		}else{
			$.post("/duserController/updatepassword.html","data1="+data1+"&data2="+data2+"&data3="+data3,function(data){
				layer.open({
					id: 'layerDemo1'+data.code //防止重复弹出
					,content: '<div style="padding: 20px 100px;">'+ data.code +'</div>'
					,btn: '关闭'
						,btnAlign: 'c' //按钮居中
							,shade: 0 //不显示遮罩
							,yes: function(){
								window.location.href='/duserController/password.html'
							}
				});
				 
			},"JSON") 
		}
	}else{
		layer.open({
			id: 'layerDemo12' //防止重复弹出
			,content: '<div style="padding: 20px 100px;">不能留空值</div>'
			,btn: '关闭'
				,btnAlign: 'c' //按钮居中
					,shade: 0 //不显示遮罩
					,yes: function(){
						layer.closeAll();
					}
		});

	}
	
	
})
}


 </script>
</body>
</html>