/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.maceraoyunu;

/**
 *
 * @author Furkan Çetiner
 */
public abstract class NormalLoc extends Location{
    
    public NormalLoc(Player player,String name) {
        super(player);
        this.name=name;
    }
    public boolean getLocation(){
    return true;
    }
    
    
    
}
