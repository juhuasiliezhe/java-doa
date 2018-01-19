function timeUtils(value){
	if(value==undefined){
		return "-";
	}
	  var date = new Date(value);
	  return dateFormat (value,"yyyy-MM-dd hh:mm:ss");
  }
function timeUtilsimple(value){
	if(value==undefined){
		return "-";
	}
	var date = new Date(value);
	return dateFormat (value,"yyyy-MM-dd");
}


function  dateFormat (value,format) {
	
	var now=new Date(value);
	
    var date = {
           "M+": now.getMonth() + 1,
           "d+": now.getDate(),
           "h+": now.getHours(),
           "m+": now.getMinutes(),
           "s+": now.getSeconds(),
           "q+": Math.floor((now.getMonth() + 3) / 3),
           "S+": now.getMilliseconds()
    };
    if (/(y+)/i.test(format)) {
           format = format.replace(RegExp.$1, (now.getFullYear() + '').substr(4 - RegExp.$1.length));
    }
    for (var k in date) {
           if (new RegExp("(" + k + ")").test(format)) {
                  format = format.replace(RegExp.$1, RegExp.$1.length == 1
                         ? date[k] : ("00" + date[k]).substr(("" + date[k]).length));
           }
    }
    return format;
}
