package ru.kpfu.itis.Group11401.Astashev.Task013;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by 1 on 25.03.2016.
 */

public class Sql {
    public String getS() {
        return s;
    }

    private String s;

    public void setEmail(String s){
        this.s = s;
        System.out.println("все норм");
    }

    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("ru/kpfu/itis/Group11401/Astashev/Task013/spring-config.xml");
        Sql e = ac.getBean(Sql.class);
        e.setEmail("select  where");
    }
}