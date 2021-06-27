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
public class equation {
   equation(int a,int b,int c,int y,int x ){
       Scanner s=new Scanner (System.in);
   
//       System.out.println("enter the A value");
//        a=s.nextInt();
//        System.out.println("enter the b value");
//        b=s.nextInt();
//        System.out.println("enter the c value");
//        c=s.nextInt();
//        System.out.println("enter the y value");
//        y=s.nextInt();
//        System.out.println("enter the x value");
//        x=s.nextInt();
//   h
    int e=a*x;
   int  f=b*y;
    int g=c-e;
    int sum=g/f;
       System.out.println(sum);
   } 
   public static void main (String [] arg){
   
      equation a=new equation(2,3,10,1,2);
       
    
     
   }
    
}
