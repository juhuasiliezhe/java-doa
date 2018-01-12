<#assign base=request.contextPath />
<!DOCTYPE html>
<html lang="zh-cn">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>首页</title>
    <link href="${base}/static/css/bootstrap.css" rel="stylesheet">
    <link rel="stylesheet" href="${base}/static/bootstrap/bootstraptable/bootstrap-table.css">
    <link rel="stylesheet" href="${base}/static/bootstrap/css/bootstrap-datetimepicker.min.css">
    <script src="${base}/static/jquery/jQuery-2.2.0.min.js"></script>
    <script src="${base}/static/js/bootstrap.min.js"></script>
    <script src="${base}/static/bootstrap/bootstraptable/bootstrap-table.js"></script>
    <script src="${base}/static/bootstrap/bootstraptable/bootstrap-table-zh-CN.js"></script>
    <script src="${base}/static/bootstrap/js/bootstrap-datetimepicker.js"></script>
    <script src="${base}/static/bootstrap/js/bootstrap-datetimepicker.zh-CN.js"></script>
    <script src="${base}/static/js/showDPatient.js"></script>
</head>
<style>
    .onlyinput{
        margin-left: 10px;!important;
    }
    .theinput{
        border: 1px solid #CCC;
        color: #888;
        height: 28px;
        line-height: 15px;
        margin-bottom: 16px;
        margin-right: 6px;
        margin-top: 2px;
        outline: 0 none;
        padding: 5px 0px 5px 5px;
        width: 30%;
        border-radius: 4px;
        -webkit-border-radius: 4px;
        -moz-border-radius: 4px;
        -webkit-box-shadow: inset 0 1px 1px rgba(0, 0, 0, 0.075);
        box-shadow: inset 0 1px 1px rgba(0, 0, 0, 0.075);
        -moz-box-shadow: inset 0 1px 1px rgba(0, 0, 0, 0.075);
        margin-left: 3%;
    }
    h2{
    color: #888;
    }
    .startTime2{
	    width:137px;
	    text-align: center;
	    margin-left: 0;
	    float: right;
	    height:34px;
	    margin-top: 0; 
	    margin-bottom: 0; 
    }

</style>

<body style="background:rgb(247, 247, 247);">


<!-- 广告轮播 -->
<div class="container" style="background: #FFFFFF;height:700px;border-radius:8px;margin-top: 2%">
    <div  style="">
        <h2>患者信息</h2>
        <div  style="margin-bottom:5%;">
        	<button type="button" id="seach_Date" style="float:right;"  class="btn btn-primary">
                   		 检索
            </button>
        	<input type="text"    placeholder="选择时间" value="" class="form_datetime theinput startTime startTime2 "/>
        </div>		
            <table id="searchTable"  > </table>
    </div>
</div>





<!-- 模态框（Modal） -->
<div class="modal fade" style="margin-top: 8%" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content"  >
            <div class="modal-header" style="border-bottom: 0;text-align: center;">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">
                    &times;
                </button>
                <h4 class="modal-title" id="myModalLabel">
                    <input type="hidden" id="appointmentid" />
                     预约患者：【<span id="appointmentname">张三</span>】
                </h4>
            </div>
            <div class="modal-body" style="text-align: center;">

                <div style="margin-bottom: 25px;margin-right: 6%;"> 预约类型&nbsp;&nbsp;&nbsp;&nbsp;
                    <span>
                        <input class="onlyinput" style="margin-left: 12px;" name="nephropathy" type="radio" value="初诊" />初诊
                        <input class="onlyinput"  style="margin-left: 12px;" name="nephropathy" type="radio" value="复诊" />复诊
                        <input class="onlyinput" style="margin-left: 12px;" name="nephropathy" type="radio" value="不速" />不速
                    </span>
                </div>


            <div>预约时间 <input type="text" style="width: 35%;" placeholder="选择时间" value="" class="form_datetime theinput startTime"/>

            </div>
             <div style="margin-right: 11%;">需要时间
                <input type="text" class="theinput addme" style="width: 17%;" placeholder="分钟" value="" />
                <input type="button" class="button " id="addtime" style="background: #3c8dbc;color: #fff;" value="确定" />
            </div>



               <div style=""><h4>【预约项目】</h4></div> <textarea class="theinput" id="thecomment"  style="margin-left: 7%;height: 200px;width: 50%"  placeholder="请输入原因"></textarea>
            </div>
            <div class="modal-footer" style="text-align: center">
                <button type="button" style="margin-right: 11%;" class="btn btn-default" data-dismiss="modal">取消
                </button>
                <button type="button" id="addappointment" data-dismiss="modal" class="btn btn-primary">
                  				  确定
                </button>
            </div>
        </div><!-- /.modal-content -->
    </div><!-- /.modal -->
</div>
<!-- 删除模态框（Modal） -->
<div class="modal fade" style="margin-top: 8%" id="myModal2" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content"  >
            <div class="modal-header" style="border-bottom: 0;text-align: center;">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">
                    &times;
                </button>
                <h4 class="modal-title" id="myModalLabel">
                    <input type="hidden" id="appointmentid" />
                    确定 删除患者：【<span id="appointmentname2">张三</span>】?
                </h4>
            </div>
             
            <div class="modal-footer" style="text-align: center">
                <button type="button" style="margin-right: 11%;" class="btn btn-default" data-dismiss="modal">取消
                </button>
                <button type="button" id="downappointment" data-dismiss="modal" class="btn btn-primary">
                  				  确定
                </button>
            </div>
        </div><!-- /.modal-content -->
    </div><!-- /.modal -->
</div>
<script type="text/javascript">
    $('.form_datetime').datetimepicker({
//        minView: "month", //选择日期后，不会再跳转去选择时分秒
        language:  'zh-CN',
        format: 'yyyy-mm-dd hh:ii',
        showDropdowns: true,
        todayBtn:  1,
        autoclose: 1,
    });
</script>




</body>
</html>
