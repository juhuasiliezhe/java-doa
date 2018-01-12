package tk.mybatis.springboot.controller;


import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import net.sf.json.JSONObject;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.servlet.ModelAndView;
import com.github.pagehelper.Page;

import tk.mybatis.springboot.model.DUser;
import tk.mybatis.springboot.util.JsonUtils;
import tk.mybatis.springboot.util.Log4j;

/**
 * @author Alan
 * BaseConntroller
 * 
 * 2017-6-6  下午8:56:07
 */
public class BaseController{

	protected HttpServletRequest				request;
	
	protected HttpServletResponse				response;
	
	protected HttpSession						session;

	protected List<?>							ControList			= new ArrayList();

	protected Map<String, List<?>>  			ControJsonMap		= new HashMap<String, List<?>>();

	protected Map<String, Object>				ControJsonObject	= new HashMap<String, Object>();

	protected ModelAndView 						modelAndView 		= new ModelAndView();

	@ModelAttribute
	public void setReqAndRes(HttpServletRequest request, HttpServletResponse response) {
		this.request = request;
		this.response = response;
		this.session = request.getSession();
		try {
			request.setCharacterEncoding("utf-8");
			response.setCharacterEncoding("utf-8");
			response.setHeader("contentType", "text/html; charset=utf-8");
		} catch (UnsupportedEncodingException e) {
			Log4j.setLog4j(this.getClass());
			Log4j.Log4JOutError("設置編碼失敗");
		}
	}
	public Map<String, List<?>> getControJsonMap() {
		return ControJsonMap;
	}

	
	public Map<String, Object> getControJsonObject() {
		return ControJsonObject;
	}


	/**
	 * 向前端输入json数据 传一个数据
	 * @param key
	 * @param value
	 * 示例 
	 * sendOutPrint("list","任何值");
	 *
	 * @author Alan 创建于:2017 2017-6-19 下午5:10:37
	 *
	 */
	public void sendOutPrint(String key,Object value) {
		Map<String, Object> ControJsonMap = new HashMap<String, Object>();
		ControJsonMap.put(key, value);
		sendOutPrint(ControJsonMap);
	}
	
	/**
	 *向前端输入json数据 传多个数据
	 *@param ControJsonMap
	 *示例 ControJsonObject.put("list", ContentList);
	 *	 ControJsonObject.put("size", size);
	 *	 ControJsonObject.put("list", time);
	 *	 sendOutPrint(ControJsonObject);
	 *
	 *@author Alan 创建于:2017 2017-6-19 下午5:12:23
	 *
	 */
	public void sendOutPrint(Map<String, Object> ControJsonMap) {
		try {
			PrintWriter out = response.getWriter();
			JSONObject json = new JSONObject();
			for (Entry<String, Object> map : ControJsonMap.entrySet()) {
				json.put(map.getKey(), map.getValue());
			}
			char[] buf = json.toString().toCharArray();
			if(buf.length>0){
				out.write(buf);
				out.flush();
				out.close();
				System.out.println("*******************数据发送到前台*******************");
				ControJsonMap.clear();
			}
		} catch (IOException e) {
			Log4j.Log4JOutError(e.getMessage());
		}
	}
	 

	public void pageOutPrint(Page data) {
		Map<String, Object> ControJsonMap = new HashMap<String, Object>();
		if(data==null){
			ControJsonMap.put("total", 0);
			ControJsonMap.put("rows", "[]");
			sendOutPrint(ControJsonMap);
			return;
		}
		
		ControJsonMap.put("total", data.getTotal());
		ControJsonMap.put("rows", JsonUtils.objectToJson(data.getResult()));
		sendOutPrint(ControJsonMap);
	}
	/**
	 * 返回JSON到前台 罗棋锋 2017.6.19
	 * @param key
	 * @param value
	 */
	public void sendOutPrint(Object value) {
		
		try {
			PrintWriter out = response.getWriter();
			char[] buf = JsonUtils.objectToJson(value).toCharArray();
			if(buf.length>0){
			out.write(buf);
			out.flush();
			out.close();
			}
		} catch (IOException e) {
			Log4j.Log4JOutError(e.getMessage());
		}
	}
	public void sendOutPrint1(Object value) {
		
		try {
			PrintWriter out = response.getWriter();
			char[] buf = JSONObject.fromObject(value).toString().toCharArray();
			if(buf.length>0){
				out.write(buf);
				out.flush();
				out.close();
			}
		} catch (IOException e) {
			Log4j.Log4JOutError(e.getMessage());
		}
	}
	
	/**
	 * 获取用户IP
	 * @return
	 */
	public  String getIp() {
        String ip = request.getHeader("x-forwarded-for");
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("Proxy-Client-IP");
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("WL-Proxy-Client-IP");
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getRemoteAddr();
        }
        return ip;
    }
	/**
	 * 根据判断返回结果   1为成功  0为失败
	 *@param boolean1
	 *@return
	 *
	 *@author Alan 创建于:2017 2017-6-22 上午10:21:45
	 *
	 */
	public void result(Boolean boolean1){
		int i=0;
		if (boolean1==true) {
			i=1;
		} 
		sendOutPrint("result", i);
	}
	
	public DUser GetCurUser(){
		DUser user = null;
		try {
			user = ((DUser) request.getSession().getAttribute("user"));
		} catch (Exception e) {
			//logger.info("获取用户登录信息失败");
			return user;
		}
		return user;
	}

}
