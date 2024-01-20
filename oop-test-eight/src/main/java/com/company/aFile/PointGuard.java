package com.company.aFile;

public class PointGuard extends BasketballPlayer{
    public int countOfGuard;

    public PointGuard(String nameOfPlayer, String sportType, int numberPosition, String teamName,
                      int numberOfGoals, int countOfGuard) {
        super(nameOfPlayer, sportType, numberPosition, teamName, numberOfGoals);
        this.countOfGuard = countOfGuard;
    }
}
