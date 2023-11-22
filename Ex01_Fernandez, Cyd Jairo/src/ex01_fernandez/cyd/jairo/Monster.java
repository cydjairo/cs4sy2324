/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex01_fernandez.cyd.jairo;

import java.util.ArrayList;

/**
 *
 * @author cyd jairo
 */
public abstract class Monster implements Interactive{
    protected final String name, type, strongAgainst, weakAgainst;
    protected int maxHP, hp, atk, atkBoost, atkLost, def, defBoost,
            defLost, xp, lvl;
    protected boolean guard, charge;
    protected static ArrayList<Monster> monsterList = new ArrayList<>();

    public Monster(String n, String t, String s, String w, int m, int base){
        name = n;
        type = t;
        strongAgainst = s;
        weakAgainst = w;
        maxHP = m;
        hp = m;
        atk = base;
        def = base;
        xp = 5000;
        lvl = 50;
        monsterList.add(this);
        guard = false;
        charge = false;
    }

    public String getName() {
        return name;
    }
    public int getMaxHP() {
        return maxHP;
    }
    public int getHP() {
        return hp;
    }
    public int getAtk() {
        return atk;
    }
    public int getDef() {
        return def;
    }
    public int getLvl(){
        return lvl;
    }
    public static ArrayList<Monster> getMonsterList() {
        return monsterList;
    }

    public void attack(Monster m){
        atk += atkBoost;
        atk -= atkLost;
        def += defBoost;
        def -= defLost;
        int damage = (int) ((atk*atk)/(double)(atk+m.getDef()));    // damage is calculated as double, then cast as int
        boolean strong = false, weak = false;
        if(strongAgainst.equals(m.type)){
            damage *= 2;
            strong = true;
        }
        if(weakAgainst.equals(m.type)){
            damage *= 0.5;
            weak = true;
        }
        if(m.guard){
            m.guard = false;
            damage *= 0.7;
        }
        if(charge){
            charge = false;
            damage *= 1.3;
        }
        m.hp -= damage;
        if(m.hp < 0) m.hp = 0;
            System.out.println(name  + " attacked " + m.getName() +
            " and dealt " + damage + " damage, reducing it to " + m.getHP() + "HP.");
        if(strong) System.out.println("It was super effective!");
        if(weak) System.out.println("It wasn't very effective...");
        gainXP(2);                                                  // every attack raises XP by 2

        if(m.getHP() <= 0){
            m.hp = 0;
            System.out.println(m.getName() + " fainted.");
            gainXP(10);                                             // defeating a monster raises XP by 10
        }
    }
    
    public static void battleStart(Monster offense, Monster defense){
        System.out.println("The Battle has Started: " + offense.getName() + " Lvl. " 
                + offense.getLvl() + " VS. " + defense.getName() + " Lvl. " + 
                defense.getLvl());
        offense.resetHP();
        defense.resetHP();
        offense.resetSpecial();
        defense.resetSpecial();
        
    }

    public void guard(){
        guard = true;
        System.out.println(name + " put up its guard. It will receive 30% less damage on the next attack.");
    }

    public void charge(){
        charge = true;
        System.out.println(name + " charged. Its next attack will do 30% more damage.");
    }

    public void rest(){
        hp += maxHP * 0.15;
        if(hp > maxHP) hp = maxHP;
        System.out.println(name + " rested. It's health is now " + hp + ".");
    }

    public void special(){
        System.out.println(name + " did a pose.");
    }
    
    public void resetSpecial(){
    //it makes sure that the special gets reset once a battle starts
    }

    public void resetHP(){
        hp = maxHP;
    }
    
    public void interact(){
        
    }

    // handles all increases in XP
    private void gainXP(int i){
        xp += i;
        if(xp >= 100){
            xp %= 100;
            lvl++;
            maxHP += 5;
            hp += 5;
            atk += 2;
            def += 2;
            System.out.println(name + " levelled up to " + lvl + "!");
        }
    }    
}
