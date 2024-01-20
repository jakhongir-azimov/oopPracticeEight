package com.company.aFile;

public class FootballPlayer extends Player {
    int countOfRedCard;
    int countOfYellowCard;
    int countOfGoals;

    public FootballPlayer(String nameOfPlayer, String sportType, int numberPosition, String teamName,
                          int countOfRedCard, int countOfYellowCard, int countOfGoals) {
        super(nameOfPlayer, sportType, numberPosition, teamName);
        this.countOfRedCard = countOfRedCard;
        this.countOfYellowCard = countOfYellowCard;
        this.countOfGoals = countOfGoals;
    }
}
