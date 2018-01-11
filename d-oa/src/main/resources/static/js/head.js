$(function () {
    clickWork();
});
function  clickWork(){
    $(".thetop").click(function(){
        $(this).addClass("active").siblings().removeClass("active");
    });
}