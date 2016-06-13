package ru.itis.astashev.services;

import ru.itis.astashev.entity.User;
import ru.itis.astashev.form.RegistrationForm;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by 1 on 03.05.2016.
 */

public interface UsersService {

    ArrayList<User> findAll();
    User findOneByLogin(String login);
    User findOneByEmail(String email);
    User findOneById(int id);
    void createUsers(RegistrationForm form);
    void deleteUsers(int id);
    HashMap<String, Object> getInformAboutUser(int id);
    ArrayList<HashMap<String, Object>> getInformAboutUsers();
}