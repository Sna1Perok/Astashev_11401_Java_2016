package ru.kpfu.itis.Group11401.Astashev.Task010.Football.Test;


import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.kpfu.itis.Group11401.Astashev.Task010.Football.MainGoalkeeper;

public class TestMainGoalkeeper {

    ApplicationContext ac = new ClassPathXmlApplicationContext(
            "ru/kpfu/itis/Group11401/Astashev/Task010/Football/spring-config.xml"
    );

    @Test
    public void ConstructorMainGoalkeeperShouldBeCorrect() {
       // MainGoalkeeper mainGoalkeeper = new MainGoalkeeper(50, 60, "Shol", 30);
        MainGoalkeeper mainGoalkeeper = (MainGoalkeeper) ac.getBean("mGoalkeep");
        int scill = 50;
        int experience = 60;
        String name = "Shol";
        int age = 30;
        Assert.assertTrue(scill == mainGoalkeeper.getScill() && experience == mainGoalkeeper.getExperience() &&
                name.equals(mainGoalkeeper.getName()) && age == mainGoalkeeper.getAge());
    }

    @Test
    public void GetterMainGoalkeeperNameShouldBeCorrect() {
        String name = "Shol";
        // MainGoalkeeper mainGoalkeeper = new MainGoalkeeper(50, 60, "Shol", 30);
        MainGoalkeeper mainGoalkeeper = (MainGoalkeeper) ac.getBean("mGoalkeep");
        Assert.assertTrue(name.equals(mainGoalkeeper.getName()));
    }

    @Test
    public void GetterMainGoalkeeperAgeShouldBeCorrect() {
        int scill = 50;
        int experience = 60;
        String name = "Shol";
        int age = 30;
        MainGoalkeeper mainGoalkeeper = new MainGoalkeeper(scill, experience, name, age);
        Assert.assertTrue(age == mainGoalkeeper.getAge());
    }

    @Test
    public void GetterMainGoalkeeperExpShouldBeCorrect() {
        int scill = 50;
        int experience = 60;
        String name = "Shol";
        int age = 30;
        MainGoalkeeper mainGoalkeeper = new MainGoalkeeper(scill, experience, name, age);
        Assert.assertTrue(experience == mainGoalkeeper.getExperience());
    }

    @Test
    public void GetterMainGoalkeeperScillShouldBeCorrect() {
        int scill = 50;
        int experience = 60;
        String name = "Shol";
        int age = 30;
        MainGoalkeeper mainGoalkeeper = new MainGoalkeeper(scill, experience, name, age);
        Assert.assertTrue(scill == mainGoalkeeper.getScill());
    }

    @Test
    public void MainGoalkeeperShouldOntheBall() {
        int scill = 50;
        int experience = 60;
        String name = "Shol";
        int age = 30;
        MainGoalkeeper mainGoalkeeper = new MainGoalkeeper(scill, experience, name, age);
        mainGoalkeeper.onTheBall(name, experience, age);
        Assert.assertTrue(experience < mainGoalkeeper.getExperience());
    }

    @Test
    public void MainGoalkeeperShouldUncorectOnTheBall() {
        int experience = 30;
        String name = "Shol";
        int age = 30;
        // MainGoalkeeper mainGoalkeeper = new MainGoalkeeper(50, 60, "Shol", 30);
        MainGoalkeeper mainGoalkeeper = (MainGoalkeeper) ac.getBean("mGoalkeep");mainGoalkeeper.onTheBall(name, experience, age);
        Assert.assertTrue(experience > mainGoalkeeper.getExperience());
    }

    @Test
    public void GoalkeeperShoulJumpUncorrect() {
        int experience = 30;
        String name = "Shol";
        int age = 70;
        // MainGoalkeeper mainGoalkeeper = new MainGoalkeeper(50, 60, "Shol", 30);
        MainGoalkeeper mainGoalkeeper = (MainGoalkeeper) ac.getBean("mGoalkeep"); mainGoalkeeper.jump(name, age);
        Assert.assertTrue(experience > mainGoalkeeper.getExperience());
    }
}