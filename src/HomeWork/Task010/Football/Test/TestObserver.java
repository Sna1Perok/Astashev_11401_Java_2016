package ru.kpfu.itis.Group11401.Astashev.Task010.Football.Test;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.kpfu.itis.Group11401.Astashev.Task010.Football.Fans;

public class TestObserver {

    ApplicationContext ac = new ClassPathXmlApplicationContext(
            "ru/kpfu/itis/Group11401/Astashev/Task010/Football/spring-config.xml"
    );

    @Test
    public void ConstructorObserverShouldBeRight() {
        int count = 1500;
        boolean pyrotechnics = true;
        boolean performance = true;
        boolean posters = true;
        int teamSpirit = 100;
        String sector = "s";
        ru.kpfu.itis.Group11401.Astashev.Task010.Football.Observer observer = new ru.kpfu.itis.Group11401.Astashev.Task010.Football.Observer(count, pyrotechnics, performance, posters, sector, teamSpirit);
        Assert.assertTrue(performance == observer.isPerformance() && posters == observer.isPosters() &&
                pyrotechnics == observer.isPyrotechnics() && sector.equals(observer.getSector()));
    }

    @Test
    public void GetterObserverIsPyrotech() {
        int count = 1500;
        boolean pyrotechnics = true;
        boolean performance = true;
        boolean posters = true;
        int teamSpirit = 100;
        String sector = "s";
        ru.kpfu.itis.Group11401.Astashev.Task010.Football.Observer observer = new ru.kpfu.itis.Group11401.Astashev.Task010.Football.Observer(count, pyrotechnics, performance, posters, sector, teamSpirit);
        Assert.assertTrue(pyrotechnics == observer.isPyrotechnics());
    }

    @Test
    public void GetterObserverIsPoster() {
        int count = 1500;
        boolean pyrotechnics = true;
        boolean performance = true;
        boolean posters = true;
        int teamSpirit = 100;
        String sector = "s";
        ru.kpfu.itis.Group11401.Astashev.Task010.Football.Observer observer = new ru.kpfu.itis.Group11401.Astashev.Task010.Football.Observer(count, pyrotechnics, performance, posters, sector, teamSpirit);
        Assert.assertTrue(posters == observer.isPosters());
    }

    @Test
    public void GetterObserverIsCount() {
        int count = 1500;
        boolean pyrotechnics = true;
        boolean performance = true;
        boolean posters = true;
        int teamSpirit = 100;
        String sector = "s";
        ru.kpfu.itis.Group11401.Astashev.Task010.Football.Observer observer = new ru.kpfu.itis.Group11401.Astashev.Task010.Football.Observer(count, pyrotechnics, performance, posters, sector, teamSpirit);
        Assert.assertTrue(count == observer.getCount());
    }

    @Test
    public void GetterObserverIsSector() {
        int count = 1500;
        boolean pyrotechnics = true;
        boolean performance = true;
        boolean posters = true;
        int teamSpirit = 100;
        String sector = "s";
        ru.kpfu.itis.Group11401.Astashev.Task010.Football.Observer observer = new ru.kpfu.itis.Group11401.Astashev.Task010.Football.Observer(count, pyrotechnics, performance, posters, sector, teamSpirit);
        Assert.assertTrue(sector.equals(observer.getSector()));
    }

    @Test
    public void GetterObserverIsPerf() {
        int count = 1500;
        boolean pyrotechnics = true;
        boolean performance = true;
        boolean posters = true;
        int teamSpirit = 100;
        String sector = "s";
        ru.kpfu.itis.Group11401.Astashev.Task010.Football.Observer observer = new ru.kpfu.itis.Group11401.Astashev.Task010.Football.Observer(count, pyrotechnics, performance, posters, sector, teamSpirit);
        Assert.assertTrue(performance == observer.isPerformance());
    }

    @Test
    public void ObserverShouldSgout() {
        int count = 1500;
        boolean pyrotechnics = true;
        boolean performance = true;
        boolean posters = true;
        int teamSpirit = 100;
        String sector = "s";
        ru.kpfu.itis.Group11401.Astashev.Task010.Football.Observer observer = new ru.kpfu.itis.Group11401.Astashev.Task010.Football.Observer(count, pyrotechnics, performance, posters, sector, teamSpirit);
        observer.shout();
        Assert.assertTrue(teamSpirit + 1 == observer.getTeamSpirit());
    }

    @Test
    public void ObserverShouldSign() {
        int count = 1500;
        boolean pyrotechnics = true;
        boolean performance = true;
        boolean posters = true;
        int teamSpirit = 100;
        String sector = "s";
        ru.kpfu.itis.Group11401.Astashev.Task010.Football.Observer observer = new ru.kpfu.itis.Group11401.Astashev.Task010.Football.Observer(count, pyrotechnics, performance, posters, sector, teamSpirit);
        observer.sign();
        Assert.assertTrue(!observer.isPerformance());
    }

    @Test
    public void ObserverShouldCheer() {
        int count = 1500;
        boolean pyrotechnics = true;
        boolean performance = true;
        boolean posters = true;
        int teamSpirit = 100;
        String sector = "s";
        ru.kpfu.itis.Group11401.Astashev.Task010.Football.Observer observer = new ru.kpfu.itis.Group11401.Astashev.Task010.Football.Observer(count, pyrotechnics, performance, posters, sector, teamSpirit);
        observer.cheer();
        Assert.assertTrue(!observer.isPosters());
    }

    @Test
    public void ObserverShouldPyr() {
        int count = 2111;
        boolean pyrotechnics = true;
        boolean performance = true;
        boolean posters = true;
        int teamSpirit = 100;
        String sector = "s";
        ru.kpfu.itis.Group11401.Astashev.Task010.Football.Observer observer = new ru.kpfu.itis.Group11401.Astashev.Task010.Football.Observer(count, pyrotechnics, performance, posters, sector, teamSpirit);
        observer.usetp();
        Assert.assertTrue(!observer.isPyrotechnics());
    }

    @Test
    public void ObserverShouldntFight() {
        int count = 1500;
        boolean pyrotechnics = true;
        boolean performance = true;
        boolean posters = true;
        int teamSpirit = 100;
        String sector = "s";
        ru.kpfu.itis.Group11401.Astashev.Task010.Football.Observer observer = new ru.kpfu.itis.Group11401.Astashev.Task010.Football.Observer(count, pyrotechnics, performance, posters, sector, teamSpirit);
        Fans fans = new Fans("sad", 12332, true, true);
        observer.fight(fans);
        Assert.assertTrue(!observer.isPyrotechnics());
    }

}