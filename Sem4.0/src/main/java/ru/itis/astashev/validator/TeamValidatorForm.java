package ru.itis.astashev.validator;/**
 * Created by 1 on 07.05.2016.
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;
import ru.itis.astashev.form.RegTeamForm;
import ru.itis.astashev.services.FootballTeamService;
import ru.itis.astashev.services.GameService;
import ru.itis.astashev.services.UsersService;

@Component
@Qualifier("teamValidatorForm")
public class TeamValidatorForm implements Validator {
    public boolean supports(Class<?> aClass) {
        return RegTeamForm.class.equals(aClass);
    }

    @Autowired
    UsersService usersService;
    @Autowired
    FootballTeamService footballTeamService;
    @Autowired
    GameService gameService;

    public void validate(Object o, Errors errors) {
        RegTeamForm form = (RegTeamForm) o;

        if(footballTeamService.findOneByName(form.getName()) != null){
            errors.rejectValue("Name", "", "Name is used already");
        }

    }

}