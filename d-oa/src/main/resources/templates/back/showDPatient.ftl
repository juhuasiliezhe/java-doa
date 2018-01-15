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

<style>
</style>

</head>
<body>
	<div class="layui-row">
		<div class="layui-col-md12">
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

		<div class="layui-form" id="thetestt" style="display:none">
			<div class="layui-layer-title" style="cursor: move;">预约患者姓名:【】</div>


			<div class="layui-form-item" pane="">
				<label class="layui-form-label">预约类型</label>
				<div class="layui-input-block">
					<input type="radio" name="sex" value="初诊" title="初诊" checked="">
					<input type="radio" name="sex" value="复诊" title="复诊"> <input
						type="radio" name="sex" value="不速" title="不速" disabled="">
				</div>
			</div>


			<div class="layui-form-item">
				<div class="layui-inline">
					<label class="layui-form-label">预约日期</label>
					<div class="layui-input-block">
						<input type="text" name="date" placeholder="输入日期" id="date1"
							autocomplete="off" class="layui-input">
					</div>
				</div>
				<div class="layui-inline">
					<label class="layui-form-label">耗时：</label>
					<div class="layui-input-inline">
						<input type="text" name="number" placeholder="输入分钟"
							autocomplete="off" class="layui-input">
					</div>
					<button class="layui-btn">确定时间</button>
				</div>
			</div>
			<div class="layui-form-item">
				<label class="layui-form-label">预约项目</label>
				<div class="layui-input-inline">
					<input type="text" name="username" lay-verify="required"
						placeholder="请输入" autocomplete="off" class="layui-input">
				</div>
			</div>




		</div>



	</div>




	<script type="text/html" id="usernameTpl">
  <a class="layui-table-link" target="_blank">{{ d.name }}</a>
</script>
	<script type="text/html" id="backtype">

  <a class="layui-btn layui-btn-primary layui-btn-xs" onclick="pushApp({{d.id}})" lay-event="detail">预约</a>
  <a class="layui-btn layui-btn-xs" lay-event="edit">查看</a>
  <a class="layui-btn layui-btn-danger layui-btn-xs" lay-event="del">删除</a>
  
</script>

	<script type="text/html" id="barDemo1">
  <a class="layui-btn layui-btn-xs" lay-event="edit">工具性按钮</a>
</script>


	<script src="${base}/static/layui/dist/layui.js" charset="utf-8"></script>
	<script src="${base}/static/js/showDPatient.js"></script>
	<!-- 注意：如果你直接复制所有代码到本地，上述js路径需要改成你本地的 -->


</body>
</html>