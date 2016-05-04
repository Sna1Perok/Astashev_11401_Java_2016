package ru.itis.astashev.entity;/**
 * Created by 1 on 05.05.2016.
 */

import javax.persistence.*;
import java.util.Scanner;

@Entity
@Table(name = "footballleague")
public class FootballLeague {
    private int id;
    private String name;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
    }

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "auto_id_league")
    @SequenceGenerator(name = "auto_id_league", sequenceName = "auto_id_league", allocationSize = 1)
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FootballLeague that = (FootballLeague) o;

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
        return "FootballLeague{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}