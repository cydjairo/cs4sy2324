/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex01_fernandez.cyd.jairo;

/**
 *
 * @author cyd jairo
 */
public class Ex01_FernandezCydJairo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        FireType Blaziken = new FireType("Blaziken", 70, 95);
        GrassType Sceptile = new GrassType("Sceptile", 70, 85);
        WaterType Swampert = new WaterType("Swampert", 100, 100) {};
        
        Location Pallet = new Location("Pallet Town", "Starter Town");
        
        NPC ProfessorOak = new NPC("Professor Oak", Pallet, "Welcome to Pallet Town!");
        
        Trainer Ash = new Trainer("Ash", Pallet);        
    }
    
}
