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
		<div  class="layui-form " style="margin-top: 1%;">
			<div class="layui-form-item">
				<div class="layui-inline">
				
					<label class="layui-form-label">回访日期</label>
					<div class="layui-input-block">
						<input type="text" name="date" id="date1" autocomplete="off"
							class="layui-input">
					</div>
				</div>
				
				<div class="layui-inline">
					<label class="layui-form-label">姓名</label>
					<div class="layui-input-inline">
						<input type="text" id="thename" name="number" autocomplete="off"
							class="layui-input">
					</div>
					<button class="layui-btn" id="querydata">搜索</button>
				</div>
				<div class="layui-inline"  id="whatstatus">
				
					<label class="layui-form-label"></label>
					<div class="layui-input-block">
					<input type="checkbox"checked=""   name="status"  value="1" title="回访"> 
					<input type="checkbox" name="status"     value="2"title="已回访" >
					</div>
				</div>
			</div>
			
			
		</div>

 
		<table lay-filter="demo" class="layui-table" lay-data="{id: 'idTest'}">
			<thead>
				<tr>
					<th lay-data="{type:'checkbox'}"></th>
					<th lay-data="{field:'id', width:'4%', sort: true}">编号</th>
					<th lay-data="{field:'name', width:'8%', templet: '#usernameTpl'}">姓名</th>
					<th lay-data="{field:'comment', width:'8%'}">预约项目</th>
					<th lay-data="{field:'backcomment',width:'20%'}">回访内容</th>
					<th lay-data="{field:'backresult',width:'15%'}">回访结果</th>
					<th lay-data="{field:'apptime', width:'15%', sort: true}">预约时间</th>
					<th lay-data="{field:'gettime', width:'10%', sort: true}">结算时间</th>
					<th lay-data="{field:'backtime', width:'10%', sort: true}">回访时间</th>
					<th style="text-align: center;"lay-data="{field:'',event: 'setSign', templet: '#backtype',style:'text-align: center; '}"></th>
				</tr>
			</thead>
		</table>

	</div>
	</div>




	<script type="text/html" id="usernameTpl">
  <a class="layui-table-link" target="_blank">{{ d.name }}</a>
</script>
	<script type="text/html" id="backtype">
  {{#  if(d.backtype === 2){ }}
   <div style="background-color: #C9C9C9;">已回访</div>
  {{#  } else { }}
   	<a href="javascript:void()"><div style="background:#009688;color: #fff;">回访</div></a>
   	
  {{#  } }}
</script>

	<script type="text/html" id="barDemo1">
  <a class="layui-btn layui-btn-xs" lay-event="edit">工具性按钮</a>
</script>


	<script src="${base}/static/layui/dist/layui.js" charset="utf-8"></script>
	<script src="${base}/static/js/showReturnVisit.js"></script>
	<!-- 注意：如果你直接复制所有代码到本地，上述js路径需要改成你本地的 -->


</body>
</html>