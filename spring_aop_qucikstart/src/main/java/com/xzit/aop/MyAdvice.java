package com.xzit.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAdvice {
    /*@Pointcut("execution(void com.xzit.dao.BookDao.update())")
    private void pt(){}*/
    @Pointcut("execution(void com.xzit.dao.impl.BookDaoImpl.update())")
    private void pt(){};

    @Before("pt()")
    public void method(){
        System.out.println(System.currentTimeMillis());
    }
}
