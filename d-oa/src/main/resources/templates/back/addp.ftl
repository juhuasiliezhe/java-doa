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


	<h1>添加患者</h1>
	<fieldset class="layui-elem-field layui-field-title"
		style="margin-top: 20px;">
		<legend>基本信息</legend>
	</fieldset>


	<form class="layui-form" action="${base}/back/addPatient" method="post" >
		<div class="layui-form-item">
			<label class="layui-form-label">姓名：</label>
			<div class="layui-input-inline">
				<input type="text" name="name" lay-verify="required"
					placeholder="请输入" autocomplete="off" class="layui-input">
			</div>
		</div>

		<div class="layui-form-item">
			<label class="layui-form-label">性别：</label>
			<div class="layui-input-block">
				<input type="radio" name="sex" value="男" title="男" >
				<input type="radio" name="sex" value="女" title="女"> <input
					type="radio" name="sex" value="未知" title="未知">
			</div>
		</div>

		<div class="layui-form-item" >
			<div class="layui-inline" >
				<label class="layui-form-label">出生日期：</label>
				<div class="layui-input-block">
					<input type="text"  name="birthday"  id="date1" autocomplete="off"class="layui-input">
				</div>
			</div>
			<div class="layui-inline">
				<label class="layui-form-label">年龄：</label>
				<div class="layui-input-inline">
					<input type="text" name="age" id="theage" style="background:#8888882b;" disabled="disabled" autocomplete="off"
						class="layui-input">
				</div>
			</div>
		</div>



		<div class="layui-form-item">
			<label class="layui-form-label">监护人：</label>
			<div class="layui-input-inline">
				<input type="text" name="keeper" lay-verify="required"
					placeholder="请输入" autocomplete="off" class="layui-input">
			</div>
		</div>

		<div class="layui-form-item">
			<label class="layui-form-label">职业：</label>
			<div class="layui-input-inline">
				<input type="text" name="work" lay-verify="required"
					placeholder="请输入" autocomplete="off" class="layui-input">
			</div>
		</div>


		<!-- ================================ -->
		<fieldset class="layui-elem-field layui-field-title"
			style="margin-top: 20px;">
			<legend>患者信息</legend>
		</fieldset>
		
		<div class="layui-form-item">
			<label class="layui-form-label">患者来源：</label>
			<div class="layui-input-block">
				<input type="radio" name="fromwhere" value="朋友介绍 " title="朋友介绍 " >
				<input type="radio" name="fromwhere" value="在附近居住/工作" title="在附近居住/工作"> 
				<input type="radio" name="fromwhere" value="其他" title="其他">
			</div>
		</div>




		<div class="layui-form-item">
			<label class="layui-form-label">备注：</label>
			<div class="layui-input-inline">
			
			<textarea  name="tip"  placeholder="请输入内容" class="layui-textarea"></textarea>
			
				 
			</div>
		</div>

		 
		<div class="layui-form-item">
			<div class="layui-inline">
				<label class="layui-form-label">初诊日期：</label>
				<div class="layui-input-block">
					<input type="text" name="cometime" id="date11" autocomplete="off"
						class="layui-input">
				</div>
			</div>
			 
		</div>
		
		
		<!-- ================================ -->
		<fieldset class="layui-elem-field layui-field-title"
			style="margin-top: 20px;">
			<legend>联系方式</legend>
		</fieldset>
		
		
		<div class="layui-form-item">
			<label class="layui-form-label">手机号码：</label>
			<div class="layui-input-inline">
				<input type="text" name="phone" lay-verify="required"
					placeholder="请输入" autocomplete="off" class="layui-input">
			</div>
		</div>
		 
		 
		 
		
		
		<!-- ================================ -->
		<fieldset class="layui-elem-field layui-field-title"
			style="margin-top: 20px;">
			<legend>健康状况</legend>
		</fieldset>
		
		<div class="layui-form-item">
			<label class="layui-form-label">健康现状：</label>
			<div class="layui-input-block">
				<input type="radio" name="type" value="好" title="好" >
				<input type="radio" name="type" value="一般" title="一般"> <input
					type="radio" name="type" value="差" title="差">
			</div>
		</div>
		
		<div class="layui-form-item">
			<label class="layui-form-label">过敏史：</label>
			<div class="layui-input-inline">
				<input type="text" name="allergy" lay-verify="required"
					placeholder="请输入" autocomplete="off" class="layui-input">
			</div>
		</div>
		<div class="layui-form-item">
			<label class="layui-form-label">心脏病：</label>
			<div class="layui-input-block">
				<input type="checkbox" name="heart"  value="心率不齐" title="心率不齐"> 
				<input type="checkbox" name="heart"  value="冠心病" title="冠心病" >
				 <input type="checkbox" name="heart" value="心肌病"title="心肌病  ">
				 <input type="checkbox" name="heart" value="起搏器" title="起搏器">
			</div>
		</div>
		
		
		<div class="layui-form-item">
			<label class="layui-form-label">高血压病：</label>
			<div class="layui-input-block">
				<input type="checkbox" name="hypertension" lay-skin="switch"
					lay-text="有|无">
			</div>
		</div>
		
		<div class="layui-form-item">
			<label class="layui-form-label">糖尿病 ：</label>
			<div class="layui-input-block">
				<input type="checkbox" name="diabetes" lay-skin="switch"
					lay-text="有|无">
			</div>
		</div>
		
		<div class="layui-form-item">
			<label class="layui-form-label">肾脏病 ：</label>
			<div class="layui-input-block">
				<input type="checkbox" name="kidney" lay-skin="switch"
					lay-text="有|无">
			</div>
		</div>
		
		<div class="layui-form-item">
			<label class="layui-form-label">胃肠溃疡：</label>
			<div class="layui-input-block">
				<input type="checkbox" name="nephropathy" lay-skin="switch"
					lay-text="有|无">
			</div>
		</div>
		
		
		<div class="layui-form-item">
			<label class="layui-form-label">传染病 ：</label>
			<div class="layui-input-block">
				<input type="checkbox" name="infectious" value="流行性腮腺炎" title="流行性腮腺炎 "> 
				<input type="checkbox" name="infectious" value="肝炎"title="肝炎" >
				 <input type="checkbox" name="infectious" value="乙肝表面抗原"title="乙肝表面抗原  ">
				 <input type="checkbox" name="infectious" value="艾滋病"title="艾滋病 ">
				 <input type="checkbox" name="infectious" value="其他"title="其他 ">
			</div>
		</div>
		<div class="layui-form-item">
			<label class="layui-form-label">血液病 ：</label>
			<div class="layui-input-block">
				<input type="checkbox" name="blood" value="血小板减少症炎" title="血小板减少症炎 "> 
				<input type="checkbox" name="blood" value="白血病" title="白血病 " >
				 <input type="checkbox" name="blood" value="再生障碍性贫血" title="再生障碍性贫血">
				 <input type="checkbox" name="blood" value="艾滋病" title="艾滋病 ">
				 <input type="checkbox" name="blood" value="其他" title="其他 ">
			</div>
		</div>
		
		 
		
		<div class="layui-form-item">
			 
			<div class="layui-inline">
				<label class="layui-form-label">是否服用其他药品：</label>
				<div class="layui-input-inline">
					<input type="text" name="otherdrug" autocomplete="off"
						class="layui-input">
				</div>
			</div>
		</div>
		
		
		
		 
		
		<div class="layui-form-item">
			<label class="layui-form-label">口腔麻药反应 ：</label>
			<div class="layui-input-block">
				<input type="radio" name="anesthetic" value="是" title="否" >
				<input type="radio" name="anesthetic" value="否" title="否">  
			</div>
		</div>
		<div class="layui-form-item">
			<label class="layui-form-label">是否有其他重大疾病尚未提到 ：</label>
			<div class="layui-input-block">
				<input type="radio" name="otherdisease" value="是" title="否" >
				<input type="radio" name="otherdisease" value="否" title="否">  
			</div>
		</div>
		
		<div class="layui-form-item">
			<label class="layui-form-label">是否空腹：</label>
			<div class="layui-input-block">
				<input type="radio" name="fasting" value="是" title="否" >
				<input type="radio" name="fasting" value="否" title="否">  
			</div>
		</div>
		<div class="layui-form-item">
			<label class="layui-form-label">是否怀孕：</label>
			<div class="layui-input-block">
				<input type="radio" name="pregnant" value="是" title="否" >
				<input type="radio" name="pregnant" value="否" title="否">  
			</div>
		</div>
		
		<div class="layui-form-item">
			<label class="layui-form-label"></label>
			<div class="layui-input-block">
				<button type="button" class="layui-btn layui-btn-lg submitdata">提交资料</button>
			</div>
		</div>
		 
		  
	</form>
	<script src="${base}/static/jquery/jQuery-2.2.0.min.js"></script>
	<script src="${base}/static/layui/dist/layui.js" charset="utf-8"></script>
	<script src="${base}/static/js/addp.js"></script>
 
</body>
</html>