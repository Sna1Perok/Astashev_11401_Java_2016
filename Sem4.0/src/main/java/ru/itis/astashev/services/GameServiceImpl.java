package ru.itis.astashev.services;/**
 * Created by 1 on 05.05.2016.
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.itis.astashev.entity.Games;
import ru.itis.astashev.repository.GamesRepository;

import java.util.ArrayList;

@Service
public class GameServiceImpl implements GameService {

    @Autowired
    GamesRepository gamesRepository;

    @Override
    public ArrayList<Games> findAll() {
        return gamesRepository.findAll();
    }
}