package ru.itis.astashev.services;

import ru.itis.astashev.entity.Games;

import java.util.ArrayList;

/**
 * Created by 1 on 03.05.2016.
 */
public interface GameService {

    ArrayList<Games> findAll();
}