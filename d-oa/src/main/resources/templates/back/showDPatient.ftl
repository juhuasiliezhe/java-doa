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
<script src="${base}/static/jquery/jQuery-2.2.0.min.js"></script>
<script src="${base}/static/jquery/artTemp.js"></script>

<style>
h1,legend {
	color: #888;
}
.layui-form-item11{
    margin-left: 12%;
}
</style>

</head>
<body>
	<div class="layui-row">
		<div class="layui-col-md12">
		
		
		<fieldset class="layui-elem-field layui-field-title"style="margin-top: 20px;">
		<legend>患者资料</legend>
		</fieldset>
			<div class="layui-form " style="margin-top: 1%;">
				<div class="layui-form-item">


					<div class="layui-inline">
						<label class="layui-form-label">姓名</label>
						<div class="layui-input-inline">
							<input type="text" id="thename" name="number" autocomplete="off"
								class="layui-input">
						</div>
						<button class="layui-btn" id="querydata">搜索</button>
					</div>

				</div>


			</div>


			<table lay-filter="demo" class="layui-table"
				lay-data="{id: 'idTest'}">
				<thead>
					<tr>
						<th lay-data="{type:'checkbox'}"></th>
						<th lay-data="{field:'id', width:'4%', sort: true}">编号</th>
						<th lay-data="{field:'name', width:'8%', templet: '#usernameTpl'}">姓名</th>
						<th lay-data="{field:'sex', width:'8%'}">性别</th>
						<th lay-data="{field:'fromwhere',width:'8%'}">患者来源</th>
						<th lay-data="{field:'cometime',width:'10%'}">初诊日期</th>
						<th lay-data="{field:'phone', width:'10%', sort: true}">手机号码</th>
						<th lay-data="{field:'uptime', width:'10%', sort: true}">添加时间</th>
						<th lay-data="{field:'tip', width:'20%', sort: true}">备注</th>
						<th style="text-align: center;"
							lay-data="{field:'',event: 'setSign', templet: '#backtype',style:'text-align: center; '}"></th>
					</tr>
				</thead>
			</table>

		</div>



		<div class="thetestt" style="display:none">
			<div class="layui-form ">
				<div class="layui-form-item" lay-filter="test2">
					<label class="layui-form-label">预约类型</label>
					<div class="layui-input-block">
						<input type="radio" name="typea" value="初诊" title="初诊"> <input
							type="radio" name="typea" value="复诊" title="复诊"> <input
							type="radio" name="typea" value="不速" title="不速">
					</div>
				</div>

				<div class="layui-form-item">
					<div class="layui-inline">
						<label class="layui-form-label">预约日期：</label>
						<div class="layui-input-block">
							<input type="text" name="date" placeholder="" id="date1"
								style="width: 190px;" autocomplete="off"
								class="layui-input startTime">
						</div>
					</div>
					<div class="layui-inline">
						<label class="layui-form-label">耗时：</label>
						<div class="layui-input-inline">
							<input type="text" name="number" placeholder="输入分钟"
								autocomplete="off" class="layui-input addme">
						</div>
						<button class="layui-btn" id="addtime">确定时间</button>
					</div>
				</div>

				<div class="layui-form-item">
					<label class="layui-form-label">预约时间：</label>
					<div class="layui-input-block">
						<input type="text" name="title" style="width: 293px;" id="endTime"
							disabled="disabled" name="endTime" lay-verify="title"
							autocomplete="off" class="layui-input">
					</div>
				</div>

				<div class="layui-form-item">
					<label class="layui-form-label">预约项目</label>
					<div class="layui-input-inline">
						<input type="text" name="thecomment" id="thecomment" lay-verify="required"
							placeholder="请输入项目" style="width: 293px;" autocomplete="off"
							class="layui-input">
					</div>
				</div>
			</div>
		</div>



	</div>
	





<script type="text/html" id="usernameTpl">
  <a class="layui-table-link" target="_blank">{{ d.name }}</a>
</script>

<script type="text/html" id="backtype">
  <a class="layui-btn  layui-btn-sm" onclick="pushApp({{d.id}},'{{d.name}}')" lay-event="detail">预约</a>
  <a class="layui-btn layui-btn-normal layui-btn-sm" lay-event="edit" onclick="showApp({{d.id}},'{{d.name}}')">查看</a>
  <a class="layui-btn layui-btn-danger layui-btn-sm" onclick="delApp({{d.id}},'{{d.name}}')" lay-event="del">删除</a>
</script>

	<script type="text/html" id="barDemo1">
  <a class="layui-btn layui-btn-xs" lay-event="edit">工具性按钮</a>
</script>


	<script src="${base}/static/layui/dist/layui.js" charset="utf-8"></script>
	<script src="${base}/static/js/showDPatient.js"></script>
	
	<!-- 注意：如果你直接复制所有代码到本地，上述js路径需要改成你本地的 -->
	
	
	<div  class="showAll" style="display:none" >
	</div>
	
	<script id="artListComment" type="text/html" >
	<form class="layui-form"   action="/back/updatePatient" method="post"  >
	<input type="hidden" value=<$=data.id$> name="id">
	<!-- 查询详情 -->
	 <fieldset class="layui-elem-field layui-field-title"
		style="margin-top: 20px;">
		<legend>基本信息</legend>
	</fieldset>
		<div class="layui-form-item layui-form-item11">
			<label class="layui-form-label">姓名：</label>
			<div class="layui-input-inline">
				<input type="text" name="name" lay-verify="required" value="<$=data.name$>"
					placeholder="请输入" autocomplete="off" class="layui-input">
			</div>
		</div>

		<div class="layui-form-item layui-form-item11">
			<label class="layui-form-label">性别：</label>
			<div class="layui-input-block">

				
				<input type="radio"<$if(data.sex=='男'){$> checked="" <$}$> name="sex" value="男" title="男" >
				<input type="radio" <$if(data.sex=='女'){$> checked="" <$}$> name="sex" value="女" title="女"> <input
					type="radio"<$if(data.sex=='未知'){$> checked="" <$}$> name="sex" value="未知" title="未知">
			</div>
		</div>

		<div class="layui-form-item layui-form-item11" >
			<div class="layui-inline" >
				<label class="layui-form-label">出生日期：</label>
				<div class="layui-input-block">
					<input type="text"  name="birthday" value="<$=data.birthday$>"  id="date11" autocomplete="off"class="layui-input">
				</div>
			</div>
			<div class="layui-inline">
				<label class="layui-form-label">年龄：</label>
				<div class="layui-input-inline">
					<input type="text" name="age" value="<$=data.age$>"  id="theage" style="background:#8888882b;" disabled="disabled" autocomplete="off"
						class="layui-input">
				</div>
			</div>
		</div>



		<div class="layui-form-item layui-form-item11">
			<label class="layui-form-label">监护人：</label>
			<div class="layui-input-inline">
				<input type="text" name="keeper" lay-verify="required"
					placeholder="请输入"  value="<$=data.keeper$>" autocomplete="off" class="layui-input">
			</div>
		</div>

		<div class="layui-form-item layui-form-item11">
			<label class="layui-form-label">职业：</label>
			<div class="layui-input-inline">
				<input type="text" name="work" lay-verify="required"
					placeholder="请输入" value="<$=data.work$>" autocomplete="off" class="layui-input">
			</div>
		</div>


		
		<fieldset class="layui-elem-field layui-field-title"
			style="margin-top: 20px;">
			<legend>患者信息</legend>
		</fieldset>
		
		<div class="layui-form-item layui-form-item11">
			<label class="layui-form-label">患者来源：</label>
			<div class="layui-input-block">
				<input type="radio" name="fromwhere" <$if(data.fromwhere=='朋友介绍'){$> checked="" <$}$> value="朋友介绍 " title="朋友介绍 " >
				<input type="radio" name="fromwhere" <$if(data.fromwhere=='在附近居住/工作'){$> checked="" <$}$> value="在附近居住/工作" title="在附近居住/工作"> 
				<input type="radio" name="fromwhere" <$if(data.fromwhere=='其他'){$> checked="" <$}$> value="其他" title="其他">
			</div>
		</div>




		 <div class="layui-form-item layui-form-text layui-form-item11">
    <label class="layui-form-label">备注：</label>
    <div class="layui-input-block">
<input type="text"  name="tip" value="<$=data.tip$>"  lay-verify="required"
					placeholder="请输入" autocomplete="off" class="layui-input">
    </div>
  </div>

		 



		 
		<div class="layui-form-item layui-form-item11">
			<div class="layui-inline">
				<label class="layui-form-label">初诊日期：</label>
				<div class="layui-input-block">
					<input type="text" name="cometime" value="<$=data.cometime$>"  id="date12" autocomplete="off"
						class="layui-input">
				</div>
			</div>
			 
		</div>
		
		
		
		
		
		<fieldset class="layui-elem-field layui-field-title"
			style="margin-top: 20px;">
			<legend>联系方式</legend>
		</fieldset>
		
		
		<div class="layui-form-item layui-form-item11">
			<label class="layui-form-label">手机号码：</label>
			<div class="layui-input-inline">
				<input type="text" name="phone" value="<$=data.phone$>"  lay-verify="required"
					placeholder="请输入" autocomplete="off" class="layui-input">
			</div>
		</div>
		 
		 
		 
		
		
		
		<fieldset class="layui-elem-field layui-field-title"
			style="margin-top: 20px;">
			<legend>健康状况</legend>
		</fieldset>
		
		<div class="layui-form-item layui-form-item11">
			<label class="layui-form-label">健康现状：</label>
			<div class="layui-input-block">
				<input type="radio" name="type" <$if(data.type=='好'){$> checked="" <$}$> value="好" title="好" >
				<input type="radio" name="type" <$if(data.type=='一般'){$> checked="" <$}$> value="一般" title="一般"> <input
					type="radio" name="type"  <$if(data.type=='差'){$> checked="" <$}$> value="差" title="差">
			</div>
		</div>
		
		<div class="layui-form-item layui-form-item11">
			<label class="layui-form-label">过敏史：</label>
			<div class="layui-input-inline">
				<input type="text" name="allergy" lay-verify="required"
					placeholder="请输入" value="<$=data.allergy$>" autocomplete="off" class="layui-input">
			</div>
		</div>
		<div class="layui-form-item layui-form-item11">
			<label class="layui-form-label">心脏病：</label>
			<div class="layui-input-block">
				<input type="checkbox" name="heart" <$if(data.heart.indexOf('心率不齐')>-1){$> checked="" <$}$> value="心率不齐" title="心率不齐"> 
				<input type="checkbox" name="heart" <$if(data.heart.indexOf('冠心病')>-1){$> checked="" <$}$>  value="冠心病" title="冠心病" >
				 <input type="checkbox" name="heart"<$if(data.heart.indexOf('心肌病')>-1){$> checked="" <$}$>  value="心肌病"title="心肌病  ">
				 <input type="checkbox" name="heart"<$if(data.heart.indexOf('起搏器')>-1){$> checked="" <$}$>  value="起搏器" title="起搏器">
			</div>
		</div>
		
		
		<div class="layui-form-item layui-form-item11">
			<label class="layui-form-label">高血压病：</label>
			<div class="layui-input-block">
				<input type="checkbox" <$if(data.hypertension=='on'){$> checked="" <$}$> name="hypertension" lay-skin="switch"
					lay-text="有|无">
			</div>
		</div>
		
		<div class="layui-form-item layui-form-item11">
			<label class="layui-form-label">糖尿病 ：</label>
			<div class="layui-input-block">
				<input type="checkbox" <$if(data.diabetes=='on'){$> checked="" <$}$>  name="diabetes" lay-skin="switch"
					lay-text="有|无">
			</div>
		</div>
		
		<div class="layui-form-item layui-form-item11">
			<label class="layui-form-label">肾脏病 ：</label>
			<div class="layui-input-block">
				<input type="checkbox" <$if(data.kidney=='on'){$> checked="" <$}$>  name="kidney" lay-skin="switch"
					lay-text="有|无">
			</div>
		</div>
		
		<div class="layui-form-item layui-form-item11">
			<label class="layui-form-label">胃肠溃疡：</label>
			<div class="layui-input-block">
				<input type="checkbox"  <$if(data.nephropathy=='on'){$> checked="" <$}$>  name="nephropathy" lay-skin="switch"
					lay-text="有|无">
			</div>
		</div>
		
		
		<div class="layui-form-item layui-form-item11">
			<label class="layui-form-label">传染病 ：</label>
			<div class="layui-input-block">
				<input type="checkbox" name="infectious" <$if(data.infectious.indexOf('流行性腮腺炎')>-1){$> checked="" <$}$> value="流行性腮腺炎" title="流行性腮腺炎 "> 
				<input type="checkbox" name="infectious" <$if(data.infectious.indexOf('肝炎')>-1){$> checked="" <$}$>  value="肝炎"title="肝炎" >
				 <input type="checkbox" name="infectious" <$if(data.infectious.indexOf('乙肝表面抗原')>-1){$> checked="" <$}$>  value="乙肝表面抗原"title="乙肝表面抗原  ">
				 <input type="checkbox" name="infectious" <$if(data.infectious.indexOf('艾滋病')>-1){$> checked="" <$}$>  value="艾滋病"title="艾滋病 ">
				 <input type="checkbox" name="infectious" <$if(data.infectious.indexOf('其他')>-1){$> checked="" <$}$>  value="其他"title="其他 ">
			</div>
		</div>
		<div class="layui-form-item layui-form-item11">
			<label class="layui-form-label">血液病 ：</label>
			<div class="layui-input-block">
				<input type="checkbox" name="blood" <$if(data.blood.indexOf('血小板减少症炎')>-1){$> checked="" <$}$>  value="血小板减少症炎" title="血小板减少症炎 "> 
				<input type="checkbox" name="blood" <$if(data.blood.indexOf('白血病')>-1){$> checked="" <$}$>  value="白血病" title="白血病 " >
				 <input type="checkbox" name="blood" <$if(data.blood.indexOf('再生障碍性贫血')>-1){$> checked="" <$}$>  value="再生障碍性贫血" title="再生障碍性贫血">
				 <input type="checkbox" name="blood" <$if(data.blood.indexOf('艾滋病')>-1){$> checked="" <$}$>  value="艾滋病" title="艾滋病 ">
				 <input type="checkbox" name="blood" <$if(data.blood.indexOf('其他')>-1){$> checked="" <$}$>  value="其他" title="其他 ">
			</div>
		</div>
		
		 
		
		<div class="layui-form-item layui-form-item11">
			 
			<div class="layui-inline">
				<label class="layui-form-label">是否服用其他药品 ：</label>
				<div class="layui-input-inline">
					<input type="text" name="otherdrug" value="<$=data.otherdrug$>" autocomplete="off"
						class="layui-input">
				</div>
			</div>
		</div>
		
		
		
		 
		
		<div class="layui-form-item layui-form-item11">
			<label class="layui-form-label">口腔麻药反应 ：</label>
			<div class="layui-input-block">
				<input type="radio" name="anesthetic"<$if(data.anesthetic=='是'){$> checked="" <$}$> value="是" title="否" >
				<input type="radio" name="anesthetic"<$if(data.anesthetic=='否'){$> checked="" <$}$> value="否" title="否">  
			</div>
		</div>
		<div class="layui-form-item layui-form-item11">
			<label class="layui-form-label">是否有其他重大疾病尚未提到 ：</label>
			<div class="layui-input-block">
				<input type="radio" name="otherdisease" <$if(data.otherdisease=='是'){$> checked="" <$}$> value="是" title="否" >
				<input type="radio" name="otherdisease" <$if(data.otherdisease=='否'){$> checked="" <$}$> value="否" title="否">  
			</div>
		</div>
		
		<div class="layui-form-item layui-form-item11">
			<label class="layui-form-label">是否空腹：</label>
			<div class="layui-input-block">
				<input type="radio" name="fasting" <$if(data.fasting=='是'){$> checked="" <$}$> value="是" title="否" >
				<input type="radio" name="fasting" <$if(data.fasting=='否'){$> checked="" <$}$> value="否" title="否">  
			</div>
		</div>
		<div class="layui-form-item layui-form-item11">
			<label class="layui-form-label">是否怀孕：</label>
			<div class="layui-input-block">
				<input type="radio" name="pregnant" <$if(data.pregnant=='是'){$> checked="" <$}$> value="是" title="否" >
				<input type="radio" name="pregnant" <$if(data.pregnant=='否'){$> checked="" <$}$> value="否" title="否">  
			</div>
		</div>
		  
	</form>
		 

</script>	
	
	
	
	
	
	
	
	
	


</body>
</html>