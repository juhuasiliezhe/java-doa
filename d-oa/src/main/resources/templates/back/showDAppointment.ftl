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

 
</head>
<body>
	<div class="layui-row">
		<div class="layui-col-md12">
		<fieldset class="layui-elem-field layui-field-title"
		style="margin-top: 20px;">
		<legend style="color: #888;">今日预约</legend>
		</fieldset>
			<div class="layui-form " style="margin-top: 1%;">
				<div class="layui-form-item">
					<div class="layui-inline">

						<label class="layui-form-label">日期</label>
						<div class="layui-input-block">
							<input type="text" name="date" id="date1" style="width: 133%;" autocomplete="off"
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
					<div class="layui-inline" id="whatstatus">

						<label class="layui-form-label"></label>
						<div class="layui-input-block">
							<input type="checkbox" checked="" name="status" value="1"
								title="待结算"> <input type="checkbox" checked=""
								name="status" value="2" title="已结算">
						</div>
					</div>
				</div>

			</div>


			<table lay-filter="demo" class="layui-table"
				lay-data="{id: 'idTest'}">
				<thead>
					<tr>
						<th lay-data="{type:'checkbox'}"></th>
						<th lay-data="{field:'id', width:'8%', sort: true}">编号</th>
						<th
							lay-data="{field:'name', width:'12%', templet: '#usernameTpl'}">姓名</th>
						<th lay-data="{field:'apptime', width:'17%'}">预约时间</th>
						<th lay-data="{field:'type',width:'20%'}">预约类型</th>
						<th lay-data="{field:'comment', width:'20%'}">预约项目</th>
						<th style="text-align: center;"
							lay-data="{field:'', templet: '#backtype',style:'text-align: center; '}"></th>
						<!-- <th style="text-align: center;"lay-data="{field:'',event: 'setSign', templet: '#backtype',style:'text-align: center; '}"></th> -->
					</tr>
				</thead>
			</table>

		</div>
		
		
		<div class="balances"  style="display:none">
			
		</div>
		
		
		
	</div>





	<script src="${base}/static/layui/dist/layui.js" charset="utf-8"></script>
	<script src="${base}/static/js/showDAppointment.js"></script>
	<#include "${base}/artTemplet/showDAppointmentDate.ftl">
	<!-- 注意：如果你直接复制所有代码到本地，上述js路径需要改成你本地的 -->


</body>
</html>