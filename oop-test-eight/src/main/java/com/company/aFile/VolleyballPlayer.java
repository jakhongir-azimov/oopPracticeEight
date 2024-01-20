package com.company.aFile;

public class VolleyballPlayer extends Player {
    public int countOfPoints;

    public VolleyballPlayer(String nameOfPlayer, String sportType, int numberPosition, String teamName,
                            int numberOfPoints) {
        super(nameOfPlayer, sportType, numberPosition, teamName);
        this.countOfPoints = numberOfPoints;
    }
}
