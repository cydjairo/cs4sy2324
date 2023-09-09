/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication2;

/**
 *
 * @author cyd jairo
 */
public class song_exercise2 {
    String name, album, length, performer;
    int id;
    
    public song_exercise2(int t, String a, String r, String c, String y){
    id = t;
    name = a;
    album = r;
    length = c;
    performer = y;
    } 
    public void displaySonging(){
    System.out.println("Song Number: " + id);
    System.out.println("Name: " + name);
    System.out.println("Album: " + album);
    System.out.println("Length: " + length);
    System.out.println("Performer" + performer);
    System.out.println(" ");
    }
}
