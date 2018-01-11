package tk.mybatis.springboot.util;


import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
/**
 * URL参数加密
 * @author Alan 创建于:2017 2017-10-14 上午10:44:11
 *
 */
public class UrlParamEncryption {
	 

	private static final String DES_ALGORITHM = "DES";
	
	private static final String Ourkey = "ztsyOurTheWhatKey2017K";

    /**
     * DES加密
     *@param plainData
     *@param secretKey
     *@return
     *@throws Exception
     *
     *@author Alan 创建于:2017 2017-10-17 下午4:19:41
     *
     */
    public static String encryption(String plainData, String secretKey) throws Exception {
    	
    	if(plainData!=null&&!"".equals(plainData)){
    		plainData=plainData.replace("jiahao","+");
    		Cipher cipher = null;
    		try {
    			cipher = Cipher.getInstance(DES_ALGORITHM);
    			cipher.init(Cipher.ENCRYPT_MODE, generateKey(secretKey));

    		} catch (NoSuchAlgorithmException e) {
    			e.printStackTrace();
    		} catch (NoSuchPaddingException e) {
    			e.printStackTrace();
    		} catch (InvalidKeyException e) {

    		}

    		try {
    			// 为了防止解密时报javax.crypto.IllegalBlockSizeException: Input length must
    			// be multiple of 8 when decrypting with padded cipher异常，
    			// 不能把加密后的字节数组直接转换成字符串
    			byte[] buf = cipher.doFinal(plainData.getBytes());
    			return Base64Utils.encode(buf);

    		} catch (IllegalBlockSizeException e) {
    			e.printStackTrace();
    			throw new Exception("IllegalBlockSizeException", e);
    		} catch (BadPaddingException e) {
    			e.printStackTrace();
    			throw new Exception("BadPaddingException", e);
    		}
    	}
    	return "";

    }
    public static String encryption(String plainData) throws Exception {
    	
    	return encryption(plainData,Ourkey);
    }
    public static String decryption(String secretData) throws Exception {
    	
    	return decryption(secretData,Ourkey);
    }


    /**
     * DES解密
     *@param secretData
     *@param secretKey
     *@return
     *@throws Exception
     *
     *@author Alan 创建于:2017 2017-10-17 下午4:19:54
     *
     */
      
    public static String decryption(String secretData, String secretKey) throws Exception {
    	
    	if(secretData!=null&&!"".equals(secretData)){
    		secretData=secretData.replace("jiahao","+").replace("xiegan","/");
    		Cipher cipher = null;
            try {
                cipher = Cipher.getInstance(DES_ALGORITHM);
                cipher.init(Cipher.DECRYPT_MODE, generateKey(secretKey));

            } catch (NoSuchAlgorithmException e) {
                e.printStackTrace();
                throw new Exception("NoSuchAlgorithmException", e);
            } catch (NoSuchPaddingException e) {
                e.printStackTrace();
            } catch (InvalidKeyException e) {
                e.printStackTrace();
                throw new Exception("InvalidKeyException", e);

            }
            try {

                byte[] buf = cipher.doFinal(Base64Utils.decode(secretData.toCharArray()));

                return new String(buf,"UTF-8");

            } catch (IllegalBlockSizeException e) {
                e.printStackTrace();
                throw new Exception("IllegalBlockSizeException", e);
            } catch (BadPaddingException e) {
                e.printStackTrace();
                throw new Exception("BadPaddingException", e);
            }
            
    		
    	}
    	return "";

        
    }

    /**
     * 获得秘密密钥
     *@param secretKey
     *@return
     *@throws NoSuchAlgorithmException
     *@throws InvalidKeySpecException
     *@throws InvalidKeyException
     *
     *@author Alan 创建于:2017 2017-10-17 下午4:20:04
     *
     */
      
    private static SecretKey generateKey(String secretKey)
            throws NoSuchAlgorithmException, InvalidKeySpecException, InvalidKeyException {
        SecretKeyFactory keyFactory = SecretKeyFactory.getInstance(DES_ALGORITHM);
        DESKeySpec keySpec = new DESKeySpec(secretKey.getBytes());
        keyFactory.generateSecret(keySpec);
        return keyFactory.generateSecret(keySpec);
    }
	/**
	 * base64编码
	 * @author Alan 创建于:2017 2017-10-17 下午4:20:58
	 *
	 */
    static private class Base64Utils {

        static private char[] alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/="
                .toCharArray();
        static private byte[] codes = new byte[256];

        static {
            for (int i = 0; i < 256; i++)
                codes[i] = -1;
            for (int i = 'A'; i <= 'Z'; i++)
                codes[i] = (byte) (i - 'A');
            for (int i = 'a'; i <= 'z'; i++)
                codes[i] = (byte) (26 + i - 'a');
            for (int i = '0'; i <= '9'; i++)
                codes[i] = (byte) (52 + i - '0');
            codes['+'] = 62;
            codes['/'] = 63;
        }

        /**
         * 将原始数据编码为base64编码
         *@param data
         *@return
         *
         *@author Alan 创建于:2017 2017-10-17 下午4:20:19
         *
         */
          
        static private String encode(byte[] data) {
            char[] out = new char[((data.length + 2) / 3) * 4];
            for (int i = 0, index = 0; i < data.length; i += 3, index += 4) {
                boolean quad = false;
                boolean trip = false;
                int val = (0xFF & (int) data[i]);
                val <<= 8;
                if ((i + 1) < data.length) {
                    val |= (0xFF & (int) data[i + 1]);
                    trip = true;
                }
                val <<= 8;
                if ((i + 2) < data.length) {
                    val |= (0xFF & (int) data[i + 2]);
                    quad = true;
                }
                out[index + 3] = alphabet[(quad ? (val & 0x3F) : 64)];
                val >>= 6;
                out[index + 2] = alphabet[(trip ? (val & 0x3F) : 64)];
                val >>= 6;
                out[index + 1] = alphabet[val & 0x3F];
                val >>= 6;
                out[index + 0] = alphabet[val & 0x3F];
            }

            return new String(out);
        }

        /**
         * 将base64编码的数据解码成原始数据
         *@param data
         *@return
         *
         *@author Alan 创建于:2017 2017-10-17 下午4:21:19
         *
         */
          
        static private byte[] decode(char[] data) {
            int len = ((data.length + 3) / 4) * 3;
            if (data.length > 0 && data[data.length - 1] == '=')
                --len;
            if (data.length > 1 && data[data.length - 2] == '=')
                --len;
            byte[] out = new byte[len];
            int shift = 0;
            int accum = 0;
            int index = 0;
            for (int ix = 0; ix < data.length; ix++) {
                int value = codes[data[ix] & 0xFF];
                if (value >= 0) {
                    accum <<= 6;
                    shift += 6;
                    accum |= value;
                    if (shift >= 8) {
                        shift -= 8;
                        out[index++] = (byte) ((accum >> shift) & 0xff);
                    }
                }
            }
            if (index != out.length)
                throw new Error("miscalculated data length!");
            return out;
        }
    }

    /**
     * 测试
     *@param args
     *@throws Exception
     *
     *@author Alan 创建于:2017 2017-10-17 下午4:21:27
     *
     */
	public static void main(String[] args) throws Exception {
		/*UrlParamEncryption des = new UrlParamEncryption();// 实例化一个对像
		des.getKey("aaddd");// 生成密匙
		String strEnc = des.getEncString("www.baidu");// 加密字符串,返回String的密文
		System.out.println(strEnc);*/
		String strEnc = UrlParamEncryption.decryption("sFWxiegan4QneCGM=");// 加密字符串,返回String的密文
		System.out.println(strEnc);
		String strDes = UrlParamEncryption.encryption("成交公告");// 把String 类型的密文解密
		System.out.println(strDes);
	}

}