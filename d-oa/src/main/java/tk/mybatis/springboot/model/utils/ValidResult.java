package tk.mybatis.springboot.model.utils;

/**
 * @author 罗棋锋
 * 创建时间：2017.06.15
 * 功能：AjAX校验结果
 */
public class ValidResult {
	
	/**
	 * 校验结果，是否成功
	 */
	public boolean result;
	/**
	 * 成功之后，跳转的URL地址
	 */
	public String url;
	/**
	 * 返回的数据信息
	 */
	public Object data;
	/**
	 * 返回的数据信息
	 */
	public Object Numdata;
	/**
	 * 返回的数据信息
	 */
	public Object Numdata1;
	/**
	 * 返回的数据信息
	 */
	public Object userdata;
	/**
	 * 返回的数据信息
	 */
	public Object notuserdata;
	/**
	 * 校验失败后的错误信息
	 */
	public String errMsg;	
	
}
