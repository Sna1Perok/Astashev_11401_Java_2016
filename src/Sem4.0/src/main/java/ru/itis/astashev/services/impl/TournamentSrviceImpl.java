package ru.itis.astashev.services.impl;/**
 * Created by 1 on 28.05.2016.
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.itis.astashev.entity.FootballTeam;
import ru.itis.astashev.entity.Tournament;
import ru.itis.astashev.form.TournamentForm;
import ru.itis.astashev.repository.TournamentRepository;
import ru.itis.astashev.services.FootballLeagueService;
import ru.itis.astashev.services.TournamentService;

import java.util.ArrayList;
import java.util.HashMap;

@Service
public class TournamentSrviceImpl implements TournamentService {

    @Autowired
    TournamentRepository tournamentRepository;
    @Autowired
    FootballLeagueService footballLeagueService;

    @Override
    public Tournament findOneById(int id) {
        return tournamentRepository.findOneById(id);
    }

    @Override
    public ArrayList<Tournament> findAll() {
        return tournamentRepository.findAll();
    }

    @Override
    public Tournament findOneByName(String name) {
        return tournamentRepository.findOneByName(name);
    }

    @Override
    public void createTournament(TournamentForm form) {
        Tournament tournament = new Tournament();
        tournament.setFootballLeague(footballLeagueService.findOneById(5));
        tournament.setInf(form.getTextarea());
        tournament.setName(form.getName());
        tournamentRepository.save(tournament);
    }

    @Override
    public ArrayList<HashMap<String, Object>> findInfAboutTournament() {
        ArrayList<HashMap<String, Object>> list = new ArrayList<HashMap<String, Object>>();
        ArrayList<Tournament> tournaments = tournamentRepository.findAll();
        for (Tournament torn : tournaments) {
            if(torn.getId() == 1){
                continue;
            }
            HashMap<String, Object> hm = new HashMap<String, Object>();
            hm.put("id", torn.getId());
            hm.put("name", torn.getName());
            hm.put("inf", torn.getInf());
            hm.put("league", torn.getFootballLeague());
            hm.put("leaguename", torn.getFootballLeague().getName());
            list.add(hm);
        }
        return list;
    }

    @Override
    public HashMap<String, Object> myTournament(FootballTeam footballTeam) {
        HashMap<String, Object> hm = new HashMap<String, Object>();
        if (footballTeam.getTournament() != null) {
            hm.put("name", footballTeam.getTournament().getName());
            hm.put("inf", footballTeam.getTournament().getInf());
            hm.put("id", footballTeam.getTournament().getId());
            return hm;
        }
        return null;
    }
}