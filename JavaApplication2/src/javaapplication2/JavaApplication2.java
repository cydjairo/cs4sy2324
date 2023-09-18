/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication2;

/**
 *
 * @author cyd jairo
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        song_exercise2 warRr = new song_exercise2("WAR-R-R", "Love Part 1", "Korean RNB" , 272);
        song_exercise2 Bad = new song_exercise2 ("bad", "0.1 flaws and all.", "Korean RNB", 263);
        
        singer_exercise2 Anne = new singer_exercise2("Anne", 10, 5000, warRr);
        singer_exercise2 Phila = new singer_exercise2("Phila", 50, 10000, Bad);
        
        Anne.performForTheAudience(150);
        Anne.changeFavoriteSong(Bad);
        
        Anne.performForTheAudience(Phila, 100);
         
        Anne.performForTheAudience(100);
        
        valorant_exercise2 Jett = new valorant_exercise2(10, "Jett", "South Korea", "Duelist", "Cloudburst", 200, "Updraft", 150, "Tailwind", "Blade Storm", 8, "Can't Slow Me Down");
        valorant_exercise2 Reyna = new valorant_exercise2(11, "Reyna", "Mexico", "Duelist", "Leer", 250, "Devour", 200, "Dismiss", "Empress", 6, "Tell Me You'll Never Leave");
        valorant_exercise2 Neon = new valorant_exercise2(18, "Neon", "Philippines", "Duelist", "Fast Lane", 300, "Relay Bolt", 200, "High Gear", "Overdrive", 7, "Entertain Me");
        
        Jett.displayAgentInfo();
        Reyna.displayAgentInfo();
        Neon.displayAgentInfo();
        
    }
    
}
