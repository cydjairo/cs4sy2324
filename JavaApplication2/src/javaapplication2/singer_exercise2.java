/*
 
Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
*/
package javaapplication2;

/**
 *
 
@author Christian Brandon*/
public class singer_exercise2 {
    // instance fields
    private final String name;
    private int noOfPerformances;
    private static int totalPerformances;
    private double earnings;
    private song_exercise2 favoriteSong;

    // constructor method
    public singer_exercise2(String name, int noOfPerformances, 
            double earnings, song_exercise2 favoriteSong) {
        this.name = name;
        this.noOfPerformances = noOfPerformances;
        this.earnings = earnings;
        this.favoriteSong = favoriteSong;
        totalPerformances += noOfPerformances;
    }
    
    public String getName(){
        return name;
    }
    public void performForTheAudience(int people) {
        noOfPerformances++;
        totalPerformances++;
        earnings += people * 100;
    }

    public void performForTheAudience(singer_exercise2 singer, int people) {
        noOfPerformances++;
        singer.noOfPerformances++;
        totalPerformances++;  // add by 1 or 2??
        singer.earnings += people * 50;
        earnings += people * 50;
    }

    public void changeFavoriteSong(song_exercise2 song) {
        favoriteSong = song;
    }

    public double getEarnings() {
        return earnings;
    }

    public song_exercise2 getFavoriteSong() {
        return favoriteSong;
    }

    public static int getTotalPerformances() {
        return totalPerformances;
    }
}
