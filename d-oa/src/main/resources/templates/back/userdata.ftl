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
		<legend>基本信息</legend>
	</fieldset>


	<form class="layui-form" action="${base}/duserController/update.html" method="post" >
		<div class="layui-form-item">
			<label class="layui-form-label">姓名：</label>
			<div class="layui-input-inline">
				<input type="text" name="name" lay-verify="required"
					 value="${user.name}" autocomplete="off" class="layui-input">
			</div>
		</div>
		 
		<div class="layui-form-item" >
			<div class="layui-inline" >
				<label class="layui-form-label">注册日期：</label>
				<div class="layui-input-block">
					<input type="text" value="${user.uptime}"  disabled="disabled" autocomplete="off"class="layui-input">
				</div>
			</div>
			 
		</div>

		<div class="layui-form-item">
			<label class="layui-form-label">业绩比例：</label>
			<div class="layui-input-inline">
				<input type="text" name="percent" lay-verify="required"
					placeholder="例如：17;则表示17%" value="${user.percent!''}" autocomplete="off" class="layui-input">
			</div>
		</div>

		 
 
		 
		
		<div class="layui-form-item">
			<label class="layui-form-label"></label>
			<div class="layui-input-block">
				<button type="submit" class="layui-btn layui-btn-lg submitdata">提交资料</button>
			</div>
		</div>
		 
		  
	</form>
	<script src="${base}/static/jquery/jQuery-2.2.0.min.js"></script>
	<script src="${base}/static/layui/dist/layui.js" charset="utf-8"></script>
 
</body>
</html>