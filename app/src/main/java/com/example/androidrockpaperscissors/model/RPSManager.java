package com.example.androidrockpaperscissors.model;

public class RPSManager {
    public Player user;
    public Player computer;
    public int gamesPlayed;
    public String[] objects = {"rock", "paper", "scissors"};
    public static RPSManager instance;

    public static RPSManager getInstance(){
        if(instance == null){
            instance = new RPSManager();
        }
        return instance;
    }

    private RPSManager(){
        this.gamesPlayed = 0;
        user = new Player("Shaneil", 0);
        computer = new Player("Elon", 0);
    }

    public String intToObject(Player player){
        for(int i = 0; i < objects.length; i++){
            if(player.getObjectSelection() == i){
                return objects[i];
            }
        }
        return "error";
    }

    public boolean isTie(){
        if(user.getObjectSelection() == computer.getObjectSelection()){
            return true;
        }
        else {
            return false;
        }
    }

    public Boolean hasUserWon(){
        int userSelection = user.getObjectSelection();
        int computerSelection = computer.getObjectSelection();
        if (computerSelection != losingIndex(userSelection)){
            return true;
        }
        else {
            return false;
        }
    }

    public int losingIndex(int selection){
        return (selection + 1) % 3;
    }




}
