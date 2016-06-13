package ru.itis.astashev.entity;/**
 * Created by 1 on 15.05.2016.
 */

import javax.persistence.*;
import java.util.Scanner;

@Entity
@Table(name = "users")
public class User {
    private int id;
    private int card;
    private String login;
    private String pass;
    private String name;
    private String surname;
    private Integer goals;
    private int skill;
    private String email;
    private Role role;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
    }

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "auto_id_users")
    @SequenceGenerator(name = "auto_id_users", sequenceName = "auto_id_users", allocationSize = 1)
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "login")
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    @Basic
    @Column(name = "pass")
    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "surname")
    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Basic
    @Column(name = "goals")
    public Integer getGoals() {
        return goals;
    }

    public void setGoals(Integer goals) {
        this.goals = goals;
    }

    @Basic
    @Column(name = "skill")
    public int getSkill() {
        return skill;
    }

    public void setSkill(int skill) {
        this.skill = skill;
    }

    FootballTeam footballTeam;

    @ManyToOne(targetEntity = FootballTeam.class)
    @JoinColumn(name = "teamid", referencedColumnName = "id")
    public FootballTeam getTeam() {
        return footballTeam;
    }

    public void setTeam(FootballTeam footballTeam) {
        this.footballTeam = footballTeam;
    }

    @Basic
    @Column(name = "email")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "role")
    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User that = (User) o;

        if (id != that.id) return false;
        if (skill != that.skill) return false;
        if (login != null ? !login.equals(that.login) : that.login != null) return false;
        if (pass != null ? !pass.equals(that.pass) : that.pass != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (surname != null ? !surname.equals(that.surname) : that.surname != null) return false;
        if (goals != null ? !goals.equals(that.goals) : that.goals != null) return false;
        if (footballTeam != null ? !footballTeam.equals(that.footballTeam) : that.footballTeam != null) return false;
        if (email != null ? !email.equals(that.email) : that.email != null) return false;
        if (role != null ? !role.equals(that.role) : that.role != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (login != null ? login.hashCode() : 0);
        result = 31 * result + (pass != null ? pass.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (surname != null ? surname.hashCode() : 0);
        result = 31 * result + (goals != null ? goals.hashCode() : 0);
        result = 31 * result + skill;
        result = 31 * result + (footballTeam != null ? footballTeam.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (role != null ? role.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", login='" + login + '\'' +
                ", pass='" + pass + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", goals=" + goals +
                ", skill=" + skill +
                ", email='" + email + '\'' +
                ", role=" + role +
              //  ", footballTeamId=" + footballTeam.getId() +
                '}';
    }
    @Basic
    @Column(name = "card")
    public int getCard() {
        return this.card;
    }

    public void setCard(int card) {
        this.card = card;
    }
}