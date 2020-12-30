package com.zjrc.springaop.common.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Map;

@Aspect
@Component
@Order(1)
public class AnotherWebLogAspect {
    private final static Logger logger = LoggerFactory.getLogger(AnotherWebLogAspect.class);
    @Pointcut("execution(public * com.zjrc.springaop.controller..*.*(..))")
    public void webLog() {
    }

    @Around(value = "webLog()")
    public Object doAround(ProceedingJoinPoint joinPoint) throws Throwable{
        long startTime = System.currentTimeMillis();
        Object ob = joinPoint.proceed();
        long endTime = System.currentTimeMillis();
        long takeTime  = endTime - startTime;
        logger.info("耗时:"+ takeTime+"==============Order Traing");
        return ob;

    }
}
