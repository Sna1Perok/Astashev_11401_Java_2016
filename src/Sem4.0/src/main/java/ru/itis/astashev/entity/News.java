package ru.itis.astashev.entity;/**
 * Created by 1 on 28.05.2016.
 */

import javax.persistence.*;

@Entity
@Table(name = "news")
public class News {
    private int id;
    private String zagolovok;
    private String text;
    private Games game;


    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "auto_id_news")
    @SequenceGenerator(name = "auto_id_news", sequenceName = "auto_id_news", allocationSize = 1)
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "zagolovok")
    public String getZagolovok() {
        return zagolovok;
    }

    public void setZagolovok(String zagolovok) {
        this.zagolovok = zagolovok;
    }

    @Basic
    @Column(name = "text")
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @ManyToOne
    @JoinColumn(name = "game", referencedColumnName = "id")
    public Games getGame() {
        return game;
    }

    public void setGame(Games game) {
        this.game = game;
    }
}