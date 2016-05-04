package ru.itis.astashev.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.itis.astashev.entity.FootballLeague;

import java.util.ArrayList;

/**
 * Created by 1 on 04.05.2016.
 */
@Repository
public interface FootballLeagueRepository extends JpaRepository<FootballLeague,Integer> {

    ArrayList<FootballLeague> findAll();
    FootballLeague findOneById(int id);
}
