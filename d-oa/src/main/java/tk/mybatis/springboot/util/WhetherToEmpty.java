package tk.mybatis.springboot.util;

import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 *  判斷真或者假
 * @author Alan
 * WhetherToEmpty 
 * 
 * 2017-6-6  下午10:01:58
 */
public class WhetherToEmpty {

	private static Boolean	empty;

	/**
	 * 判斷字符串是否 為空 是：返回true 不是：false
	 */
	public static Boolean StringWhetherToEmpty(String str) {
		if (str != null) {

			if (!" ".equals(str)) {
				try {
					if (str.length() > 0) {
						empty = false;
					} else {
						empty = true;
					}
				} catch (Exception e) {
					empty = true;
				}
			} else {
				empty = true;
			}

		} else {
			empty = true;
		}
		return empty;
	}

	/**
	 * 判斷一類是否為空
	 */
	@SuppressWarnings({ "rawtypes" })
	public static Boolean ObjectWhetherToEmpty(Object obj) {
		empty = false;

		if (obj == null)
			empty = true;

		if (obj instanceof CharSequence)
			empty = ((CharSequence) obj).length() == 0;

		if (obj instanceof Collection)
			empty = ((Collection) obj).isEmpty();

		if (obj instanceof Map)
			empty = ((Map) obj).isEmpty();
		if (obj instanceof Object[]) {
			Object[] object = (Object[]) obj;
			if (object.length == 0) {
				empty = true;
			}
			return empty;
		}

		return empty;
	}

	/**
	 * 判斷list 是否有元素 和是否為空
	 */
	public static Boolean ListWhetherToEmpty(List<?> list) {
		empty = true;
		if (list != null) {
			if (!list.isEmpty()) {
				if (list.size() > 0) {
					WhetherToEmpty.ObjectWhetherToEmpty(list);
				}
			}
		}
		return empty;
	}

}
