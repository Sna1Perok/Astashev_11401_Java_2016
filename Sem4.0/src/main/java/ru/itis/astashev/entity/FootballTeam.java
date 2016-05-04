package ru.itis.astashev.entity;/**
 * Created by 1 on 05.05.2016.
 */

import javax.persistence.*;
import java.util.Scanner;

@Entity
@Table(name = "footballteam")
public class FootballTeam {
    private int id;
    private String name;
    private FootballLeague league;

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
    @JoinColumn(name = "league", referencedColumnName = "id")
    public FootballLeague getLeague() {
        return league;
    }

    public void setLeague(FootballLeague league) {
        this.league = league;
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
                ", league=" + league +
                '}';
    }
}