package com.company.aFile;

public class BasketballPlayer extends Player{
    int numberOfGoals;

    public BasketballPlayer(String nameOfPlayer, String sportType, int numberPosition, String teamName,
                            int numberOfGoals) {
        super(nameOfPlayer, sportType, numberPosition, teamName);
        this.numberOfGoals = numberOfGoals;
    }
}
