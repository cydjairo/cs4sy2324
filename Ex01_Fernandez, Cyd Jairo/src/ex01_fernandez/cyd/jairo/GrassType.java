/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex01_fernandez.cyd.jairo;

/**
 *
 * @author cyd jairo
 */
public class GrassType extends Monster {
    private int specialCount = 0;
    
    public GrassType(String n, int m, int b){
        super(n, "grass", "water", "fire", m, b);
    }
    
    @Override
    public void special(){
            hp += maxHP * 0.2;
            if(hp > maxHP) 
                hp = maxHP;
            System.out.println(name + "used its special move!");
            System.out.println(name + "'s HP was restored back to " + hp + ".");
            specialCount++;
    }
    
    @Override 
    public void rest(){
            hp += maxHP / 2;
            if(hp > maxHP)
                hp = maxHP;
            System.out.println("");
            System.out.println(name + " rested. It's HP was restored back to " + hp + ".");
        }
    }
