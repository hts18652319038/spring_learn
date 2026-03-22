package com.xzit.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAdvice {
    @Pointcut("execution(void com.xzit.dao.BookDao.update())")
    private void pt(){

    }
    @Pointcut("execution(int com.xzit.dao.BookDao.select())")
    private void pt2(){
    }

    @Before("pt()")
    public void before(){
        System.out.println("before advice ...");
    }

    @After("pt()")
    public void after(){
        System.out.println("after advice ...");
    }

    @Around("pt()")
    public void around(ProceedingJoinPoint pjp) throws Throwable{
        System.out.println("around before advice ...");
        // 表示对原始操作的调用
        pjp.proceed();
        System.out.println("around after advice ...");
    }

    @AfterReturning("pt2()")
    public void afterReturning(){
        System.out.println("afterReturning advice ...");
    }

    @AfterThrowing("pt2()")
    public void afterThrowing(){
        System.out.println("afterThrowing advice ...");
    }
}
