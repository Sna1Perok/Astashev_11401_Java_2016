package ru.itis.astashev.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.itis.astashev.entity.User;

import java.util.ArrayList;

/**
 * Created by 1 on 04.05.2016.
 */
@Repository
public interface UserRepository extends JpaRepository<User,Integer> {
   User findOneByEmail(String email);
   User findOneById(int id);
   User findOneByLogin(String login);
   ArrayList<User> findAll();


}
