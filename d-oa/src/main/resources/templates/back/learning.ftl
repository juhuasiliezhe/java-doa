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
	<!-- <div class="layui-row">
		<div class="layui-col-md12">
			<div class="layui-form" style="text-align: center;margin-top: 10%;margin-right: 36%;">

				<div class="layui-form-item">
					<label class="layui-form-label"></label>
					<div class="layui-input-block">
						<input type="radio" name="sex" value="1" title="母音" checked="">
						<input type="radio" name="sex" value="2" title="子音"> <input
							type="radio" name="sex" value="3" title="混合">
							<button class="layui-btn" id="querydata">开始随机</button>
					</div>
					
				</div>
				<div id="mytest" style='font-size: 113px;'></div>

			</div>
		</div>
	</div> -->
	<button class="layui-btn" id="querydata2">导出</button>







	<script src="${base}/static/layui/dist/layui.js" charset="utf-8"></script>
	<!-- 注意：如果你直接复制所有代码到本地，上述js路径需要改成你本地的 -->
	<script>
	$(function () {
		layui.use(
				[ 'form', 'layedit', 'laydate' ],
				function() {
					var form = layui.form, layer = layui.layer, layedit = layui.layedit, laydate = layui.laydate;
				});
		randomList();

	});
		 
		function randomList(){
			$("#querydata").click(function(){
				type=$("input[type='radio']:checked").val()
				var muyin = ["[ i ]","[ ɪ ]","[ e ]","[ ɛ ]","[ æ ]","[ ɑ ]","[ o ]","[ ɔ ]","[ ʊ ]","[ u ]","[ ʌ ]","[ ə ]","[ ɚ ]","[ ɜ: ]","[ ai ]","[ ɔi ]","[ aʊ ]"]; 
				var ziyin = ["[ p ]","[ b ]","[ t ]","[ d ]","[ k ]","[ g ]","[ f ]","[ v ]","[ s ]","[ z ]","[ ʃ ]","[ ʒ ]","[ ɵ ]","[ ð ]","[ h ]","[ r ]","[ ʧ ]","[ ʤ ]","[ m ]","[ n ]","[ ŋ ]","[ l ]","[ w ]","[ j ]"];
				var all= muyin.concat(ziyin);//c=[1,2,3,4,5,6]
				if (type=='1'){
					$("#mytest").html(muyin[Math.floor(Math.random()*muyin.length)])
				}else if(type=='2'){
					$("#mytest").html(ziyin[Math.floor(Math.random()*ziyin.length)])
				}else{
					$("#mytest").html(all[Math.floor(Math.random()*all.length)])
				}
			})
				
		}
		
	</script>



</body>
</html>