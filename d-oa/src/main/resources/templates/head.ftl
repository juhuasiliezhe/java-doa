<!-- 顶部导航 -->
<#assign base=request.contextPath />
<html>
<head>
    <link href="${base}/static/css/head.css" rel="stylesheet">
    <script src="${base}/static/js/head.js"></script>

</head>
<body >
<input type="hidden" id="imbase" value="${base}"/>
<div class="navbar navbar-inverse navbar-fixed-top newtheme" role="navigation" id="menu-nav">
    <div class="container">
        <div class="navbar-collapse collapse">
            <ul class="nav navbar-nav" style="width: 100%;">
                <li class="thetop indexname"><a href="${base}/index/blogindex">主页</a></li>
                <li class="thetop "><a href="#ad-carousel">生活小录</a></li>
                <li class="thetop "><a href="#summary-container">读书笔记</a></li>
                <li class="thetop dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown">技术浅记 <span class="caret"></span></a>
                    <ul class="dropdown-menu" role="menu">

                        <li><a href="${base}/technology/technologyindex" data-tab="tab-all">全部</a></li>
                        <li><a href="#feature-tab" data-tab="tab-java">java</a></li>
                        <li><a href="#feature-tab" data-tab="tab-python">python</a></li>
                        <li><a href="#feature-tab" data-tab="tab-linux">linux</a></li>
                        <li><a href="#feature-tab" data-tab="tab-ie">c</a></li>
                        <li><a href="#feature-tab" data-tab="tab-c++">c++</a></li>
                        <li><a href="#feature-tab" data-tab="tab-c#">c#</a></li>
                        <li><a href="#feature-tab" data-tab="tab-php">php</a></li>
                        <li><a href="#feature-tab" data-tab="tab-html/css">html/css</a></li>
                        <li><a href="#feature-tab" data-tab="tab-javascript">javascript</a></li>
                        <li class="dropdown-submenu">
                            <a href="javascript:;">数据库</a>
                            <ul class="dropdown-menu">
                                <li><a href="javascript:;">sqlServer</a></li>
                                <li><a href="javascript:;">mysql</a></li>
                                <li><a href="javascript:;">redis</a></li>
                                <li><a href="javascript:;">solr</a></li>
                            </ul>
                        </li>
                        <li class="dropdown-submenu">
                            <a href="javascript:;">产品工具</a>
                            <ul class="dropdown-menu">
                                <li><a href="javascript:;">XMind</a></li>
                                <li><a href="javascript:;">AxureRP</a></li>
                                <li><a href="javascript:;">PowerDesigner</a></li>
                                <li><a href="javascript:;">visio</a></li>
                            </ul>
                        </li>
                        <li class="dropdown-submenu">
                            <a href="javascript:;">UI</a>
                            <ul class="dropdown-menu">
                                <li><a href="javascript:;">PS</a></li>
                            </ul>
                        </li>
                    </ul>
                </li>
                <li class="thetop"><a href="#" data-toggle="modal" data-target="#about-modal">关于本站</a></li>
            </ul>
        </div>
    </div>
</div>
</body>
</html>