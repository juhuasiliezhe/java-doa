$(function () {
	layonthis();
	sureSecond();
});
function sureSecond(){
	$(".submitdata").click(function(){
		layer.open({
	        type: 1
	        ,id: 'layerDemo1' //防止重复弹出
	        ,content: '<div style="padding: 20px 100px;">确定提交资料吗</div>'
	        ,btn: ['确定', '取消']
	        ,btnAlign: 'c' //按钮居中
	        ,shade: 0 //不显示遮罩
	        ,yes: function(){
	        	$(".layui-form").submit();
	        }
	      });
	}) ;
}

function layonthis(){
	layui.use(['form', 'layedit', 'laydate'], function(){
		  var form = layui.form
		  ,layer = layui.layer
		  ,layedit = layui.layedit
		  ,laydate = layui.laydate
		  //日期
		  laydate.render({
		    elem: '#date'
		    	,done: function(value, date, endDate){
		    	  }
		  });
		  laydate.render({
		    elem: '#date1'
		    	,done: function(value, date, endDate){
		    		birthdaychange();
		    	  }
		  
		  });
		  laydate.render({
		    elem: '#date11'
		    	,done: function(value, date, endDate){
		    	  }
		  });
		  
		  
		  
		  
		  
		  //创建一个编辑器
		  var editIndex = layedit.build('LAY_demo_editor');
		 
		  //自定义验证规则
		  form.verify({
		    title: function(value){
		      if(value.length < 5){
		        return '标题至少得5个字符啊';
		      }
		    }
		    ,pass: [/(.+){6,12}$/, '密码必须6到12位']
		    ,content: function(value){
		      layedit.sync(editIndex);
		    }
		  });
		  
		  //监听指定开关
		  form.on('switch(switchTest)', function(data){
		    layer.msg('开关checked：'+ (this.checked ? 'true' : 'false'), {
		      offset: '6px'
		    });
		    layer.tips('温馨提示：请注意开关状态的文字可以随意定义，而不仅仅是ON|OFF', data.othis)
		  });
		  
		  //监听提交
		  form.on('submit(demo1)', function(data){
		    layer.alert(JSON.stringify(data.field), {
		      title: '最终的提交信息'
		    })
		    return false;
		  });
		  
		   
		});
}

function birthdaychange(){
	var dates=$("#date1").val();
	var theage=jsGetAge(dates);
	$("#theage").val(theage);
	
}


function jsGetAge(strBirthday){         
    var returnAge;  
    var strBirthdayArr=strBirthday.split("-");  
    var birthYear = strBirthdayArr[0];  
    var birthMonth = strBirthdayArr[1];  
    var birthDay = strBirthdayArr[2];  
      
    d = new Date();  
    var nowYear = d.getFullYear();  
    var nowMonth = d.getMonth() + 1;  
    var nowDay = d.getDate();  
      
    if(nowYear == birthYear){  
        returnAge = 0;//同年 则为0岁  
    }  
    else{  
        var ageDiff = nowYear - birthYear ; //年之差  
        if(ageDiff > 0){  
            if(nowMonth == birthMonth) {  
                var dayDiff = nowDay - birthDay;//日之差  
                if(dayDiff < 0)  
                {  
                    returnAge = ageDiff - 1;  
                }  
                else  
                {  
                    returnAge = ageDiff ;  
                }  
            }  
            else  
            {  
                var monthDiff = nowMonth - birthMonth;//月之差  
                if(monthDiff < 0)  
                {  
                    returnAge = ageDiff - 1;  
                }  
                else  
                {  
                    returnAge = ageDiff ;  
                }  
            }  
        }  
        else  
        {  
            returnAge = -1;//返回-1 表示出生日期输入错误 晚于今天  
        }  
    }  
      
    return returnAge;//返回周岁年龄  
      
}  
	


