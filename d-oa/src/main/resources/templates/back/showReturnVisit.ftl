<#assign base=request.contextPath />
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>测试</title>
<meta name="renderer" content="webkit">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport"
	content="width=device-width, initial-scale=1, maximum-scale=1">
<link rel="stylesheet" href="${base}/static/layui/dist/css/layui.css"
	media="all">
<script src="${base}/static/jquery/jQuery-2.2.0.min.js"></script>
<script src="${base}/static/jquery/artTemp.js"></script>



 

</head>
<body>
	<div class="layui-row">
	<div class="layui-col-md12">
	
	<fieldset class="layui-elem-field layui-field-title"
		style="margin-top: 20px;">
		<legend style="color: #888;">今日回复</legend>
	</fieldset>
		<div  class="layui-form " style="margin-top: 1%;">
			<div class="layui-form-item">
				<div class="layui-inline">
				
					<label class="layui-form-label">回访日期</label>
					<div class="layui-input-block">
						<input type="text" name="date" style="width: 133%;" id="date1" autocomplete="off"
							class="layui-input">
					</div>
				</div>
				
				<div class="layui-inline">
					<label class="layui-form-label">姓名</label>
					<div class="layui-input-inline">
						<input type="text" id="thename" name="number" autocomplete="off"
							class="layui-input">
					</div>
					<button class="layui-btn" id="querydata">搜索</button>
				</div>
				<div class="layui-inline"  id="whatstatus">
				
					<label class="layui-form-label"></label>
					<div class="layui-input-block">
					<input type="checkbox"checked=""   name="status"  value="1" title="回访"> 
					<input type="checkbox" name="status"     value="2"title="已回访" >
					</div>
				</div>
			</div>
			
			
		</div>

 
		<table lay-filter="demo" class="layui-table" lay-data="{id: 'idTest'}">
			<thead>
				<tr>
					<th lay-data="{type:'checkbox'}"></th>
					<th lay-data="{field:'id', width:'4%', sort: true}">编号</th>
					<th lay-data="{field:'name', width:'6%', templet: '#usernameTpl'}">姓名</th>
					<th lay-data="{field:'comment', width:'8%'}">预约项目</th>
					<th lay-data="{field:'backcomment',width:'15%'}">回访内容</th>
					<th lay-data="{field:'backresult',width:'15%'}">回访结果</th>
					<th lay-data="{field:'apptime', width:'14%', sort: true}">预约时间</th>
					<th lay-data="{field:'gettime', width:'11%', sort: true}">结算时间</th>
					<th lay-data="{field:'backtime', width:'11%', sort: true,  templet:'#backtime'    }">回访时间</th>
					<th style="text-align: center;"lay-data="{field:'', templet: '#backtype',style:'text-align: center; '}"></th>
				</tr>
			</thead>
		</table>

	</div>
	</div>
	
		<div class="balances"  style="display:none">
			
		</div>


<script type="text/html" id="balances">
  			<div class="layui-form ">
				<div class="layui-form-item" lay-filter="test2">
					<label class="layui-form-label">预约类型</label>
					<div class="layui-input-block">
						<input type="radio" name="typea" <$if(data.type=='初诊'){$> checked="" <$}$> value="初诊" title="初诊"> <input
							type="radio" name="typea" <$if(data.type=='复诊'){$> checked="" <$}$>value="复诊" title="复诊"> <input
							type="radio" name="typea" <$if(data.type=='不速'){$> checked="" <$}$>value="不速" title="不速">
					</div>
				</div>

				<div class="layui-form-item">
					<div class="layui-inline">
						<label class="layui-form-label">就诊日期：</label>
						<div class="layui-input-block">
							<input type="text" name="date" placeholder="" id="date31"
								style="width: 190px;" autocomplete="off"
								class="layui-input startTime">
						</div>
					</div>
					<div class="layui-inline">
						<label class="layui-form-label">耗时：</label>
						<div class="layui-input-inline">
							<input type="text" name="number" placeholder="输入分钟"
								autocomplete="off" class="layui-input addme">
						</div>
						<button class="layui-btn" id="addtime">确定时间</button>
					</div>
				</div>

				<div class="layui-form-item">
					<label class="layui-form-label">就诊时间：</label>
					<div class="layui-input-block">
						<input type="text" name="title" value="<$=data.apptime$>" style="width: 293px;" id="endTime"
							disabled="disabled" name="endTime" lay-verify="title"
							autocomplete="off" class="layui-input">
					</div>
				</div>

				<div class="layui-form-item">
					<label class="layui-form-label">就诊项目</label>
					<div class="layui-input-inline">
						<input type="text" name="thecomment" value="<$=data.comment$>" id="thecomments" lay-verify="required"
							placeholder="请输入项目"  autocomplete="off"
							class="layui-input">
					</div>
				</div>
				<div class="layui-form-item">
					<label class="layui-form-label">总收费</label>
					<div class="layui-input-inline">
						<input type="text" name="thecomment" value="<$=data.getmoney$>" id="getmoney" lay-verify="required"
							placeholder="请输入金额" autocomplete="off"
							class="layui-input">
					</div>
				</div>
				<div class="layui-form-item">
					<label class="layui-form-label">扣除</label>
					<div class="layui-input-inline">
						<input type="text" name="thecomment" value="<$=data.putmoney$>" id="putmoney" lay-verify="required"
							placeholder="请输入金额"  autocomplete="off"
							class="layui-input">
					</div>
				</div>
				
				 
				</div>

			<div class="layui-form-item">
					<label class="layui-form-label">回访时间：</label>
					<div class="layui-input-block">
						<input type="text" name="date"  placeholder="" id="date21"
								style="width: 190px;" autocomplete="off"
								class="layui-input startTime">
					</div>
				</div>

 


				<div class="layui-form-item">
					<label class="layui-form-label">回访内容：</label>
					<div class="layui-input-block">
						<textarea type="text" name="title" value="<$=data.backcomment$>" id="backcomment" style="width: 293px;height: 86px;"  
							 lay-verify="title"
							autocomplete="off" class="layui-input"></textarea>
					</div>
				</div>
			</div>
</script>

	<script type="text/html" id="backtime">

  {{#  if(d.backtime!=null){ }}
	 {{#  return timeUtilsimple(d.backtime.time)}}
  {{#  }  }}

</script>
	<script type="text/html" id="usernameTpl">
  <a class="layui-table-link" target="_blank">{{ d.name }}</a>
</script>
	<script type="text/html" id="backtype">
  {{#  if(d.backtype === 2){ }}
<a class="layui-btn layui-btn-sm" style="background:#C9C9C9;"  disabled="disabled" lay-event="del">已回访</a>
<a class="layui-btn layui-btn-sm" onclick="updateApp({{d.id}},'{{d.name}}')" lay-event="del">修改</a>

  {{#  } else { }}
<a class="layui-btn layui-btn-sm" onclick="getApp({{d.id}},'{{d.name}}','{{d.backcomment}}')" style="background:#009688;color: #fff;">去回访</a>
<a class="layui-btn layui-btn-sm" onclick="updateApp({{d.id}},'{{d.name}}')" lay-event="del">修改</a>
   	
  {{#  } }}
</script>

	<script type="text/html" id="barDemo1">
  <a class="layui-btn layui-btn-xs" lay-event="edit">工具性按钮</a>
</script>
<script type="text/html" id="bardate">
  <div class="layui-form"   >
	<div class="layui-layer-title" style="cursor: move;">
回访患者姓名:【<$=name$>】</div>
<div class="layui-form-item layui-form-text" style="margin-top: 10px;">
<label class="layui-form-label">回访内容</label>
<div class="layui-input-block">
<textarea  id="thearea"  placeholder="请输入内容" style="width:80%;" class="layui-textarea backcomment">
</textarea></div></div><div class="layui-form-item layui-form-text">
<label class="layui-form-label">回访结果</label><div class="layui-input-block">
<textarea placeholder="请输入内容"  style="width:80%;" class="layui-textarea backresult">
</textarea></div></div></div>
</script>


	<script src="${base}/static/layui/dist/layui.js" charset="utf-8"></script>
	<script src="${base}/static/js/common/common.js" charset="utf-8"></script>
	<script src="${base}/static/js/showReturnVisit.js"></script>
	<!-- 注意：如果你直接复制所有代码到本地，上述js路径需要改成你本地的 -->
	
	
	

</body>
</html>