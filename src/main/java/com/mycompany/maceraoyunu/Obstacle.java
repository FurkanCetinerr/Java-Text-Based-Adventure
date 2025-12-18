/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.maceraoyunu;

import java.util.Random;

/**
 *
 * @author Furkan Çetiner
 */
public class Obstacle  {
private String name;
private int damage,award,health,maxNumber;


    
    public Obstacle(String name, int damage, int health, int award,int maxNumber) {
        
        this.name=name;
        this.award=award;
        this.damage= damage;
        this.health= health;
        this.maxNumber=maxNumber;
    }

    public int count(){
    Random r = new Random(3);
    return r.nextInt(this.maxNumber)+ 1;
    }
    
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the damage
     */
    public int getDamage() {
        return damage;
    }

    /**
     * @param damage the damage to set
     */
    public void setDamage(int damage) {
        this.damage = damage;
    }

    /**
     * @return the award
     */
    public int getAward() {
        return award;
    }

    /**
     * @param award the award to set
     */
    public void setAward(int award) {
        this.award = award;
    }

    /**
     * @return the health
     */
    public int getHealth() {
        return health;
    }

    /**
     * @param health the health to set
     */
    public void setHealth(int health) {
        this.health = health;
    }

    /**
     * @return the maxNumber
     */
    public int getMaxNumber() {
        return maxNumber;
    }

    /**
     * @param maxNumber the maxNumber to set
     */
    public void setMaxNumber(int maxNumber) {
        this.maxNumber = maxNumber;
    }

    
    
    
}
