package ru.itis.astashev.controller;

import org.dom4j.DocumentException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Validator;
import org.springframework.web.bind.annotation.*;
import ru.itis.astashev.entity.FootballTeam;
import ru.itis.astashev.entity.User;
import ru.itis.astashev.form.RegTeamForm;
import ru.itis.astashev.services.*;
import ru.itis.astashev.services.pdf.PdfFile;
import org.springframework.core.io.FileSystemResource;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by 1 on 07.05.2016.
 */

@Controller
@RequestMapping
public class UserAndTeamController {
    @Autowired
    GameService gameService;

    @Autowired
    FootballTeamService footballTeamService;

    @Autowired
    RequestService requestService;

    @Autowired
    UsersService usersService;
    @Autowired
    PdfFile pdfFile;
    @Autowired
    TournamentService tournamentService;


    @Autowired
    private HttpServletRequest request;

    @Qualifier("teamValidatorForm")
    @Autowired
    Validator validator;

    @RequestMapping(value = "/oafl/user/{id}", method = RequestMethod.GET)
    public String userHome(Model model, @PathVariable int id) {
        HashMap<String, Object> infUser = usersService.getInformAboutUser(id);
        User user = usersService.findOneById(id);
        HashMap<String, Object> infTeam = footballTeamService.findInformationAboutTeam(user.getTeam().getId());
        if (user.getId() == id) {
            model.addAttribute("mypage", true);
        }
        model.addAttribute("inf", infUser);
        model.addAttribute("infT", infTeam);
        return "user";
    }

    @RequestMapping(value = "/oafl/team/{teamName}", method = RequestMethod.GET)
    public String teamHome(Model model, @PathVariable String teamName) {
        User user = (User) request.getSession().getAttribute("user");
        FootballTeam footballTeam = footballTeamService.findOneByName(teamName);
        ArrayList<HashMap<String, Object>> games = footballTeamService.fidAllByIdteam1OfIdteam2(footballTeam);
        ArrayList<HashMap<String, Object>> players = footballTeamService.findUsersInOneTeam(footballTeam.getId());
        HashMap<String, Object> infTeam = footballTeamService.findInformationAboutTeam(footballTeam.getId());
        model.addAttribute("players", players);
        model.addAttribute("game_list", games);
        model.addAttribute("infT", infTeam);
        return "team";
    }

    @RequestMapping(value = "/oafl/team/create-team", method = RequestMethod.GET)
    public String createTeam(Model model, @RequestParam(value = "error", required = false) Boolean error) {
        if (Boolean.TRUE.equals(error)) {
            model.addAttribute("error", error);
        }
        User user = (User) request.getSession().getAttribute("user");
        model.addAttribute("user", user);
        request.setAttribute("reg_form", new RegTeamForm());
        return "regTeam";
    }


    @RequestMapping(value = "/oafl/team/create-team", method = RequestMethod.POST)
    public String getRegForm(@ModelAttribute("moder_form") @Valid RegTeamForm form,
                             BindingResult result) throws ParseException {
        validator.validate(form, result);
        User user = (User) request.getSession().getAttribute("user");
        if (result.hasErrors()) {
            return "redirect:/oafl/team/create-team?error=1";
        }
        footballTeamService.createFootballTeam(form);
        return "redirect:/oafl/user/" + user.getId();
    }

    @RequestMapping(value = "/oafl/team/find-team", method = RequestMethod.GET)
    public String findTeam(Model model) {
        ArrayList<HashMap<String, Object>> teams = new ArrayList<HashMap<String, Object>>();
        ArrayList<FootballTeam> footballTeams = footballTeamService.findAll();
        for (FootballTeam foot : footballTeams) {
            if (foot.getId() == 1) {
                continue;
            }
            HashMap<String, Object> hm = footballTeamService.findInformationAboutTeam(foot.getId());
            teams.add(hm);
        }
        model.addAttribute("team", teams);
        return "findTeam";
    }

    @RequestMapping(value = "/oafl/createapplication/{teamName}", method = RequestMethod.GET)
    public String findTeamPost(Model model, @PathVariable String teamName) {
        User user = (User) request.getSession().getAttribute("user");
        requestService.createRequest(user, footballTeamService.findOneByName(teamName));
        return "redirect:/oafl/user/" + user.getId() + "?conf=true";
    }


    @RequestMapping(value = "/oafl/add-players", method = RequestMethod.GET)
    public String addPlayers(Model model) {
        User user = (User) request.getSession().getAttribute("user");
        FootballTeam footballTeam = footballTeamService.findOneById(user.getTeam().getId());
        ArrayList<HashMap<String, Object>> requests = requestService.findRightRequest(footballTeam.getId());
        ArrayList<HashMap<String, Object>> touenaments = tournamentService.findInfAboutTournament();
        model.addAttribute("team", requests);
        HashMap<String, Object> myTournament = tournamentService.myTournament(footballTeam);
        if (myTournament != null) {
            model.addAttribute("hasTournament", true);
        } else {

        }
        model.addAttribute("tournament", touenaments);
        return "captainAddPlayers";
    }

    @RequestMapping(value = "/oafl/add-players/success{id}", method = RequestMethod.GET)
    public String addPlayersSuccess(Model model, @PathVariable int id,
                                    @RequestParam(value = "successT", required = false) Boolean successT) {
        if (Boolean.TRUE.equals(successT)) {
            model.addAttribute("successT", successT);
        }
        User user = usersService.findOneById(id);
        requestService.successAdded(user);
        return "redirect:/oafl/add-players";
    }

    @RequestMapping(value = "/oafl/add-players/danger{id}", method = RequestMethod.GET)
    public String dangerAdded(Model model, @PathVariable int id) {
        User user = usersService.findOneById(id);
        requestService.deleteUser(user);
        return "redirect:/oafl/add-players";
    }

    @RequestMapping(value = "/oafl/tournament/success{id}", method = RequestMethod.GET)
    public String chooseTournament(@PathVariable int id) {
        User user = (User) request.getSession().getAttribute("user");
        footballTeamService.addTournament(user, tournamentService.findOneById(id));
        return "redirect:/oafl/";
    }

    @RequestMapping(value = "/oafl/pdf/{name}", method = RequestMethod.GET)
    public String pdf(Model model, @PathVariable String name, @RequestParam(value = "successT", required = false) Boolean successT) throws DocumentException, com.itextpdf.text.DocumentException, IOException {
        if (Boolean.TRUE.equals(successT)) {
            model.addAttribute("successT", successT);
        }
        int id = usersService.findOneByLogin(name).getId();
        HashMap<String, Object> infUser = usersService.getInformAboutUser(id);
        User user = usersService.findOneById(id);
        HashMap<String, Object> infTeam = footballTeamService.findInformationAboutTeam(user.getTeam().getId());

        String filepath = pdfFile.createPdf(usersService.findOneByLogin(name));
        FileSystemResource fileSystemResource = new FileSystemResource(filepath);
        model.addAttribute("inf", infUser);
        model.addAttribute("infT", infTeam);
        return "redirect:/oafl/user/" + id + "?successT=1";
    }
}