/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex01_fernandez.cyd.jairo;

import java.util.ArrayList;

import java.util.*;

/**
 *
 * @author cyd jairo
 */
public class Location implements Interactive {
    protected String name;
    protected ArrayList<Character> personList;
    protected String localSpecialty;

    public Location(String n){
        this.name = n;
        this.localSpecialty = null;
        this.personList = new ArrayList<>();
    }
    public Location(String n, String s){
        this.name = n;
        this.localSpecialty = s;
        this.personList = new ArrayList<>();
    }

    public String getName(){
        return name;
    }
    public ArrayList<Character> getPersonList(){
        return personList;
    }
    public void addPerson(Character c){
        personList.add(c);
    }
    public void removePerson(Character c){
        personList.remove(c);
    }
    
    @Override
    public void interact(){
        System.out.println("Name of town: " + name + " | " + this.localSpecialty);
    }
}

