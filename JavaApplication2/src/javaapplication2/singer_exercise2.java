/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication2;

/**
 *
 * @author cyd jairo
 */
public class singer_exercise2 {
    String name, favoriteSong;
    int NoOfPerformances;
    static int totalPerformances;
    double earnings;
    
    public singer_exercise2 (String n, int num, double earn, String s){
        name = n;
        NoOfPerformances = num;
        earnings = earn;
        favoriteSong = s;
    }
    
    public void performForTheAudience(int numOfPeople){
    System.out.println("===");
    System.out.println("Before:");
    System.out.println("Performances: " + NoOfPerformances);
    System.out.println("Earnings: " + earnings);
    NoOfPerformances = NoOfPerformances + 1;
    earnings =earnings + 100*numOfPeople;
    System.out.println(" ");
    System.out.println("After: ");
    System.out.println("Performances: " + NoOfPerformances);
    System.out.println("Earnings: " + earnings);
    System.out.println("    ");
    }
    
    public void changeFavoriteSong(String newSong){
    System.out.println("==============");
    System.out.println("Previous Favorite Song: " + favoriteSong);
    favoriteSong = newSong;
    System.out.println("New Favorite Song: " + favoriteSong);
    System.out.println("==============");
    System.out.println(" ");
    }
}
