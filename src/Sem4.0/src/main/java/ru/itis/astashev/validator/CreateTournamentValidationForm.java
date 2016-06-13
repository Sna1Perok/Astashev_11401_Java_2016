package ru.itis.astashev.validator;/**
 * Created by 1 on 28.05.2016.
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;
import ru.itis.astashev.form.TournamentForm;
import ru.itis.astashev.services.FootballTeamService;
import ru.itis.astashev.services.GameService;
import ru.itis.astashev.services.TournamentService;

@Component
@Qualifier("tournamentValidatorForm")
public class CreateTournamentValidationForm implements Validator {
    public boolean supports(Class<?> aClass) {
        return TournamentForm.class.equals(aClass);
    }

    @Autowired
    TournamentService tournamentService;
    @Autowired
    FootballTeamService footballTeamService;
    @Autowired
    GameService gameService;

    public void validate(Object o, Errors errors) {
        TournamentForm form = (TournamentForm) o;

        if(tournamentService.findOneByName(form.getName()) != null){
            errors.rejectValue("Name", "", "Name is used already");
        }
    }

}