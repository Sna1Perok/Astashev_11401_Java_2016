package ru.kpfu.itis.Group11401.Astashev.Task010.Football.Test;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.kpfu.itis.Group11401.Astashev.Task010.Football.FootballPlayer;
import ru.kpfu.itis.Group11401.Astashev.Task010.Football.MainReferee;


public class TestFootballPlayer {

    ApplicationContext ac = new ClassPathXmlApplicationContext(
            "ru/kpfu/itis/Group11401/Astashev/Task010/Football/spring-config.xml"
    );
    @Test
    public void ConstructorShouldBeRight() {
        FootballPlayer fb = (FootballPlayer) ac.getBean("footballPlayer1");
        String name = "Nikita";
        int card = 1;
        int attacscill = 100;
        int defScaill = 99;
        boolean boll = false;
        fb.setiHaveABoll(false);
        Assert.assertTrue(name.equals(fb.getName()) && card == fb.getCard() && attacscill == fb.getAttackScill() && defScaill ==
                fb.getDefendScill() && boll == fb.isiHaveABoll());
    }

    @Test
    public void GetterFootballPlayerShouldBeCorrectName() {
       // FootballPlayer fb = new FootballPlayer("Nikita", 1, 100, 99, false);
        FootballPlayer fb = (FootballPlayer) ac.getBean("footballPlayer1");
        String name = "Nikita";
        Assert.assertTrue(name.equals("Nikita"));
    }

    @Test
    public void GetterFootballPlayerShouldBeCorrectCard() {
        // FootballPlayer fb = new FootballPlayer("Nikita", 1, 100, 99, false);
        FootballPlayer fb = (FootballPlayer) ac.getBean("footballPlayer1");
        int card = 1;
        Assert.assertTrue(card == fb.getCard());
    }


    @Test
    public void GetterFootballPlayerShouldBeCorrectatTeam() {
        // FootballPlayer fb = new FootballPlayer("Nikita", 1, 100, 99, false);
        FootballPlayer fb = (FootballPlayer) ac.getBean("footballPlayer1");
        int attacscill = 100;
        Assert.assertTrue(attacscill == fb.getAttackScill());
    }

    @Test
    public void PlayeShoulDoPassCorrect() {
        FootballPlayer fb = new FootballPlayer("Nikita", 1, 100, 99, true);
        FootballPlayer fb1 = new FootballPlayer("Kirill", 0, 30, 50, false);
        fb.giveThePass(fb1);
        Assert.assertTrue(fb1.isiHaveABoll());
    }

    @Test
    public void PlayeShoulDoPassUnCorrect() {
        // FootballPlayer fb = new FootballPlayer("Nikita", 1, 100, 99, false);
        FootballPlayer fb = (FootballPlayer) ac.getBean("footballPlayer1");
        // FootballPlayer fb1 = new FootballPlayer("Kirill", 0, 30, 50, false);
        FootballPlayer fb1 = (FootballPlayer) ac.getBean("footballPlayer2");
        fb.giveThePass(fb1);
        Assert.assertTrue(!fb.isiHaveABoll());
    }

    @Test
    public void PlayeShoulDoNormPassCorrect() {
        // FootballPlayer fb = new FootballPlayer("Nikita", 1, 100, 99, false);
        FootballPlayer fb = (FootballPlayer) ac.getBean("footballPlayer1");
        // FootballPlayer fb1 = new FootballPlayer("Kirill", 0, 30, 50, false);
        FootballPlayer fb1 = (FootballPlayer) ac.getBean("footballPlayer2");
        fb.giveThePass(fb1);
        Assert.assertTrue(fb1.isiHaveABoll() && !fb.isiHaveABoll());
    }

    @Test
    public void PlayeShoulDoCanopyCorrect() {
        // FootballPlayer fb = new FootballPlayer("Nikita", 1, 100, 99, false);
        FootballPlayer fb = (FootballPlayer) ac.getBean("footballPlayer1");
        // FootballPlayer fb1 = new FootballPlayer("Kirill", 0, 30, 50, false);
        FootballPlayer fb1 = (FootballPlayer) ac.getBean("footballPlayer2");
        fb.doCanopy(fb1);
        Assert.assertTrue(!fb.isiHaveABoll());
    }

    @Test
    public void PlayeShoulDoNormCanopyCorrect() {
        // FootballPlayer fb = new FootballPlayer("Nikita", 1, 100, 99, false);
        FootballPlayer fb = (FootballPlayer) ac.getBean("footballPlayer1");
        // FootballPlayer fb1 = new FootballPlayer("Kirill", 0, 30, 50, false);
        FootballPlayer fb1 = (FootballPlayer) ac.getBean("footballPlayer2");
        fb.doCanopy(fb1);
        Assert.assertTrue(fb1.isiHaveABoll() && !fb.isiHaveABoll());
    }

    @Test
    public void PlayeShoulDoCanopyUnCorrect() {
        // FootballPlayer fb = new FootballPlayer("Nikita", 1, 100, 99, false);
        FootballPlayer fb = (FootballPlayer) ac.getBean("footballPlayer1");
        // FootballPlayer fb1 = new FootballPlayer("Kirill", 0, 30, 50, false);
        FootballPlayer fb1 = (FootballPlayer) ac.getBean("footballPlayer2");
        fb.doCanopy(fb1);
        Assert.assertTrue(!fb.isiHaveABoll());
    }

    @Test
    public void PlayeShoulBreakTheRulesCorrect() {
        MainReferee mainreferi = new MainReferee(1, 12, 33, "Lorn");
        // FootballPlayer fb = new FootballPlayer("Nikita", 1, 100, 99, false);
        FootballPlayer fb = (FootballPlayer) ac.getBean("footballPlayer1");
        int card = fb.getCard();
        fb.toBreakTheRules(mainreferi);
        Assert.assertTrue(card == card);
    }

    @Test
    public void PlayeShoulBreakTheRulesUnCorrect() {
        MainReferee mainreferi = new MainReferee(1, 12, 33, "Lorn");
        // FootballPlayer fb1 = new FootballPlayer("Kirill", 0, 30, 50, false);
        FootballPlayer fb1 = (FootballPlayer) ac.getBean("footballPlayer2");
        int card = fb1.getCard();
        fb1.toBreakTheRules(mainreferi);
        Assert.assertTrue(card == card);
    }

    @Test
    public void PlayeShoulBreakTheRulesUnCorrect2() {
        MainReferee mainreferi = new MainReferee(1, 12, 33, "Lorn");
        // FootballPlayer fb1 = new FootballPlayer("Kirill", 0, 30, 50, false);
        FootballPlayer fb1 = (FootballPlayer) ac.getBean("footballPlayer2");
        int card = fb1.getCard();
        fb1.toBreakTheRules(mainreferi);
        fb1.addCard();
        Assert.assertTrue(card == card);
    }

    @Test
    public void PlayeShoulBreakTheRulesUnCorrect3() {
        MainReferee mainreferi = new MainReferee(1, 12, 33, "Lorn");
        // FootballPlayer fb1 = new FootballPlayer("Kirill", 0, 30, 50, false);
        FootballPlayer fb1 = (FootballPlayer) ac.getBean("footballPlayer2");
        int card = fb1.getCard();
        fb1.toBreakTheRules(mainreferi);
        fb1.addCard();
        Assert.assertTrue(card == card);
    }

    @Test
    public void PlayeShoulBreakTheRulesUnCorrect4() {
        MainReferee mainreferi = new MainReferee(0, 12, 33, "Lorn");
        // FootballPlayer fb1 = new FootballPlayer("Kirill", 0, 30, 50, false);
        FootballPlayer fb1 = (FootballPlayer) ac.getBean("footballPlayer2");
        int card = fb1.getCard();
        fb1.toBreakTheRules(mainreferi);
        fb1.addCard();
        Assert.assertTrue(card == card);
    }

    @Test
    public void PlayerTryCirclePlayer() {
        // FootballPlayer fb = new FootballPlayer("Nikita", 1, 100, 99, false);
        FootballPlayer fb = (FootballPlayer) ac.getBean("footballPlayer1");
        // FootballPlayer fb1 = new FootballPlayer("Kirill", 0, 30, 50, false);
        FootballPlayer fb1 = (FootballPlayer) ac.getBean("footballPlayer2");
        int card = fb1.getCard();
        fb1.circlePlayer(fb);
        Assert.assertTrue(!fb1.isiHaveABoll() && fb.isiHaveABoll());
    }

    @Test
    public void PlayerShouldCirclePlayer() {
        // FootballPlayer fb = new FootballPlayer("Nikita", 1, 100, 99, false);
        FootballPlayer fb = (FootballPlayer) ac.getBean("footballPlayer1");
        // FootballPlayer fb1 = new FootballPlayer("Kirill", 0, 30, 50, false);
        FootballPlayer fb1 = (FootballPlayer) ac.getBean("footballPlayer2");
        int card = fb1.getCard();
        fb.circlePlayer(fb1);
        Assert.assertTrue(fb.isiHaveABoll());
    }


}