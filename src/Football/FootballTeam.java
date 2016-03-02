package Football;

import java.util.ArrayList;

/**
 * Created by 1 on 12.02.2016.
 */

public class FootballTeam implements Team {
    String name;
    int teamSpirit;
    ArrayList<FootballPlayer> team;
    String bestGame;
    FootballPlayer bestPlayer;


    public String getName() {
        return name;
    }

    public int getTeamSpirit() {
        return teamSpirit;
    }

    public ArrayList<FootballPlayer> getTeam() {
        return team;
    }

    public String getBestGame() {
        return bestGame;
    }


    public FootballTeam(String name, ArrayList<FootballPlayer> playersTeam, String bestGame, int teamSpirit) {
        this.name = name;
        this.bestGame = bestGame;
        this.team = playersTeam;
        this.teamSpirit = teamSpirit;
    }


    @Override
    public boolean theExchangeOfPlayers(FootballPlayer myplayer, FootballPlayer yourplayer) {
        System.out.println("Команда " + this.name + "хочет провести трансфер игрока" + myplayer.getName() + "на игрока" + yourplayer.getName());
       teamSpirit++;
        return false;
    }

    @Override
    public FootballPlayer favoritPlayer() {
        teamSpirit++;
        return null;
    }

    @Override
    public void statistica() {
        //  String namePL = bestPlayer.name;
        System.out.println("name this team - " + name + "the best game - " + bestGame + ", the best player ");
    }

    @Override
    public boolean addPlayer(FootballPlayer fplayer) {
        if (this.getTeamSpirit()>99) {
            team.add(fplayer);
            System.out.println("Игрок " + fplayer.getName() + " перешел в команду " + name);
            return true;
        } else {
            System.out.println("Трансфер с игроков " + fplayer.getName() + " сорвался, он не перейдет в " + name);
            return false;
        }
    }


}