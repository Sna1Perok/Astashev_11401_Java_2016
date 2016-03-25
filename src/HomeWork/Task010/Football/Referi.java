package ru.kpfu.itis.Group11401.Astashev.Task010.Football; /**
 * Created by 1 on 12.02.2016.
 */

public interface Referi {
    void findOffence(FootballPlayer footballPlayer);
    void whistle();
    void showTheCard(FootballPlayer name);
    void offside(FootballPlayer footballPlayer, Linesman linesman);
}