package ru.itis.astashev.services.impl;/**
 * Created by 1 on 26.05.2016.
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.itis.astashev.entity.FootballTeam;
import ru.itis.astashev.entity.Request;
import ru.itis.astashev.entity.User;
import ru.itis.astashev.repository.RequestsRepository;
import ru.itis.astashev.repository.UserRepository;
import ru.itis.astashev.services.RequestService;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.HashMap;

@Service
public class RequestServiceImpl implements RequestService {
    @Autowired
    private HttpServletRequest request;
    @Autowired
    RequestsRepository requestsRepository;
    @Autowired
    UserRepository userRepository;

    @Override
    public ArrayList<Request> findAll() {
        return requestsRepository.findAll();
    }

    @Override
    public Request findOneById(int id) {
        return requestsRepository.findOneById(id);
    }

    @Override
    public void createRequest(User user, FootballTeam footballTeam) {
        Request req = new Request();
        req.setUser(user);
        req.setTeam(footballTeam);
        requestsRepository.save(req);
    }

    @Override
    public ArrayList<HashMap<String, Object>> findRightRequest(int id) {
        ArrayList<Request> requests = requestsRepository.findAll();
        ArrayList<HashMap<String, Object>> requestsRight = new ArrayList<HashMap<String, Object>>();
        for (Request r : requests) {
            if (r.getTeam().getId() == id) {
                HashMap<String, Object> hm = new HashMap<String, Object>();
                hm.put("name", r.getUser().getName());
                hm.put("id", r.getUser().getId());
                hm.put("goals", r.getUser().getGoals());
                hm.put("card", r.getUser().getCard());
                hm.put("email", r.getUser().getEmail());
                requestsRight.add(hm);

            }
        }
        return requestsRight;
    }

    @Override
    public void successAdded(User user) {
        User im = (User) request.getSession().getAttribute("user");
        User user1 = userRepository.findOneById(user.getId());
        user1.setTeam(im.getTeam());
        userRepository.save(user1);
        ArrayList<Request> requests = requestsRepository.findAll();
        for (Request r : requests) {
            if (r.getUser().getId() == user.getId()) {
                requestsRepository.delete(r);
            }
        }


    }

    @Override
    public void deleteUser(User user) {
        User im = (User) request.getSession().getAttribute("user");
        ArrayList<Request> requests = requestsRepository.findAll();
        for (Request r : requests) {
            if (r.getUser().getId() == user.getId() && r.getTeam().getId() == im.getTeam().getId()) {
                requestsRepository.delete(r);
                break;
            }
        }
    }
}