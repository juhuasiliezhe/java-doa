<#assign base=request.contextPath />
<!DOCTYPE html>
<html lang="zh-cn">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>首页</title>
    <link href="${base}/static/css/bootstrap.css" rel="stylesheet">
    <link rel="stylesheet" href="${base}/static/css/blogindex.css">
    <script src="${base}/static/jquery/jQuery-2.2.0.min.js"></script>
    <script src="${base}/static/js/bootstrap.min.js"></script>
    <script src="${base}/static/js/indexFirst.js"></script>
</head>

<body>
<#include "head.ftl">

<div class="container" style="background: #a57f7f;">
    <div class="row">
        <div class="col-lg-12">dfdf

        </div>
    </div>
</div>

<!-- 广告轮播 -->
<div class="container">
    <div class="row">
        <div class="col-lg-8" style="  padding-left: 0px; ">
            <div id="ad-carousel" class="carousel slide" style="height:50%;">
                <ol class="carousel-indicators">
                    <li data-target="#ad-carousel" data-slide-to="0" class="active"></li>
                    <li data-target="#ad-carousel" data-slide-to="1"></li>
                    <li data-target="#ad-carousel" data-slide-to="2"></li>
                    <li data-target="#ad-carousel" data-slide-to="3"></li>
                    <li data-target="#ad-carousel" data-slide-to="4"></li>
                </ol>
                <div class="carousel-inner">
                    <!-- 轮播图片 -->
                    <div class="item active">
                        <img src="http://p3.pstatp.com/origin/2899000416063bd7fac9" alt="1 slide">

                        <div class="carousel-caption">
                            <h1>Chrome</h1>

                            <p>Google Chrome，又称Google浏览器，是一个由Google（谷歌）公司开发的网页浏览器。</p>

                            <p><a class="btn btn-lg btn-primary" href="http://www.google.cn/intl/zh-CN/chrome/browser/"
                                  role="button" target="_blank">点我下载</a></p>
                        </div>
                    </div>
                    <div class="item">
                        <img src="http://f10.baidu.com/it/u=2881303562,336932824&fm=72" alt="2 slide">

                        <div class="carousel-caption">
                            <h1>Firefox</h1>

                            <p>Mozilla Firefox，中文名通常称为“火狐”或“火狐浏览器”，是一个开源网页浏览器。</p>

                            <p><a class="btn btn-lg btn-primary" href="http://www.firefox.com.cn/download/"
                                  target="_blank"
                                  role="button">点我下载</a></p>
                        </div>
                    </div>
                    <div class="item">
                        <img src="http://f11.baidu.com/it/u=2493823552,615247646&fm=72" alt="3 slide">

                        <div class="carousel-caption">
                            <h1>Safari</h1>

                            <p>Safari，是苹果计算机的最新操作系统Mac OS X中的浏览器。</p>

                            <p><a class="btn btn-lg btn-primary"
                                  href="http://img5.imgtn.bdimg.com/it/u=3615305644,432669841&fm=200&gp=0.jpg"
                                  target="_blank"
                                  role="button">点我下载</a></p>
                        </div>
                    </div>
                    <div class="item">
                        <img src="http://www.firefox.com.cn/download/" alt="4 slide">

                        <div class="carousel-caption">
                            <h1>Opera</h1>

                            <p>Opera浏览器，是一款挪威Opera Software ASA公司制作的支持多页面标签式浏览的网络浏览器。</p>

                            <p><a class="btn btn-lg btn-primary" href="http://www.opera.com/zh-cn" target="_blank"
                                  role="button">点我下载</a></p>
                        </div>
                    </div>
                    <div class="item">
                        <img src="http://img3.imgtn.bdimg.com/it/u=1076242151,1026662692&fm=200&gp=0.jpg" alt="5 slide">

                        <div class="carousel-caption">
                            <h1>IE</h1>

                            <p>Internet Explorer，简称 IE，是微软公司推出的一款网页浏览器。</p>

                            <p><a class="btn btn-lg btn-primary" href="http://ie.microsoft.com/" target="_blank"
                                  role="button">点我下载</a></p>
                        </div>
                    </div>
                </div>


                <!--11111111111111 轮播 -->


                <a class="left carousel-control" href="#ad-carousel" data-slide="prev"><span
                        class="glyphicon glyphicon-chevron-left"></span></a>
                <a class="right carousel-control" href="#ad-carousel" data-slide="next"><span
                        class="glyphicon glyphicon-chevron-right"></span></a>

            </div>
        </div>
        <div class="col-lg-4" style="background: red;height:50%;">dfdf</div>
    </div>
</div>


<!-- 主要内容 -->
<div class="container">
    <div class="row">
        <div class="col-lg-8" style="  padding-left: 0px; ">
            <div   style="margin-top:-5%;">
                <div class="listShow Hots">
                    <h4 class="hotType">热门排行</h4>
                    <hr class="context_hr"/>
                    <div class="thisHost">
                    <#list hotsblogs as blog>
                        <div class="padd">
                            <div class="hotList">${blog_index+1}</div>
                            <div class="titleList">
                                <a class="hothref" href="javascipt:void()">${blog.title}
                                    <div class="glyphicon glyphicon-time hottip hottiptime">${blog.uptime}</div>
                                    <div class="glyphicon glyphicon-eye-open hottip ">${blog.hits}浏览</div>
                                </a>
                            </div>
                        </div>
                    </#list>
                    </div>
                </div>



            <#list blogs as blog>
                <div class=" listShow" style="overflow: hidden;">
                    <a href="javascript:void()" >
                        <div class="context_title  col-lg-8">${blog.title}</div>
                    </a>
                    <div>
                        <img class="context_img col-lg-4" src="${blog.imageurl}?imageView2/1/w/200/h/123">
                        <a href="javascript:void()">
                            <div class="context_text col-lg-8" style="">${blog.summary}...</div>
                        </a>
                        <div style="">
                            <div class="glyphicon glyphicon-comment tips">100留言</div>
                            <div class="glyphicon glyphicon-eye-open tips">${blog.hits}浏览</div>
                            <div class="glyphicon glyphicon-time tips">${blog.uptime}</div>
                            <div class="glyphicon glyphicon-bookmark tips">${blog.categoryname}</div>
                        </div>
                    </div>

                </div>
            </#list>
            </div>
        </div>
        <div class="col-lg-4" style="background: red;height:50%;">dfdf</div>
    </div>


    <footer>
        <p class="pull-right"><a href="#top">回到顶部</a></p>

        <p>&copy; dfdfdfd</p>
    </footer>

</div>
<div style="float:right;z-index:10;background:#49d1d2;width:25%;height:200px;margin-top:-4.3%;">
    df

</div>


</body>
</html>
