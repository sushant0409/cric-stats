package com.sushavi.cricstats.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Slf4j
public class LoggingAspect {

    @Around("@annotation(com.sushavi.cricstats.aspect.LogExecutionTime)")
    public Object beforeMethodExecution(ProceedingJoinPoint proceedingJoinPoint) throws Throwable
    {
        long startTime = System.currentTimeMillis();

        Object result = proceedingJoinPoint.proceed();
        long endTime = System.currentTimeMillis();

        log.info("Method {} executed in Execution Time {} ", proceedingJoinPoint.getSignature().getName(), (endTime - startTime));
        return result;
    }
}
