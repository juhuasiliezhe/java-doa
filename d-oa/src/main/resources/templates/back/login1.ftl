<#assign base=request.contextPath />
<!DOCTYPE html>
<html lang="zh-cn">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
    <title>登录</title>
    <link rel="stylesheet" href="${base}/static/css/loginstyle.css">
    <script src="${base}/static/jquery/jQuery-2.2.0.min.js"></script>
</head>

<body>


<!-- 广告轮播 -->
<script>

    $(function () {
        $.ajaxSetup({
            async:false
        })
        clickCLOSE();
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
    function  formdate() {
        var username=$("#username").val();
        var password=$("#password").val();
        if (username==""||password==""){
            return;
        }
        $.post("/duserController/uplogin","username="+username+"&password="+password,function(data){
            if(data.code==-1){
            	$(".username").css("background","url(/static/images/pass.png) no-repeat 447px 17px");
                
            }else if(data.code==0){

                $(".key").css("background","url(/static/images/pass.png) no-repeat 447px 17px");

            }else{
                $("#theform").submit();
            }
        },"JSON")
        
    }
    
    function  clickCLOSE() {
        $('.close').on('click', function(c){
             $('.login-form').fadeOut('slow', function(c){
            $('.login-form').remove();
             });
         });
    }
</script>
<style>
    #onlogin{
    font-size: 30px;
    color: #fff;
    outline: none;
    border: none;
    background: #3ea751;
    width: 100%;
    padding: 18px 0;
    border-bottom-left-radius: 15px;
    -webkit-border-bottom-left-radius: 15px;
    -moz-border-bottom-left-radius: 15px;
    -o-border-bottom-left-radius: 15px;
    border-bottom-right-radius: 15px;
    -webkit-border-bottom-right-radius: 15px;
    -moz-border-bottom-right-radius: 15px;
    -o-border-bottom-right-radius: 15px;
    cursor: pointer;
    }
</style>
<!--SIGN UP-->
<h1></h1>
<div class="login-form">
    <div class="close"> </div>
    <div class="head-info">
        <label class="lbl-1"> </label>
        <label class="lbl-2"> </label>
        <label class="lbl-3"> </label>
    </div>
    <div class="clear"> </div>
    <div class="avtar">
        <img src="/static/images/avtar.png" />
    </div>
    <form action="${base}/" method="get" id="theform">
        <input type="text" class="text" value="username" id="username" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Username';}" >
        <div class="key">
            <input type="password" value="password" id="password" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Password';}">
        </div>
    </form>
    <div class="signin">
        <input type="button" value="Login" id="onlogin" >
    </div>
</div>


</body>
</html>