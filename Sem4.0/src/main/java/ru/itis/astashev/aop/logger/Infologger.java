package ru.itis.astashev.aop.logger;/**
 * Created by 1 on 01.06.2016.
 */

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

import java.util.Arrays;
import java.util.Date;

@Aspect
public class Infologger {
    private static org.apache.log4j.Logger log = Logger.getLogger(Infologger.class);

    @Before("execution(* ru.itis.astashev.services.*.*(..))")
    public void logToInfoService(JoinPoint joinPoint) {
        log.info("\n*****" + new Date() + "*****\n"
                + "Started invocation of service method"
                + joinPoint.getTarget().getClass().getSimpleName()
                + "."
                + joinPoint.getSignature().getName()
                + " with params: \n"
                + Arrays.toString(joinPoint.getArgs())
                + "\n***************************************");
    }
}