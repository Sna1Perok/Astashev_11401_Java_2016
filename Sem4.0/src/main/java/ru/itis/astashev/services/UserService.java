package ru.itis.astashev.services;

import ru.itis.astashev.entity.Users;

import java.util.ArrayList;

/**
 * Created by 1 on 02.05.2016.
 */

public interface UserService {
   ArrayList<Users> findAll();
   Users findOneByLogin(String login);
}