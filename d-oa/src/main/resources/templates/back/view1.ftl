<#assign base=request.contextPath />
<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org" >
<head>
    <meta name="keywords" content="keyword1,keyword2,keyword3"></meta>
    <meta name="description" content="this is my page"></meta>
    <meta name="content-type" content="text/html; charset=UTF-8"></meta>
    <title>博客</title>
    <link rel="stylesheet" href="${base}/static/xheditor/demos/common.css" type="text/css" media="screen" />
    <script type="text/javascript" src="${base}/static/xheditor/jquery/jquery-1.4.4.min.js"></script>
    <script type="text/javascript" src="${base}/static/xheditor/xheditor-1.1.14-zh-cn.min.js"></script>
		<script type="text/javascript">
		$(pageInit);
		function pageInit(){
		    $.extend(xheditor.settings,{shortcuts:{'ctrl+enter':submitForm}});
		    $('#elm1').xheditor({tools:'full',skin:'default',internalScript:false,
		    html5Upload:false,onUpload : insertUpload, upImgUrl:"${base}/back/image",upImgExt:"jpg,jpeg,gif,png"});
		}
		//图片上传回调函数
	    function insertUpload(msg) {
	        var _msg = msg.toString();
	        //插入图片到编辑器
	        //以下步骤不是必须的，请跳过
	        //(1)将图片地址保存到checkbox中
	        $("#imagesDiv").append("<input type='checkbox' name='attachments' checked='checked' onclick='return false;' value='"+_msg+"''/>" + _msg+"<br>");
	        //(2)插入图片到下拉列表
	        $("#imageUrl").append("<option>" + _msg+"</option>");
	    }
		function submitForm(){
			$('#frmDemo').submit();
		}
		</script>
</head>
<body>
    <textarea id="elm1" name="essaycontent" rows="40" cols="80" style="width: 80%"></textarea>
    <div id="imagesDiv"></div>
    <div id="imageUrl"></div>
</body>
</html>