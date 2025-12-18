/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.maceraoyunu;

/**
 *
 * @author Furkan Çetiner
 */
public class SafeHouse extends NormalLoc{
    
    
    //@override
    public boolean getLocation(){
        player.setHealthy(player.getrHealthy());
        System.out.println("Sağlığınız Yenilendi !");
        System.out.println("Şuan Güvenli Ev adlı yerdesiniz.");
        return true;
    }
    
    public SafeHouse(Player player) {
        super(player, "Güvenli Ev");
        
        
    }
    
}
