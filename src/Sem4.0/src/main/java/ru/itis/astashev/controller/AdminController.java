package ru.itis.astashev.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Validator;
import org.springframework.web.bind.annotation.*;
import ru.itis.astashev.entity.FootballTeam;
import ru.itis.astashev.entity.User;
import ru.itis.astashev.form.TournamentForm;
import ru.itis.astashev.services.*;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by aygulmardanova on 29.04.16.
 */
@Controller
@RequestMapping
public class AdminController {
    @Autowired
    GameService gameService;

    @Autowired
    FootballTeamService footballTeamService;

  @Autowired
    NewsService newsService;

    @Autowired
    UsersService usersService;
    @Autowired
    TournamentService tournamentService;

    @Autowired
    private HttpServletRequest request;

    @Autowired
    RequestService requestService;
    @Qualifier("tournamentValidatorForm")
    @Autowired
    Validator validator;

    @RequestMapping(value = "/admin", method = RequestMethod.GET)

    public String returnHiPage(Model model, @RequestParam(value = "error", required = false) Boolean error,
                               @RequestParam(value = "successT", required = false) Boolean successT) {
        if (Boolean.TRUE.equals(error)) {
            model.addAttribute("error", error);
        }
        if (Boolean.TRUE.equals(successT)) {
            model.addAttribute("successT", successT);
        }
        request.setAttribute("reg_form", new TournamentForm());
        User user = (User) request.getSession().getAttribute("user");
        FootballTeam footballTeam = footballTeamService.findOneById(user.getTeam().getId());
        ArrayList<HashMap<String, Object>> requests = usersService.getInformAboutUsers();
        model.addAttribute("game_list", gameService.findInfAboutGames());
        model.addAttribute("team", requests);
        return "adminHome";
    }


    @RequestMapping(value = "/oafl/admin/delete{id}", method = RequestMethod.GET)
    public String deleteUser(Model model, @PathVariable int id) {
        usersService.deleteUsers(id);
        return "redirect:/admin";
    }
/*
    @RequestMapping(value = "/oafl/team/create-cup", method = RequestMethod.GET)
    public String createTournament(Model model, @RequestParam(value = "error", required = false) Boolean error) {
        if (Boolean.TRUE.equals(error)) {
            model.addAttribute("error", error);
        }
        request.setAttribute("reg_form", new TournamentForm());
        return "adminCreateTournament";
    }*/


    @RequestMapping(value = "/oafl/team/create-cup", method = RequestMethod.POST)
    public String getRegForm(@ModelAttribute("moder_form") @Valid TournamentForm form,
                             BindingResult result) throws ParseException {
        validator.validate(form, result);
        User user = (User) request.getSession().getAttribute("user");
        if (result.hasErrors()) {
            return "redirect:/admin?error=1";
        }
        tournamentService.createTournament(form);

        return "redirect:/admin?successT=1" ;
    }

    @RequestMapping(value = "/admin/review{id}", method = RequestMethod.GET)
    public String review(Model model, @PathVariable int id, @RequestParam(value = "error", required = false) Boolean error,
                         @RequestParam(value = "successT", required = false) Boolean successT ) {
        if (Boolean.TRUE.equals(error)) {
            model.addAttribute("error", error);
        }
        if (Boolean.TRUE.equals(successT)) {
            model.addAttribute("successT", successT);
        }
        request.setAttribute("reg_form", new TournamentForm());
        model.addAttribute("atr", gameService.findInfAbout1Games(id));
        return "adminNews";
    }
    @RequestMapping(value = "/admin/review{id}", method = RequestMethod.POST)
    public String createNews( @PathVariable int id,@ModelAttribute("moder_form") @Valid TournamentForm form,
                             BindingResult result) throws ParseException {
        validator.validate(form, result);
        System.out.println("asdawdasdssssssssssssssssssss");
        User user = (User) request.getSession().getAttribute("user");
        if (result.hasErrors()) {
            return "redirect:/admin?error=1";
        }
        newsService.createNews(form, gameService.findOneById(id));
        return "redirect:/admin?successT=1" ;
    }

}
