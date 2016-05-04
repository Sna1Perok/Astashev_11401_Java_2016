package ru.itis.astashev.services;/**
 * Created by 1 on 05.05.2016.
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.itis.astashev.entity.FootballLeague;
import ru.itis.astashev.repository.FootballLeagueRepository;

import java.util.ArrayList;

@Service
public class FootballLeagueServiceImpl implements FootballLeagueService {

    @Autowired
    FootballLeagueRepository footballLeagueRepository;

    @Override
    public ArrayList<FootballLeague> findAll() {
        return footballLeagueRepository.findAll();
    }

    @Override
    public FootballLeague findOneById(int id) {
        return footballLeagueRepository.findOneById(id);
    }
}