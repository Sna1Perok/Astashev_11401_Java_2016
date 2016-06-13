package ru.itis.astashev.entity;

import javax.persistence.*;

/**
 * Created by 1 on 28.05.2016.
 */

@Entity
@Table(name = "tournament")
public class Tournament {
    private int id;
    private FootballLeague footballLeague;
    private String inf;
    private String name;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "auto_id_tournament")
    @SequenceGenerator(name = "auto_id_tournament", sequenceName = "auto_id_tournament", allocationSize = 1)
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
    @Basic
    @Column(name = "inf")
    public String getInf() {
        return inf;
    }

    public void setInf(String inf) {
        this.inf = inf;
    }

    @ManyToOne(targetEntity = FootballLeague.class)
    @JoinColumn(name = "league", referencedColumnName = "id")
    public FootballLeague getFootballLeague() {
        return footballLeague;
    }

    public void setFootballLeague(FootballLeague footballLeague){
        this.footballLeague = footballLeague;
    }

    @Override
    public String toString() {
        return "Tournament{" +
                "id=" + id +
                ", footballLeague=" + footballLeague +
                ", inf='" + inf + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}