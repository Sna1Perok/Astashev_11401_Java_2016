package ru.itis.astashev.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import ru.itis.astashev.transforms.UsersFromSecurity;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by aygulmardanova on 29.04.16.
 */
@Controller
@RequestMapping
public class LoginPageController {
    @Autowired
    private HttpServletRequest request;


    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String def() {
        request.getSession().setAttribute("user", null);
        return "redirect:/oafl";
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String getLoginPage(@RequestParam(value = "error", required = false) Boolean error,
                               Model model) {
        if (Boolean.TRUE.equals(error)) {
            model.addAttribute("error", error);
        }
        return "/login";
    }

    @RequestMapping(value = "/default", method = RequestMethod.GET)
    public String defaultAfterLogin(HttpServletRequest request) {
        if (request.isUserInRole("ROLE_ADMIN")) {
            request.getSession().setAttribute("user", UsersFromSecurity.getUseresFromSecurity());
            return "redirect:/oafl";
        } else if (request.isUserInRole("ROLE_USER")) {
            request.getSession().setAttribute("user", UsersFromSecurity.getUseresFromSecurity());
            return "redirect:/oafl";
        } else if (request.isUserInRole("ROLE_CAPITAN")) {
            request.getSession().setAttribute("user", UsersFromSecurity.getUseresFromSecurity());
            return "redirect:/oafl/add-players";

        } else {
            request.getSession().setAttribute("user", null);
            return "/login";
        }
    }


}
