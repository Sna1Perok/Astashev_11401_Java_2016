package ru.itis.astashev.services;

import ru.itis.astashev.entity.FootballTeam;

import java.util.ArrayList;

/**
 * Created by 1 on 05.05.2016.
 */

public interface FootballTeamService {
    ArrayList<FootballTeam> findAll();

    FootballTeam findOneById(int id);
}