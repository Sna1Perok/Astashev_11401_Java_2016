package Football;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

import static org.mockito.Mockito.*;

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
        fb.setiHaveABoll(false);
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
        FootballPlayer fb = new FootballPlayer("Nikita", 1, 100, 99, false);
        String name = "Nikita";
        int card = 1;
        int attacscill = 100;
        int defScaill = 99;
        Assert.assertTrue(card == fb.getCard());
    }


    @Test
    public void GetterFootballPlayerShouldBeCorrectatTeam() {
        FootballPlayer fb = new FootballPlayer("Nikita", 1, 100, 99, false);
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
        Assert.assertTrue(fb1.isiHaveABoll() && !fb.isiHaveABoll());
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
        Assert.assertTrue(fb1.isiHaveABoll() && !fb.isiHaveABoll());
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
        MainReferi mainreferi = new MainReferi(1, 12, 33, "Lorn");
        FootballPlayer fb = new FootballPlayer("Nikita", 1, 100, 99, true);
        FootballPlayer fb1 = new FootballPlayer("Kirill", 0, 30, 50, false);
        int card = fb.getCard();
        fb.toBreakTheRules(mainreferi);
        Assert.assertTrue(card == card);
    }

    @Test
    public void PlayeShoulBreakTheRulesUnCorrect() {
        MainReferi mainreferi = new MainReferi(1, 12, 33, "Lorn");
        FootballPlayer fb1 = new FootballPlayer("Kirill", 1, 30, 50, false);
        int card = fb1.getCard();
        fb1.toBreakTheRules(mainreferi);
        Assert.assertTrue(card == card);
    }

    @Test
    public void PlayeShoulBreakTheRulesUnCorrect2() {
        MainReferi mainreferi = new MainReferi(1, 12, 33, "Lorn");
        FootballPlayer fb1 = new FootballPlayer("Kirill", 1, 30, 20, false);
        int card = fb1.getCard();
        fb1.toBreakTheRules(mainreferi);
        fb1.addCard();
        Assert.assertTrue(card == card);
    }

    @Test
    public void PlayeShoulBreakTheRulesUnCorrect3() {
        MainReferi mainreferi = new MainReferi(1, 12, 33, "Lorn");
        FootballPlayer fb1 = new FootballPlayer("Kirill", 0, 110, 120, false);
        int card = fb1.getCard();
        fb1.toBreakTheRules(mainreferi);
        fb1.addCard();
        Assert.assertTrue(card == card);
    }

    @Test
    public void PlayeShoulBreakTheRulesUnCorrect4() {
        MainReferi mainreferi = new MainReferi(0, 12, 33, "Lorn");
        FootballPlayer fb1 = new FootballPlayer("Kirill", 0, 0, 0, false);
        int card = fb1.getCard();
        fb1.toBreakTheRules(mainreferi);
        fb1.addCard();
        Assert.assertTrue(card == card);
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
    public void ConstructorFootballTeamShouldBeCorrect() {
        ArrayList<FootballPlayer> rubin = new ArrayList<FootballPlayer>();
        FootballPlayer fb = new FootballPlayer("Nikita", 1, 100, 99, true);
        FootballPlayer fb1 = new FootballPlayer("Kirill", 1, 30, 20, false);
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
        FootballPlayer fb = new FootballPlayer("Nikita", 1, 100, 99, true);
        FootballPlayer fb1 = new FootballPlayer("Kirill", 1, 30, 20, false);
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
        FootballPlayer fb = mock(FootballPlayer.class);
        FootballPlayer fb1 = mock(FootballPlayer.class);
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
        FootballPlayer fb = mock(FootballPlayer.class);
        FootballPlayer fb1 = mock(FootballPlayer.class);
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
        FootballPlayer fb = mock(FootballPlayer.class);
        FootballPlayer fb1 = mock(FootballPlayer.class);
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
    //////good weather

    @Test
    public void ConstructorGoodWeatherShouldBeRight() {
        GoodWeather badWeather = new GoodWeather(1, 1, 3);
        int intensity = 1;
        int time = 1;
        int forecast = 3;
        Assert.assertTrue(intensity == badWeather.getIntensity() &&
                time == badWeather.getTime() && forecast == badWeather.getForecast());
    }

    @Test
    public void GetterGoodWeatherIntensityBeRight() {
        GoodWeather badWeather = new GoodWeather(1, 1, 3);
        int intensity = 1;
        Assert.assertTrue(intensity == badWeather.getIntensity());
    }

    @Test
    public void GetterGoodWeatherTimeBeRight() {
        BadWeather badWeather = new BadWeather(1, 1, 3);
        int time = 1;
        Assert.assertTrue(time == badWeather.getTime());
    }

    @Test
    public void GetterGoodWeatherForecastBeRight() {
        GoodWeather badWeather = new GoodWeather(1, 1, 3);
        int forecast = 3;
        Assert.assertTrue(forecast == badWeather.getForecast());
    }

    @Test
    public void ConstructorGoodWeatherShouldBeCorrect() {
        GoodWeather goodWeather = new GoodWeather(3, 3, 3);
        int time = 3;
        int identicy = 3;
        int forecast = 3;
        Assert.assertTrue(time == goodWeather.getTime() && identicy == goodWeather.getIntensity() &&
                forecast == goodWeather.getForecast());
    }

    @Test
    public void MethodRainInGoodWeatherShouldMakeARain() {
        GoodWeather goodWeather = new GoodWeather(2, 2, 2);
        int intensity = 2;
        int time = 2;
        int forecast = 2;
        goodWeather.rain(2, 2, 2);
        Assert.assertTrue(time + 1 == goodWeather.getTime());
    }

    @Test
    public void MethodRainInGoodWeatherWithLightRain() {
        GoodWeather goodWeather = new GoodWeather(2, 2, -3);
        int intensity = 4;
        int time = 4;
        int forecast = -3;
        goodWeather.rain(4, 4, -3);
        Assert.assertTrue(forecast + 1 == goodWeather.getForecast());
    }

    @Test
    public void MethodRainInGoodWeatherWithLightFog() {
        GoodWeather goodWeather = new GoodWeather(2, 2, -3);

        int forecast = -3;
        goodWeather.fog(4, 4, -3);
        Assert.assertTrue(forecast + 1 == goodWeather.getForecast());
    }

    @Test
    public void MethodRainInGoodWeatherShouldMakeRainAndSnow() {
        GoodWeather goodWeather = new GoodWeather(2, 2, -3);
        int forecast = -3;
        goodWeather.rainAndSnow(4, 4, -3);
        Assert.assertTrue(forecast + 1 == goodWeather.getForecast());
    }

    @Test
    public void MethodRainInGoodWeatherShouldSunny() {
        GoodWeather goodWeather = new GoodWeather(2, 2, 2);
        int time = 2;
        goodWeather.sunny();
        Assert.assertTrue(time + 1 == goodWeather.getTime());
    }

    @Test
    public void MethodRainInGoodWeatherShouldThunder() {
        GoodWeather goodWeather = new GoodWeather(2, 2, 2);
        int time = 2;
        goodWeather.thunder(2, 2, 2);
        Assert.assertTrue(time + 1 == goodWeather.getForecast());
    }

    /////linesman
    @Test
    public void ConstructorLinesmanShouldBeCorrect() {
        int position = 0;
        int expirience = 41;
        String name = "Lok";
        int age = 41;
        Linesman linesman1 = new Linesman(0, 41, 41, "Lok");
        Assert.assertTrue(position == linesman1.getPosition() && expirience == linesman1.getExpirience() &&
                name.equals(linesman1.getName()) && age == linesman1.getAge());

    }

    @Test
    public void GetterNameLinesmanShouldBeCorrect() {
        String name = "Lok";
        Linesman linesman1 = new Linesman(0, 41, 41, "Lok");
        Assert.assertTrue(name.equals(linesman1.getName()));
    }

    @Test
    public void GetterAgeLinesmanShouldBeCorrect() {
        int age = 41;
        Linesman linesman1 = new Linesman(0, 41, 41, "Lok");
        Assert.assertTrue(age == linesman1.getAge());
    }

    @Test
    public void GetterExpirienceLinesmanShouldBeCorrect() {
        int age = 41;
        Linesman linesman1 = new Linesman(0, 41, 41, "Lok");
        Assert.assertTrue(age == linesman1.getExpirience());
    }

    @Test
    public void GetterPositionLinesmanShouldBeCorrect() {
        int age = 0;
        Linesman linesman1 = new Linesman(0, 41, 41, "Lok");
        Assert.assertTrue(age == linesman1.getPosition());
    }

    @Test
    public void LinesmanShouldCorrectFindOffence() {
        Linesman linesman1 = new Linesman(0, 41, 41, "Lok");
        FootballPlayer footballPlayer = new FootballPlayer("Nikita", 100, 200, 32, true);
        int experience = linesman1.getExpirience();
        linesman1.findOffence(footballPlayer);
        Assert.assertTrue(experience < linesman1.getExpirience());
    }

    @Test
    public void LinesmanShouldUnCorrectFindOffence() {
        Linesman linesman1 = new Linesman(0, 30, 30, "Lok");
        FootballPlayer footballPlayer = new FootballPlayer("Nikita", 100, 200, 32, true);
        int experience = linesman1.getExpirience();
        linesman1.findOffence(footballPlayer);
        Assert.assertTrue(experience > linesman1.getExpirience());
    }

    @Test
    public void WhenLinesmanWhistle() {
        Linesman linesman1 = new Linesman(0, 30, 30, "Lok");
        int experience = linesman1.getExpirience();
        linesman1.whistle();
        Assert.assertTrue(experience < linesman1.getExpirience());
    }

    @Test
    public void WhenLinesmanShowTheCard() {
        Linesman linesman1 = new Linesman(0, 30, 30, "Lok");
        int experience = linesman1.getExpirience();
        linesman1.whistle();
        Assert.assertTrue(experience < linesman1.getExpirience());
    }

    @Test
    public void WhenLinesmanCantFindOffsideHeShouldWhistle() {
        Linesman linesman1 = new Linesman(0, 30, 30, "Lok");
        int experience = linesman1.getExpirience();
        FootballPlayer footballPlayer = new FootballPlayer("Nikita", 100, 200, 32, true);
        linesman1.offside(footballPlayer, linesman1);
        Assert.assertTrue(experience == linesman1.getExpirience());
    }

    @Test
    public void WhenLinesmanFindOffsideHeShouldWhistle() {
        Linesman linesman1 = new Linesman(0, 41, 41, "Lok");
        int experience = linesman1.getExpirience();
        FootballPlayer footballPlayer = new FootballPlayer("Nikita", 100, 200, 32, true);
        linesman1.offside(footballPlayer, linesman1);
        Assert.assertTrue(experience < linesman1.getExpirience());
    }

    @Test
    public void WhenLinesmanShowTheCardHeShould() {
        Linesman linesman1 = new Linesman(0, 41, 41, "Lok");
        int experience = linesman1.getExpirience();
        FootballPlayer footballPlayer = new FootballPlayer("Nikita", 100, 200, 32, true);
        linesman1.showTheCard(footballPlayer);
        Assert.assertTrue(experience < linesman1.getExpirience());
    }
    ///MainGoalkeeper

    @Test
    public void ConstructorMainGoalkeeperShouldBeCorrect() {
        MainGoalkeeper mainGoalkeeper = new MainGoalkeeper(50, 60, "Shol", 30);
        int scill = 50;
        int experience = 60;
        String name = "Shol";
        int age = 30;
        Assert.assertTrue(scill == mainGoalkeeper.getScill() && experience == mainGoalkeeper.getExperience() &&
                name.equals(mainGoalkeeper.getName()) && age == mainGoalkeeper.getAge());
    }

    @Test
    public void GetterMainGoalkeeperNameShouldBeCorrect() {
        int scill = 50;
        int experience = 60;
        String name = "Shol";
        int age = 30;
        MainGoalkeeper mainGoalkeeper = new MainGoalkeeper(scill, experience, name, age);
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
        int scill = 50;
        int experience = 30;
        String name = "Shol";
        int age = 30;
        MainGoalkeeper mainGoalkeeper = new MainGoalkeeper(scill, experience, name, age);
        mainGoalkeeper.onTheBall(name, experience, age);
        Assert.assertTrue(experience > mainGoalkeeper.getExperience());
    }

    @Test
    public void GoalkeeperShoulJumpUncorrect() {
        int scill = 50;
        int experience = 30;
        String name = "Shol";
        int age = 70;
        MainGoalkeeper mainGoalkeeper = new MainGoalkeeper(scill, experience, name, age);
        mainGoalkeeper.jump(name, age);
        Assert.assertTrue(experience > mainGoalkeeper.getExperience());
    }

    ///MainReferi
    @Test
    public void ConstructorMainRefereeShouldBeCorrect() {
        int position = 1;
        int expirience = 50;
        String name = "Yan";
        int age = 40;
        MainReferi mainReferi = new MainReferi(position, expirience, age, name);
        Assert.assertTrue(position == mainReferi.getPosition() && expirience == mainReferi.getExpirience() &&
                mainReferi.getAge() == age && name.equals(mainReferi.getName()));
    }

    @Test
    public void GettermainRefereePositionShouldBeCorrect() {
        int position = 1;
        int expirience = 50;
        String name = "Yan";
        int age = 40;
        MainReferi mainReferi = new MainReferi(position, expirience, age, name);
        Assert.assertTrue(position == mainReferi.getPosition());
    }

    @Test
    public void GettermainRefereeAgeShouldBeCorrect() {
        int position = 1;
        int expirience = 50;
        String name = "Yan";
        int age = 40;
        MainReferi mainReferi = new MainReferi(position, expirience, age, name);
        Assert.assertTrue(age == mainReferi.getAge());
    }

    @Test
    public void GettermainRefereeNameShouldBeCorrect() {
        int position = 1;
        int expirience = 50;
        String name = "Yan";
        int age = 40;
        MainReferi mainReferi = new MainReferi(position, expirience, age, name);
        Assert.assertTrue(name.equals(mainReferi.getName()));
    }

    @Test
    public void GetterMainRefereeExpShouldBeCorrect() {
        int position = 1;
        int expirience = 50;
        String name = "Yan";
        int age = 40;
        MainReferi mainReferi = new MainReferi(position, expirience, age, name);
        Assert.assertTrue(expirience == mainReferi.getExpirience());
    }

    @Test
    public void MainRefereeShoulFindOffence() {
        int position = 1;
        int expirience = 50;
        String name = "Yan";
        int age = 40;
        MainReferi mainReferi = new MainReferi(position, expirience, age, name);
        FootballPlayer footballPlayer = new FootballPlayer("sd", 231, 231, 23, true);
        mainReferi.findOffence(footballPlayer);
        Assert.assertTrue(expirience < mainReferi.getExpirience());
    }

    @Test
    public void MainRefereeCantFindOffence() {
        int position = 1;
        int expirience = 33;
        String name = "Yan";
        int age = 25;
        MainReferi mainReferi = new MainReferi(position, expirience, age, name);
        FootballPlayer footballPlayer = new FootballPlayer("sd", 231, 231, 23, true);
        mainReferi.findOffence(footballPlayer);
        Assert.assertTrue(expirience > mainReferi.getExpirience());
    }

    @Test
    public void MainRefereeWhistle() {
        int position = 1;
        int expirience = 33;
        String name = "Yan";
        int age = 25;
        MainReferi mainReferi = new MainReferi(position, expirience, age, name);
        mainReferi.whistle();
        Assert.assertTrue(expirience < mainReferi.getExpirience());
    }

    @Test
    public void MainRefereeShouldShowTheCard() {
        int position = 1;
        int expirience = 33;
        String name = "Yan";
        int age = 25;
        MainReferi mainReferi = new MainReferi(position, expirience, age, name);
        FootballPlayer footballPlayer = new FootballPlayer("sd", 231, 231, 23, true);
        mainReferi.showTheCard(footballPlayer);
        Assert.assertTrue(expirience < mainReferi.getExpirience());
    }

    @Test
    public void MainRefereeShouldFindTheIffence() {
        int position = 1;
        int expirience = 33;
        String name = "Yan";
        int age = 25;
        MainReferi mainReferi = new MainReferi(position, expirience, age, name);
        FootballPlayer footballPlayer = new FootballPlayer("sd", 231, 231, 23, true);
        Linesman linesman = new Linesman(1, 23, 43, "sda");
        mainReferi.offside(footballPlayer, linesman);
        Assert.assertTrue(expirience < mainReferi.getExpirience());
    }

    /////observer
    @Test
    public void ConstructorObserverShouldBeRight() {
        int count = 1500;
        boolean pyrotechnics = true;
        boolean performance = true;
        boolean posters = true;
        int teamSpirit = 100;
        String sector = "s";
        Observer observer = new Observer(count, pyrotechnics, performance, posters, sector, teamSpirit);
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
        Observer observer = new Observer(count, pyrotechnics, performance, posters, sector, teamSpirit);
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
        Observer observer = new Observer(count, pyrotechnics, performance, posters, sector, teamSpirit);
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
        Observer observer = new Observer(count, pyrotechnics, performance, posters, sector, teamSpirit);
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
        Observer observer = new Observer(count, pyrotechnics, performance, posters, sector, teamSpirit);
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
        Observer observer = new Observer(count, pyrotechnics, performance, posters, sector, teamSpirit);
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
        Observer observer = new Observer(count, pyrotechnics, performance, posters, sector, teamSpirit);
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
        Observer observer = new Observer(count, pyrotechnics, performance, posters, sector, teamSpirit);
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
        Observer observer = new Observer(count, pyrotechnics, performance, posters, sector, teamSpirit);
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
        Observer observer = new Observer(count, pyrotechnics, performance, posters, sector, teamSpirit);
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
        Observer observer = new Observer(count, pyrotechnics, performance, posters, sector, teamSpirit);
        Fans fans = new Fans("sad", 12332, true, true);
        observer.fight(fans);
        Assert.assertTrue(!observer.isPyrotechnics());
    }


    //////////RefereeIntheYard

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
        MainReferi mainReferi = new MainReferi(1, 23, 32, "dd");
        refereeIntTheYard.toBreakTheRules(mainReferi);
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
        MainReferi mainReferi = new MainReferi(1, 23, 32, "dd");
        refereeIntTheYard.toBreakTheRules(mainReferi);
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
        MainReferi mainReferi = new MainReferi(1, 23, 32, "dd");
        refereeIntTheYard.toBreakTheRules(mainReferi);
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

    ////rezerve Goalkeeper
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
    /// TeamCoah

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

