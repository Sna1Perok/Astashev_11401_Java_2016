package Football;/**
 * Created by 1 on 12.02.2016.
 */

import java.util.*;

public abstract class Game implements Player,Team {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        FootballPlayer fp0 = new FootballPlayer("Nikita",0,100,90,false);
        ArrayList<FootballPlayer> plteam = new ArrayList<FootballPlayer>();

        FootballPlayer fp1 = new FootballPlayer("Kirill",0,10,90,false);
        FootballPlayer fp2 = new FootballPlayer("Kolya",2,50,50,false);
        Player fp3 = new FootballPlayer("Yura",0,80,70,false);


        Coach coach1 = new TeamCoach("Nikita","Rubin",20,80);
        coach1.replacement(fp1,fp2);
        coach1.prompt();
        coach1.tolkToTheAssistant(fp1);

        Goalkeeper goalkeeper = new MainGoalkeeper(100,60,"Miasha",30);
        goalkeeper.onTheBall("Misha",100,30);
        goalkeeper.vait("Misha");
        goalkeeper.jump("Misha",30);

        Goalkeeper goalkeeper1 = new ReservGoalKeeper(100,60,"Sasha",30);
        goalkeeper.onTheBall("Sasha",100,30);
        goalkeeper.vait("Sasha");
        goalkeeper.jump("Sasha",30);

        Player player = new FootballPlayer("Nikita",0,100,50,false);
        FootballPlayer player1 = new FootballPlayer("Nikita",0,100,50,false);
        player.giveThePass(player1);
        player.doCanopy(fp0);
        player.circlePlayer(player1);

        Referi linesman = new Linesman(0,50,40,"Kolasy");
        Linesman linesman1 = new Linesman(0,50,40,"Kolasy");
        linesman.offside(player1,linesman1);
        linesman.showTheCard(player1);
        linesman.findOffence(player1);
        linesman.whistle();

        Referi referi = new MainReferi(0,50,40,"Pasha");
        referi.offside(player1,linesman1);
        referi.whistle();
        referi.findOffence(player1);
        referi.showTheCard(player1);


        Spectator  fans = new Fans("Ultras",2000,true,true);
        Fans fans1 = new Fans("Beef",1000,true,true);
        fans.fight(fans1);
        fans.usetp();
        fans.sign();
        fans.shout();
        fans.cheer();

        Spectator  spectator = new Observer(20000,true,true,true,"3",20);
        spectator.cheer();
        spectator.shout();
        spectator.sign();
        spectator.usetp();
        spectator.fight(fans1);

        ArrayList<FootballPlayer> footballteam = null;
        Team team = new FootballTeam("Rubin",footballteam,"Rebin - Zenit 100-0", 32);
        team.favoritPlayer();
        team.statistica();

        FootballPlayer player2 = new FootballPlayer("asd",21,23,3,false);
        team.theExchangeOfPlayers(player1, player2);

        Weather weather = new BadWeather(0,0,3);
        weather.fog(3,3,3);
        weather.rain(1,2,3);
        weather.rainAndSnow(4,4,4);
        weather.sunny();
        weather.thunder(0,0,0);

        Weather weather1 = new GoodWeather(0,0,3);
        weather.fog(3,3,3);
        weather.rain(1,2,3);
        weather.rainAndSnow(4,4,4);
        weather.sunny();
        weather.thunder(0,0,0);

        RefereeIntTheYard goodplayer = new RefereeIntTheYard(true,2,3,3,3,3,"as",3);
        goodplayer.circlePlayer(player1);
        goodplayer.showTheCard(player1);
        goodplayer.doCanopy(fp0);
        goodplayer.findOffence(player1);
        goodplayer.giveThePass(player1);

    }
}