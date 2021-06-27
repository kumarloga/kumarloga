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
public class splitword {
    public static void main(String [] arg){
        String sentence="welcome to india";
        String words[]=sentence.split(" ");
        for(String word:words){
        String start=word.substring(0, 1).toUpperCase();
        String mid=word.substring(1,word.length()-1). toLowerCase();
        String end=word.substring(word.length()-1).toUpperCase();
            System.out.println(start+mid+end);
                
                }
    
    }
    
}
