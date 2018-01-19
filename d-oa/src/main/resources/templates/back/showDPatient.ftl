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
     margin-top: -8px;
    
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
					<div class="layui-inline">
						<label class="layui-form-label"></label>
						<div class="layui-input-inline">
							<button class="layui-btn"  id="addPat">添加新患者信息</button>
						</div>
						
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
						<th lay-data="{field:'sex', width:'4%'}">性别</th>
						<th lay-data="{field:'fromwhere',width:'8%'}">患者来源</th>
						<th lay-data="{field:'cometime',width:'8%'}">就诊日期</th>
						<th lay-data="{field:'phone', width:'8%', sort: true}">手机号码</th>
						<th lay-data="{field:'uptime', width:'10%', sort: true,templet: '#uptime'}">添加时间</th>
						<th lay-data="{field:'tip', width:'15%', sort: true}">处置项目</th>
						<th lay-data="{field:'telephone', width:'15%', sort: true}">患者类型</th>
						<th style="text-align: center;"
							lay-data="{field:'',event: 'setSign', templet: '#backtype',style:'text-align: center; '}"></th>
					</tr>
				</thead>
			</table>

		</div>



		<div class="thetestt" style="display:none">
			
		</div>



	</div>
	
<script type="text/html" id="uptime">
	{{#  if(d.uptime!=null){ }}
	 {{#  return timeUtils(d.uptime.time)}}
  {{#  }  }}
</script>
	








	<script src="${base}/static/layui/dist/layui.js" charset="utf-8"></script>
	<script src="${base}/static/js/common/common.js" charset="utf-8"></script>
	<script src="${base}/static/js/showDPatient.js"></script>
	<#include "${base}/artTemplet/showDpatientDate.ftl">
	
	<!-- 注意：如果你直接复制所有代码到本地，上述js路径需要改成你本地的 -->
	
	
	<div  class="showAll " style="display:none" >
	</div>
	
	 
	 
	
	
	
	
	
	
	
	
	
	
	


</body>
</html>