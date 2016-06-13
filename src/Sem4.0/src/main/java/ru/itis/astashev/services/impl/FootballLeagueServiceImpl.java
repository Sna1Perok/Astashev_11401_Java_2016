package ru.itis.astashev.services.impl;/**
 * Created by 1 on 05.05.2016.
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.itis.astashev.entity.FootballLeague;
import ru.itis.astashev.repository.FootballLeagueRepository;
import ru.itis.astashev.services.FootballLeagueService;

@Service
public class FootballLeagueServiceImpl implements FootballLeagueService {

    @Autowired
    public  FootballLeagueRepository footballLeagueRepository;



    @Override
    public FootballLeague findOneById(int id) {
        return footballLeagueRepository.findOneById(id);
    }
}