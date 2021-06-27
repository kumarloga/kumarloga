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
import java.util.*;
public class sentences {
    public static void main(String[] args) {
         String input;
         Scanner s=new Scanner (System.in);
        System.out.println("ENTER YOUR CHOICE OPTION , OR  SPACE ");
        input=s.next();
         String str="PUBG Mobile was banned in India in September 2020. PUBG Mobile patch 1.3 brings new additions to the Erangel map."
                + " The game will kick off Royale Pass Season 18 from March 17";
        StringTokenizer st=new  StringTokenizer(str, ".");
        if(input.equals("sentence")){
       
        while(st.hasMoreTokens()){
            System.out.println(st.nextToken().trim());
        }
        }
            if(input.equals("word")){
               
             st=new StringTokenizer(str, " ");
         while(st.hasMoreTokens()){
            System.out.println(st.nextToken().trim());     
         }
                     }
            
        
    }
}
