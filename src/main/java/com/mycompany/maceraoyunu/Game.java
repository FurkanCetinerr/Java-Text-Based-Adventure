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
public class Game {
    Player player;
    Location location;
    Scanner scan =new Scanner(System.in);
            
    Game(){
       
    }
    public void login(){
         Scanner scan =new Scanner(System.in);
            
        System.out.println("Macera oyununa hoşgeldiniz !");
        System.out.print("Lütfen isminizi giriniz :");
        String playerName= scan.nextLine();
        player =new Player(playerName);
        player.selectCha();
        start();
    }
public void start(){
    while(true){
    System.out.println();
    System.out.println("----------------------------------------------");
    System.out.println();
    System.out.println("Eylem gerçekleştirmek için bir yer seçiniz : ");
    System.out.println("1- Güvenli Ev --> Size ait güvenli bir mekan, düşman yok ! ");
    System.out.println("2- Mağara --> Karşınıza belki zombi çıkabilir ! ");
    System.out.println("3- Orman --> Karşınıza belki vampir çıkabilir ! ");
    System.out.println("4- Nehir --> Karşınıza belki ayı çıkabilir ! ");
    System.out.println("5- Mağaza --> Silah veya zırh satın alabileceğiniz bir satıcı ! ");
    System.out.print("Gitmek istediğiniz yer: ");
    int selectLoc=scan.nextInt();
    while(selectLoc < 0 ||  selectLoc > 5){
        System.out.println("Lütfen geçerli bir değer giriniz ! ");
        selectLoc=scan.nextInt();
    }
    switch(selectLoc){
        
        case 1:
            location= new SafeHouse(player);
            break;
        case 2:
            location= new Cave(player);
            break;
        case 3:
            location= new Forest(player);
            break;
        case 4:
            location= new River(player);
            break;
        case 5:
            location= new ToolStore(player);
            break;    
        default :
            location= new SafeHouse(player);
            
    }
        
        if(location.getName() == "Güvenli Ev"){
            if(player.getInventory().isFirewood() && player.getInventory().isFood() && player.getInventory().isWater()){
                System.out.println("Tebrikler Oyunu Kazandınız !");
                break;
            }
    }
        if(!location.getLocation()){
             System.out.println("Oyun bitti !");
                break;
   }
    }
}
    
    
    
    
    
    
    
    
    
    
    
    
    
}
