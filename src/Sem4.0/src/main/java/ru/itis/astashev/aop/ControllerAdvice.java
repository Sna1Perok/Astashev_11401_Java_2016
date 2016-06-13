package ru.itis.astashev.aop;/**
 * Created by 1 on 01.06.2016.
 */

import org.apache.log4j.Logger;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.ui.Model;
import ru.itis.astashev.transforms.UsersFromSecurity;

import java.util.Arrays;
import java.util.Date;


@Aspect
public class ControllerAdvice {
    private static Logger log = Logger.getLogger(ControllerAdvice.class);

    @Around("execution(* ru.itis.astashev.controller.*.*(..)) &&" + "args(model)")
    public Object controller(ProceedingJoinPoint jp, Model model) throws Throwable {
        log.info("\n*****" + new Date() + "*****\n"
                + "Started invocation of controller method"
                + jp.getTarget().getClass().getSimpleName()
                + "."
                + jp.getSignature().getName()
                + " with params: \n"
                + Arrays.toString(jp.getArgs())
                + "\n***************************************");
        model.addAttribute("user", UsersFromSecurity.getUseresFromSecurity());
        return jp.proceed();
    }

}