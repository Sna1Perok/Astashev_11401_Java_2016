package ru.kpfu.itis.Group11401.Astashev.Task010.Football.Test;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.kpfu.itis.Group11401.Astashev.Task010.Football.FootballPlayer;
import ru.kpfu.itis.Group11401.Astashev.Task010.Football.FootballTeam;

import java.util.ArrayList;

import static org.mockito.Mockito.ignoreStubs;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class TestFootballTeam {
    ApplicationContext ac = new ClassPathXmlApplicationContext(
            "ru/kpfu/itis/Group11401/Astashev/Task010/Football/spring-config.xml"
    );

    @Test
    public void ConstructorFootballTeamShouldBeCorrect() {
        ArrayList<FootballPlayer> rubin = new ArrayList<FootballPlayer>();
        // FootballPlayer fb = new FootballPlayer("Nikita", 1, 100, 99, false);
        FootballPlayer fb = (FootballPlayer) ac.getBean("footballPlayer1");
        // FootballPlayer fb1 = new FootballPlayer("Kirill", 0, 30, 50, false);
        FootballPlayer fb1 = (FootballPlayer) ac.getBean("footballPlayer2");
        rubin.add(fb);
        rubin.add(fb1);
        rubin.add(fb);
        rubin.add(fb1);
        String s = "ya";
        FootballTeam ft = new FootballTeam("Rubin", rubin, "ya", 100);
        String name = "Rubin";
        int dux = 100;
        Assert.assertTrue(ft.getName().equals(name) && s.equals(ft.getBestGame()) && dux == ft.getTeamSpirit());
    }

    @Test
    public void GetterNameShouldBeCorrect() {

        FootballTeam ft = mock(FootballTeam.class);
        when(ft.getName()).thenReturn("Rubin");
        String name = "Rubin";
        Assert.assertTrue(ft.getName().equals(name));
    }

    @Test
    public void GetterBestGameShouldBeCorrect() {

        FootballTeam ft = mock(FootballTeam.class);
        when(ft.getBestGame()).thenReturn("Rubin");
        String name = "Rubin";
        Assert.assertTrue(ft.getBestGame().equals(name));
    }

    @Test
    public void GetterTeamShouldBeCorrect() {
        ArrayList<FootballPlayer> rubin = new ArrayList<FootballPlayer>();
        // FootballPlayer fb = new FootballPlayer("Nikita", 1, 100, 99, false);
        FootballPlayer fb = (FootballPlayer) ac.getBean("footballPlayer1");
        // FootballPlayer fb1 = new FootballPlayer("Kirill", 0, 30, 50, false);
        FootballPlayer fb1 = (FootballPlayer) ac.getBean("footballPlayer2");
        rubin.add(fb);
        rubin.add(fb1);
        rubin.add(fb);
        rubin.add(fb1);
        FootballTeam ft = mock(FootballTeam.class);
        when(ft.getTeam()).thenReturn(rubin);
        Assert.assertTrue(ft.getTeam() == rubin);
    }

    @Test
    public void GetterTeamSpiritShouldBeCorrect() {
        FootballTeam ft = mock(FootballTeam.class);
        when(ft.getTeamSpirit()).thenReturn(100);
        int teamSpirit = 100;
        Assert.assertTrue(ft.getTeamSpirit() == teamSpirit);
    }

    @Test
    public void MethodTheExchangeOfPlayersShouldBeCorrect() {
        ArrayList<FootballPlayer> rubin = new ArrayList<FootballPlayer>();
        // FootballPlayer fb = new FootballPlayer("Nikita", 1, 100, 99, false);
        FootballPlayer fb = (FootballPlayer) ac.getBean("footballPlayer1");
        // FootballPlayer fb1 = new FootballPlayer("Kirill", 0, 30, 50, false);
        FootballPlayer fb1 = (FootballPlayer) ac.getBean("footballPlayer2");
        rubin.add(fb);
        rubin.add(fb1);
        rubin.add(fb);
        rubin.add(fb1);
        String s = "ya";
        String name = "Rubin";
        int teamSpirit = 100;
        FootballTeam ft = new FootballTeam(name, rubin, s, teamSpirit);
        ft.theExchangeOfPlayers(fb, fb1);
        Assert.assertTrue(teamSpirit + 1 == ft.getTeamSpirit());
    }

    @Test
    public void MethodFavoritePlayersShouldBeCorrect() {
        ArrayList<FootballPlayer> rubin = new ArrayList<FootballPlayer>();
        String s = "ya";
        String name = "Rubin";
        int teamSpirit = 100;
        FootballTeam ft = new FootballTeam(name, rubin, s, teamSpirit);
        ft.favoritPlayer();
        ft.statistica();
        Assert.assertTrue(teamSpirit + 1 == ft.getTeamSpirit());
    }

    @Test
    public void MethodAddPlayersShouldBeCorrect() {
        ArrayList<FootballPlayer> rubin = new ArrayList<FootballPlayer>();
        // FootballPlayer fb = new FootballPlayer("Nikita", 1, 100, 99, false);
        FootballPlayer fb = (FootballPlayer) ac.getBean("footballPlayer1");
        // FootballPlayer fb1 = new FootballPlayer("Kirill", 0, 30, 50, false);
        FootballPlayer fb1 = (FootballPlayer) ac.getBean("footballPlayer2");
        rubin.add(fb);
        rubin.add(fb1);
        rubin.add(fb);
        rubin.add(fb1);
        String s = "ya";
        String name = "Rubin";
        int teamSpirit = 100;
        FootballTeam ft = new FootballTeam(name, rubin, s, teamSpirit);
        ft.addPlayer(fb);
        ignoreStubs();
    }

    @Test
    public void MethodAddPlayersShouldBeUnCorrect() {
        ArrayList<FootballPlayer> rubin = new ArrayList<FootballPlayer>();
        // FootballPlayer fb = new FootballPlayer("Nikita", 1, 100, 99, false);
        FootballPlayer fb = (FootballPlayer) ac.getBean("footballPlayer1");
        // FootballPlayer fb1 = new FootballPlayer("Kirill", 0, 30, 50, false);
        FootballPlayer fb1 = (FootballPlayer) ac.getBean("footballPlayer2");
        rubin.add(fb);
        rubin.add(fb1);
        rubin.add(fb);
        rubin.add(fb1);
        String s = "ya";
        String name = "Rubin";
        int teamSpirit = 100;
        FootballTeam ft = new FootballTeam(name, rubin, s, 76);
        ft.addPlayer(fb);
        ArrayList<FootballPlayer> teamm = ft.getTeam();
        ignoreStubs();
    }
}