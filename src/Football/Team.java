package Football;

import java.util.ArrayList;

/**
 * Created by 1 on 12.02.2016.
 */

public interface Team {
    boolean theExchangeOfPlayers(FootballPlayer myplayer, FootballPlayer yourplayer);
    FootballPlayer favoritPlayer();
    void statistica();
    boolean addPlayer(FootballPlayer player);
    ArrayList<FootballPlayer> getTheTeam();
}