/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex01_fernandez.cyd.jairo;

/**
 *
 * @author cyd jairo
 */
public class FireType extends Monster {
    private int specialCount = 0;
    
    public FireType(String n, int m, int b){
        super(n, "fire", "grass", "water", m, b);
        atk = (int)(b * 1.3);
        def = (int)(b * 0.7);
    }
    
    @Override
    public void special(){
            atkBoost = 2;
            hp -= maxHP * 0.1;
            System.out.println(name + "used its special move!");
            System.out.println(name + "'s attack was raised by 2. Current health: " + hp + ".");
            specialCount++;
    }
    
    @Override
    public void resetSpecial(){
        atk -= specialCount * 2;
        specialCount = 0;
    }
    
    
}
