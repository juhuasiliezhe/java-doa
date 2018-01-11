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

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import tk.mybatis.springboot.controller.BaseController;
import tk.mybatis.springboot.model.DUser;
import tk.mybatis.springboot.service.DUserService;

/**
 * @author liuzh
 * @since 2015-12-19 11:10
 */
@Controller
@RequestMapping("duserController")
public class DuserController extends BaseController {
    @Resource
    private DUserService userService;
    /**
     * 跳转到登录页面
     * @return
     */
    @GetMapping("/login.html")
    public String  login() {

        return  "back/login";
    }

    @PostMapping("/uplogin")
    public void   addPatient(DUser dUser) {

        Integer uplogin=0;

        Integer uplogin1 = userService.uplogin(dUser.getUsername());

        if (uplogin1==1){
            DUser uplogin2 = userService.uplogin(dUser);
            if (uplogin2!=null) {
            	uplogin = 1;
            	session.setAttribute("user",uplogin2);
			}else {
				uplogin = 0;
			}
            
            
        }else{
            uplogin=-1;
        }

        sendOutPrint("code",uplogin);

    }

    @GetMapping("/gologin.html")
    public String  login2 () {

        return "back/backindex";
    }
    @GetMapping("/loginout.html")
    public String  loginout () {
        session.setAttribute("user",null);

        return "/";
    }






















}
