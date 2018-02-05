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





</head>
<body>
	 
	<button class="layui-btn" id="querydata2">导出</button>




	<input id="basd" value="${base}">

	<script src="${base}/static/layui/dist/layui.js" charset="utf-8"></script>
	<!-- 注意：如果你直接复制所有代码到本地，上述js路径需要改成你本地的 -->
	<script>
	$(function () {
		layui.use(
				[ 'form', 'layedit', 'laydate' ],
				function() {
					var form = layui.form, layer = layui.layer, layedit = layui.layedit, laydate = layui.laydate;
				});
		postExcel();

	});
		function postExcel(){
		
			$("#querydata2").click(function(){
				document.location.href = "tedsfsdf" ;
				/* $.post("/tedsfsdf","",function(data){
		            
		        },"JSON") */
				 
			})
		}
		
		 
		
	</script>



</body>
</html>