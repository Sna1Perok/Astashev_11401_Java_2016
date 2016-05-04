package ru.itis.astashev.services;/**
 * Created by 1 on 07.05.2016.
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.itis.astashev.entity.Users;
import ru.itis.astashev.repository.UserRepository;

import java.util.ArrayList;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepository userRepository;

    @Override
    public ArrayList<Users> findAll() {
        return userRepository.findAll();
    }

    @Override
    public Users findOneByLogin(String login) {
        return userRepository.findOneByLogin(login);
    }
}