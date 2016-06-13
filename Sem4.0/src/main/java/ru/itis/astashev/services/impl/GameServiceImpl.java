package ru.itis.astashev.services.impl;/**
 * Created by 1 on 05.05.2016.
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.itis.astashev.entity.Games;
import ru.itis.astashev.repository.GamesRepository;
import ru.itis.astashev.services.GameService;

import java.util.ArrayList;
import java.util.HashMap;

@Service
public class GameServiceImpl implements GameService {

    @Autowired
    GamesRepository gamesRepository;

    @Override
    public Games findOneById(int id) {
        return gamesRepository.findOneById(id);
    }

    @Override
    public ArrayList<Games> findAll() {
        return gamesRepository.findAll();
    }

    @Override
    public ArrayList<HashMap<String, Object>> findInfAboutGames() {
        ArrayList<HashMap<String, Object>> list = new ArrayList<HashMap<String, Object>>();
        for (Games g : gamesRepository.findAll()) {
            System.out.println();
            HashMap<String, Object> hm = new HashMap<>();
            hm.put("game_id", g.getId());
            hm.put("team1name", g.getFootbalteam1().getName());
            hm.put("team1id", g.getFootbalteam1().getId());
            hm.put("team2name", g.getFootbalteam2().getName());
            hm.put("team2id", g.getFootbalteam2().getId());
            hm.put("whomakethegoal", g.getWhomakethegoal());
            hm.put("score", g.getScore());
            hm.put("leagueName", g.getLeague().getName());
            hm.put("leagueId", g.getLeague().getId());
            hm.put("date", g.getDate());
            System.out.println();
            list.add(hm);
        }
        return list;
    }

    @Override
    public HashMap<String, Object> findInfAbout1Games(int id) {
        Games g = gamesRepository.findOneById(id);
        HashMap<String, Object> hm = new HashMap<>();
        hm.put("game_id", g.getId());
        hm.put("team1name", g.getFootbalteam1().getName());
        hm.put("team1id", g.getFootbalteam1().getId());
        hm.put("team2name", g.getFootbalteam2().getName());
        hm.put("team2id", g.getFootbalteam2().getId());
        hm.put("whomakethegoal", g.getWhomakethegoal());
        hm.put("score", g.getScore());
        hm.put("leagueName", g.getLeague().getName());
        hm.put("leagueId", g.getLeague().getId());
        hm.put("date", g.getDate());
        System.out.println();
        return hm;
    }
}