package ru.itis.astashev.validator;/**
 * Created by 1 on 07.05.2016.
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;
import ru.itis.astashev.form.RegistrationForm;
import ru.itis.astashev.services.FootballTeamService;
import ru.itis.astashev.services.GameService;
import ru.itis.astashev.services.UsersService;

@Component
@Qualifier("userRegFormValidator")
public class UserRegFormValidator implements Validator {
    public boolean supports(Class<?> aClass) {
        return RegistrationForm.class.equals(aClass);
    }

    @Autowired
    UsersService usersService;
    @Autowired
    FootballTeamService footballTeamService;
    @Autowired
    GameService gameService;

    public void validate(Object o, Errors errors) {
        RegistrationForm form = (RegistrationForm) o;
        int a = 5;
        if (usersService.findOneByLogin(form.getLogin()) != null) {
            errors.rejectValue("login", "", "login is used already");
        }
        if (usersService.findOneByEmail(form.getEmail()) != null) {
            errors.rejectValue("email", "", "email is used already");
        }
        if (!form.getPassword().equals(form.getRepassword())) {
            errors.rejectValue("repassword", "", "passwords don't match");
        }
    }

}