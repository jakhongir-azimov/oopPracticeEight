package com.company.aFile;

public class Setter extends VolleyballPlayer{
    int countOfSets;

    public Setter(String nameOfPlayer, String sportType, int numberPosition, String teamName,
                  int numberOfPoints, int countOfSets) {
        super(nameOfPlayer, sportType, numberPosition, teamName, numberOfPoints);
        this.countOfSets = countOfSets;
    }
}
