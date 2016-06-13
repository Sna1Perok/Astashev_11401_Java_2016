package ru.itis.astashev.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.itis.astashev.entity.Request;

import java.util.ArrayList;

/**
 * Created by 1 on 26.05.2016.
 */
public interface RequestsRepository extends JpaRepository<Request,Integer> {
    Request findOneById(int id);
    ArrayList<Request> findAll();
}
