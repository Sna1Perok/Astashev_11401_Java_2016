package ru.itis.astashev.services;

import ru.itis.astashev.entity.FootballLeague;

/**
 * Created by 1 on 05.05.2016.
 */

public interface FootballLeagueService {

    FootballLeague findOneById(int id);
}