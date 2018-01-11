package tk.mybatis.springboot.util;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map;

import freemarker.core.ParseException;
import freemarker.template.Configuration;
import freemarker.template.DefaultObjectWrapper;
import freemarker.template.MalformedTemplateNameException;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import freemarker.template.TemplateNotFoundException;

public class FreemarkerUtil {
	private static FreemarkerUtil util;
	
	private static Configuration cfg;
	public FreemarkerUtil(){
		
	}
	public static FreemarkerUtil getInstance(String pname){
		if (util==null) {
			cfg=new Configuration();
			cfg.setClassForTemplateLoading(FreemarkerUtil.class, pname);
			util=new FreemarkerUtil();
		}
		return util;
	}
	private  Template getTemplate(String fname){
		try {
			return cfg.getTemplate(fname);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
	/**
	 * 通过标准输出流输出模板的结果
	 *@param root 数据对象
	 *@param fname 模板文件
	 *
	 *@author Alan 创建于:2017 2017-6-9 下午2:32:44
	 *
	 */
	public void sprint(Map<String, Object> root,String fname){
		try {
			getTemplate(fname).process(root, new PrintWriter(System.out));
		} catch (TemplateException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	/**
	 * 基于文件的输出
	 *@param root
	 *@param fname
	 *@param outpath
	 *
	 *@author Alan 创建于:2017 2017-6-9 下午2:35:02
	 *
	 */
	public void fprint(Map<String, Object> root,String fname,String outpath){
		try {
			getTemplate(fname).process(root, new FileWriter(outpath));
		} catch (TemplateException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	/**
	 * 
	 *@param templatePath  模板文件存放路径  
	 *@param templateName  模板文件名称  
	 *@param fileName	         生成的文件名称 
	 *@param templateEncoding 文本HTML的编码方式
	 *@param root  储存的数据
	 *
	 *@author Alan 创建于:2017 2017-6-27 下午2:46:34
	 *
	 */
	public  static void analysisTemplate(String templatePath,String templateName,String fileName,String templateEncoding,Map<?,?> root) {
		try {
			// 创建Configuration对象
			Configuration config=new Configuration();
			// 指定模板路径
			File file=new File(templatePath);
			//设置要解析的模板所在的目录，并加载模板文件
			config.setDirectoryForTemplateLoading(file);
			//设置包装器，并将对象包装为数据模型 
			config.setObjectWrapper(new DefaultObjectWrapper());
			//获取模板,并设置编码方式，编码必须要与页面中的编码格式一致 
			Template template =                                                   
					config.getTemplate(templateName,templateEncoding);
			// 合并数据模型与模板
			FileOutputStream fos = new FileOutputStream(fileName);  
			//输出到页面
			Writer out = new OutputStreamWriter(fos,templateEncoding);  
			template.process(root, out);
			out.flush();
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (TemplateException e) {
			e.printStackTrace();
		}
	}
	public  void template(String templateName,String fileHtml,String key,Object value) {
		try {
			Map<String,Object> root=new HashMap<String,Object>();
			root.put(key, value);
			util.getInstance("/fmtemplates");
			Template template =cfg.getTemplate(templateName+".ftl");
			// 合并数据模型与模板
			FileOutputStream fos = new FileOutputStream("src/main/webapp/WEB-INF/view/html/"+fileHtml+".html");  
			//输出到页面
			Writer out = new OutputStreamWriter(fos,"UTF-8");  
			template.process(root, out);
			out.flush();
			out.close();
		} catch (IOException e) {
			Log4j.Log4JOutError(e.getMessage());
		} catch (TemplateException e) {
			e.printStackTrace();
		}
		
		
		
		 
		
	}
/*	public static void template(String templateName,String fileHtml,String key,Object value) {
		Map<String,Object> root=new HashMap<String, Object>();
		root.put(key, value);
		try {
			// 创建Configuration对象
			Configuration config=new Configuration();
			// 指定模板路径
			File file=new File("src/main/webapp/WEB-INF/view/fmtemplates");
			//设置要解析的模板所在的目录，并加载模板文件
			config.setDirectoryForTemplateLoading(file);
			//设置包装器，并将对象包装为数据模型 
			config.setObjectWrapper(new DefaultObjectWrapper());
			//获取模板,并设置编码方式，编码必须要与页面中的编码格式一致 
			Template template =                                                   
					config.getTemplate(templateName+".ftl","UTF-8");
			// 合并数据模型与模板
			FileOutputStream fos = new FileOutputStream("src/main/webapp/WEB-INF/view/html/"+fileHtml+".html");  
			//输出到页面
			Writer out = new OutputStreamWriter(fos,"UTF-8");  
			template.process(root, out);
			out.flush();
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (TemplateException e) {
			e.printStackTrace();
		}
		
	}
*/}
