/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javabasics;

/**
 *
 * @author kumar
 */
public class encryption {
     public static void main(String [] arg){
         String letter="abcdefghijklmnopqrstuvwxyz";
        String name="hello"; 
        for(int i=0;i<name.length();i++){
         System.out.println(letter.indexOf(name.charAt(i))+1);             
        }
     }
      
    
    
}
