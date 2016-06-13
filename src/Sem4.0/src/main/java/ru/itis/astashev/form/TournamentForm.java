package ru.itis.astashev.form;/**
 * Created by 1 on 28.05.2016.
 */

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class TournamentForm {

    @Pattern(regexp = "(\\s*\\w+\\s*)+", message = "\"symbols, digits, spaces and \\\"_\\\" allowed\"")
    @Size(min = 5, max = 35, message = "incorrect name size(5 - 35 symbols)")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Pattern(regexp = "(\\s*\\w+\\s*)+", message = "\"symbols, digits, spaces and \\\"_\\\" allowed\"")
    @Size(min = 5, max = 299, message = "incorrect name size(5 - 299 symbols)")
    private String textarea;

    public String getTextarea() {
        return textarea;
    }

    public void setTextarea(String textarea) {
        this.textarea = textarea;
    }

}