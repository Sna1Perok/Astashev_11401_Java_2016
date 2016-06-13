package ru.itis.astashev.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Validator;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import ru.itis.astashev.form.RegistrationForm;
import ru.itis.astashev.services.UsersService;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

/**
 * Created by aygulmardanova on 29.04.16.
 */
@Controller
@RequestMapping
public class RegPageController {
    RegistrationForm registrationForm;
    @Autowired
    HttpServletRequest request;
    @Autowired
    UsersService usersService;

    @Qualifier("userRegFormValidator")
    @Autowired
    Validator validator1;

    @RequestMapping(value = "/oafl/registration", method = RequestMethod.GET)
    public String getRegForm(Model model, @RequestParam(value = "error", required = false) Boolean error) {
        if (Boolean.TRUE.equals(error)) {
            model.addAttribute("error", error);
        }
        request.setAttribute("reg_form", new RegistrationForm());
        return "reg";
    }


    @RequestMapping(value = "/oafl/registration", method = RequestMethod.POST)
    public String getRegForm(@ModelAttribute("moder_form") @Valid RegistrationForm form,
                             BindingResult result) {
        validator1.validate(form, result);

        if (result.hasErrors()) {
            return "redirect:/oafl/registration?error=1";
        }
        usersService.createUsers(form);
        return "redirect:/oafl";
    }
}
