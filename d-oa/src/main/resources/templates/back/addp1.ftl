<#assign base=request.contextPath />
<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org" >
<head>
    <meta name="keywords" content="keyword1,keyword2,keyword3"></meta>
    <meta name="description" content="this is my page"></meta>
    <meta name="content-type" content="text/html; charset=UTF-8"></meta>
    <title>添加患者</title>

    <link rel="stylesheet" href="${base}/static/xheditor/demos/common.css" type="text/css" media="screen" />
    <link href="${base}/static/bootstrap/css/bootstrap.min.css" rel="stylesheet">

    <link rel="stylesheet" href="${base}/static/css/qikoo.css">
    <link rel="stylesheet" href="${base}/static/css/store.css">
    <link rel="stylesheet" href="${base}/static/css/view.css">
    <script src="${base}/static/jquery/jQuery-2.2.0.min.js"></script>
    <script src="${base}/static/bootstrap/js/bootstrap.min.js"></script>
    <script src="${base}/static/js/qikoo.js"></script>
    <script type="text/javascript">
        $(function() {

        })




    </script>

</head>
<body style="background:rgb(247, 247, 247);">

<div class="container" style="margin-top: 2%;border-radius: 8px;"  >
    <div >
        <div  >

            <form action="${base}/back/addPatient" method="post" style="border: 0px;" class="bootstrap-frm">
                <h1>添加患者
                    <span></span>
                </h1>

                <label>
                    <h4>基本信息</h4>
                    <hr style="border:none;border-top:1px solid;" />
                </label>
                <label>
                    <span>姓名:</span>
                    <input id="name" type="text" name="name" placeholder="请输入姓名" />
                </label>

                <label>
                    <span>性别 :</span>
                    <input name="sex" type="radio" value="男" />男
                    <input name="sex" type="radio" value="女" />女
                    <input name="sex" type="radio" value="未知" />未知


                    </select>
                </label>

                <label>
                    <span>出生年月 :</span>
                    <input   type="text" name="birthday" placeholder="请输入出生年月" />
                </label>

                <label>
                    <span>年龄 :</span>
                    <input   type="text" name="age" placeholder="请输入年龄" />
                </label>
                <label>
                    <span>监护人 :</span>
                    <input   type="text" name="keeper" placeholder="请输入监护人" />
                </label>
                <label>
                    <span>职业 :</span>
                    <input   type="text" name="work" placeholder="请输入职业" />
                </label>

                <label>
                    <h4>患者信息</h4>
                    <hr style="border:none;border-top:1px solid;" />
                </label>

                <label>
                    <span>患者来源 :</span>

                    <input name="fromwhere" type="radio" value="朋友介绍" />朋友介绍
                    <input name="fromwhere" type="radio" value="在附近居住/工作" />在附近居住/工作
                    <input name="fromwhere" type="radio" value="其他" />其他

                </label>

                <label>
                    <span>备注 :</span>
                    <input   type="text" name="tip" placeholder="请输入备注" />
                </label>
                <label>
                    <span>初诊日期 :</span>
                    <input   type="text" name="cometime" placeholder="请输入日期" />
                </label>



                <label>
                    <h4>联系方式</h4>
                    <hr style="border:none;border-top:1px solid;" />
                </label>


                <label>
                    <span>手机号码 :</span>
                    <input   type="text" name="phone" placeholder="请输入手机号码" />
                </label>


                <label>
                    <span>电话 :</span>
                    <input   type="text" name="telephone" placeholder="请输入电话号码" />
                </label>

                <label>
                    <span>邮箱 :</span>
                    <input   type="text" name="email" placeholder="请输入邮箱" />
                </label>

                <label>
                    <span>住址 :</span>
                    <input   type="text" name="address" placeholder="请输入住址" />
                </label>




                <label>
                    <h4>健康状况</h4>
                    <hr style="border:none;border-top:1px solid;" />
                </label>

                <label>
                    <span>现在身体状况 :</span>
                    <input name="type" type="radio" value="好" />好
                    <input name="type" type="radio" value="一般" />一般
                    <input name="type" type="radio" value="差" />差

                </label>

                <label>
                    <span>过敏史 :</span>
                    <textarea   name="allergy" placeholder="请输入过敏史"></textarea>
                </label>




                <label>
                    <span>心脏病 :</span>
                    <input name="heart" type="checkbox" value="心率不齐" />心率不齐
                    <input name="heart" type="checkbox" value="冠心病" />冠心病
                    <input name="heart" type="checkbox" value="心肌病" />心肌病
                    <input name="heart" type="checkbox" value="起搏器" />起搏器

                </label>


                <label>
                    <span>高血压病 :</span>
                    <input name="hypertension" type="radio" value="有" />有
                </label>

                <label>
                    <span>糖尿病 :</span>
                    <input name="diabetes" type="radio" value="有" />有
                </label>

                <label>
                    <span>肾脏病 :</span>
                    <input name="kidney" type="radio" value="有" />有
                </label>

                <label>
                    <span>胃肠溃疡 :</span>
                    <input name="nephropathy" type="radio" value="有" />有
                </label>

                <label>
                    <span>传染病 :</span>
                    <input name="infectious" type="checkbox" value="流行性腮腺炎" />流行性腮腺炎
                    <input name="infectious" type="checkbox" value="肝炎" />肝炎
                    <input name="infectious" type="checkbox" value="乙肝表面抗原" />乙肝表面抗原
                    <input name="infectious" type="checkbox" value="艾滋病" />艾滋病
                    <input name="infectious" type="checkbox" value="其他" />其他

                </label>
                <label>
                    <span>血液病 :</span>
                    <input name="blood" type="checkbox" value="血小板减少症" />血小板减少症
                    <input name="blood" type="checkbox" value="白血病" />白血病
                    <input name="blood" type="checkbox" value="再生障碍性贫血" />再生障碍性贫血
                    <input name="blood" type="checkbox" value="其他" />其他

                </label>

                <label>
                    <span>吸烟史 :</span>
                    <input  type="text" name="smoke" placeholder="（支/天）" />
                </label>

                <label>
                    <span>饮酒史 :</span>
                    <input id="email" type="text" name="drink" placeholder="（量/天）" />
                </label>

                <label>
                    <span>服用小剂量阿司匹林 :</span>
                    <input  type="radio" value="有" />有
                </label>
                <label>
                    <span></span>
                    <textarea   name="aspirin" placeholder="请输入原因"></textarea>
                </label>

                <label>
                    <span>是否服用其他药品 :</span>
                    <input  type="radio" value="有" />有
                </label>
                <label>
                    <span></span>
                    <textarea   name="otherdrug" placeholder="如果有，请输入详情"></textarea>
                </label>


                <label>
                    <span>口腔麻药反应 :</span>
                    <input name="anesthetic" type="radio" value="是" />是
                    <input name="anesthetic" type="radio" value="否" />否
                </label>

                <label>
                    <span>是否有其他重大疾病尚未提到 :</span>
                    <input name="otherdisease" type="radio" value="是" />是
                    <input name="otherdisease" type="radio" value="否" />否
                </label>
                <label>
                    <span>是否空腹 :</span>
                    <input name="fasting" type="radio" value="是" />是
                    <input name="fasting" type="radio" value="否" />否
                </label>
                <label>
                    <span>是否正怀孕 :</span>
                    <input name="pregnant" type="radio" value="是" />是
                    <input name="pregnant" type="radio" value="否" />否
                </label>

                <label style="margin-left: 21%">
                    <span>&nbsp;</span>
                    <input type="button" class="button " data-toggle="modal" data-target="#myModal" style="background: #3c8dbc;color: #fff;" value="提交" />
                </label>



                <!-- 模态框（Modal） -->
                <div class="modal fade" style="margin-top: 13%" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
                    <div class="modal-dialog">
                        <div class="modal-content" style="width: 59%">
                            <div class="modal-header" style="border-bottom: 0;text-align: center;">
                                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">
                                    &times;
                                </button>
                                <h4 class="modal-title" id="myModalLabel">
                                    确定添加患者吗？
                                </h4>
                            </div>

                            <div class="modal-footer" style="text-align: center">
                                <button type="button" style="margin-right: 11%;" class="btn btn-default" data-dismiss="modal">取消
                                </button>
                                <button type="submit" class="btn btn-primary">
                                    确定
                                </button>
                            </div>
                        </div><!-- /.modal-content -->
                    </div><!-- /.modal -->
                </div>




                <div style="height:300px">
                </div>
            </form>

        </div>
    </div>

</div>




</body>
</html>