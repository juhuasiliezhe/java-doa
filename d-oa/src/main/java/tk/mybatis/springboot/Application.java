package tk.mybatis.springboot;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import javax.servlet.MultipartConfigElement;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFFont;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.util.HSSFColor;
import org.apache.poi.ss.usermodel.BorderStyle;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.HorizontalAlignment;
import org.apache.poi.ss.usermodel.VerticalAlignment;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.MultipartConfigFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import tk.mybatis.spring.annotation.MapperScan;

/**
 * 
 * @author Alan 创建于: 2018-1-11 上午11:50:26
 *
 */
@Controller
@EnableWebMvc
@Configuration
@SpringBootApplication
@MapperScan("tk.mybatis.springboot.mapper")
public class Application extends WebMvcConfigurerAdapter implements CommandLineRunner {
    private Logger logger = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        logger.info("服务启动完成!");

    }

    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
                           ModelAndView modelAndView) throws Exception {

        System.out.println(">>>MyInterceptor1>>>>>>>请求处理之后进行调用，但是在视图被渲染之前（Controller方法调用之后）");
    }

    @RequestMapping("")
    String home() {

        return "index";
//        return "redirect:back/backindex";
    }
    @RequestMapping("index")
    String index() {
    	
    	return "index";
//        return "redirect:back/backindex";
    }
    
    @GetMapping("login.html")
    public String  login() {

        return  "back/login";
    }
    @GetMapping("learn")
    public String  learn() {
    	
    	return  "back/learning";
    }
    
    //显示声明CommonsMultipartResolver为mutipartResolver
    /**
     * 文件上传配置
     * @return
     */
    @Bean
    public MultipartConfigElement multipartConfigElement() {
        MultipartConfigFactory factory = new MultipartConfigFactory();
        //文件最大
        factory.setMaxFileSize("10240KB"); //KB,MB
        /// 设置总上传数据总大小
        factory.setMaxRequestSize("102400KB");
        return factory.createMultipartConfig();
    }
    
    
    
    
    @GetMapping("tedsfsdf")
    public void export(HttpServletRequest request, HttpServletResponse res) throws IOException {  
    	/**
         * 以下为生成Excel操作
         */
        // 1.创建一个workbook，对应一个Excel文件
        HSSFWorkbook wb = new HSSFWorkbook();
        // 2.在workbook中添加一个sheet，对应Excel中的一个sheet
        HSSFSheet sheet = wb.createSheet("XXX表");
        // 3.在sheet中添加表头第0行，老版本poi对excel行数列数有限制short
        HSSFRow row = sheet.createRow((int) 0);
        // 4.创建单元格，设置值表头，设置表头居中
        HSSFCellStyle style = wb.createCellStyle();
        // 居中格式
        style.setAlignment(HSSFCellStyle.ALIGN_CENTER);
   
        // 设置表头
        HSSFCell cell = row.createCell(0);
        cell.setCellValue("表头1");
        cell.setCellStyle(style);
   
        cell = row.createCell(1);
        cell.setCellValue("表头2");
        cell.setCellStyle(style);
   
        cell = row.createCell(2);
        cell.setCellValue("表头3");
        cell.setCellStyle(style);
   
        cell = row.createCell(3);
        cell.setCellValue("表头4");
        cell.setCellStyle(style);
   
        cell = row.createCell(4);
        cell.setCellValue("表头5");
        cell.setCellStyle(style);

     // 循环将数据写入Excel
        for (int i = 0; i < 50; i++) {
          row = sheet.createRow((int) i + 1);
//          List list= lists.get(i);
          // 创建单元格，设置值
          row.createCell(0).setCellValue(i+1);
          row.createCell(1).setCellValue(i+2);
          row.createCell(2).setCellValue(i+3);
          row.createCell(3).setCellValue(i+4);
          row.createCell(4).setCellValue(i+5);
        }
        
//        FileOutputStream out =new FileOutputStream("E:/sdf.xls");
//        wb.write(out); 
//        out.close();
        String fileName = "XXX表";
        ByteArrayOutputStream os = new ByteArrayOutputStream();
        wb.write(os);
        byte[] content = os.toByteArray();
        InputStream is = new ByteArrayInputStream(content);
        // 设置response参数，可以打开下载页面
        res.reset();
        res.setContentType("application/vnd.ms-excel;charset=utf-8");
        res.setHeader("Content-Disposition", "attachment;filename="
            + new String((fileName + ".xls").getBytes(), "iso-8859-1"));
        ServletOutputStream out = res.getOutputStream();
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;
   
        try {
          bis = new BufferedInputStream(is);
          bos = new BufferedOutputStream(out);
          byte[] buff = new byte[2048];
          int bytesRead;
          // Simple read/write loop.
          while (-1 != (bytesRead = bis.read(buff, 0, buff.length))) {
            bos.write(buff, 0, bytesRead);
          }
        } catch (Exception e) {
          // TODO: handle exception
          e.printStackTrace();
        } finally {
          if (bis != null)
            bis.close();
          if (bos != null)
            bos.close();
        }
    }  
     


}
