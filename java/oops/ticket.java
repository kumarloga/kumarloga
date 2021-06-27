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
public class ticket {
    public static void main(String arg[]){
    Scanner s=new Scanner(System .in);
    int movie;
    int movieSeats;
    String n="120";
    int i;
    System.out.println("ENTER THE TOTAL NUMBER OF MOVIE");
    movie=s.nextInt();
    String movieData[][]=new String [movie][3];
    
    
     for(i=0;i>movie;i++){
        System.out.println("ENTER THE MOVIE DATA");
    for(int j=0;j<3;j++)
    { movieData[i][j]=s.next();
    }
   
    }
    System.out.println("ENTER THE MOVIE TO SEARCH");
    String movieName=s.next();
    for(i=0;i<movie;i++){
    if(movieName.equals(movieData[i][0]));{
    System.out.println("SHOW TIME\t"+movieData[i][1]);
    System.out.println("ENTER THE NUMBER OF SEAT");
     movieSeats=s.nextInt();
    if( Integer.toString(movieSeats).equals(movieData[i][2])){
       int x=Integer.parseInt(n);
    System.out.println("TOTAL AMOUNT "+movieSeats*x);
    }
    else{System.out.println("not avil");
            }
    }
    
    
    
    }
}


}