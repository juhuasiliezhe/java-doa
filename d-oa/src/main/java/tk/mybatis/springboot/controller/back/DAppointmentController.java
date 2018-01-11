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
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import tk.mybatis.springboot.controller.BaseController;
import tk.mybatis.springboot.model.DAppointment;
import tk.mybatis.springboot.model.DPatient;
import tk.mybatis.springboot.model.DUser;
import tk.mybatis.springboot.model.utils.PageData;
import tk.mybatis.springboot.service.DAppointmentService;
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
 * @author liuzh
 * @since 2015-12-19 11:10
 */
@Controller
@RequestMapping("dappointmentController")
public class DAppointmentController extends BaseController {
    @Resource
    private DAppointmentService dAppointmentService;

    /**
     * 跳转到预约列表页
     * @return
     */
    @GetMapping("/showDAppointment.html")
    public String  showAppointment() {
        return  "back/showDAppointment";
    }


    /**
     * 添加预约
     * @param dAppointment
     */
    @PostMapping("addappointments")
    public void   addappointment(DAppointment dAppointment) {
        String theStatus="预约成功";
        System.out.println(theStatus);
        dAppointment.setDid(GetCurUser().getId());
        Integer integer = dAppointmentService.addAppointment(dAppointment);
        if (integer==-1){
            theStatus="预约失败";
        }
        sendOutPrint("code",theStatus);
    }
//============================!



    /**
     * 查询预约列表数据
     * @param requestJson
     */
    @PostMapping("/dappointmentlist")
    public void   dappointmentlist(@RequestBody String requestJson) {
        PageData data= JsonUtils.jsonToPojo(requestJson,PageData.class);
        DUser df=GetCurUser();
        List<DAppointment> dPatients =  dAppointmentService.queryByRolr( data.getPageindex(),  data.getPageSize(),  data.getSortOrders(), data.getSearchtext(), data.getStartDate(),GetCurUser().getId());
//        List<DAppointment> dPatients = dAppointmentService.queryAlldAppointment(data.getPageindex(), data.getPageSize(), data.getSortOrders());
        pageOutPrint((Page) dPatients);
    }

    /**
     * 预约中结算
     * @param dAppointment
     */
    @PostMapping("/addMoneyAppointment")
    public void   addMoneyAppointment(DAppointment dAppointment) {
        dAppointment.setGettime(DateUtils.getNowTime());
        dAppointment.setUpstatus(2);
        dAppointment.setBacktype(0);
        dAppointment.setDid(GetCurUser().getId());
        String theStatus="结算成功";
        Integer integer = dAppointmentService.addMoneyAppointment(dAppointment);
        if (integer==-1){
            theStatus="结算失败";
        }
        sendOutPrint("code",theStatus);
    }
    /**
     * 预约中取消预约
     * @param dAppointment
     */
    @PostMapping("/downMoneyAppointment")
    public void   downMoneyAppointment(DAppointment dAppointment) {
    	dAppointment.setStatus(0);
    	String theStatus="取消成功";
    	Integer integer = dAppointmentService.addMoneyAppointment(dAppointment);
    	if (integer==-1){
    		theStatus="取消失败";
    	}
    	sendOutPrint("code",theStatus);
    }
    @PostMapping("/addbackComment")
    public void   addbackComment(DAppointment dAppointment) {
        dAppointment.setBacktime(DateUtils.getNowTime());
        dAppointment.setBacktype(2);
        dAppointment.setDid(GetCurUser().getId());
        String theStatus="回访成功";
        Integer integer = dAppointmentService.addMoneyAppointment(dAppointment);
        if (integer==-1){
            theStatus="回访失败";
        }
        sendOutPrint("code",theStatus);
    }
    //=========================================================

    /**
     * 跳转到回访列表页
     * @return
     */
    @GetMapping("/showReturnVisit.html")
    public String  showReturnVisit() {
        return  "back/showReturnVisit";
    }

    /**
     * 回访数据列表
     * @param requestJson
     */
    @PostMapping("/dappointmentbacklist")
    public void   dappointmentbacklist(@RequestBody String requestJson) {
        PageData data= JsonUtils.jsonToPojo(requestJson,PageData.class);
        List<DAppointment> dPatients = dAppointmentService.queryAlldBackAppointment(data.getPageindex(), data.getPageSize(), data.getSortOrders(),GetCurUser().getId());
        pageOutPrint((Page) dPatients);
    }
















}
