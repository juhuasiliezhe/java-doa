$(function () {
    var imbase=$("#imbase").val();
    $('#ad-carousel').carousel();
    var df= $('.thetop');
    $('.thetop').eq(3).addClass("active");
    getData();
    addthetime();
});
function addthetime(){

    $("#addappointment").click(function () {
        var id=$("#appointmentid").val();
        var getmoney=$(".getmoney").val();
        var putmoney=$(".putmoney").val();
        if (getmoney==""){
            return;
        }

        $.post("/dappointmentController/addbackComment","id="+id+"&backcomment="+getmoney+"&backresult="+putmoney,function(data){
            alert(data.code)
            $('#searchTable').bootstrapTable( 'refresh');
        },"JSON")

    });


}



function getData(){
    var url = "/dappointmentController/dappointmentbacklist";
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
        sortName : "uptime",     //是否启用排序
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
            return { css:{'color': '#666'}
            };
        },

        columns: [{
            field: 'name',
            title: '姓名',
            align : 'center',
            valign : 'middle',
            width:"3%",

        }, {
            field: 'comment',
            title: '预约项目',
            align : 'center',
            valign : 'middle',
            width:"15%",

        }, {
            field: 'backcomment',
            title: '回访内容',
            align : 'center',
            valign : 'middle',
            width:"10%",
        }, {
            field: 'backresult',
            title: '回访结果',
            align : 'center',
            valign : 'middle',
            width:"5%",
        }, {
            field: 'apptime',
            title: '预约时间',
            align : 'center',
            valign : 'middle',
            sortable : true,
            sortName : "uptime",     //是否启用排序
            sortOrder: "desc",
            width:"3%",
        }, {
            field: 'gettime',
            title: '结算时间',
            align : 'center',
            valign : 'middle',
            width:"2%",

        }, {
            field: 'backtime',
            title: '回访时间',
            align : 'center',
            valign : 'middle',
            width:"2%",

        } , {

            field : '',
            title : '操作',
            align : 'center',
            valign : 'middle',
            events: operateEvents,
            formatter: operateFormatter,
            width:"5%",
        }],

    });
    $(".columns ").css("display","none");
    // $("#searchTable").css("border","1px solid #333333");

}

function operateFormatter(value, row, index) {
    if (row.backtype==2){
        return [
            '<button class="btn btn-success" disabled="disabled" style="margin:2px 5px;width: 50%" >已回访</button>',
        ].join('');

    }
    return [
        '<button class="btn btn-primary yuyue"  data-toggle="modal" data-target="#myModal" style="margin:2px 5px;" >回访</button>',
    ].join('');
}
var operateEvents = {
    'click .yuyue': function(e, value, row, index) {
        $("#appointmentid").val(row.id);
        $("#appointmentname").html(row.name);
    } ,
};




function queryParams(params) {
    var param = {
        pageindex : this.pageNumber,
        pageSize : this.pageSize,
        searchtext:$(".search input.form-control").val(),
        sortOrders: "id"+" "+params.order,
    }
    return param;
}


