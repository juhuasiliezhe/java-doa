<#assign base=request.contextPath />
<!DOCTYPE html>
<html lang="zh-cn">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>今日预约</title>
    <link href="${base}/static/css/bootstrap.css" rel="stylesheet">
    <link rel="stylesheet" href="${base}/static/bootstrap/bootstraptable/bootstrap-table.css">
    <link rel="stylesheet" href="${base}/static/bootstrap/css/bootstrap-datetimepicker.min.css">
    <script src="${base}/static/jquery/jQuery-2.2.0.min.js"></script>
    <script src="${base}/static/js/bootstrap.min.js"></script>
    <script src="${base}/static/bootstrap/bootstraptable/bootstrap-table.js"></script>
    <script src="${base}/static/bootstrap/bootstraptable/bootstrap-table-zh-CN.js"></script>
    <script src="${base}/static/bootstrap/js/bootstrap-datetimepicker.js"></script>
    <script src="${base}/static/bootstrap/js/bootstrap-datetimepicker.zh-CN.js"></script>
    <script src="${base}/static/js/showDAppointment.js"></script>
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
    .startTime{
	    width:137px;
	    text-align: center;
	    margin-left: 0;
	    float: right;
	    height:34px;
	    margin-top: 0; 
	    margin-bottom: 0; 
    }
    h2{
    color: #888;
    }

</style>

<body style="background:#ecf0f5;">


<!-- 广告轮播 -->
<div class="container" style="width: 100%;background: #FFFFFF;height:700px;border-radius:8px;margin-top: 2%">
    
        <h2>今日工作</h2>
        <div  style="margin-bottom:5%;">
        	<button type="button" id="seach_Date" style="float:right;"  class="btn btn-primary">
                   		 检索
            </button>
        	<input type="text"    placeholder="选择时间" value="" class="form_datetime theinput startTime "/>
        </div>		
            <table id="searchTable"  > </table>
</div>





<!-- 结算模态框（Modal） -->
<div class="modal fade" style="margin-top: 8%" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content"  >
            <div class="modal-header" style="border-bottom: 0;text-align: center;">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">
                    &times;
                </button>
                <h4 class="modal-title" id="myModalLabel">
                    <input type="hidden" id="appointmentid" />
                     患者：【<span id="appointmentname">张三</span>】结算
                </h4>
            </div>
            <div class="modal-body" style="text-align: center;">



            <div>实收金额： <input type="text" onkeyup="value=value.replace(/[^\d.]/g,'')" style="width: 35%;" placeholder="输入金额" value="" class=" theinput  getmoney"/>

            </div>
             <div >
                 扣去材料： <input type="text" onkeyup="value=value.replace(/[^\d.]/g,'')" style="width: 35%;" placeholder="输入金额" value="" class=" theinput  putmoney"/>
            </div>




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
<!-- 取消预约模态框 -->
<div class="modal fade" style="margin-top: 8%" id="myModal2" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content"  >
            <div class="modal-header" style="border-bottom: 0;text-align: center;">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">
                    &times;
                </button>
                <h4 class="modal-title" >
                    <input type="hidden"  />
                     确定取消预约吗？
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
        minView: "month", //选择日期后，不会再跳转去选择时分秒
        language:  'zh-CN',
        format: 'yyyy-mm-dd',
        showDropdowns: true,
        todayBtn:  1,
        autoclose: 1,
    });
</script>




</body>
</html>
