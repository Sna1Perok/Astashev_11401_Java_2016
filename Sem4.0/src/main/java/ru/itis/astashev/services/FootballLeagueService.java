package ru.itis.astashev.services;

import ru.itis.astashev.entity.FootballLeague;

import java.util.ArrayList;

/**
 * Created by 1 on 05.05.2016.
 */

public interface FootballLeagueService {
    ArrayList<FootballLeague> findAll();

    FootballLeague findOneById(int id);
}