/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2014-2016 abel533@gmail.com
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

package tk.mybatis.springboot.controller.back;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import tk.mybatis.springboot.controller.BaseController;
import tk.mybatis.springboot.model.DAppointment;
import tk.mybatis.springboot.model.DPatient;
import tk.mybatis.springboot.model.LayDates;
import tk.mybatis.springboot.model.LaytableDate;
import tk.mybatis.springboot.model.utils.PageData;
import tk.mybatis.springboot.service.DPatientService;
import tk.mybatis.springboot.util.DateUtils;
import tk.mybatis.springboot.util.JsonUtils;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;
import java.util.List;

/**
 * 患者管理
 * @author Alan 创建于: 2018-1-17 下午2:43:43
 *
 */
@Controller
@RequestMapping("back")
public class DPatientController extends BaseController {
    @Resource
    private DPatientService dPService;


    /**
     * 跳转到添加患者页面
     * @return
     */
    @GetMapping("/view")
    public String  view() {
        return  "back/addp";
    }


    /**
     * 添加患者信息
     * @param dPatient
     * @return
     */
    @PostMapping("/addPatient")
    public String  addPatient(DPatient dPatient) {
    	dPatient.setHypertension(setOff(dPatient.getHypertension()));
    	dPatient.setDiabetes(setOff(dPatient.getDiabetes())); 
    	dPatient.setKidney(setOff(dPatient.getKidney())); 
    	dPatient.setNephropathy(setOff(dPatient.getNephropathy()));
        dPatient.setDid(GetCurUser().getId());
        dPatient.setUptime(DateUtils.getNowDate());
        dPService.addPatient(dPatient);
        return   "back/showDPatient";
    }
    /**
     * 修改患者信息
     * @param dPatient
     * @return
     */
    @PostMapping("/updatePatient")
    public String  updatePatient(DPatient dPatient) {
    	
    	dPatient.setHypertension(setOff(dPatient.getHypertension()));
    	dPatient.setDiabetes(setOff(dPatient.getDiabetes())); 
    	dPatient.setKidney(setOff(dPatient.getKidney())); 
    	dPatient.setNephropathy(setOff(dPatient.getNephropathy()));
    	dPService.updatePatient(dPatient, GetCurUser().getId());
    	return   "back/showDPatient";
    }
    public String setOff(String get){
    	if (get==null) {
    		get="OFF";
		}
    	return get;
    }

    /**
     * 跳转到患者管理页面
     * @return
     */
    @GetMapping("/patient.html")
    public String  patient() {



        return   "back/showDPatient";
    }

    /**
     * 患者列表页面数据
     * @param requestJson
     */
    @PostMapping("/showPatient")
    public void   showPatient(LaytableDate data) {
    	List<DPatient> dPatients = dPService.queryAllPatient(GetCurUser().getId(),data.getPage(), data.getLimit(), data.getOrder(),data.getName());
    	Page<DPatient> listCountry = (Page<DPatient>)dPatients;
    	long total = listCountry.getTotal();
    	LayDates dates=new LayDates(0,"",total,dPatients);
    	
    	sendOutPrint1(dates);

    }
    @PostMapping("/queryOnePatient")
    public void   queryOnePatient(int id) {
    	 DPatient queryOnePatient = dPService.queryOnePatient(id);
    	 sendOutPrint("data",queryOnePatient);
    	
    }
/*    @PostMapping("/showPatient")
    public void   showPatient(@RequestBody String requestJson) {
    	
    	PageData data= JsonUtils.jsonToPojo(requestJson,PageData.class);
    	List<DPatient> dPatients = dPService.queryAllPatient(GetCurUser().getId(),data.getPageindex(), data.getPageSize(), data.getSortOrders());
    	pageOutPrint((Page) dPatients);
    	
    }
*/
    
    @PostMapping("downpatient")
    public void   addappointment(DPatient dPatient) {
        String theStatus="删除成功";
        dPatient.setStatus(0);
        Integer integer = dPService.updatePatient(dPatient,GetCurUser().getId());
        if (integer==-1){
            theStatus="删除失败";
        }
        sendOutPrint("code",theStatus);
    }























    @GetMapping("/default")
    public String  defaults() {
        return  "back/default";
    }

    @GetMapping(value = "/backindex")
    public String backindex()  {
        return "back/backindex";
    }
    @PostMapping(value = "/image")
    public void upImg2(MultipartFile filedata, HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html; charset=UTF-8");
        long maxSize = 0;
        maxSize = 1024*1024;
        String path = request.getSession().getServletContext().getRealPath("/upload");
        String fileName = filedata.getOriginalFilename();
        Calendar calendar=Calendar.getInstance();
        String newFileName= calendar.getTimeInMillis()+"."+fileName.split("\\.")[1];
        File targetFile = new File(path, newFileName+"");
        if(!targetFile.exists()){
            targetFile.mkdirs();
        }
        //保存
        try {
            filedata.transferTo(targetFile);
            PrintWriter out = response.getWriter();
            String pathName=request.getContextPath()+"/upload/"+newFileName;
            System.out.println(pathName);
            out.println("{\"err\":\"\",\"msg\":\""+pathName+"\"}");//这里返回你图片上传路径，返回json到编辑器中，这样编辑器就能及时显示图片内容了
            out.flush();
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
