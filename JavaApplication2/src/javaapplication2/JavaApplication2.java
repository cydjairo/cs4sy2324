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
        
        song_exercise3 First = new song_exercise3(1, "WAR-R-R", "Love Part 1", "4 mins, 32 secs", "Colde");
        song_exercise3 Second = new song_exercise3(2, "ONLY", "4 ONLY", "4 mins.", "LeeHi");
        song_exercise3 Third = new song_exercise3 (3, "bad", "0.1 flaws and all.", "4 mins, 23 secs", "wave to earth");
        
        singer_exercise2 Anne = new singer_exercise2("Anne Ambrocio", 10, 5000, "Paraluman");
        
        First.displaySonging();
        Second.displaySonging();
        Third.displaySonging();
         
        Anne.performForTheAudience(40000);
        Anne.changeFavoriteSong("Uhaw");
        
        valorant_exercise2 Jett = new valorant_exercise2(10, "Jett", "South Korea", "Duelist", "Cloudburst", 200, "Updraft", 150, "Tailwind", "Blade Storm", 8, "Can't Slow Me Down");
        valorant_exercise2 Reyna = new valorant_exercise2(11, "Reyna", "Mexico", "Duelist", "Leer", 250, "Devour", 200, "Dismiss", "Empress", 6, "Tell Me You'll Never Leave");
        valorant_exercise2 Neon = new valorant_exercise2(18, "Neon", "Philippines", "Duelist", "Fast Lane", 300, "Relay Bolt", 200, "High Gear", "Overdrive", 7, "Entertain Me");
        
        Jett.displayAgentInfo();
        Reyna.displayAgentInfo();
        Neon.displayAgentInfo();
        
    }
    
}
