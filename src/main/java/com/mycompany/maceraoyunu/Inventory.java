/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.maceraoyunu;

/**
 *
 * @author Furkan Çetiner
 */
public class Inventory  {
    private boolean water;
    private boolean firewood;
    private boolean food;
    private String wName,aName;
    private int damage,armor;

    
    Inventory(){
        
        this.water= false;
        this.firewood= false;
        this.food=false;
        this.damage=0;
        this.armor=0;
        this.wName= null;
        this.aName= null;
      
    }

    public void selectCha(){
}

    /**
     * @return the water
     */
    public boolean isWater() {
        return water;
    }

    /**
     * @param water the water to set
     */
    public void setWater(boolean water) {
        this.water = water;
    }

    /**
     * @return the firewood
     */
    public boolean isFirewood() {
        return firewood;
    }

    /**
     * @param firewood the firewood to set
     */
    public void setFirewood(boolean firewood) {
        this.firewood = firewood;
    }

    /**
     * @return the food
     */
    public boolean isFood() {
        return food;
    }

    /**
     * @param food the food to set
     */
    public void setFood(boolean food) {
        this.food = food;
    }

    /**
     * @return the wName
     */
    public String getwName() {
        return wName;
    }

    /**
     * @param wName the wName to set
     */
    public void setwName(String wName) {
        this.wName = wName;
    }

    /**
     * @return the aName
     */
    public String getaName() {
        return aName;
    }

    /**
     * @param aName the aName to set
     */
    public void setaName(String aName) {
        this.aName = aName;
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
     * @return the armor
     */
    public int getArmor() {
        return armor;
    }

    /**
     * @param armor the armor to set
     */
    public void setArmor(int armor) {
        this.armor = armor;
    }
    
    
}
