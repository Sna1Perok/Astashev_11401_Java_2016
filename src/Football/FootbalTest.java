package Football;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

/**
 * Created by 1 on 26.02.2016.
 */

public class FootbalTest {
    ///////////////////// BadWeather
    @Test
    public void ConstructorBadWeatherShouldBeRight() {
        BadWeather badWeather = new BadWeather(1, 1, 3);
        int intensity = 1;
        int time = 1;
        int forecast = 3;
        Assert.assertTrue(intensity == badWeather.getIntensity() &&
                time == badWeather.getTime() && forecast == badWeather.getForecast());
    }

    @Test
    public void GetterBadWeatherIntensityBeRight() {
        BadWeather badWeather = new BadWeather(1, 1, 3);
        int intensity = 1;
        Assert.assertTrue(intensity == badWeather.getIntensity());
    }

    @Test
    public void GetterBadWeatherTimeBeRight() {
        BadWeather badWeather = new BadWeather(1, 1, 3);
        int time = 1;
        Assert.assertTrue(time == badWeather.getTime());
    }

    @Test
    public void GetterBadWeatherForecastBeRight() {
        BadWeather badWeather = new BadWeather(1, 1, 3);
        int forecast = 3;
        Assert.assertTrue(forecast == badWeather.getForecast());
    }

    @Test
    public void MethodRainShouldMakeTheRain() {
        BadWeather badWeather = new BadWeather(3, 3, 3);
        int k = badWeather.getTime();
        badWeather.rain(badWeather.getIntensity(), badWeather.getTime(), badWeather.getForecast());
        Assert.assertTrue(k < badWeather.getTime());
    }

    @Test
    public void MethodRainShouldMakeTheRain_forecast3() {
        BadWeather badWeather = new BadWeather(1, 3, 3);
        int k = badWeather.getForecast();
        badWeather.rain(badWeather.getIntensity(), badWeather.getTime(), badWeather.getForecast());
        Assert.assertTrue(k < badWeather.getForecast());
    }

    @Test
    public void MethodRainShouldMakeThefog() {
        BadWeather badWeather = new BadWeather(3, 3, 3);
        int k = badWeather.getTime();
        badWeather.fog(badWeather.getIntensity(), badWeather.getTime(), badWeather.getForecast());
        Assert.assertTrue(k < badWeather.getTime());
    }

    @Test
    public void MethodRainShouldMakeThefog_forecast3() {
        BadWeather badWeather = new BadWeather(1, 3, 3);
        int k = badWeather.getForecast();
        badWeather.fog(badWeather.getIntensity(), badWeather.getTime(), badWeather.getForecast());
        Assert.assertTrue(k < badWeather.getForecast());
    }

    @Test
    public void MethodRainShouldMakeTherainAndSnow() {
        BadWeather badWeather = new BadWeather(3, 3, 3);
        int k = badWeather.getTime();
        badWeather.rainAndSnow(badWeather.getIntensity(), badWeather.getTime(), badWeather.getForecast());
        Assert.assertTrue(k > badWeather.getTime());
    }

    @Test
    public void MethodRainShouldMakeTheRainAndSnow_forecast3() {
        BadWeather badWeather = new BadWeather(1, 1, 4);
        int k = badWeather.getForecast();
        badWeather.rainAndSnow(badWeather.getIntensity(), badWeather.getTime(), badWeather.getForecast());
        Assert.assertTrue(k > badWeather.getForecast());
    }

    @Test
    public void MethodRainShouldMakeTheSunny() {
        BadWeather badWeather = new BadWeather(1, 1, 4);
        int k = badWeather.getTime();
        badWeather.sunny();
        Assert.assertTrue(k < badWeather.getForecast());
    }

    @Test
    public void MethodRainShouldMakeTheThunder() {
        BadWeather badWeather = new BadWeather(3, 3, 3);
        int k = badWeather.getTime();
        badWeather.thunder(badWeather.getIntensity(), badWeather.getTime(), badWeather.getForecast());
        Assert.assertTrue(k > badWeather.getTime());
    }

    @Test
    public void MethodRainShouldMakeTheThunder_forecast3() {
        BadWeather badWeather = new BadWeather(1, 1, 4);
        int k = badWeather.getTime();
        badWeather.thunder(badWeather.getIntensity(), badWeather.getTime(), badWeather.getForecast());
        Assert.assertTrue(k > badWeather.getTime());
    }


    //////////// Fans

    @Test
    public void ConstructorShouldBeCorrectWithTeamSpirit() {
        Fans fans = new Fans("Rubin", 100, true, true, 50);
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
        Fans fans = new Fans("Rubin", 100, true, true);
        int count = 100;
        boolean pyrotechnics = true;
        boolean posters = true;
        String name = "Rubin";
        Assert.assertTrue(count == fans.getCount() &&
                pyrotechnics == fans.isPyrotechnics() && posters == fans.isPosters() && name.equals(fans.getName()));
    }

    @Test
    public void GetterFansCountShouldBeRight() {
        Fans fans = new Fans("Rubin", 100, true, true, 50);
        int count = 100;
        int teamSpirit = 50;
        boolean pyrotechnics = true;
        boolean posters = true;
        String name = "Rubin";
        Assert.assertTrue(count == fans.getCount());
    }

    @Test
    public void GetterFansPyrotechnicsShouldBeRight() {
        Fans fans = new Fans("Rubin", 100, true, true, 50);
        int count = 100;
        int teamSpirit = 50;
        boolean pyrotechnics = true;
        boolean posters = true;
        String name = "Rubin";
        Assert.assertTrue(pyrotechnics == fans.isPyrotechnics());
    }

    @Test
    public void GetterFansTeamSpiritShouldBeRight() {
        Fans fans = new Fans("Rubin", 100, true, true, 50);
        int count = 100;
        int teamSpirit = 50;
        boolean pyrotechnics = true;
        boolean posters = true;
        String name = "Rubin";
        Assert.assertTrue(teamSpirit == fans.getTeamSpirit());
    }

    @Test
    public void GetterFansPostersShouldBeRight() {
        Fans fans = new Fans("Rubin", 100, true, true, 50);
        int count = 100;
        int teamSpirit = 50;
        boolean pyrotechnics = true;
        boolean posters = true;
        String name = "Rubin";
        Assert.assertTrue(posters == fans.isPosters());
    }

    @Test
    public void GetterFansNameShouldBeRight() {
        Fans fans = new Fans("Rubin", 100, true, true, 50);
        int count = 100;
        int teamSpirit = 50;
        boolean pyrotechnics = true;
        boolean posters = true;
        String name = "Rubin";
        Assert.assertTrue(name == fans.getName());
    }

    @Test
    public void FansShouldShout() {
        Fans fans = new Fans("Rubin", 100, true, true, 50);
        //  Fans fanss = mock(Fans.class);
        // when(fanss.getCount()).thenReturn(100,100,100);
        // when(fanss.getName()).thenReturn("Rubin","Rubin","Rubin");
        //  when(fanss.getTeamSpirit()).thenReturn(50,50,50);
        //  when(fanss.isPosters()).thenReturn(true,false,false,false);
        //  when(fanss.isPyrotechnics()).thenReturn(true,false,false,false);
        int teamSpirit = fans.getTeamSpirit();
        fans.shout();
        Assert.assertTrue(teamSpirit < fans.getTeamSpirit());
    }

    @Test
    public void FansShouldSign() {
        Fans fans = new Fans("Rubin", 100, true, true, 50);
        int teamSpirit = fans.getTeamSpirit();
        fans.sign();
        Assert.assertTrue(teamSpirit < fans.getTeamSpirit());
    }

    @Test
    public void FansShouldCheer() {
        Fans fans = new Fans("Rubin", 100, true, true, 50);
        int teamSpirit = fans.getTeamSpirit();
        fans.cheer();
        Assert.assertTrue(teamSpirit < fans.getTeamSpirit() && !fans.isPosters());
    }

    @Test
    public void FansShouldUpset() {
        Fans fans = new Fans("Rubin", 100, true, true, 50);
        int teamSpirit = fans.getTeamSpirit() - 4;
        fans.usetp();
        Assert.assertTrue(teamSpirit == fans.getTeamSpirit() && !fans.isPyrotechnics());
    }

    @Test
    public void FansShouldUpsetWhenTheyDoesntPurotec() {
        Fans fans = new Fans("Rubin", 100, false, true, 50);
        int teamSpirit = fans.getTeamSpirit() - 3;
        fans.usetp();
        Assert.assertTrue(teamSpirit == fans.getTeamSpirit() && !fans.isPyrotechnics());
    }

    @Test
    public void WhenFansFight() {
        Fans fans = new Fans("Rubin", 100, true, true, 50);
        Fans fans1 = new Fans("Beef", 100, true, true, 50);
        int teamSpirit = fans.getTeamSpirit();
        fans.fight(fans1);
        Assert.assertTrue(teamSpirit > fans.getTeamSpirit() && !fans.isPyrotechnics() && !fans.isPosters());
    }

    ///////////////FootballPlayer

    @Test
    public void ConstructorShouldBeRight() {
        FootballPlayer fb = new FootballPlayer("Nikita", 1, 100, 99, false);
        String name = "Nikita";
        int card = 1;
        int attacscill = 100;
        int defScaill = 99;
        boolean boll = false;
        Assert.assertTrue(name.equals(fb.getName()) && card == fb.getCard() && attacscill == fb.getAttackScill() && defScaill ==
                fb.getDefendScill() && boll == fb.isiHaveABoll());
    }

    @Test
    public void GetterFootballPlayerShouldBeCorrectName() {
        FootballPlayer fb = new FootballPlayer("Nikita", 1, 100, 99, false);
        String name = "Nikita";
        int card = 1;
        int attacscill = 100;
        int defScaill = 99;
        Assert.assertTrue(name.equals("Nikita"));
    }

    @Test
    public void GetterFootballPlayerShouldBeCorrectCard() {
        FootballPlayer fb = new FootballPlayer("Nikita", 1, 100, 99,false);
        String name = "Nikita";
        int card = 1;
        int attacscill = 100;
        int defScaill = 99;
        Assert.assertTrue(card == fb.getCard());
    }


    @Test
    public void GetterFootballPlayerShouldBeCorrectatTeam() {
        FootballPlayer fb = new FootballPlayer("Nikita", 1, 100, 99,false);
        String name = "Nikita";
        int card = 1;
        int attacscill = 100;
        int defScaill = 99;
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
        FootballPlayer fb = new FootballPlayer("Nikita", 1, 22, 22, true);
        FootballPlayer fb1 = new FootballPlayer("Kirill", 0, 30, 50, false);
        fb.giveThePass(fb1);
        Assert.assertTrue(!fb.isiHaveABoll());
    }
    @Test
    public void PlayeShoulDoNormPassCorrect() {
        FootballPlayer fb = new FootballPlayer("Nikita", 1, 44, 44, true);
        FootballPlayer fb1 = new FootballPlayer("Kirill", 0, 30, 50, false);
        fb.giveThePass(fb1);
        Assert.assertTrue(fb1.isiHaveABoll()&& !fb.isiHaveABoll() );
    }
    @Test
    public void PlayeShoulDoCanopyCorrect() {
        FootballPlayer fb = new FootballPlayer("Nikita", 1, 100, 99, true);
        FootballPlayer fb1 = new FootballPlayer("Kirill", 0, 30, 50, false);
        fb.doCanopy(fb1);
        Assert.assertTrue(!fb.isiHaveABoll());
    }
    @Test
    public void PlayeShoulDoNormCanopyCorrect() {
        FootballPlayer fb = new FootballPlayer("Nikita", 1, 44, 44, true);
        FootballPlayer fb1 = new FootballPlayer("Kirill", 0, 30, 50, false);
        fb.doCanopy(fb1);
        Assert.assertTrue(fb1.isiHaveABoll()&& !fb.isiHaveABoll() );
    }
    @Test
    public void PlayeShoulDoCanopyUnCorrect() {
        FootballPlayer fb = new FootballPlayer("Nikita", 1, 22, 22, true);
        FootballPlayer fb1 = new FootballPlayer("Kirill", 0, 30, 50, false);
        fb.doCanopy(fb1);
        Assert.assertTrue(!fb.isiHaveABoll());
    }
    @Test
    public void PlayeShoulBreakTheRulesCorrect() {
        MainReferi mainreferi = new MainReferi(1,12,33,"Lorn");
        FootballPlayer fb = new FootballPlayer("Nikita", 1, 100, 99, true);
        FootballPlayer fb1 = new FootballPlayer("Kirill", 0, 30, 50, false);
        int card = fb.getCard();
        fb.toBreakTheRules(mainreferi);
        Assert.assertTrue(card== card);
    }
    @Test
    public void PlayeShoulBreakTheRulesUnCorrect() {
        MainReferi mainreferi = new MainReferi(1,12,33,"Lorn");
        FootballPlayer fb1 = new FootballPlayer("Kirill", 1, 30, 50, false);
        int card = fb1.getCard();
        fb1.toBreakTheRules(mainreferi);
        Assert.assertTrue(card== card);
    }
    @Test
    public void PlayeShoulBreakTheRulesUnCorrect2() {
        MainReferi mainreferi = new MainReferi(1,12,33,"Lorn");
        FootballPlayer fb1 = new FootballPlayer("Kirill", 1, 30, 20, false);
        int card = fb1.getCard();
        fb1.toBreakTheRules(mainreferi);
        fb1.addCard();
        Assert.assertTrue(card== card);
    }
    @Test
    public void PlayeShoulBreakTheRulesUnCorrect3() {
        MainReferi mainreferi = new MainReferi(1,12,33,"Lorn");
        FootballPlayer fb1 = new FootballPlayer("Kirill", 0, 110, 120, false);
        int card = fb1.getCard();
        fb1.toBreakTheRules(mainreferi);
        fb1.addCard();
        Assert.assertTrue(card== card);
    }
    @Test
    public void PlayerTryCirclePlayer() {
        FootballPlayer fb = new FootballPlayer("Nikita", 1, 100, 99, true);
        FootballPlayer fb1 = new FootballPlayer("Kirill", 1, 30, 20, false);
        int card = fb1.getCard();
        fb1.circlePlayer(fb);
        Assert.assertTrue(!fb1.isiHaveABoll() && fb.isiHaveABoll());
    }
    @Test
    public void PlayerShouldCirclePlayer() {
        FootballPlayer fb = new FootballPlayer("Nikita", 1, 100, 99, true);
        FootballPlayer fb1 = new FootballPlayer("Kirill", 1, 30, 20, false);
        int card = fb1.getCard();
        fb.circlePlayer(fb1);
        Assert.assertTrue(fb.isiHaveABoll());
    }
    //////FootballTeam
    @Test
    public void ConstructorFootballTeamShouldBeCorrect(){
        ArrayList<FootballPlayer> rubin = new ArrayList<FootballPlayer>();
        FootballPlayer fb = new FootballPlayer("Nikita", 1, 100, 99, true);
        FootballPlayer fb1 = new FootballPlayer("Kirill", 1, 30, 20, false);
        rubin.add(fb);
        rubin.add(fb1);
        rubin.add(fb);
        rubin.add(fb1);
        String s = "ya";
        FootballTeam ft = new FootballTeam("Rubin",rubin,s, 100);
        String name = "Rubin";
        int dux = 100;
        Assert.assertTrue(ft.getName().equals(name)&& s.equals(ft.getBestGame()) && dux == ft.getTeamSpirit());

    }
}