package com.company.aFile;

public class GoalKeeper extends FootballPlayer{
    public int countOfSaves;

    public GoalKeeper(String nameOfPlayer, String sportType, int numberPosition, String teamName,
                      int countOfRedCard, int countOfYellowCard, int countOfGoals, int numberOfSaves) {
        super(nameOfPlayer, sportType, numberPosition, teamName, countOfRedCard, countOfYellowCard, countOfGoals);
        this.countOfSaves = numberOfSaves;
    }
}
