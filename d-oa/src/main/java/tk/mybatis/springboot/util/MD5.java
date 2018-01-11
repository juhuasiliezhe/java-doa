package tk.mybatis.springboot.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * 罗棋锋 MD5 加密
 * @author dell
 *
 */
public class MD5 {
	private static MD5 md5 = null;

	public static MD5 getInstance() {
		if (md5 == null) {
			return new MD5();
		} else {
			return md5;
		}
	}

	/**
	 * 罗棋锋 密码加密
	 * @param userPwd
	 * @return
	 */
	public String md5Encrypt(String userPwd) {
		if (userPwd == null || "".equals(userPwd)) {
			return null;
		}
		
		userPwd = "df"+userPwd + "$%^";
		byte[] source = userPwd.getBytes();
		String s = null;
		char hexDigits[] = { // 用来将字节转换成 16 进制表示的字符
		'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd',
				'e', 'f' };
		try {
			MessageDigest md = MessageDigest
					.getInstance("MD5");
			md.update(source);
			byte tmp[] = md.digest(); // MD5 的计算结果是一个 128 位的长整数，
			// 用字节表示就是 16 个字节
			char str[] = new char[16 * 2]; // 每个字节用 16 进制表示的话，使用两个字符，
			// 所以表示成 16 进制需要 32 个字符
			int k = 0; // 表示转换结果中对应的字符位置
			for (int i = 0; i < 16; i++) { // 从第一个字节开始，对 MD5 的每一个字节
				// 转换成 16 进制字符的转换
				byte byte0 = tmp[i]; // 取第 i 个字节
				str[k++] = hexDigits[byte0 >>> 4 & 0xf]; // 取字节中高 4 位的数字转换,
				// >>> 为逻辑右移，将符号位一起右移
				str[k++] = hexDigits[byte0 & 0xf]; // 取字节中低 4 位的数字转换
			}
			s = new String(str); // 换后的结果转换为字符串
		} catch (Exception e) {
			e.printStackTrace();
		}
		return s;
	}
	
	
	public String getMD5(String sourceStr) {
		
		String s = null;
		// 用来将字节转换成16进制表示的字符R
		char[] hexDigits = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
				'a', 'b', 'c', 'd', 'e', 'f' };
		try {
			MessageDigest md = MessageDigest.getInstance("MD5");
			md.update(sourceStr.getBytes());
			// MD5的计算结果是一个128位的长整数，用字节表示为16个字节
			byte[] tmp = md.digest();
			// 每个字节用16进制表示的话，使用2个字符(高4位一个,低4位一个)，所以表示成16进制需要32个字符
			char[] str = new char[16 * 2];
			int k = 0;// 转换结果中对应的字符位置
			for (int i = 0; i < 16; i++) {// 对MD5的每一个字节转换成16进制字符
				byte byte0 = tmp[i];
				str[k++] = hexDigits[byte0 >>> 4 & 0xf];// 对字节高4位进行16进制转换
				str[k++] = hexDigits[byte0 & 0xf]; // 对字节低4位进行16进制转换
			}
			s = new String(str);
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		return s;
		
	}

	

}
