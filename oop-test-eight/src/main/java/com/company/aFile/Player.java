package com.company.aFile;

public class Player implements Information {
    String nameOfPlayer;
    String sportType;
    int numberPosition;
    String teamName;

    public Player(String nameOfPlayer, String sportType, int numberPosition, String teamName) {
        this.nameOfPlayer = nameOfPlayer;
        this.sportType = sportType;
        this.numberPosition = numberPosition;
        this.teamName = teamName;
    }

    @Override
    public void getInfo() {
        System.out.println("Player Information: ");
        System.out.println("Name: " + nameOfPlayer);
        System.out.println("Sport Type: " + sportType);
        System.out.println("Number Position: " + numberPosition);
    }

    @Override
    public void getTeamInfo() {
        System.out.println("Team Name: " + teamName);
    }
}
