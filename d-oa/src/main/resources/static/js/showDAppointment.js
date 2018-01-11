$(function () {
    var imbase=$("#imbase").val();
    $('#ad-carousel').carousel();
    var df= $('.thetop');
    $('.thetop').eq(3).addClass("active");
    getData();
    addthetime();
    searchwhat();
});
function addthetime(){

    $("#addappointment").click(function () {
        var id=$("#appointmentid").val();
        var getmoney=$(".getmoney").val();
        var putmoney=$(".putmoney").val();
        if (getmoney==""){
            return;
        }

       $.post("/dappointmentController/addMoneyAppointment","id="+id+"&getmoney="+getmoney+"&putmoney="+putmoney,function(data){
           $('#searchTable').bootstrapTable( 'refresh');
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
function searchwhat(){
	$("#seach_Date").click(function () {
			getData();
           $('#searchTable').bootstrapTable( 'refresh');
    });
}



function getData(){
    var url = "/dappointmentController/dappointmentlist";
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
            toolbar: false,
        }, {

            field: 'name',
            title: '姓名',
            align : 'center',
            valign : 'middle',
            width:"3%",
        }, {
            field: 'apptime',
            title: '预约时间',
            align : 'center',
            valign : 'middle',
            sortable : true,
            sortName : "uptime",     //是否启用排序
            sortOrder: "desc",
            width:"2%",


        }, {
            field: 'type',
            title: '预约类型',
            align : 'center',
            valign : 'middle',
            width:"5%",

        }, {
            field: 'comment',
            title: '预约项目',
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

}

function operateFormatter(value, row, index) {
    if (row.upstatus==2){
        return [
            '<button class="btn btn-success" disabled="disabled" style="margin:2px 5px;width: 50%" >已结算</button>',
        ].join('');

    }
    return [
        '<button class="btn btn-primary yuyue"  data-toggle="modal" data-target="#myModal" style="margin:2px 5px;" >结算</button>',
        '<button class="btn btn-default shanchu" data-toggle="modal"  data-target="#myModal2" style="margin:2px 5px;" >取消预约</button>',
    ].join('');
}
var operateEvents = {
    'click .yuyue': function(e, value, row, index) {
        $("#appointmentid").val(row.id);
        $("#appointmentname").html(row.name);
    } ,
    'click .shanchu': function(e, value, row, index) {
    	$("#appointmentid").val(row.id);
    } ,
};




function queryParams(params) {
    var param = {
        pageindex : this.pageNumber,
        pageSize : this.pageSize,
        searchtext:$(".search input.form-control").val(),
        sortOrders: "id"+" "+params.order,
        startDate:$(".startTime").val(),
    }
    return param;
}

