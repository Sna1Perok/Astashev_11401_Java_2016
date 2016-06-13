package ru.itis.astashev.services.impl;/**
 * Created by 1 on 05.05.2016.
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.itis.astashev.entity.*;
import ru.itis.astashev.form.RegTeamForm;
import ru.itis.astashev.repository.*;
import ru.itis.astashev.services.FootballTeamService;

import javax.servlet.http.HttpServletRequest;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

@Service
public class FootballTeamServiceImpl implements FootballTeamService {

    @Autowired
    public FootballTeamRepository footballTeamRepository;
    @Autowired
    UserRepository userRepository;
    @Autowired
    GamesRepository gamesRepository;
    @Autowired
    FootballLeagueRepository footballLeagueRepository;
    @Autowired
    TournamentRepository tournamentRepository;
    @Autowired
    RequestsRepository requestsRepository;
    @Autowired
    private HttpServletRequest request;


    @Override
    public ArrayList<FootballTeam> findAll() {
        return footballTeamRepository.findAll();
    }

    @Override
    public FootballTeam findOneById(int id) {
        return footballTeamRepository.findOneById(id);
    }

    @Override
    public FootballTeam findOneByName(String name) {
        return footballTeamRepository.findOneByName(name);
    }

    @Override
    public ArrayList<HashMap<String, Object>> fidAllByIdteam1OfIdteam2(FootballTeam footballTeam) {
        ArrayList<Games> games = gamesRepository.findAll();
        ArrayList<Games> rightGame = new ArrayList<Games>();
        for (Games g : games) {
            if (g.getFootbalteam1().getId() == footballTeam.getId() || g.getFootbalteam2().getId() == footballTeam.getId()) {
                rightGame.add(g);
            }
        }
        ArrayList<HashMap<String, Object>> al = new ArrayList<>();
        for (Games g : rightGame) {
            HashMap<String, Object> hm = new HashMap<>();
            hm.put("game_id", g.getId());
            hm.put("team1name", g.getFootbalteam1().getName());
            hm.put("team1id", g.getFootbalteam1().getId());
            hm.put("team2name", g.getFootbalteam2().getName());
            hm.put("team2id", g.getFootbalteam2().getId());
            hm.put("whomakethegoal", g.getWhomakethegoal());
            hm.put("score", g.getScore());
            hm.put("leagueName", g.getLeague().getName());
            hm.put("leagueId", g.getLeague().getId());
            hm.put("date", g.getDate());
            al.add(hm);
        }
        return al;
    }

    @Override
    public HashMap<String, Object> findInformationAboutTeam(int id) {
        HashMap<String, Object> inf = new HashMap<String, Object>();
        FootballTeam footballTeam = footballTeamRepository.findOneById(id);
        inf.put("name", footballTeam.getName());
        inf.put("id", footballTeam.getId());
        inf.put("leagueid", footballTeam.getLeague().getId());
        inf.put("leaguename", footballTeam.getLeague().getName());
        inf.put("win", footballTeam.getWin());
        inf.put("lose", footballTeam.getLose());
        inf.put("goals", footballTeam.getGoals());
        inf.put("misgoal", footballTeam.getMaissedgoals());
        inf.put("date", footballTeam.getDate());
        inf.put("teamid", footballTeam.getId());
        return inf;
    }

    @Override
    public ArrayList<HashMap<String, Object>> findUsersInOneTeam(int id) {
        ArrayList<User> users = userRepository.findAll();
        ArrayList<User> userRight = new ArrayList<>();
        ArrayList<HashMap<String, Object>> list = new ArrayList<HashMap<String, Object>>();

        for (User u : users) {
            if (u.getTeam().getId() > 0) {
                if (u.getTeam().getId() == id) {

                    HashMap<String, Object> hm = new HashMap<String, Object>();
                    userRight.add(u);
                    hm.put("name", u.getName());
                    hm.put("id", u.getId());
                    hm.put("surname", u.getSurname());
                    hm.put("skill", u.getSkill());
                    hm.put("goals", u.getGoals());
                    hm.put("card", u.getCard());
                    list.add(hm);
                }
            }
        }

        return list;
    }

    @Override
    public void createFootballTeam(RegTeamForm form) throws ParseException {
        FootballLeague footballLeague = footballLeagueRepository.findOneById(5);
        FootballTeam footballTeam = new FootballTeam();
        User user = (User) request.getSession().getAttribute("user");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = sdf.parse(sdf.format(new Date()));
        footballTeam.setTournament(tournamentRepository.findOneById(1));
        footballTeam.setName(form.getName());
        footballTeam.setLeague(footballLeague);
        footballTeam.setDate(date);
        footballTeam.setGoals(0);
        footballTeam.setInf("");
        footballTeam.setLose(0);
        footballTeam.setMaissedgoals(0);
        footballTeam.setWin(0);
        footballTeamRepository.save(footballTeam);

        ArrayList<Request> requests = requestsRepository.findAll();
        for (Request r : requests) {
            if (r.getUser().getId() == user.getId()) {
                requestsRepository.delete(r);
            }
        }

        user.setTeam(footballTeam);
        user.setRole(Role.ROLE_CAPITAN);
        userRepository.save(user);
    }

    @Override
    public void addTournament(User user, Tournament tournament) {
        FootballTeam footballTeam = user.getTeam();
        System.out.println(tournament);
        footballTeam.setTournament(tournament);
        System.out.println(footballTeam + "********************");
        footballTeamRepository.save(footballTeam);
    }


}