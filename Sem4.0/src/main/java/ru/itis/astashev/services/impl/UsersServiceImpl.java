package ru.itis.astashev.services.impl;/**
 * Created by 1 on 05.05.2016.
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.itis.astashev.entity.FootballTeam;
import ru.itis.astashev.entity.Role;
import ru.itis.astashev.entity.User;
import ru.itis.astashev.form.RegistrationForm;
import ru.itis.astashev.repository.FootballTeamRepository;
import ru.itis.astashev.repository.UserRepository;
import ru.itis.astashev.services.UsersService;

import java.util.ArrayList;
import java.util.HashMap;

@Service
public class UsersServiceImpl implements UsersService {
    @Autowired
    public UserRepository userRepository;

    @Autowired
    FootballTeamRepository footballTeamRepository;

    @Override
    public ArrayList<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public User findOneByLogin(String login) {
        return userRepository.findOneByLogin(login);
    }

    @Override
    public User findOneByEmail(String email) {
        return userRepository.findOneByEmail(email);
    }

    @Override
    public User findOneById(int id) {
        return userRepository.findOneById(id);
    }

    @Override
    public void createUsers(RegistrationForm form) {
        // FootballTeam footballTeam = footballTeamRepository.findOneById(0);
        User user = new User();
        FootballTeam footballTeam = footballTeamRepository.findOneById(1);
        user.setPass(form.getPassword());
        user.setEmail(form.getEmail());
        user.setLogin(form.getLogin());
        user.setName(form.getName());
        user.setSurname(form.getSurname());
        user.setGoals(0);
        user.setSkill(50);
        user.setRole(Role.ROLE_USER);
        user.setGoals(0);
        user.setCard(0);
        user.setTeam(footballTeam);
        userRepository.save(user);
    }

    @Override
    public void deleteUsers(int id) {
        userRepository.delete(userRepository.findOneById(id));
    }

    @Override
    public HashMap<String, Object> getInformAboutUser(int id) {
        User user = userRepository.findOneById(id);
        HashMap<String, Object> inf = new HashMap<String, Object>();
        inf.put("name", user.getName());
        inf.put("id", user.getId());
        inf.put("surname", user.getSurname());
        inf.put("mail", user.getEmail());
        inf.put("goals", user.getGoals());
        inf.put("login", user.getLogin());
        inf.put("skill", user.getSkill());
        inf.put("card", user.getCard());
        inf.put("teamid", user.getTeam().getId());
        inf.put("teamname", user.getTeam().getName());
        inf.put("leagueid", user.getTeam().getLeague().getId());
        inf.put("leaguename", user.getTeam().getLeague().getName());
        return inf;

    }

    @Override
    public ArrayList<HashMap<String, Object>> getInformAboutUsers() {
        ArrayList<HashMap<String, Object>> list = new ArrayList<HashMap<String, Object>>();
        ArrayList<User> users = userRepository.findAll();
        for (User user : users) {
            if(user.getId() == 1){
                continue;
            }
            list.add(getInformAboutUser(user.getId()));
        }
        return list;
    }

}