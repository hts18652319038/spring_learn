package com.xzit.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
@Aspect
public class MyAdvice {
    @Pointcut("execution(* com.xzit.dao.BookDao.findName(..))")
    private void pt(){}

    @Before("pt()")
    public void before(JoinPoint jp){
        Object[] args = jp.getArgs();
        System.out.println(Arrays.toString(args));
        System.out.println("before advice ...");
    }

    @After("pt()")
    public void after(JoinPoint jp){
        Object[] args = jp.getArgs();
        System.out.println(Arrays.toString(args)) ;
        System.out.println("after advice ...");
    }

    @Around("pt()")
    public Object around(ProceedingJoinPoint pjp) throws Throwable{
        Object[] args = pjp.getArgs();
        System.out.println(Arrays.toString(args)) ;
        /*args[0] = 666;*/

        Object ret = pjp.proceed();
        return ret;
    }

    @AfterReturning(value="pt()",returning = "ret")
    public void afterReturning(Object ret){
        System.out.println("afterReturning advice ..."+ret);
    }

    @AfterThrowing("pt()")
    public void afterThrowing(){
        System.out.println("afterThrowing advice ...");
    }
}
