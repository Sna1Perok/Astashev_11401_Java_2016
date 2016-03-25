package ru.kpfu.itis.Group11401.Astashev.Task012;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

/**
 * Created by 1 on 25.03.2016.
 */

@Aspect
public class Aspects {

    @Around("execution(* ru.kpfu.itis.Group11401.Astashev.Task012.Sql.setSql(..))")
    public Object stopIt(ProceedingJoinPoint jp) throws Throwable {
        String lang = (String) jp.getArgs()[0];
        if(lang.toLowerCase().indexOf("select")!=0 &&lang.toLowerCase().indexOf("from")!=0 &&
                lang.toLowerCase().indexOf("where")!=0 || lang.toLowerCase().indexOf("select")!=0 &&
                lang.toLowerCase().indexOf("from")!=0){
            System.out.println("Строка возможно сдержит sql инъекцию");
            return null;
        }
        return jp.proceed();
    }
}