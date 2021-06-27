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
import java.util.Scanner;
public class scann {
    public static void main (String [] arg){
    int x,y,e;
    Scanner s= new Scanner(System.in);
 System.out.println("ENTER THE FIRST NUMBER");
 x=s.nextInt();
    int sum=0;
    int r=x/100;
    e=x%100;
    y=x%10;
   sum=r+y;
    System.out.println(sum);
      
   
    }
    
    
}
