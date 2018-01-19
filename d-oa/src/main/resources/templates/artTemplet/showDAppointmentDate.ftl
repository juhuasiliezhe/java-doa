<script type="text/html" id="jiesuan">


<div class="layui-form " style="margin-top: 21px;">
				<div class="layui-form-item">
					<label class="layui-form-label">总额：</label>
					<div class="layui-input-inline">
						<input type="text"  id="allmoney" lay-verify="required"
							placeholder="请输入金额"  autocomplete="off"
							class="layui-input">
					</div>
				</div>
				<div class="layui-form-item">
					<label class="layui-form-label">扣除：</label>
					<div class="layui-input-inline">
						<input type="text"  id="subtractmoney" lay-verify="required"
							placeholder="请输入金额"  autocomplete="off"
							class="layui-input">
					</div>
				</div>
				
				<div class="layui-form-item">
			<div class="layui-inline">
				<label class="layui-form-label">回访日期：</label>
				<div class="layui-input-block">
					<input type="text" name="backtime" id="date11" autocomplete="off"
						class="layui-input">
				</div>
			</div>
			<div class="layui-form-item">
					<label class="layui-form-label">回访内容：</label>
					<div class="layui-input-block">
						<textarea type="text" name="title" id="backcomment" style="width: 293px;height: 86px;"  
							 lay-verify="title"
							autocomplete="off" class="layui-input"></textarea>
					</div>
				</div>
			 
		</div>
			</div>
  
</script>



	<script type="text/html" id="usernameTpl">
  <a class="layui-table-link" target="_blank">{{ d.name }}</a>
</script>
	<script type="text/html" id="backtype">
  {{#  if(d.upstatus ===2){ }}
<a class="layui-btn layui-btn-sm" style="background:#C9C9C9;" disabled="disabled" lay-event="del">结算</a>
<a class="layui-btn layui-btn-sm" onclick="updateApp({{d.id}},'{{d.name}}')" lay-event="del">修改</a>
<a class="layui-btn layui-btn-danger layui-btn-sm" style="background:#C9C9C9;" disabled="disabled"  lay-event="del">删除</a>
  {{#  } else { }}
 	 <a class="layui-btn layui-btn-sm" onclick="balances({{d.id}},'{{d.name}}')" lay-event="edit">结算</a>
 	 <a class="layui-btn layui-btn-sm" onclick="updateApp({{d.id}},'{{d.name}}')" lay-event="del">修改</a>
 	 <a class="layui-btn layui-btn-danger layui-btn-sm" onclick="delappointemt({{d.id}},'{{d.name}}')" lay-event="del">删除</a>
   	
  {{#  } }}
</script>

	<script type="text/html" id="barDemo1">
  <a class="layui-btn layui-btn-xs" lay-event="edit">工具性按钮</a>
</script>


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
						<input type="text" name="date"  value="<$=data.backtime$>" placeholder="" id="date21"
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