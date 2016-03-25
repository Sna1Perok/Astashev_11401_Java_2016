package ru.kpfu.itis.Group11401.Astashev.Task010.Football.Test;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.kpfu.itis.Group11401.Astashev.Task010.Football.FootballPlayer;
import ru.kpfu.itis.Group11401.Astashev.Task010.Football.Linesman;
import ru.kpfu.itis.Group11401.Astashev.Task010.Football.MainReferee;

/**
 * Created by 1 on 25.03.2016.
 */

public class TestMainReferee {
    ApplicationContext ac = new ClassPathXmlApplicationContext(
            "ru/kpfu/itis/Group11401/Astashev/Task010/Football/spring-config.xml"
    );


    @Test
    public void ConstructorMainRefereeShouldBeCorrect() {
        int position = 1;
        int expirience = 50;
        String name = "Yan";
        int age = 40;
        MainReferee mainReferee = new MainReferee(position, expirience, age, name);
        Assert.assertTrue(position == mainReferee.getPosition() && expirience == mainReferee.getExpirience() &&
                mainReferee.getAge() == age && name.equals(mainReferee.getName()));
    }

    @Test
    public void GettermainRefereePositionShouldBeCorrect() {
        int position = 1;
        int expirience = 50;
        String name = "Yan";
        int age = 40;
        MainReferee mainReferee = new MainReferee(position, expirience, age, name);
        Assert.assertTrue(position == mainReferee.getPosition());
    }

    @Test
    public void GettermainRefereeAgeShouldBeCorrect() {
        int position = 1;
        int expirience = 50;
        String name = "Yan";
        int age = 40;
        MainReferee mainReferee = new MainReferee(position, expirience, age, name);
        Assert.assertTrue(age == mainReferee.getAge());
    }

    @Test
    public void GettermainRefereeNameShouldBeCorrect() {
        int position = 1;
        int expirience = 50;
        String name = "Yan";
        int age = 40;
        MainReferee mainReferee = new MainReferee(position, expirience, age, name);
        Assert.assertTrue(name.equals(mainReferee.getName()));
    }

    @Test
    public void GetterMainRefereeExpShouldBeCorrect() {
        int position = 1;
        int expirience = 50;
        String name = "Yan";
        int age = 40;
        MainReferee mainReferee = new MainReferee(position, expirience, age, name);
        Assert.assertTrue(expirience == mainReferee.getExpirience());
    }

    @Test
    public void MainRefereeShoulFindOffence() {
        int position = 1;
        int expirience = 50;
        String name = "Yan";
        int age = 40;
        MainReferee mainReferee = new MainReferee(position, expirience, age, name);
        FootballPlayer footballPlayer = new FootballPlayer("sd", 231, 231, 23, true);
        mainReferee.findOffence(footballPlayer);
        Assert.assertTrue(expirience < mainReferee.getExpirience());
    }

    @Test
    public void MainRefereeCantFindOffence() {
        int position = 1;
        int expirience = 33;
        String name = "Yan";
        int age = 25;
        MainReferee mainReferee = new MainReferee(position, expirience, age, name);
        FootballPlayer footballPlayer = new FootballPlayer("sd", 231, 231, 23, true);
        mainReferee.findOffence(footballPlayer);
        Assert.assertTrue(expirience > mainReferee.getExpirience());
    }

    @Test
    public void MainRefereeWhistle() {
        int position = 1;
        int expirience = 33;
        String name = "Yan";
        int age = 25;
        MainReferee mainReferee = new MainReferee(position, expirience, age, name);
        mainReferee.whistle();
        Assert.assertTrue(expirience < mainReferee.getExpirience());
    }

    @Test
    public void MainRefereeShouldShowTheCard() {
        int position = 1;
        int expirience = 33;
        String name = "Yan";
        int age = 25;
        MainReferee mainReferee = new MainReferee(position, expirience, age, name);
        FootballPlayer footballPlayer = new FootballPlayer("sd", 231, 231, 23, true);
        mainReferee.showTheCard(footballPlayer);
        Assert.assertTrue(expirience < mainReferee.getExpirience());
    }

    @Test
    public void MainRefereeShouldFindTheIffence() {
        int position = 1;
        int expirience = 33;
        String name = "Yan";
        int age = 25;
        MainReferee mainReferee = new MainReferee(position, expirience, age, name);
        FootballPlayer footballPlayer = new FootballPlayer("sd", 231, 231, 23, true);
        Linesman linesman = new Linesman(1, 23, 43, "sda");
        mainReferee.offside(footballPlayer, linesman);
        Assert.assertTrue(expirience < mainReferee.getExpirience());
    }
}