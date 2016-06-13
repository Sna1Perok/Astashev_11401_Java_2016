package ru.itis.astashev.services.impl;/**
 * Created by 1 on 28.05.2016.
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.itis.astashev.entity.Games;
import ru.itis.astashev.entity.News;
import ru.itis.astashev.form.TournamentForm;
import ru.itis.astashev.repository.GamesRepository;
import ru.itis.astashev.repository.NewsRepository;
import ru.itis.astashev.services.NewsService;

import java.util.ArrayList;
import java.util.HashMap;

@Service
public class NewsServiceImpl implements NewsService {
    @Autowired
    NewsRepository newsRepository;
    @Autowired
    GamesRepository gamesRepository;

    @Override
    public ArrayList<News> findAll() {
        return newsRepository.findAll();
    }

    @Override
    public News findOneById(int id) {
        return newsRepository.findOneById(id);
    }

    @Override
    public News findOneByZagolovok(String name) {
        return newsRepository.findOneByZagolovok(name);
    }

    @Override
    public void createNews(TournamentForm form, Games games) {
        News news = new News();
        news.setGame(games);
        news.setText(form.getTextarea());
        news.setZagolovok(form.getName());
        newsRepository.save(news);
    }

    @Override
    public ArrayList<HashMap<String, Object>> findInfNews() {
        ArrayList<HashMap<String, Object>> list = new ArrayList<HashMap<String, Object>>();
        for (News news : newsRepository.findAll()) {
            Games g = news.getGame();
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
            hm.put("topic", news.getZagolovok());
            hm.put("text", news.getText());
            list.add(hm);
        }
        return  list;
    }
}