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
import java. util.*;
public class scannerexample {
    public static void main(String []arg){
    int count;
    int i;
    Scanner s=new Scanner(System.in);
    System.out.println("Enter the no courese");
    count=s.nextInt();
    String courseData[][]=new String [count][3];
    
  for( i=0;i<count;i++){
  
      System.out.println("ENTER THE COURSE DETAILS");
      for(int j=0;j<3;j++){
      courseData[i][j]=s.next();
      }
  }
  System.out.println("ENTER THE COURSE NAME TO SEARCH");
  String courseName=s.next();
  
  for( i=0;i<count;i++){
      if(courseName.equals(courseData[i][0]))
      {
     System.out.println("DURATION\n"+courseData[i][1]);
     System.out.println("fee\n"+courseData[i][2]);
     break;
      }
  
  }
   
  if(i==count){
  System.out.println("unaval");
  }
  
    }
    
    }
    
    

