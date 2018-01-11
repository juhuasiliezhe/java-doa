$(function () {
    var imbase=$("#imbase").val();
    $('#ad-carousel').carousel();
    var df= $('.thetop');
    $('.thetop').eq(3).addClass("active");
    getData();
    addthetime();
});
function addthetime(){
    $("#addtime").click(function () {
        var starttime=$(".startTime").val();
        var getmin=$(".addme").val();
        if (starttime!=""&&getmin!=""){
            var endtime=judgFailTime(starttime+":00",Number(getmin)).split(" ")[1];

            $(".startTime").val(starttime.split(" ")[0]+" 【"+starttime.split(" ")[1]+"-"+endtime.substring(0,5)+"】");
        }
        
    });
    $("#addappointment").click(function () {
        var id=$("#appointmentid").val();
        var name=$("#appointmentname").html();

        var type= $('input:radio[name="nephropathy"]:checked').val();
        var apptime=$(".startTime").val();
        var comment=$("#thecomment").val();
      $.post("/dappointmentController/addappointments","pid="+id+"&name="+name+"&type="+type+"&apptime="+apptime+"&comment="+comment,function(data){
           alert(data.code)

       },"JSON")


    });
    
    $("#downappointment").click(function () {
    	var id=$("#appointmentid").val();
    	
    	$.post("/dappointmentController/downMoneyAppointment","id="+id,function(data){
    		alert(data.code)
    		$('#searchTable').bootstrapTable( 'refresh');
    	},"JSON")
    	
    });


}


/**
 * 日期加分钟
 */
function judgFailTime(data,minute) {
    var time = new Date(data.replace("-","/"));
    var b = minute; //分钟数
    time.setMinutes(time.getMinutes() + b, time.getSeconds(), 0);
    return dateToString(time)
    //如何将b的分钟数加到上面的时间上？？？？？
}

/**
 * 日期格式转字符串
 * @param now
 * @returns {string}
 */
function dateToString(now){
    var year = now.getFullYear();
    var month =(now.getMonth() + 1).toString();
    var day = (now.getDate()).toString();
    var hour = (now.getHours()).toString();
    var minute = (now.getMinutes()).toString();
    var second = (now.getSeconds()).toString();
    if (month.length == 1) {
        month = "0" + month;
    }
    if (day.length == 1) {
        day = "0" + day;
    }
    if (hour.length == 1) {
        hour = "0" + hour;
    }
    if (minute.length == 1) {
        minute = "0" + minute;
    }
    if (second.length == 1) {
        second = "0" + second;
    }
    var dateTime = year + "-" + month + "-" + day +" "+ hour +":"+minute+":"+second;
    return dateTime;
}

function getData(){
    var url = "/back/showPatient";
    $('#searchTable').bootstrapTable({
        method:'post',
        dataType:'json',
        cache: false,
        striped: true,                              //是否显示行间隔色
        sidePagination: "server",           //分页方式：client客户端分页，server服务端分页（*）
        url:url,
        showColumns:true,
        strictSearch: true,

        pagination:true,
        sortable : true,
        sortName : "id",     //是否启用排序
        sortOrder: "desc",
        queryParams : queryParams,
        pageNumber:1,
        //初始化加载第一页，默认第一页
        pageSize: 7,                       //每页的记录行数（*）
        pageList: [7,15,25],        //可供选择的每页的行数（*）
        uniqueId: "hid",

        clickToSelect: true,
        searchOnEnterKey: true,
        search:true,
        rowStyle: function rowStyle( row, index) {
            return { css:{'color': '#0000cc'}
            };
        },

        columns: [{
            field: 'id',
            title: '编号',
            align : 'center',
            valign : 'middle',
            width:"1%",
            sortable : true,
            sortName : "id",     //是否启用排序
            sortOrder: "desc",
        }, {
            field: 'name',
            title: '性别',
            align : 'center',
            valign : 'middle',
            width:"3%",
        }, {
            field: 'sex',
            title: '性别',
            align : 'center',
            valign : 'middle',
            width:"2%",
        }, {
            field: 'fromwhere',
            title: '患者来源',
            align : 'center',
            valign : 'middle',
            width:"3%",

        }, {
            field: 'cometime',
            title: '初诊日期',
            align : 'center',
            valign : 'middle',
            width:"5%",
        }, {
            field: 'phone',
            title: '手机号码',
            align : 'center',
            valign : 'middle',
            width:"5%",
        }, {
            field: 'uptime',
            title: '添加时间',
            align : 'center',
            valign : 'middle',

            width:"5%",
        }, {
            field: 'tip',
            title: '备注',
            align : 'center',
            valign : 'middle',
            width:"15%",
        } , {

            field : '',
            title : '操作',
            align : 'center',
            valign : 'middle',
            events: operateEvents,
            formatter: operateFormatter,
            width:"11%",
        }],

    });
    $(".columns ").css("display","none");
    // $("#searchTable").css("border","1px solid #333333");

}

function operateFormatter(value, row, index) {

    return [
        '<button class="btn btn-success yuyue"  data-toggle="modal" data-target="#myModal" style="margin:2px 5px;" >预约</button>',
        '<button class="btn btn-primary xiangqing" style="margin:2px 5px;" >详情</button>',
        '<button class="btn btn-default shanchu" data-toggle="modal" data-target="#myModal2" style="margin:2px 5px;" >删除</button>',
    ].join('');
}
var operateEvents = {
    'click .yuyue': function(e, value, row, index) {
        $("#appointmentid").val(row.id);
        $("#appointmentname").html(row.name);
    } ,
    'click .shanchu': function(e, value, row, index) {
    	$("#appointmentid").val(row.id);
    	$("#appointmentname2").html(row.name);
    } ,
};



function rowStyle(row, index){
    return { classes:'text-nowrap another-class',css: {'color': '#0000cc', 'font-size': '50px'}
}; }





function queryParams(params) {
    var param = {
        pageindex : this.pageNumber,
        pageSize : this.pageSize,
        searchtext:$(".search input.form-control").val(),
        sortOrders: "id"+" "+params.order,
    }
    return param;
}

