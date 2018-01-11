package tk.mybatis.springboot.AspectController;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * 说明：
 *
 * @Author: Alan
 * 2017-12-21  21:22:35
 * 星期四
 */
@Aspect
@Order(5)
@Component
public class WebAspect {


    /*@Resource
    private CategoryService categoryService;*/
    //切面点
    @Pointcut("execution(* tk.mybatis.springboot.controller..*.*(..))")
    public void webLog(){}

    @Before("webLog()")
    public void doBefore(JoinPoint joinPoint) throws Throwable {

    }
    @After("webLog()")
    public void doAfter(JoinPoint joinPoint) throws Throwable {
//        List<Category> categories = categoryService.queryAllCategory("c_id desc");


    }



    @AfterReturning(returning = "ret", pointcut = "webLog()")
    public void doAfterReturning(Object ret) throws Throwable {}
}