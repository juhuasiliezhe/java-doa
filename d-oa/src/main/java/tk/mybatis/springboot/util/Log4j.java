package tk.mybatis.springboot.util;

import org.apache.log4j.Logger;

/**
 * 
 * @author Alan 创建于:2017 2017-6-14 上午10:43:19
 *
 * @param <T>
 */
public class Log4j<T> {
	public static Logger	logger	= null;

	/**
	 * 
	 * 创建一个新的实例 Log4j.
	 * 
	 * @param object
	 */
	public Log4j(T t) {
		logger = Logger.getLogger(t.getClass().getName());
	}

	public static void setLog4j(Class<?> T) {
		logger = Logger.getLogger(T.getName());
	}

	/**
	 * 輸出信息日誌
	 */
	public static void Log4jOutInfo(Object Info) {
		logger.info("信息：" + Info);
	}

	/**
	 * 輸出錯誤
	 */
	public static void Log4JOutError(Object Info) {
		logger.error("错误信息：" + Info);
	}
}
