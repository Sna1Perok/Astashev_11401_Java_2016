package ru.itis.astashev.entity;/**
 * Created by 1 on 05.05.2016.
 */

import javax.persistence.*;
import java.util.Date;
import java.util.Scanner;

@Entity
@Table(name = "footballteam")
public class FootballTeam {
    private int id;
    private int goals;
    private Date date;
    private String inf;
    private int lose;
    private int win;
    private int maissedgoals;
    private String name;
    private FootballLeague league_id;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
    }

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "auto_id_team")
    @SequenceGenerator(name = "auto_id_team", sequenceName = "auto_id_team", allocationSize = 1)
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @ManyToOne(targetEntity = FootballLeague.class)
    @JoinColumn(name = "league_id", referencedColumnName = "id")
    public FootballLeague getLeague() {
        return league_id;
    }

    public void setLeague(FootballLeague league) {
        this.league_id = league;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FootballTeam that = (FootballTeam) o;

        if (id != that.id) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "FootballTeam{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", league=" + league_id +
                '}';
    }

    @Basic
    @Column(name = "goals")
    public int getGoals() {
        return goals;
    }

    public void setGoals(int goals) {
        this.goals = goals;
    }

    @Basic
    @Column(name = "lose")
    public int getLose() {
        return lose;
    }

    public void setLose(int lose) {
        this.lose = lose;
    }

    @Basic
    @Column(name = "win")
    public int getWin() {
        return win;
    }

    public void setWin(int win) {
        this.win = win;
    }

    @Basic
    @Column(name = "misedgoals")
    public int getMaissedgoals() {
        return maissedgoals;
    }

    public void setMaissedgoals(int maissedgoals) {
        this.maissedgoals = maissedgoals;
    }

    @Basic
    @Column(name = "date")
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Basic
    @Column(name = "inf")
    public String getInf() {
        return inf;
    }

    public void setInf(String inf) {
        this.inf = inf;
    }


    Tournament tournament;

    @OneToOne(targetEntity = Tournament.class)
    @JoinColumn(name = "tournament", referencedColumnName = "id")
    public Tournament getTournament() {
        return tournament;
    }

    public void setTournament(Tournament tournament) {
        this.tournament = tournament;
    }
}