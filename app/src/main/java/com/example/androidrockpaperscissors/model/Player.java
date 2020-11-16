package com.example.androidrockpaperscissors.model;

public class Player {
    /*
    * Possible things to do,
    *  make a singleton class with two players (players are not singleton)
    * allow players to store, name, games won, and current score (
    */
    private String name;
    private int wins;
    private int objectSelection;

    public Player(String name, int wins) {
        this.name = name;
        this.wins = wins;
        this.objectSelection = -1;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWins() {
        return wins;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }

    public int getObjectSelection() {
        return objectSelection;
    }

    public void setObjectSelection(int objectSelection) {
        this.objectSelection = objectSelection;
    }
}