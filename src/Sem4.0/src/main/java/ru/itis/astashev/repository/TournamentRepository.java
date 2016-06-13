package ru.itis.astashev.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.itis.astashev.entity.Tournament;

import java.util.ArrayList;

/**
 * Created by 1 on 28.05.2016.
 */
public interface TournamentRepository extends JpaRepository<Tournament,Integer> {
    Tournament findOneById(int id);
    Tournament findOneByName(String name);
    ArrayList<Tournament> findAll();
}
