package ru.itis.astashev.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by 1 on 07.05.2016.
 */

@Controller
@RequestMapping
public class UserController {
    @RequestMapping(value = "/predictor/myprofile", method = RequestMethod.GET)
    public String home() {
        return "user";
    }
}