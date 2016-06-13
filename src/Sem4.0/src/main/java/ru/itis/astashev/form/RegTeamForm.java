package ru.itis.astashev.form;/**
 * Created by 1 on 26.05.2016.
 */

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class RegTeamForm {

    @Pattern(regexp = "(\\w+)+", message = " just symbols  allowed")
    @Size(min = 5, max = 35, message = "incorrect name size(5-35 symbols)")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}