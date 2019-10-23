package com.codeclan.example.pinballservice.models;

import javax.persistence.*;
import java.util.ArrayList;

@Entity
@Table(name="players")
public class Player {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;

    @Column
    private String name;

    @Column
    private int score;
    private ArrayList<Player> players;

    public Player() {
    }

    public Player(String name, int score) {
        this.name = name;
        this.score = score;
        this.players = new ArrayList<Player>();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void removePlayer(Player player) {
        this.players.remove(player);
    }
}
