package com.company;

import com.company.aFile.GoalKeeper;
import com.company.aFile.PointGuard;
import com.company.aFile.VolleyballPlayer;
import com.company.convert.BaseConverter;

public class Main {
    public static void main(String[] args) {
        GoalKeeper goalKeeper = new GoalKeeper("Thibaut Courtois", "Football", 1,
                "Real Madrid", 3, 4, 23, 13);
        goalKeeper.getInfo();
        goalKeeper.getTeamInfo();
        System.out.println("Count of Saves: " + goalKeeper.countOfSaves);

        System.out.println("");

        VolleyballPlayer volleyballPlayer = new VolleyballPlayer("Tom Marcus", "Volleyball", 23,
                "Team Wolves", 14);
        volleyballPlayer.getInfo();
        volleyballPlayer.getTeamInfo();
        System.out.println("Count of Sets: " + volleyballPlayer.countOfPoints);

        System.out.println("");

        PointGuard pointGuard = new PointGuard("Jerry Smith", "BasketBall", 3,
                "Team Eagle", 15, 7);
        pointGuard.getInfo();
        pointGuard.getTeamInfo();
        System.out.println("Count of Guard: " + pointGuard.countOfGuard);

        System.out.println("_ _ _ _ _");

        BaseConverter baseConverter = new BaseConverter();

        double celsiusTemperature = 25.0;

        double kelvinTemperature = baseConverter.convertToKelvin(celsiusTemperature);
        System.out.println(celsiusTemperature + " Celsius is equal to " + kelvinTemperature + " Kelvin");

        double fahrenheitTemperature = baseConverter.convertToFahrenheit(celsiusTemperature);
        System.out.println(celsiusTemperature + " Celsius is equal to " + fahrenheitTemperature + " Fahrenheit");


    }
}