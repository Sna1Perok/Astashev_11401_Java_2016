package ru.kpfu.itis.Group11401.Astashev.Task013;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by 1 on 25.03.2016.
 */

@Aspect
public class Aspects {

    @Around("execution(* ru.kpfu.itis.Group11401.Astashev.Task013.Sql.setEmail(..))")
    public Object stopIt(ProceedingJoinPoint jp) throws Throwable {
        String lang = (String) jp.getArgs()[0];
        Pattern pattern = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})");
        Matcher matcher = pattern.matcher(lang);
        if(matcher.group(0)!= null){
            System.out.println("it's ok");
            return null;
        }
        return jp.proceed();
    }
}