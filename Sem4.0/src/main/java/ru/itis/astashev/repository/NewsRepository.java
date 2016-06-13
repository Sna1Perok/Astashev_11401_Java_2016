package ru.itis.astashev.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.itis.astashev.entity.News;

import java.util.ArrayList;

/**
 * Created by 1 on 28.05.2016.
 */
public interface NewsRepository extends JpaRepository<News, Integer> {
    ArrayList<News> findAll();
    News findOneById(int id);
    News findOneByZagolovok(String zagolovok);
}
