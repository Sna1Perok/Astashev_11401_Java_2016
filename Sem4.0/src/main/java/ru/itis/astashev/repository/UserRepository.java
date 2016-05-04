package ru.itis.astashev.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.itis.astashev.entity.Users;

import java.util.ArrayList;

/**
 * Created by 1 on 04.05.2016.
 */
@Repository
public interface UserRepository extends JpaRepository<Users,Integer> {
    ArrayList<Users> findAll();
    Users findOneByLogin(String login);
}
