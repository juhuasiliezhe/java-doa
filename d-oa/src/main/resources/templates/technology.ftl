<#assign base=request.contextPath />
<!DOCTYPE html>
<html lang="zh-cn">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>技术浅谈</title>
    <link href="${base}/static/css/bootstrap.css" rel="stylesheet">
    <link rel="stylesheet" href="${base}/static/bootstrap/bootstraptable/bootstrap-table.css">
    <link rel="stylesheet" href="${base}/static/css/technology.css">
    <script src="${base}/static/jquery/jQuery-2.2.0.min.js"></script>
    <script src="${base}/static/js/bootstrap.min.js"></script>
    <script src="${base}/static/bootstrap/bootstraptable/bootstrap-table.js"></script>
    <script src="${base}/static/bootstrap/bootstraptable/bootstrap-table-zh-CN.js"></script>
    <script src="${base}/static/js/techFirst.js"></script>
</head>

<body>
<#include "head.ftl">

<div class="container" style="background: #a57f7f;">
    <div class="row" >
        <div class="col-lg-12" >
        </div>
    </div>
</div>

<!-- 广告轮播 -->
<div class="container" style="background: #FFFFFF;height:675px;border-radius:8px;margin-top: 2%">
    <div class="row" style="">

        <div class="col-lg-12" style="overflow:auto; float:right;    border-top-right-radius:8px;border-bottom-right-radius:8px;">
            <table id="searchTable" class="table table-hover table-bordered" >
            </table>



        </div>
    </div>
</div>
</body>
</html>
