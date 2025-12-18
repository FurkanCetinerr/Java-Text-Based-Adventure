/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.maceraoyunu;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author Furkan Çetiner
 */
public class Player extends Game{
    private String name,cName;
    private int damage,healthy,money,rHealthy;
    private Inventory inventory;
    Scanner scan=new Scanner(System.in);
    
public Player(String name){
this.name=name;
this.inventory=new Inventory();

}
    public void selectCha(){
        switch(chaMenu()){
        
            case 1 :
                initPLayer("Samuray", 5, 21,  15);
                
               break;
            case 2 :
                initPLayer("Okçu", 7, 18,  20);
                
               break;
            case 3 :  
                initPLayer("Şövalye", 8, 24,  5);
                
               break;
            default:
                initPLayer("Samuray", 5, 21,  15);
                
               break;
        }
        System.out.print("Karakteriniz Oluşturuldu !");
        System.out.println(" Adı : "+getcName()+" , Hasar : "+getDamage()+" , Sağlık : "+getHealthy()+" , Para : "+getMoney());
}
public void initPLayer(String cName,int damage,int healthy, int money){
                setcName(cName);
                setDamage(damage);
                setHealthy(healthy);
                setMoney(money);
                setrHealthy(healthy);
}
    public int chaMenu(){
        System.out.println("Lütfen bir karakter seç : ");
        System.out.println("1- Samuray , Hasar: 5 , Sağlık: 21 , Para: 15");
        System.out.println("2- Okçu    , Hasar: 7 , Sağlık: 18 , Para: 20");
        System.out.println("3- Şövalye , Hasar: 8 , Sağlık: 24 , Para: 5");
        System.out.println("Karakter seçiminiz :");
        int chaID=scan.nextInt();
        
        if(chaID < 1 || chaID > 3){
            System.out.println("LÜtfen geçerli bir karakter seçiniz !");
            chaID=scan.nextInt();
        
        }
        return chaID;
    }

    public int getTotalDamage(){
    return this.getDamage()+this.getInventory().getDamage();
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
     * @return the cName
     */
    public String getcName() {
        return cName;
    }

    /**
     * @param cName the cName to set
     */
    public void setcName(String cName) {
        this.cName = cName;
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
     * @return the healthy
     */
    public int getHealthy() {
        return healthy;
    }

    /**
     * @param healthy the healthy to set
     */
    public void setHealthy(int healthy) {
        this.healthy = healthy;
    }

    /**
     * @return the money
     */
    public int getMoney() {
        return money;
    }

    /**
     * @param money the money to set
     */
    public void setMoney(int money) {
        this.money = money;
    }

    /**
     * @return the inventory
     */
    public Inventory getInventory() {
        return inventory;
    }

    /**
     * @param inventory the inventory to set
     */
    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    /**
     * @return the rHealthy
     */
    public int getrHealthy() {
        return rHealthy;
    }

    /**
     * @param rHealthy the rHealthy to set
     */
    public void setrHealthy(int rHealthy) {
        this.rHealthy = rHealthy;
    }
    
    
}
