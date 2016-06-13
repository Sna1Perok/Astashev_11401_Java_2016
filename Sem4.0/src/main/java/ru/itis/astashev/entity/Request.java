package ru.itis.astashev.entity;/**
 * Created by 1 on 05.05.2016.
 */

import javax.persistence.*;

@Entity
@Table(name = "requests")
public class Request {
    private int id;
    private User user;
    private FootballTeam footballTeam;


    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "auto_id_request")
    @SequenceGenerator(name = "auto_id_request", sequenceName = "auto_id_request", allocationSize = 1)
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }




    @ManyToOne(targetEntity = User.class)
    @JoinColumn(name = "userfromuser", referencedColumnName = "id")
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @ManyToOne(targetEntity = FootballTeam.class)
    @JoinColumn(name = "team", referencedColumnName = "id")
    public FootballTeam getTeam() {
        return footballTeam;
    }

    public void setTeam(FootballTeam footballTeam) {
        this.footballTeam = footballTeam;
    }

    @Override
    public String toString() {
        return "Request{" +
                "id=" + id +
                ", user=" + user +
                ", footballTeam=" + footballTeam +
                '}';
    }
}