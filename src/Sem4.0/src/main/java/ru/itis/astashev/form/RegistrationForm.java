package ru.itis.astashev.form;/**
 * Created by 1 on 07.05.2016.
 */

import org.hibernate.validator.constraints.Email;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class RegistrationForm {
    @Size(min = 1, max = 30, message = "incorrect login size")
    @Pattern(regexp = "\\w+", message = "symbols, digits and \"_\" allowed")
    private String login;

    @Size(min = 1, max = 30, message = "incorrect surname size")
    @Pattern(regexp = "\\w+", message = "symbols, digits and \"_\" allowed")
    private String surname;

    @Pattern(regexp = "(\\s*\\w+\\s*)+", message = "symbols, digits and \"_\" allowed")
    @Size(min = 8, max = 30, message = "incorrect pass size")
    private String password;

    @Pattern(regexp = "(\\s*\\w+\\s*)+", message = "symbols, digits and \"_\" allowed")
    @Size(min = 8, max = 30, message = "incorrect pass size")
    private String repassword;

    @Pattern(regexp = "(\\s*\\w+\\s*)+", message = "symbols, digits, spaces and \"_\" allowed")
    @Size(min = 1, max = 50, message = "incorrect name size")
    private String name;

    @Size(min = 1, max = 50, message = "incorrect email size")
    @Email(regexp = "\\w+@\\w+.\\w+", message = "incorrect email")
    private String email;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRepassword() {
        return repassword;
    }

    public void setRepassword(String repassword) {
        this.repassword = repassword;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
