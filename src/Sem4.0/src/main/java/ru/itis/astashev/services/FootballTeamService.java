package ru.itis.astashev.services;

import ru.itis.astashev.entity.FootballTeam;
import ru.itis.astashev.entity.Tournament;
import ru.itis.astashev.entity.User;
import ru.itis.astashev.form.RegTeamForm;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by 1 on 05.05.2016.
 */

public interface FootballTeamService {
    ArrayList<FootballTeam> findAll();

    FootballTeam findOneById(int id);
    FootballTeam findOneByName(String name);
    ArrayList<HashMap<String,Object>> fidAllByIdteam1OfIdteam2(FootballTeam footballTeam);
    HashMap<String, Object> findInformationAboutTeam(int id);
    ArrayList<HashMap<String, Object>> findUsersInOneTeam(int id);
    void createFootballTeam(RegTeamForm form) throws ParseException;
    void addTournament(User user, Tournament tournament);
}