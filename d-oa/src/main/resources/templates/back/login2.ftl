<#assign base=request.contextPath />
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html>
    <head>
        <title>登录系统</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
        <meta name="description" content="Expand, contract, animate forms with jQuery wihtout leaving the page" />
        <meta name="keywords" content="expand, form, css3, jquery, animate, width, height, adapt, unobtrusive javascript"/>
        
		<link rel="shortcut icon" href="../favicon.ico" type="image/x-icon"/>
        <link rel="stylesheet" type="text/css" href="${base}/static/css/newloginstyle.css" />
		<script src="${base}/static/js/cufon-yui.js" type="text/javascript"></script>
		<script src="${base}/static/js/ChunkFive_400.font.js" type="text/javascript"></script>
		<script src='${base}/static/js/dat.gui.min.js'></script>
    	<script src="${base}/static/js/backgroundindex.js"></script>
		 <style>
    
  
    </style>
		<script type="text/javascript">
			Cufon.replace('h3',{ textShadow: '1px 1px #000'});
			Cufon.replace('.back');
		</script>
    </head>
    <body>
    
		<div class="wrapper">
			 
			<div class="content">
				<div id="form_wrapper" class="form_wrapper" style="margin-top: 29%;">
					 
					<form class="login active" action="${base}/" method="get" id="theform">
						<h3>Login</h3>
						<div>
							<label>Username:</label>
							<input type="text"  id="username" onfocus="onfocusinput(1)" />
							<span class="error" id="usererror">This is not existed</span>
						</div>
						<div>
							<label>Password: <a href="javascript:void();" rel="forgot_password" class="forgot linkform">Forgot your password?</a></label>
							<input type="password"  id="password" onfocus="onfocusinput(2)" />
							<span class="error" id="passerror">This is an error</span>
						</div>
						<div class="bottom">
							<div class="remember"><input type="checkbox" /><span>Keep me logged in</span></div>
							<input type="button" id="onlogin" value="Login"></input>
							<a href="javascript:void();"  rel="register" class="linkform">You don't have an account yet? Register here</a>
							<div class="clear"></div>
						</div>
					</form>
					 
				</div>
				<div class="clear"></div>
			</div>
		</div>

		<script src="${base}/static/jquery/jQuery-2.2.0.min.js"></script>
		<script type="text/javascript">
		$(function () {
	        $.ajaxSetup({
	            async:false
	        })
	        cliconlogin();

	        $("body").keydown(function(e){
	            if(e.keyCode=="13"){//回车键的键值为13
	                formdate();//调用登录按钮的登录事件
	            }
	        })
	    });

	    function  cliconlogin() {
	        $('#onlogin').on('click', function(c){
	            formdate();

	        });

	    }
	   

		function onfocusinput(id){
			if(id==1){
				$("#usererror").css("visibility","hidden");
			}else{
				$("#passerror").css("visibility","hidden");
			}
		}
	    function  formdate() {
	        var username=$("#username").val();
	        var password=$("#password").val();
	        if (username==""||password==""){
	            return;
	        }
	        $.post("/duserController/uplogin","username="+username+"&password="+password,function(data){
	            if(data.code==-1){
		            
	            	$("#usererror").css("visibility","inherit");
	            	/* setTimeout("timedCount()",2000) */
	            }else if(data.code==0){
	            	$("#passerror").css("visibility","inherit");

	            }else{
	                $("#theform").submit();
	            }
	        },"JSON")
	        
	    }
        </script>
    </body>
</html>