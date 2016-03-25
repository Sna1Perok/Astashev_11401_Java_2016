package ru.kpfu.itis.Group11401.Astashev.Task010.Football.Test;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.kpfu.itis.Group11401.Astashev.Task010.Football.Fans;


public class TestFans {
    ApplicationContext ac = new ClassPathXmlApplicationContext(
            "ru/kpfu/itis/Group11401/Astashev/Task010/Football/spring-config.xml"
    );
    @Test
    public void ConstructorShouldBeCorrectWithTeamSpirit() {
        Fans fans =  (Fans) ac.getBean("fans");
        int count = 100;
        int teamSpirit = 50;
        boolean pyrotechnics = true;
        boolean posters = true;
        String name = "Rubin";
        Assert.assertTrue(count == fans.getCount() && teamSpirit == fans.getTeamSpirit() &&
                pyrotechnics == fans.isPyrotechnics() && posters == fans.isPosters() && name.equals(fans.getName()));
    }

    @Test
    public void ConstructorShouldBeCorrect() {
       // Fans fans = new Fans("Rubin", 100, true, true);
        Fans fans =  (Fans) ac.getBean("fans");
        int count = 100;
        boolean pyrotechnics = true;
        boolean posters = true;
        String name = "Rubin";
        Assert.assertTrue(count == fans.getCount() &&
                pyrotechnics == fans.isPyrotechnics() && posters == fans.isPosters() && name.equals(fans.getName()));
    }

    @Test
    public void GetterFansCountShouldBeRight() {
        //Fans fans = new Fans("Rubin", 100, true, true, 50);
        Fans fans =  (Fans) ac.getBean("fans");
        int count = 100;
       Assert.assertTrue(count == fans.getCount());
    }

    @Test
    public void GetterFansPyrotechnicsShouldBeRight() {
        //Fans fans = new Fans("Rubin", 100, true, true, 50);
        Fans fans =  (Fans) ac.getBean("fans");
        boolean pyrotechnics = true;
        String name = "Rubin";
        Assert.assertTrue(pyrotechnics == fans.isPyrotechnics());
    }

    @Test
    public void GetterFansTeamSpiritShouldBeRight() {
        //Fans fans = new Fans("Rubin", 100, true, true, 50);
        Fans fans =  (Fans) ac.getBean("fans");
       int teamSpirit = 50;
        Assert.assertTrue(teamSpirit == fans.getTeamSpirit());
    }

    @Test
    public void GetterFansPostersShouldBeRight() {
        //Fans fans = new Fans("Rubin", 100, true, true, 50);
        Fans fans =  (Fans) ac.getBean("fans");
        boolean posters = true;
        Assert.assertTrue(posters == fans.isPosters());
    }

    @Test
    public void GetterFansNameShouldBeRight() {
        //Fans fans = new Fans("Rubin", 100, true, true, 50);
        Fans fans =  (Fans) ac.getBean("fans"); String name = "Rubin";
        Assert.assertTrue(name == fans.getName());
    }

    @Test
    public void FansShouldShout() {
        //Fans fans = new Fans("Rubin", 100, true, true, 50);
        Fans fans =  (Fans) ac.getBean("fans");
        int teamSpirit = fans.getTeamSpirit();
        fans.shout();
        Assert.assertTrue(teamSpirit < fans.getTeamSpirit());
    }

    @Test
    public void FansShouldSign() {
        //Fans fans = new Fans("Rubin", 100, true, true, 50);
        Fans fans =  (Fans) ac.getBean("fans");
        int teamSpirit = fans.getTeamSpirit();
        fans.sign();
        Assert.assertTrue(teamSpirit < fans.getTeamSpirit());
    }

    @Test
    public void FansShouldCheer() {
        //Fans fans = new Fans("Rubin", 100, true, true, 50);
        Fans fans =  (Fans) ac.getBean("fans");
        int teamSpirit = fans.getTeamSpirit();
        fans.cheer();
        Assert.assertTrue(teamSpirit < fans.getTeamSpirit() && !fans.isPosters());
    }

    @Test
    public void FansShouldUpset() {
        //Fans fans = new Fans("Rubin", 100, true, true, 50);
        Fans fans =  (Fans) ac.getBean("fans");
        int teamSpirit = fans.getTeamSpirit() - 4;
        fans.usetp();
        Assert.assertTrue(teamSpirit == fans.getTeamSpirit() && !fans.isPyrotechnics());
    }

    @Test
    public void FansShouldUpsetWhenTheyDoesntPurotec() {
        //Fans fans = new Fans("Rubin", 100, true, true, 50);
        Fans fans =  (Fans) ac.getBean("fans");
        int teamSpirit = fans.getTeamSpirit() - 3;
        fans.usetp();
        Assert.assertTrue(teamSpirit == fans.getTeamSpirit() && !fans.isPyrotechnics());
    }

    @Test
    public void WhenFansFight() {
        //Fans fans = new Fans("Rubin", 100, true, true, 50);
        Fans fans =  (Fans) ac.getBean("fans");
        //Fans fans1 = new Fans("Beef", 100, true, true, 50);
        Fans fans1 =  (Fans) ac.getBean("fans1");
        int teamSpirit = fans.getTeamSpirit();
        fans.fight(fans1);
        Assert.assertTrue(teamSpirit > fans.getTeamSpirit() && !fans.isPyrotechnics() && !fans.isPosters());
    }

}