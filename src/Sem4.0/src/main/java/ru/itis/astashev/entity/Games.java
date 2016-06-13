package ru.itis.astashev.entity;/**
 * Created by 1 on 05.05.2016.
 */

import javax.persistence.*;
import java.sql.Date;
import java.util.Scanner;

@Entity
@Table(name = "games")
public class Games {
    private int id;
    private String score;
    private Date date;
    private String whomakethegoal;
    private int leagueId;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
    }

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "auto_id_footballgames")
    @SequenceGenerator(name = "auto_id_footballgames", sequenceName = "auto_id_footballgames", allocationSize = 1)
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "score")
    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
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
    @Column(name = "whomakethegoal")
    public String getWhomakethegoal() {
        return whomakethegoal;
    }

    public void setWhomakethegoal(String whomakethegoal) {
        this.whomakethegoal = whomakethegoal;
    }


    FootballTeam team1;
    FootballTeam team2;

    @ManyToOne
    @JoinColumn(name = "idTeam1", referencedColumnName = "id")
    public FootballTeam getFootbalteam1() {
        return team1;
    }

    public void setFootbalteam1(FootballTeam team1) {
        this.team1 = team1;
    }


    @ManyToOne
    @JoinColumn(name = "idTeam2", referencedColumnName = "id")
    public FootballTeam getFootbalteam2() {
        return team2;
    }

    public void setFootbalteam2(FootballTeam team2) {
        this.team2 = team2;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Games that = (Games) o;

        if (id != that.id) return false;
        if (score != null ? !score.equals(that.score) : that.score != null) return false;
        if (date != null ? !date.equals(that.date) : that.date != null) return false;
        if (whomakethegoal != null ? !whomakethegoal.equals(that.whomakethegoal) : that.whomakethegoal != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (score != null ? score.hashCode() : 0);
        result = 31 * result + (date != null ? date.hashCode() : 0);
        result = 31 * result + (whomakethegoal != null ? whomakethegoal.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Games{" +
                "id=" + id +
                ", score=" + score +
                ", date=" + date +
                ", whomakethegoal='" + whomakethegoal + '\'' +
                ", team1id=" + team1.getId() +
                ", team2id=" + team2.getId() +
                '}';
    }
    FootballLeague footballLeague;
    @ManyToOne
    @JoinColumn(name = "leagueid", referencedColumnName = "id")
    public FootballLeague getLeague() {
        return footballLeague;
    }
    public void setLeague(FootballLeague footballLeague) {
        this.footballLeague = footballLeague;
    }
}