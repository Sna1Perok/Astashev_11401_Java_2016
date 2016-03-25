package ru.kpfu.itis.Group11401.Astashev.Task010.Football;

/**
 * Created by 1 on 13.02.2016.
 */

public interface Coach {
   FootballPlayer replacement(FootballPlayer footballPlayer, FootballPlayer footballPlayer1);
   void prompt();
   void tolkToTheAssistant(FootballPlayer footballPlayer);
}