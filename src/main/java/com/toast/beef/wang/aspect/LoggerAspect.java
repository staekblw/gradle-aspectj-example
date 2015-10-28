package com.toast.beef.wang.aspect;

import org.aspectj.lang.*;
import org.aspectj.lang.annotation.*;

@Aspect
public class LoggerAspect {

    @Pointcut("execution(* go(..))")
    public void call() {
    }

    @Around("com.toast.beef.wang.aspect.LoggerAspect.call()")
    public Object intecept(ProceedingJoinPoint joinPoint) throws Throwable {
        System.err.println("------------------------");
        System.err.println("before call ");

        Object retVal = null;
        try {
            retVal = joinPoint.proceed();
        } finally {
            System.err.println("after call ");
            System.err.println("------------------------");
        }
        return retVal;
    }
}

