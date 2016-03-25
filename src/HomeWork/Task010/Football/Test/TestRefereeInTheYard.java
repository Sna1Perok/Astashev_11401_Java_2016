package ru.kpfu.itis.Group11401.Astashev.Task010.Football.Test;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.kpfu.itis.Group11401.Astashev.Task010.Football.FootballPlayer;
import ru.kpfu.itis.Group11401.Astashev.Task010.Football.Linesman;
import ru.kpfu.itis.Group11401.Astashev.Task010.Football.MainReferee;
import ru.kpfu.itis.Group11401.Astashev.Task010.Football.RefereeIntTheYard;

import static org.mockito.Mockito.ignoreStubs;

public class TestRefereeInTheYard {

    ApplicationContext ac = new ClassPathXmlApplicationContext(
            "ru/kpfu/itis/Group11401/Astashev/Task010/Football/spring-config.xml"
    );

    @Test
    public void ConstructorRefereeInTheYardShouldBeCorrect() {
        String name = "sd";
        int card = 0;
        String team = "aaaa";
        int attackScill = 100;
        int defendScill = 100;
        int position = 1;
        int expirience = 100;
        int age = 20;
        boolean iHaveABoll = true;
        RefereeIntTheYard refereeIntTheYard =
                new RefereeIntTheYard(iHaveABoll, age, expirience, position, defendScill, attackScill, name, card);
        Assert.assertTrue(iHaveABoll == refereeIntTheYard.isiHaveABoll() && age == refereeIntTheYard.getAge() &&
                expirience == refereeIntTheYard.getExpirience() && defendScill == refereeIntTheYard.getDefendScill() &&
                attackScill == refereeIntTheYard.getAttackScill() && name.equals(refereeIntTheYard.getName()) && card == refereeIntTheYard.getCard());
    }

    @Test
    public void GetterRefereeInTheYArdNameShoulBeCorrect() {
        String name = "sd";
        int card = 0;
        String team = "aaaa";
        int attackScill = 100;
        int defendScill = 100;
        int position = 1;
        int expirience = 100;
        int age = 20;
        boolean iHaveABoll = true;
        RefereeIntTheYard refereeIntTheYard =
                new RefereeIntTheYard(iHaveABoll, age, expirience, position, defendScill, attackScill, name, card);
        Assert.assertTrue(name.equals(refereeIntTheYard.getName()));
    }

    @Test
    public void GetterRefereeInTheYArdCardShoulBeCorrect() {
        String name = "sd";
        int card = 0;
        String team = "aaaa";
        int attackScill = 100;
        int defendScill = 100;
        int position = 1;
        int expirience = 100;
        int age = 20;
        boolean iHaveABoll = true;
        RefereeIntTheYard refereeIntTheYard =
                new RefereeIntTheYard(iHaveABoll, age, expirience, position, defendScill, attackScill, name, card);
        Assert.assertTrue(card == refereeIntTheYard.getCard());
    }

    @Test
    public void GetterRefereeInTheYArdAttacScillShoulBeCorrect() {
        String name = "sd";
        int card = 0;
        String team = "aaaa";
        int attackScill = 100;
        int defendScill = 100;
        int position = 1;
        int expirience = 100;
        int age = 20;
        boolean iHaveABoll = true;
        RefereeIntTheYard refereeIntTheYard =
                new RefereeIntTheYard(iHaveABoll, age, expirience, position, defendScill, attackScill, name, card);
        Assert.assertTrue(attackScill == refereeIntTheYard.getAttackScill());
    }

    @Test
    public void GetterRefereeInTheYArdDefScillShoulBeCorrect() {
        String name = "sd";
        int card = 0;
        String team = "aaaa";
        int attackScill = 100;
        int defendScill = 100;
        int position = 1;
        int expirience = 100;
        int age = 20;
        boolean iHaveABoll = true;
        RefereeIntTheYard refereeIntTheYard =
                new RefereeIntTheYard(iHaveABoll, age, expirience, position, defendScill, attackScill, name, card);
        Assert.assertTrue(defendScill == refereeIntTheYard.getDefendScill());
    }

    @Test
    public void GetterRefereeInTheYArdAgeShoulBeCorrect() {
        String name = "sd";
        int card = 0;
        String team = "aaaa";
        int attackScill = 100;
        int defendScill = 100;
        int position = 1;
        int expirience = 100;
        int age = 20;
        boolean iHaveABoll = true;
        RefereeIntTheYard refereeIntTheYard =
                new RefereeIntTheYard(iHaveABoll, age, expirience, position, defendScill, attackScill, name, card);
        Assert.assertTrue(age == refereeIntTheYard.getAge());
    }

    @Test
    public void GetterRefereeInTheYArdTeamShoulBeCorrect() {
        String name = "sds";
        int card = 0;
        String team = "aaaa";
        int attackScill = 100;
        int defendScill = 1002;
        int position = 1;
        int expirience = 100;
        int age = 20;
        boolean iHaveABoll = true;
        RefereeIntTheYard refereeIntTheYard =
                new RefereeIntTheYard(iHaveABoll, age, expirience, position, defendScill, attackScill, name, card);
        ignoreStubs();
    }

    @Test
    public void GetterRefereeInTheYArdPositionShoulBeCorrect() {
        String name = "sd";
        int card = 0;
        String team = "aaaa";
        int attackScill = 100;
        int defendScill = 100;
        int position = 1;
        int expirience = 100;
        int age = 20;
        boolean iHaveABoll = true;
        RefereeIntTheYard refereeIntTheYard =
                new RefereeIntTheYard(iHaveABoll, age, expirience, position, defendScill, attackScill, name, card);
        Assert.assertTrue(position == refereeIntTheYard.getPosition());
    }

    @Test
    public void RefereInTheYardShouldGiveThePassCorrect() {
        String name = "sd";
        int card = 0;
        String team = "aaaa";
        int attackScill = 100;
        int defendScill = 100;
        int position = 1;
        int expirience = 100;
        int age = 20;
        boolean iHaveABoll = true;
        RefereeIntTheYard refereeIntTheYard =
                new RefereeIntTheYard(iHaveABoll, age, expirience, position, defendScill, attackScill, name, card);
        FootballPlayer footballPlayer = new FootballPlayer("asd", 23, 23, 23, false);
        refereeIntTheYard.giveThePass(footballPlayer);
        Assert.assertTrue(!refereeIntTheYard.isiHaveABoll() && footballPlayer.isiHaveABoll());
    }

    @Test
    public void RefereInTheYardShouldGiveThePassCorrect1() {
        String name = "sd";
        int card = 0;
        String team = "aaaa";
        int attackScill = 44;
        int defendScill = 44;
        int position = 1;
        int expirience = 44;
        int age = 20;
        boolean iHaveABoll = true;
        RefereeIntTheYard refereeIntTheYard =
                new RefereeIntTheYard(iHaveABoll, age, expirience, position, defendScill, attackScill, name, card);
        FootballPlayer footballPlayer = new FootballPlayer("asd", 23, 23, 23, false);
        refereeIntTheYard.giveThePass(footballPlayer);
        Assert.assertTrue(!refereeIntTheYard.isiHaveABoll() && footballPlayer.isiHaveABoll());
    }

    @Test
    public void RefereInTheYardShouldGiveThePassUnCorrect() {
        String name = "sd";
        int card = 0;
        String team = "aaaa";
        int attackScill = 11;
        int defendScill = 11;
        int position = 1;
        int expirience = 11;
        int age = 20;
        boolean iHaveABoll = true;
        RefereeIntTheYard refereeIntTheYard =
                new RefereeIntTheYard(iHaveABoll, age, expirience, position, defendScill, attackScill, name, card);
        FootballPlayer footballPlayer = new FootballPlayer("asd", 23, 23, 23, false);
        refereeIntTheYard.giveThePass(footballPlayer);
        Assert.assertTrue(!refereeIntTheYard.isiHaveABoll());
    }

    @Test
    public void RefereInTheYardShouldDoCanopyCorrect1() {
        String name = "sd";
        int card = 0;
        String team = "aaaa";
        int attackScill = 100;
        int defendScill = 100;
        int position = 1;
        int expirience = 100;
        int age = 20;
        boolean iHaveABoll = true;
        RefereeIntTheYard refereeIntTheYard =
                new RefereeIntTheYard(iHaveABoll, age, expirience, position, defendScill, attackScill, name, card);
        FootballPlayer footballPlayer = new FootballPlayer("asd", 23, 23, 23, false);
        refereeIntTheYard.doCanopy(footballPlayer);
        Assert.assertTrue(!refereeIntTheYard.isiHaveABoll() && footballPlayer.isiHaveABoll());
    }

    @Test
    public void RefereInTheYardShouldDoCanopyCorrect() {
        String name = "sd";
        int card = 0;
        String team = "aaaa";
        int attackScill = 44;
        int defendScill = 44;
        int position = 1;
        int expirience = 44;
        int age = 20;
        boolean iHaveABoll = true;
        RefereeIntTheYard refereeIntTheYard =
                new RefereeIntTheYard(iHaveABoll, age, expirience, position, defendScill, attackScill, name, card);
        FootballPlayer footballPlayer = new FootballPlayer("asd", 23, 23, 23, false);
        refereeIntTheYard.doCanopy(footballPlayer);
        Assert.assertTrue(!refereeIntTheYard.isiHaveABoll() && footballPlayer.isiHaveABoll());
    }

    @Test
    public void RefereInTheYardShouldDoCanopyunCorrect() {
        String name = "sd";
        int card = 0;
        String team = "aaaa";
        int attackScill = 11;
        int defendScill = 11;
        int position = 1;
        int expirience = 11;
        int age = 20;
        boolean iHaveABoll = true;
        RefereeIntTheYard refereeIntTheYard =
                new RefereeIntTheYard(iHaveABoll, age, expirience, position, defendScill, attackScill, name, card);
        FootballPlayer footballPlayer = new FootballPlayer("asd", 23, 23, 23, false);
        refereeIntTheYard.doCanopy(footballPlayer);
        Assert.assertTrue(!refereeIntTheYard.isiHaveABoll());
    }

    @Test
    public void RefereeInTheYardShouldBreakRulseCorrect() {
        String name = "sd";
        int card = 0;
        String team = "aaaa";
        int attackScill = 100;
        int defendScill = 100;
        int position = 1;
        int expirience = 100;
        int age = 20;
        boolean iHaveABoll = true;
        RefereeIntTheYard refereeIntTheYard =
                new RefereeIntTheYard(iHaveABoll, age, expirience, position, defendScill, attackScill, name, card);
        FootballPlayer footballPlayer = new FootballPlayer("asd", 23, 23, 23, false);
        MainReferee mainReferee = new MainReferee(1, 23, 32, "dd");
        refereeIntTheYard.toBreakTheRules(mainReferee);
        Assert.assertTrue(expirience > refereeIntTheYard.getExpirience());
    }

    @Test
    public void RefereeInTheYardShouldBreakRulseUnCorrect() {
        String name = "sd";
        int card = 0;
        String team = "aaaa";
        int attackScill = 11;
        int defendScill = 11;
        int position = 1;
        int expirience = 1;
        int age = 20;
        boolean iHaveABoll = true;
        RefereeIntTheYard refereeIntTheYard =
                new RefereeIntTheYard(iHaveABoll, age, expirience, position, defendScill, attackScill, name, card);
        FootballPlayer footballPlayer = new FootballPlayer("asd", 23, 23, 23, false);
        MainReferee mainReferee = new MainReferee(1, 23, 32, "dd");
        refereeIntTheYard.toBreakTheRules(mainReferee);
        Assert.assertTrue(expirience > refereeIntTheYard.getExpirience());
    }

    @Test
    public void RefereeInTheYardShouldBreakRulseCorrect1() {
        String name = "sd";
        int card = 3;
        String team = "aaaa";
        int attackScill = 11;
        int defendScill = 11;
        int position = 1;
        int expirience = 11;
        int age = 20;
        boolean iHaveABoll = true;
        RefereeIntTheYard refereeIntTheYard =
                new RefereeIntTheYard(iHaveABoll, age, expirience, position, defendScill, attackScill, name, card);
        FootballPlayer footballPlayer = new FootballPlayer("asd", 23, 23, 23, false);
        MainReferee mainReferee = new MainReferee(1, 23, 32, "dd");
        refereeIntTheYard.toBreakTheRules(mainReferee);
        Assert.assertTrue(expirience > refereeIntTheYard.getExpirience());
    }

    @Test
    public void RefereeInTheYardShouldCirclePlayerCorrect() {
        String name = "sd";
        int card = 3;
        String team = "aaaa";
        int attackScill = 11;
        int defendScill = 11;
        int position = 1;
        int expirience = 11;
        int age = 20;
        boolean iHaveABoll = true;
        RefereeIntTheYard refereeIntTheYard =
                new RefereeIntTheYard(iHaveABoll, age, expirience, position, defendScill, attackScill, name, card);
        FootballPlayer footballPlayer = new FootballPlayer("asd", 23, 23, 23, false);
        refereeIntTheYard.circlePlayer(footballPlayer);
        Assert.assertTrue(!refereeIntTheYard.isiHaveABoll());
    }

    @Test
    public void RefereeInTheYardShouldCirclePlayerCorrect1() {
        String name = "sd";
        int card = 3;
        String team = "aaaa";
        int attackScill = 11;
        int defendScill = 111;
        int position = 1;
        int expirience = 11;
        int age = 20;
        boolean iHaveABoll = true;
        RefereeIntTheYard refereeIntTheYard =
                new RefereeIntTheYard(iHaveABoll, age, expirience, position, defendScill, attackScill, name, card);
        FootballPlayer footballPlayer = new FootballPlayer("asd", 23, 23, 23, false);
        refereeIntTheYard.circlePlayer(footballPlayer);
        Assert.assertTrue(refereeIntTheYard.isiHaveABoll() && !footballPlayer.isiHaveABoll());
    }

    @Test
    public void RefereeInTheYardShouldFindIffece() {
        String name = "sd";
        int card = 3;
        String team = "aaaa";
        int attackScill = 11;
        int defendScill = 111;
        int position = 1;
        int expirience = 11;
        int age = 20;
        boolean iHaveABoll = true;
        RefereeIntTheYard refereeIntTheYard =
                new RefereeIntTheYard(iHaveABoll, age, expirience, position, defendScill, attackScill, name, card);
        FootballPlayer footballPlayer = new FootballPlayer("asd", 23, 23, 23, false);
        refereeIntTheYard.findOffence(footballPlayer);
        Assert.assertTrue(expirience < refereeIntTheYard.getExpirience());
    }

    @Test
    public void RefereeInTheYardShouldFindIffece1() {
        String name = "sd";
        int card = 3;
        String team = "aaaa";
        int attackScill = 11;
        int defendScill = 111;
        int position = 1;
        int expirience = 111;
        int age = 40;
        boolean iHaveABoll = true;
        RefereeIntTheYard refereeIntTheYard =
                new RefereeIntTheYard(iHaveABoll, age, expirience, position, defendScill, attackScill, name, card);
        FootballPlayer footballPlayer = new FootballPlayer("asd", 23, 23, 23, false);
        refereeIntTheYard.findOffence(footballPlayer);
        Linesman linesman = new Linesman(2, 23, 23, "asd");
        refereeIntTheYard.offside(footballPlayer, linesman);
        Assert.assertTrue(expirience < refereeIntTheYard.getExpirience());
    }

}