package ru.itis.astashev.services;

import ru.itis.astashev.entity.FootballTeam;
import ru.itis.astashev.entity.Request;
import ru.itis.astashev.entity.User;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by 1 on 26.05.2016.
 */

public interface RequestService {

    ArrayList<Request> findAll();

    Request findOneById(int id);

    void createRequest(User user, FootballTeam footballTeam);

    ArrayList<HashMap<String, Object>> findRightRequest(int id);

    void successAdded(User user);
    void deleteUser(User user);
}