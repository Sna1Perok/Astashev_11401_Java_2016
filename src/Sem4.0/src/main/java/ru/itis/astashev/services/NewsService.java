package ru.itis.astashev.services;

import ru.itis.astashev.entity.Games;
import ru.itis.astashev.entity.News;
import ru.itis.astashev.form.TournamentForm;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by 1 on 28.05.2016.
 */
public interface NewsService {
    ArrayList<News> findAll();
    News findOneById(int id);
    News findOneByZagolovok(String name);
    void createNews(TournamentForm form, Games games);
    ArrayList<HashMap<String,Object>> findInfNews();
}
