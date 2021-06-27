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
public class ticketbooking {
    public static void main(String []arg){
    int movies;
    
    int i;
    Scanner s=new Scanner(System.in);
    System.out.println("Enter the number movies");
    movies=s.nextInt();
    String movieData[][]=new String [movies][3];
    
  for( i=0;i<movies;i++){
  
      System.out.println("ENTER THE SHOW DETAILS");
      
      for(int j=0;j<3;j++){
        //System.out.println("enter the no.seta");  
      movieData[i][j]=s.next();
      }
  }
  System.out.println("ENTER THE MOVIE NAME");
  String courseName=s.next();
 
  
  
  for( i=0;i<movies;i++){
      if(courseName.equals(movieData[i][0]))
      {
     System.out.println("time\n"+movieData[i][1]);
     String seat= s.next();
   if(seat.equals(movieData[i][2])){
       
   }
     break;
      }
  
  } 
  if(i==movies){
  System.out.println("unaval");
  }
  
    }
    
    }
    
    
    

