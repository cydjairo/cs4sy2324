/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication2;

/**
 *
 * @author cyd jairo
 */
public class valorant_exercise2 {
    
    String name, role, ability1, ability2, ability3, ultimate, themesong, cname; 
    int agentnumber, costofabt1, costofabt2, ultptsneeded;
    
    public valorant_exercise2(int v, String a, String i, String l, String o, int q, String r, int w,String A, String n, int y, String t){
    
    agentnumber = v;
    name = a;
    cname = i;
    role = l;
    ability1 = o;
    costofabt1 = q;
    ability2 = r;
    costofabt2 = w;
    ability3 = A;
    ultimate = n;
    ultptsneeded = y;
    themesong = t;
    }
    
    public void displayAgentInfo(){
    System.out.println("");
    System.out.println("Agent No.: " + agentnumber);
    System.out.println("Codename: " + name);
    System.out.println("Country: " + cname);
    System.out.println("Role: " + role);
    System.out.println("Abilities: ");
    System.out.println("--------------------");
    System.out.println("Ability 1: " + ability1);
    System.out.println("Cost: " + costofabt1);
    System.out.println("--------------------");
    System.out.println("Ability 2: " + ability2);
    System.out.println("Cost: " + costofabt2);
    System.out.println("--------------------");
    System.out.println("Ability 3: " + ability3);
    System.out.println("--------------------");
    System.out.println("Ultimate Name: " + ultimate);
    System.out.println("Ultimate Points Needed: " + ultptsneeded);
    System.out.println("--------------------");
    System.out.println("Theme Song: " + themesong);
    System.out.println(" ");
    System.out.println(" ");
    
    
            }
    
    
    
}
