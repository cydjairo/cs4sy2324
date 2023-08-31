/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs4charmfernandez;

/**
 *
 * @author CHARM
 */
public class CS4CharmFernandez {
    String fname1 = "Mark";
    String fname2 = "Joshua";
    String lname = "Tarcelo";
    String subjfname1 = "Computer";
    String  subjfname2 = "Social";
    String subjlname = "Science";
    int years1 = 7;
    int years2 = 4;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        CS4CharmFernandez myExer = new CS4CharmFernandez();
        System.out.println("Teacher 1:");
        System.out.println("Name: " + myExer.fname1 + " " +  myExer.lname);
        System.out.println("Subject: " + myExer.subjfname1 + " " + myExer.subjlname);
        System.out.println("Years of Teaching:" + myExer.years1);
        System.out.println(" ");
        System.out.println("Teacher 2:");
        System.out.println("Name: " + myExer.fname2 + " " + myExer.lname);
        System.out.println("Subject: " + myExer.subjfname2 + " " + myExer.subjlname);
        System.out.println("Years of Teaching: " + myExer.years2);
        System.out.println(" ");
        System.out.println("Total Years of Teaching: " + (myExer.years1 + myExer.years2));
        System.out.println("Joshua Tarcelo has more years of teaching: " + (myExer.years1 == myExer.years2));
        System.out.println("The teachers have the same subject: " + (myExer.subjfname1 == myExer.subjfname2));
        } 
    }
    
