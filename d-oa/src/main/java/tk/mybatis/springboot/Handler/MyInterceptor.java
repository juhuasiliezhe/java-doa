package tk.mybatis.springboot.Handler;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

/**
 * 说明：
 *
 * @Author: Alan
 * 2017-12-21  21:49:10
 * 星期四
 */
public class MyInterceptor implements HandlerInterceptor {
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		request.setCharacterEncoding("UTF-8");  
		String url = request.getServletPath();      
		System.out.println("post URL："+url);
		if(!url.equals("")){  
			//判斷是否已登录  
			if(request.getSession().getAttribute("user") == null){  
				response.sendRedirect(request.getContextPath()+"/duserController/login.html");
				return false;
			} 
		}  
		return true;  
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
	}
}
