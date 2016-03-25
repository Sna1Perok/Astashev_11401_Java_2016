package ru.kpfu.itis.Group11401.Astashev.Task010.Football.Test;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.kpfu.itis.Group11401.Astashev.Task010.Football.ReservGoalKeeper;

public class TestReservGoalkeeper {
    ApplicationContext ac = new ClassPathXmlApplicationContext(
            "ru/kpfu/itis/Group11401/Astashev/Task010/Football/spring-config.xml"
    );

    @Test
    public void ConstrucrtorRezervGoalkeepershouldBeCorrext() {
        int scill = 10;
        int experience = 10;
        String name = "Kahsa";
        int age = 30;
        ReservGoalKeeper reservGoalKeeper = new ReservGoalKeeper(scill, experience, name, age);
        Assert.assertTrue(scill == reservGoalKeeper.getScill() && experience == reservGoalKeeper.getExperience() &&
                name.equals(reservGoalKeeper.getName()) && age == reservGoalKeeper.getAge());
    }

    @Test
    public void GetterReserveGOalkeepreNameShouldBeCorrect() {
        int scill = 10;
        int experience = 10;
        String name = "Kahsa";
        int age = 30;
        ReservGoalKeeper reservGoalKeeper = new ReservGoalKeeper(scill, experience, name, age);
        Assert.assertTrue(name.equals(reservGoalKeeper.getName()));
    }

    @Test
    public void GetterReserveGOalkeepreAgeShouldBeCorrect() {
        int scill = 10;
        int experience = 10;
        String name = "Kahsa";
        int age = 30;
        ReservGoalKeeper reservGoalKeeper = new ReservGoalKeeper(scill, experience, name, age);
        Assert.assertTrue(age == reservGoalKeeper.getAge());
    }

    @Test
    public void GetterReserveGOalkeepreExpShouldBeCorrect() {
        int scill = 10;
        int experience = 10;
        String name = "Kahsa";
        int age = 30;
        ReservGoalKeeper reservGoalKeeper = new ReservGoalKeeper(scill, experience, name, age);
        Assert.assertTrue(experience == reservGoalKeeper.getExperience());
    }

    @Test
    public void GetterReserveGOalkeepreScillShouldBeCorrect() {
        int scill = 10;
        int experience = 10;
        String name = "Kahsa";
        int age = 30;
        ReservGoalKeeper reservGoalKeeper = new ReservGoalKeeper(scill, experience, name, age);
        Assert.assertTrue(scill == reservGoalKeeper.getScill());
    }

    @Test
    public void ReserveGoalkeeperShouldOnTheBall() {
        int scill = 10;
        int experience = 55;
        String name = "Kahsa";
        int age = 30;
        ReservGoalKeeper reservGoalKeeper = new ReservGoalKeeper(scill, experience, name, age);
        reservGoalKeeper.onTheBall("sad", experience, age);
        Assert.assertTrue(experience < reservGoalKeeper.getExperience());
    }

    @Test
    public void ReserveGoalkeeperShouldOnTheBall1() {
        int scill = 10;
        int experience = 33;
        String name = "Kahsa";
        int age = 30;
        ReservGoalKeeper reservGoalKeeper = new ReservGoalKeeper(scill, experience, name, age);
        reservGoalKeeper.onTheBall("sad", experience, age);
        reservGoalKeeper.vait("sd");
        Assert.assertTrue(experience > reservGoalKeeper.getExperience());
    }

    @Test
    public void ReserveGoalkeeperShouldJumpOnTheBall() {
        int scill = 10;
        int experience = 33;
        String name = "Kahsa";
        int age = 30;
        ReservGoalKeeper reservGoalKeeper = new ReservGoalKeeper(scill, experience, name, age);
        reservGoalKeeper.jump("sad", age);
        Assert.assertTrue(experience < reservGoalKeeper.getExperience());
    }

    @Test
    public void ReserveGoalkeeperShouldJumpOnTheBall1() {
        int scill = 10;
        int experience = 33;
        String name = "Kahsa";
        int age = 70;
        ReservGoalKeeper reservGoalKeeper = new ReservGoalKeeper(scill, experience, name, age);
        reservGoalKeeper.jump("sad", age);
        Assert.assertTrue(experience < reservGoalKeeper.getExperience());
    }

}