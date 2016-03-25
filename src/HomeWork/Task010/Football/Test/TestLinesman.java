package ru.kpfu.itis.Group11401.Astashev.Task010.Football.Test;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.kpfu.itis.Group11401.Astashev.Task010.Football.FootballPlayer;
import ru.kpfu.itis.Group11401.Astashev.Task010.Football.Linesman;


public class TestLinesman {
    ApplicationContext ac = new ClassPathXmlApplicationContext(
            "ru/kpfu/itis/Group11401/Astashev/Task010/Football/spring-config.xml"
    );


    @Test
    public void ConstructorLinesmanShouldBeCorrect() {
        int position = 0;
        int expirience = 41;
        String name = "Lok";
        int age = 41;
        //  Linesman linesman1 = new Linesman(0, 41, 41, "Lok");
        Linesman linesman1 = (Linesman) ac.getBean("linesman");
        Assert.assertTrue(position == linesman1.getPosition() && expirience == linesman1.getExpirience() &&
                name.equals(linesman1.getName()) && age == linesman1.getAge());

    }

    @Test
    public void GetterNameLinesmanShouldBeCorrect() {
        String name = "Lok";
        //  Linesman linesman1 = new Linesman(0, 41, 41, "Lok");
        Linesman linesman1 = (Linesman) ac.getBean("linesman");
        Assert.assertTrue(name.equals(linesman1.getName()));
    }

    @Test
    public void GetterAgeLinesmanShouldBeCorrect() {
        int age = 41;
        //  Linesman linesman1 = new Linesman(0, 41, 41, "Lok");
        Linesman linesman1 = (Linesman) ac.getBean("linesman");
        Assert.assertTrue(age == linesman1.getAge());
    }

    @Test
    public void GetterExpirienceLinesmanShouldBeCorrect() {
        int age = 41;
        //  Linesman linesman1 = new Linesman(0, 41, 41, "Lok");
        Linesman linesman1 = (Linesman) ac.getBean("linesman");
        Assert.assertTrue(age == linesman1.getExpirience());
    }

    @Test
    public void GetterPositionLinesmanShouldBeCorrect() {
        int age = 0;
        //  Linesman linesman1 = new Linesman(0, 41, 41, "Lok");
        Linesman linesman1 = (Linesman) ac.getBean("linesman");
        Assert.assertTrue(age == linesman1.getPosition());
    }

    @Test
    public void LinesmanShouldCorrectFindOffence() {
        //  Linesman linesman1 = new Linesman(0, 41, 41, "Lok");
        Linesman linesman1 = (Linesman) ac.getBean("linesman");
        //FootballPlayer footballPlayer = new FootballPlayer("Nikita", 100, 200, 32, true);
        FootballPlayer footballPlayer = (FootballPlayer) ac.getBean("Nikita");
        int experience = linesman1.getExpirience();
        linesman1.findOffence(footballPlayer);
        Assert.assertTrue(experience < linesman1.getExpirience());
    }

    @Test
    public void LinesmanShouldUnCorrectFindOffence() {
        //  Linesman linesman1 = new Linesman(0, 30, 30, "Lok");
        Linesman linesman1 = (Linesman) ac.getBean("linesman1");
        //FootballPlayer footballPlayer = new FootballPlayer("Nikita", 100, 200, 32, true);
        FootballPlayer footballPlayer = (FootballPlayer) ac.getBean("Nikita");
        int experience = linesman1.getExpirience();
        linesman1.findOffence(footballPlayer);
        Assert.assertTrue(experience > linesman1.getExpirience());
    }

    @Test
    public void WhenLinesmanWhistle() {
        //  Linesman linesman1 = new Linesman(0, 30, 30, "Lok");
        Linesman linesman1 = (Linesman) ac.getBean("linesman1");
        int experience = linesman1.getExpirience();
        linesman1.whistle();
        Assert.assertTrue(experience < linesman1.getExpirience());
    }

    @Test
    public void WhenLinesmanShowTheCard() {
        //  Linesman linesman1 = new Linesman(0, 30, 30, "Lok");
        Linesman linesman1 = (Linesman) ac.getBean("linesman1");
        int experience = linesman1.getExpirience();
        linesman1.whistle();
        Assert.assertTrue(experience < linesman1.getExpirience());
    }

    @Test
    public void WhenLinesmanCantFindOffsideHeShouldWhistle() {
        //  Linesman linesman1 = new Linesman(0, 30, 30, "Lok");
        Linesman linesman1 = (Linesman) ac.getBean("linesman1");
        int experience = linesman1.getExpirience();
        //FootballPlayer footballPlayer = new FootballPlayer("Nikita", 100, 200, 32, true);
        FootballPlayer footballPlayer = (FootballPlayer) ac.getBean("Nikita");
        linesman1.offside(footballPlayer, linesman1);
        Assert.assertTrue(experience == linesman1.getExpirience());
    }

    @Test
    public void WhenLinesmanFindOffsideHeShouldWhistle() {
        //  Linesman linesman1 = new Linesman(0, 41, 41, "Lok");
        Linesman linesman1 = (Linesman) ac.getBean("linesman");
        //FootballPlayer footballPlayer = new FootballPlayer("Nikita", 100, 200, 32, true);
        FootballPlayer footballPlayer = (FootballPlayer) ac.getBean("Nikita");
        int experience = linesman1.getExpirience();
        linesman1.offside(footballPlayer, linesman1);
        Assert.assertTrue(experience < linesman1.getExpirience());
    }

    @Test
    public void WhenLinesmanShowTheCardHeShould() {
        //  Linesman linesman1 = new Linesman(0, 41, 41, "Lok");
        Linesman linesman1 = (Linesman) ac.getBean("linesman");
        //FootballPlayer footballPlayer = new FootballPlayer("Nikita", 100, 200, 32, true);
        FootballPlayer footballPlayer = (FootballPlayer) ac.getBean("Nikita");
        int experience = linesman1.getExpirience();
        linesman1.showTheCard(footballPlayer);
        Assert.assertTrue(experience < linesman1.getExpirience());
    }

}