package tk.mybatis.springboot.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.URL;
import java.net.URLConnection;


/**
 * 短信发送 罗棋锋 2017.6.16
 * @author dell
 *
 */
public class SMS {
	
	private static String URL="http://www.72dns.com/smsadmin/Sms_Api.aspx";
	
	private static String account="4151";
	
	private static String pwd="123456%";

	/**
	 * 发送短信 罗棋锋 2017.6.16
	 * @param tel
	 * @param msg
	 * @return
	 */
	public static String sendSMS(String tel,String msg) {
		StringBuilder param=new StringBuilder();
		param.append("UserID="+account);
		param.append("&PassWord="+MD5.getInstance().getMD5(pwd));
		param.append("&mobile="+tel);
		param.append("&message=【智图数研】"+msg);
		param.append("&action=SendSms");
		String result= sendPost(param.toString());
		return result;
	}
	
	
	/**
     * 向指定 URL 发送POST方法的请求
     * 
     * @param url
     *            发送请求的 URL
     * @param param
     *            请求参数，请求参数应该是 name1=value1&name2=value2 的形式。
     * @return 所代表远程资源的响应结果
     */
    public static String sendPost(String param) {
        PrintWriter out = null;
        BufferedReader in = null;
        String result = "";
        try {
            URL realUrl = new URL(URL);
            // 打开和URL之间的连接
            URLConnection conn = realUrl.openConnection();
            // 设置通用的请求属性
            conn.setRequestProperty("accept", "*/*");
            conn.setRequestProperty("connection", "Keep-Alive");
            conn.setRequestProperty("user-agent",
                    "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1;SV1)");
            // 发送POST请求必须设置如下两行
            conn.setDoOutput(true);
            conn.setDoInput(true);
            // 获取URLConnection对象对应的输出流
            out = new PrintWriter(conn.getOutputStream());
            // 发送请求参数
            out.print(param);
            System.out.print("5678:"+param);
            // flush输出流的缓冲
            out.flush();
            // 定义BufferedReader输入流来读取URL的响应
            in = new BufferedReader(
                    new InputStreamReader(conn.getInputStream()));
            String line;
            while ((line = in.readLine()) != null) {
                result += line;
            }
        } catch (Exception e) {
            System.out.println("发送 POST 请求出现异常！"+e);
            e.printStackTrace();
        }
        //使用finally块来关闭输出流、输入流
        finally{
            try{
                if(out!=null){
                    out.close();
                }
                if(in!=null){
                    in.close();
                }
            }
            catch(IOException ex){
                ex.printStackTrace();
            }
        }
        return result;
    }    
	
    public static String verification(){
    	int random = (int) (Math.random()*9000+1000);
    	String verification = String.valueOf(random);
		return verification;
    }
   
}
