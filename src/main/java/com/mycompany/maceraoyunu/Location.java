/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.maceraoyunu;

import java.util.Scanner;

/**
 *
 * @author Furkan Çetiner
 */
public abstract class Location extends Game {
    protected Player player;
    protected String name;
    
    Scanner scan= new Scanner(System.in);
    
    Location(Player player){
    this.player=player;
    }
    
    public abstract boolean getLocation();
        
        
    

    
    
    /**
     * @return the player
     */
    public Player getPlayer() {
        return player;
    }

    /**
     * @param player the player to set
     */
    public void setPlayer(Player player) {
        this.player = player;
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
    
    
}
