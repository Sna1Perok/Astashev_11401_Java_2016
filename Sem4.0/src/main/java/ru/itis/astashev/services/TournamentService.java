package ru.itis.astashev.services;

import ru.itis.astashev.entity.FootballTeam;
import ru.itis.astashev.entity.Tournament;
import ru.itis.astashev.form.TournamentForm;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by 1 on 28.05.2016.
 */

public interface TournamentService {
    Tournament findOneById(int id);
    ArrayList<Tournament> findAll();
    Tournament findOneByName(String name);
    void createTournament(TournamentForm tournamentForm);
    ArrayList<HashMap<String, Object>> findInfAboutTournament();
    HashMap<String, Object> myTournament(FootballTeam footballTeam);

}