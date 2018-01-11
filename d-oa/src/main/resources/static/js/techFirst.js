$(function () {
    var imbase=$("#imbase").val();
    $('#ad-carousel').carousel();
    var df= $('.thetop');
    $('.thetop').eq(3).addClass("active");
    getData();

});

function getData(){
    var url = "/technology/listUsers";
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
        pageSize: 15,                       //每页的记录行数（*）
        pageList: [15,25,50],        //可供选择的每页的行数（*）
        uniqueId: "hid",

        clickToSelect: true,
        searchOnEnterKey: true,
        search:true,
        rowStyle: function rowStyle( row, index) {
            return { css:{'color': 'blue'}
            };
        },

        columns: [{
            field: 'title',
            title: '标题',
            align : 'center',
            valign : 'middle',
            width:"50%",
            cellStyle:function(value,row,index){
                return { classes:'another-class',css:{'color': 'blue'}
                };
            }
        }, {
            field: 'categoryname',
            title: '文章类型',
            align : 'center',
            valign : 'middle',

            width:"15%",
        }, {
            field: 'hits',
            title: '浏览',
            align : 'center',
            valign : 'middle',
            width:"15%",

        }, {
            field: 'uptime',
            title: '时间	',
            align : 'center',
            valign : 'middle',
            width:"15%",
            sortable : true,
            sortName : "uptime",     //是否启用排序
            sortOrder: "desc",


        }],

    });
    // $("#searchTable").css("border","1px solid #333333");

}



function rowStyle(row, index){
    return { classes:'text-nowrap another-class',css: {'color': 'blue', 'font-size': '50px'}
}; }



function operateFormatter(value, row, index) {
    var button = new Array();
    button.push('<a class="delete" href="javascript:void(0)" title="删除">删除</a>');
    return button.join("");
}
function keywordFormatter(value, row, index) {
    var button = new Array();

    var keyword=encryptByDES(row.keyword+"","ztsyOurTheWhatKey2017K");
    var CG=encryptByDES(row.inforType+"","ztsyOurTheWhatKey2017K");

    var PV=encryptByDES(row.province+"","ztsyOurTheWhatKey2017K");

    button.push('<a class="edit" target="_blank" href="${base}/Search/searchResult.html?keyWord='+keyword+'&CG='+CG+'&PV='+PV+'" >'+row.keyword+'</a>');
    return button.join("");
}
function datahere(value, row, index) {
    if(value==""){
        return "全国";
    }
    return value;
}
function datahere2(value, row, index) {
    if(value==""){
        return "全部";
    }
    return value;
}

function queryParams(params) {
    var param = {
        pageindex : this.pageNumber,
        pageSize : this.pageSize,
        searchtext:$(".search input.form-control").val(),
        sortOrders: "uptime"+" "+params.order,
    }
    return param;
}

