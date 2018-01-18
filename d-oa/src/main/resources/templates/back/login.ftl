<#assign base=request.contextPath />
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html>
    <head>
        <title>登录系统</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
        <meta name="description" content="Expand, contract, animate forms with jQuery wihtout leaving the page" />
        <meta name="keywords" content="expand, form, css3, jquery, animate, width, height, adapt, unobtrusive javascript"/>
        
        <link rel="stylesheet" type="text/css" href="${base}/static/css/login/style.css" />
		
		 <style>
  
    </style>
		 
    </head>
    <body>
    <canvas id=c  style="width:100%;"></canvas>
	<script src="${base}/static/js/dat.gui.min.js"></script>
    <script src="${base}/static/js/backgroundindex.js"></script>
    
     <div class="login">
	<h1>Login</h1>
    <form action="${base}/index" method="post" id="theform">
    	<input type="text" name="u" id="username" onfocus="onfocusinput(1)"  placeholder="Username" required="required" />
    	<span class="error"style="display: none;" id="usererror">This is not existed</span>
        <input type="password" id="password" onfocus="onfocusinput(2)" name="p" placeholder="Password" required="required" />
        <span class="error" style="display: none;" id="passerror">This is an error</span>
        
        <button type="button" id="onlogin" class="btn btn-primary btn-block btn-large">login</button>
    </form>
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
				$("#usererror").css("display","none");
			}else{
				$("#passerror").css("display","none");
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
		            
	            	$("#usererror").css("display","block");
	            	/* setTimeout("timedCount()",2000) */
	            }else if(data.code==0){
	            	$("#passerror").css("display","block");

	            }else{
	                $("#theform").submit();
	            }
	        },"JSON")
	        
	    }
        </script>
		
		 

    </body>
</html>