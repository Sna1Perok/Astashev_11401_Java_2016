package ru.itis.astashev.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by aygulmardanova on 29.04.16.
 */
@Controller
@RequestMapping
public class contrl {

    @RequestMapping(value = "/predictor/test", method = RequestMethod.GET)

    public String returnHiPage() {
        return "test";
    }
}
