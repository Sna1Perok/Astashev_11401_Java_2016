package ru.itis.astashev.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ru.itis.astashev.entity.User;
import ru.itis.astashev.services.FootballTeamService;
import ru.itis.astashev.services.GameService;
import ru.itis.astashev.services.NewsService;
import ru.itis.astashev.services.UsersService;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by aygulmardanova on 29.04.16.
 */
@Controller
@RequestMapping
public class HelloPageController {

    @Autowired
    GameService gameService;
    @Autowired
    FootballTeamService footballTeamService;
    @Autowired
    UsersService usersService;
    @Autowired
    NewsService newsService;
    @Autowired
    private HttpServletRequest request;

    @RequestMapping(value = "/oafl", method = RequestMethod.GET)
    public String returnHiPage(Model model) {
        if (!SecurityContextHolder.getContext().getAuthentication().getPrincipal().toString().equals("anonymousUser")) {
            User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
            model.addAttribute("teamid", user.getTeam().getId());
            model.addAttribute("id", user.getId());
            model.addAttribute("user", user.getSurname() + " " + user.getName());
        }
        model.addAttribute("game_list", newsService.findInfNews());
        return "mainPage";
    }
}
