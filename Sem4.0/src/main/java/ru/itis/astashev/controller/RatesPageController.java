package ru.itis.astashev.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ru.itis.astashev.entity.FootballTeam;
import ru.itis.astashev.entity.Games;
import ru.itis.astashev.services.FootballLeagueService;
import ru.itis.astashev.services.FootballTeamService;
import ru.itis.astashev.services.GameService;

import java.util.ArrayList;
import java.util.HashMap;


/**
 * Created by aygulmardanova on 29.04.16.
 */
@Controller
@RequestMapping
public class RatesPageController {
    @Autowired
     FootballLeagueService footballLeagueService;
    @Autowired
    FootballTeamService footballTeamService;
    @Autowired
    GameService gameService;

    @RequestMapping(value = "/predictor/rates", method = RequestMethod.GET)
    public String returnHiPage(Model model) {
        ArrayList<HashMap<String, Object>> al = new ArrayList<>();
           ArrayList<Games> games = gameService.findAll();
           FootballTeam team1;
            FootballTeam team2;
        for (Games g : games) {
            System.out.println("*************  " + g.getId());
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
        model.addAttribute("game_list", al);
        return "rates";
    }
}
