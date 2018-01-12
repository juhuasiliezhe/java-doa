<#assign base=request.contextPath />
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>测试</title>
<meta name="renderer" content="webkit">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport"
	content="width=device-width, initial-scale=1, maximum-scale=1">
<link rel="stylesheet" href="${base}/static/layui/dist/css/layui.css"
	media="all">
<style>
h1,legend {
	color: #888;
}
</style>

</head>

<body>


	<h1>添加患者</h1>
	<fieldset class="layui-elem-field layui-field-title"
		style="margin-top: 20px;">
		<legend>基本信息</legend>
	</fieldset>


	<form class="layui-form" action="">
		<div class="layui-form-item">
			<label class="layui-form-label">姓名：</label>
			<div class="layui-input-inline">
				<input type="text" name="username" lay-verify="required"
					placeholder="请输入" autocomplete="off" class="layui-input">
			</div>
		</div>

		<div class="layui-form-item">
			<label class="layui-form-label">性别：</label>
			<div class="layui-input-block">
				<input type="radio" name="sex" value="男" title="男" checked="">
				<input type="radio" name="sex" value="女" title="女"> <input
					type="radio" name="sex" value="未知" title="未知">
			</div>
		</div>

		<div class="layui-form-item">
			<div class="layui-inline">
				<label class="layui-form-label">出生日期</label>
				<div class="layui-input-block">
					<input type="text" name="date" id="date1" autocomplete="off"
						class="layui-input">
				</div>
			</div>
			<div class="layui-inline">
				<label class="layui-form-label">年龄：</label>
				<div class="layui-input-inline">
					<input type="text" name="number" autocomplete="off"
						class="layui-input">
				</div>
			</div>
		</div>



		<div class="layui-form-item">
			<label class="layui-form-label">监护人：</label>
			<div class="layui-input-inline">
				<input type="text" name="username" lay-verify="required"
					placeholder="请输入" autocomplete="off" class="layui-input">
			</div>
		</div>

		<div class="layui-form-item">
			<label class="layui-form-label">职业：</label>
			<div class="layui-input-inline">
				<input type="text" name="username" lay-verify="required"
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
				<input type="radio" name="wheres" value="朋友介绍 " title="朋友介绍 " checked="">
				<input type="radio" name="wheres" value="在附近居住/工作" title="在附近居住/工作"> <input
					type="radio" name="wheres" value="其他" title="其他">
			</div>
		</div>




		<div class="layui-form-item">
			<label class="layui-form-label">备注：</label>
			<div class="layui-input-block">
				<input type="text" name="title" lay-verify="title"
					autocomplete="off" placeholder="请输入标题" class="layui-input">
			</div>
		</div>
		
		<div class="layui-form-item">
			<div class="layui-inline">
				<label class="layui-form-label">初诊日期：</label>
				<div class="layui-input-block">
					<input type="text" name="date" id="date11" autocomplete="off"
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
				<input type="text" name="username" lay-verify="required"
					placeholder="请输入" autocomplete="off" class="layui-input">
			</div>
		</div>
		<div class="layui-form-item">
			<label class="layui-form-label">电话：</label>
			<div class="layui-input-inline">
				<input type="text" name="username" lay-verify="required"
					placeholder="请输入" autocomplete="off" class="layui-input">
			</div>
		</div>
		<div class="layui-form-item">
			<label class="layui-form-label">邮箱：</label>
			<div class="layui-input-inline">
				<input type="text" name="username" lay-verify="required"
					placeholder="请输入" autocomplete="off" class="layui-input">
			</div>
		</div>
		<div class="layui-form-item">
			<label class="layui-form-label">住址：</label>
			<div class="layui-input-inline">
				<input type="text" name="username" lay-verify="required"
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
				<input type="radio" name="hao" value="好" title="好" checked="">
				<input type="radio" name="hao" value="一般" title="一般"> <input
					type="radio" name="hao" value="差" title="差">
			</div>
		</div>
		
		<div class="layui-form-item">
			<label class="layui-form-label">过敏史：：</label>
			<div class="layui-input-inline">
				<input type="text" name="username" lay-verify="required"
					placeholder="请输入" autocomplete="off" class="layui-input">
			</div>
		</div>
		<div class="layui-form-item">
			<label class="layui-form-label">心脏病：</label>
			<div class="layui-input-block">
				<input type="checkbox" name="like[write]" title="心率不齐"> 
				<input type="checkbox" name="like[read]" title="冠心病" >
				 <input type="checkbox" name="like[game]" title="心肌病  ">
				 <input type="checkbox" name="like[games]" title="起搏器">
			</div>
		</div>
		
		
		<div class="layui-form-item">
			<label class="layui-form-label">高血压病：</label>
			<div class="layui-input-block">
				<input type="checkbox" name="close" lay-skin="switch"
					lay-text="有|无">
			</div>
		</div>
		
		<div class="layui-form-item">
			<label class="layui-form-label">糖尿病 ：</label>
			<div class="layui-input-block">
				<input type="checkbox" name="close" lay-skin="switch"
					lay-text="有|无">
			</div>
		</div>
		
		<div class="layui-form-item">
			<label class="layui-form-label">肾脏病 ：</label>
			<div class="layui-input-block">
				<input type="checkbox" name="close" lay-skin="switch"
					lay-text="有|无">
			</div>
		</div>
		
		<div class="layui-form-item">
			<label class="layui-form-label">胃肠溃疡：</label>
			<div class="layui-input-block">
				<input type="checkbox" name="close" lay-skin="switch"
					lay-text="有|无">
			</div>
		</div>
		
		
		<div class="layui-form-item">
			<label class="layui-form-label">传染病 ：</label>
			<div class="layui-input-block">
				<input type="checkbox" name="like1[write]" title="流行性腮腺炎 "> 
				<input type="checkbox" name="like1[read]" title="肝炎" >
				 <input type="checkbox" name="like1[game]" title="乙肝表面抗原  ">
				 <input type="checkbox" name="like1[games]" title="艾滋病 ">
				 <input type="checkbox" name="like1[gamess]" title="其他 ">
			</div>
		</div>
		<div class="layui-form-item">
			<label class="layui-form-label">血液病 ：</label>
			<div class="layui-input-block">
				<input type="checkbox" name="like11[write]" title="血小板减少症炎 "> 
				<input type="checkbox" name="like11[read]" title="白血病 " >
				 <input type="checkbox" name="like11[game]" title="再生障碍性贫血">
				 <input type="checkbox" name="like11[games]" title="艾滋病 ">
				 <input type="checkbox" name="like11[gamess]" title="其他 ">
			</div>
		</div>
		
		
		<div class="layui-form-item">
			<label class="layui-form-label">服用小剂量阿司匹林：</label>
			<div class="layui-input-block">
				<input type="checkbox" name="close" lay-skin="switch"
					lay-text="有|无">
			</div>
		</div>
		<div class="layui-form-item layui-form-text">
			<label class="layui-form-label"></label>
			<div class="layui-input-block">
				<textarea placeholder="请输入原因" class="layui-textarea"></textarea>
			</div>
		</div>
		<div class="layui-form-item">
			<label class="layui-form-label">是否服用其他药品 ：</label>
			<div class="layui-input-block">
				<input type="checkbox" name="close" lay-skin="switch"
					lay-text="有|无">
			</div>
		</div>
		<div class="layui-form-item layui-form-text">
			<label class="layui-form-label"></label>
			<div class="layui-input-block">
				<textarea placeholder="请输入原因" class="layui-textarea"></textarea>
			</div>
		</div>
		
		<div class="layui-form-item">
			<label class="layui-form-label">口腔麻药反应 ：</label>
			<div class="layui-input-block">
				<input type="radio" name="sex1" value="是" title="否" checked="">
				<input type="radio" name="sex1" value="是" title="否">  
			</div>
		</div>
		<div class="layui-form-item">
			<label class="layui-form-label">是否有其他重大疾病尚未提到 ：</label>
			<div class="layui-input-block">
				<input type="radio" name="sex12" value="是" title="否" checked="">
				<input type="radio" name="sex12" value="是" title="否">  
			</div>
		</div>
		
		<div class="layui-form-item">
			<label class="layui-form-label">是否空腹：</label>
			<div class="layui-input-block">
				<input type="radio" name="sex14" value="是" title="否" checked="">
				<input type="radio" name="sex14" value="是" title="否">  
			</div>
		</div>
		<div class="layui-form-item">
			<label class="layui-form-label">是否正怀孕：</label>
			<div class="layui-input-block">
				<input type="radio" name="sex144" value="是" title="否" checked="">
				<input type="radio" name="sex144" value="是" title="否">  
			</div>
		</div>
		 
		  
	</form>

	<script src="${base}/static/layui/dist/layui.js" charset="utf-8"></script>
	<!-- 注意：如果你直接复制所有代码到本地，上述js路径需要改成你本地的 -->
	<script>
layui.use(['form', 'layedit', 'laydate'], function(){
  var form = layui.form
  ,layer = layui.layer
  ,layedit = layui.layedit
  ,laydate = layui.laydate;
  
  //日期
  laydate.render({
    elem: '#date'
  });
  laydate.render({
    elem: '#date1'
  });
  laydate.render({
    elem: '#date11'
  });
  
  //创建一个编辑器
  var editIndex = layedit.build('LAY_demo_editor');
 
  //自定义验证规则
  form.verify({
    title: function(value){
      if(value.length < 5){
        return '标题至少得5个字符啊';
      }
    }
    ,pass: [/(.+){6,12}$/, '密码必须6到12位']
    ,content: function(value){
      layedit.sync(editIndex);
    }
  });
  
  //监听指定开关
  form.on('switch(switchTest)', function(data){
    layer.msg('开关checked：'+ (this.checked ? 'true' : 'false'), {
      offset: '6px'
    });
    layer.tips('温馨提示：请注意开关状态的文字可以随意定义，而不仅仅是ON|OFF', data.othis)
  });
  
  //监听提交
  form.on('submit(demo1)', function(data){
    layer.alert(JSON.stringify(data.field), {
      title: '最终的提交信息'
    })
    return false;
  });
  
  
});
</script>

</body>
</html>