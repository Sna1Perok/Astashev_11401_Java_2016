package ru.itis.astashev.services;/**
 * Created by 1 on 05.05.2016.
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.itis.astashev.entity.FootballTeam;
import ru.itis.astashev.repository.FootballTeamRepository;

import java.util.ArrayList;

@Service
public class FootballTeamServiceImpl implements FootballTeamService {

    @Autowired
    FootballTeamRepository footballTeamRepository;

    @Override
    public ArrayList<FootballTeam> findAll() {
        return footballTeamRepository.findAll();
    }

    @Override
    public FootballTeam findOneById(int id) {
        return footballTeamRepository.findOneById(id);
    }


}