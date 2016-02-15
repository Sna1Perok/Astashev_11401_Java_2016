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



    public FootballTeam(String name,ArrayList<FootballPlayer> playersTeam,String bestGame,int teamSpirit) {
        this.name = name;
        this.bestGame = bestGame;
        this.team = playersTeam;
    }


    @Override
    public boolean theExchangeOfPlayers(FootballPlayer myplayer, FootballPlayer yourplayer) {
        System.out.println("Команда " + this.name + "хочет провести трансфер игрока" + myplayer.name + "на игрока" + yourplayer.name);
        return false;
    }

    @Override
    public FootballPlayer favoritPlayer() {

        return null;
    }

    @Override
    public void statistica() {
      //  String namePL = bestPlayer.name;
        System.out.println("name this team - " + name + "the best game - " + bestGame + ", the best player " );
    }

    @Override
    public boolean addPlayer(FootballPlayer fplayer) {

        if (team.add(fplayer)) {
            System.out.println("Игрок " + fplayer.name + " перешел в команду " + name);
            return true;
        } else {
            System.out.println("Трансфер с игроков " + fplayer.name + " сорвался, он не перейдет в " + name);
            return false;
        }
    }

    @Override
    public ArrayList<FootballPlayer> getTheTeam() {
        return team;
    }
}