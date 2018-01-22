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

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;

import tk.mybatis.springboot.controller.BaseController;
import tk.mybatis.springboot.model.DAppointment;
import tk.mybatis.springboot.model.DUser;
import tk.mybatis.springboot.model.LayDates;
import tk.mybatis.springboot.model.LaytableDate;
import tk.mybatis.springboot.model.countBytime;
import tk.mybatis.springboot.service.DAppointmentService;
import tk.mybatis.springboot.service.DUserService;

/**
 * 医生个人业绩管理
 * @author Alan 创建于: 2018-1-17 下午2:43:43
 *
 */
@Controller
@RequestMapping("achievement")
public class AchievementController extends BaseController {
    @Resource
    private DAppointmentService dAppointmentService;
     
     
    @GetMapping("/achievement.html")
    public String  achievement () {
    	Integer[] dataByCount = dAppointmentService.getDataByCount(GetCurUser().getId());
    	Integer[] dataByCount2 = dAppointmentService.getDataByCount2(GetCurUser().getId());
    	request.setAttribute("appAllNum",dataByCount[0]);//今日预约数量
    	request.setAttribute("appDoNum",dataByCount[1]);//今日预约完成结算
    	request.setAttribute("backAllNum",dataByCount2[0]);//今日需回访
    	request.setAttribute("backDoNum",dataByCount2[1]);//今日已回访
    	
    	
    	
    	
    	

        return "back/achievement";
    }
    
    
    @PostMapping("/countData")
    public void   countData(String time) {
    	if (time.length()<=0) {
    		time="2017年12月12日-2030年12月12日";
		}
    	
    	countBytime countsAllApp = dAppointmentService.countsAllApp(time,GetCurUser().getId());
    	
    	sendOutPrint1(countsAllApp);
    }
    
     
    






















}
