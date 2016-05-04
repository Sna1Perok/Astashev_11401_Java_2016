package ru.itis.astashev.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by aygulmardanova on 29.04.16.
 */
@Controller
@RequestMapping
public class RegPageController {

    @RequestMapping(value = "/predictor/registration", method = RequestMethod.GET)

    public String getRegForm(Model model, @RequestParam(value = "error", required = false) Boolean error) {
        if (Boolean.TRUE.equals(error)) {
            model.addAttribute("error", error);
        }
       return "reg";
    }
}
