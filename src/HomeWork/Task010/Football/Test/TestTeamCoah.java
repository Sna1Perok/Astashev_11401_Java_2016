package ru.kpfu.itis.Group11401.Astashev.Task010.Football.Test;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.kpfu.itis.Group11401.Astashev.Task010.Football.FootballPlayer;
import ru.kpfu.itis.Group11401.Astashev.Task010.Football.TeamCoach;

public class TestTeamCoah {

    ApplicationContext ac = new ClassPathXmlApplicationContext(
            "ru/kpfu/itis/Group11401/Astashev/Task010/Football/spring-config.xml"
    );


    @Test
    public void ConstructorTeamCoachShouldBeCorrect() {
        String name = "Nikita";
        String team = "Rubin";
        int age = 20;
        int experience = 69;
        TeamCoach teamCoach = new TeamCoach(name, team, age, experience);
        Assert.assertTrue(name.equals(teamCoach.getName()) && team.equals(teamCoach.getTeam()) && age == teamCoach.getAge() &&
                experience == teamCoach.getExperience());
    }

    @Test
    public void GetterTeamCoahNameShouldBeCorrect() {
        String name = "Nikita";
        String team = "Rubin";
        int age = 20;
        int experience = 69;
        TeamCoach teamCoach = new TeamCoach(name, team, age, experience);
        Assert.assertTrue(name.equals(teamCoach.getName()));
    }

    @Test
    public void GetterTeamCoahTeamShouldBeCorrect() {
        String name = "Nikita";
        String team = "Rubin";
        int age = 20;
        int experience = 69;
        TeamCoach teamCoach = new TeamCoach(name, team, age, experience);
        Assert.assertTrue(team.equals(teamCoach.getTeam()));
    }

    @Test
    public void GetterTeamCoahAgeShouldBeCorrect() {
        String name = "Nikita";
        String team = "Rubin";
        int age = 20;
        int experience = 69;
        TeamCoach teamCoach = new TeamCoach(name, team, age, experience);
        Assert.assertTrue(age == teamCoach.getAge());
    }

    @Test
    public void GetterTeamCoahExpShouldBeCorrect() {
        String name = "Nikita";
        String team = "Rubin";
        int age = 20;
        int experience = 69;
        TeamCoach teamCoach = new TeamCoach(name, team, age, experience);
        Assert.assertTrue(experience == teamCoach.getExperience());
    }

    @Test
    public void TeamCoachShouldDoReplacement() {
        String name = "Nikita";
        String team = "Rubin";
        int age = 20;
        int experience = 69;
        TeamCoach teamCoach = new TeamCoach(name, team, age, experience);
        FootballPlayer fb = new FootballPlayer("Nikita", 1, 100, 99, true);
        FootballPlayer fb1 = new FootballPlayer("Kirill", 0, 30, 50, false);
        teamCoach.replacement(fb, fb1);
        Assert.assertTrue(experience < teamCoach.getExperience());
    }

    @Test
    public void TeamCoachShouldDoReplacement1() {
        String name = "Nikita";
        String team = "Rubin";
        int age = 20;
        int experience = 22;
        TeamCoach teamCoach = new TeamCoach(name, team, age, experience);
        FootballPlayer fb = new FootballPlayer("Nikita", 1, 100, 99, true);
        FootballPlayer fb1 = new FootballPlayer("Kirill", 0, 30, 50, false);
        teamCoach.replacement(fb, fb1);
        Assert.assertTrue(experience > teamCoach.getExperience());
    }

    @Test
    public void TeamCoachShouldDoReplacement3() {
        String name = "Nikita";
        String team = "Rubin";
        int age = 20;
        int experience = 44;
        TeamCoach teamCoach = new TeamCoach(name, team, age, experience);
        FootballPlayer fb = new FootballPlayer("Nikita", 1, 100, 99, true);
        FootballPlayer fb1 = new FootballPlayer("Kirill", 0, 30, 50, false);
        teamCoach.replacement(fb, fb1);
        teamCoach.tolkToTheAssistant(fb);
        Assert.assertTrue(experience < teamCoach.getExperience());
    }

    @Test
    public void TeamCoahShouldPromt() {
        String name = "Nikita";
        String team = "Rubin";
        int age = 200;
        int experience = 44;
        TeamCoach teamCoach = new TeamCoach(name, team, age, experience);
        teamCoach.prompt();
        Assert.assertTrue(experience > teamCoach.getExperience());
    }

    @Test
    public void TeamCoahShouldPromtUnCorrect() {
        String name = "Nikita";
        String team = "Rubin";
        int age = 20;
        int experience = 44;
        TeamCoach teamCoach = new TeamCoach(name, team, age, experience);
        teamCoach.prompt();
        Assert.assertTrue(experience < teamCoach.getExperience());
    }
}