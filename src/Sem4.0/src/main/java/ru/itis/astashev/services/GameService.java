package ru.itis.astashev.services;

import ru.itis.astashev.entity.Games;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by 1 on 03.05.2016.
 */
public interface GameService {
    Games findOneById(int id);
    ArrayList<Games> findAll();
    ArrayList<HashMap<String, Object>> findInfAboutGames();
   HashMap<String, Object> findInfAbout1Games(int id);
}