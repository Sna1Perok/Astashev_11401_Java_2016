package ru.astashev.services.impl;

import org.junit.BeforeClass;
import org.junit.Test;
import ru.itis.astashev.entity.FootballLeague;
import ru.itis.astashev.entity.FootballTeam;
import ru.itis.astashev.entity.Role;
import ru.itis.astashev.entity.User;
import ru.itis.astashev.repository.UserRepository;
import ru.itis.astashev.services.impl.UsersServiceImpl;

import java.util.ArrayList;

import static org.mockito.Mockito.ignoreStubs;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by 1 on 02.06.2016.
 */

public class UserServiceImplTest {
    private static UsersServiceImpl usersService;
    private static FootballTeam footballTeam;
    private static User user;
    private static ArrayList<User> users;

    @BeforeClass
    public static void init() {
        usersService = new UsersServiceImpl();
        usersService.userRepository = mock(UserRepository.class);
        FootballLeague league = new FootballLeague();
        String name = "Nikita";
        String email = "email";
        String login = "login";
        String pass = "pass";
        String surname = "surname";
        int card = 0;
        int goals = 0;
        int scill = 0;
        int id = 1;
        user.setTeam(footballTeam);
        user.setPass(pass);
        user.setName(name);
        user.setCard(card);
        user.setEmail(email);
        user.setGoals(goals);
        user.setSkill(scill);
        user.setLogin(login);
        user.setId(id);
        when(usersService.userRepository.findOneById(id)).thenReturn(user);
        when(usersService.userRepository.findAll()).thenReturn(users);
        when(usersService.userRepository.findOneByEmail(email)).thenReturn(user);
        when(usersService.userRepository.findOneByLogin(login)).thenReturn(user);
    }

    @Test
    public void createUsersshouldBeCorrect() {
        User user = new User();
        String name = "Nikita";
        String surname = "surname";
        String email = "email";
        String login = "login";
        String pass = "pass";
        int card = 0;
        int goals = 0;
        int scill = 0;
        int id = 1;
        usersService.deleteUsers(id);
        user.setPass(pass);
        user.setEmail(email);
        user.setLogin(login);
        user.setName(name);
        user.setSurname(surname);
        user.setGoals(goals);
        user.setSkill(scill);
        user.setRole(Role.ROLE_USER);
        user.setGoals(goals);
        user.setCard(card);
        user.setTeam(footballTeam);
        ignoreStubs();
    }
    @Test
    public void getInformAboutUser() {

    }
}