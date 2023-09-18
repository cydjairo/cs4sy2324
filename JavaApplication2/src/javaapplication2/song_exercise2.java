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
    private final String name, album;
    private String kindofmusic;
    private int length;
    
    public song_exercise2(String name, String album, String kindofmusic, int length){
    this.name = name;
    this.album = album;
    this.kindofmusic = kindofmusic;
    this.length = length;
    } 
    
    public void displayKindOfMusic(String musicee){
    this.kindofmusic = musicee;
    }
    
    public void SongLength(int second){
    length += second;
    }
    
    public String getName(){
    return name;
    }
    
    public String getAlbum(){
    return album;
    }
    
    public String getKindOfMusic(){
    return kindofmusic;
    }
    
    public int getLength(){
    return length;
    }
}   

