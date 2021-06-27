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
public class age {
    static int displayage(int b,int c){
       int a =b-c;
       return a;
        //System.out.println( a);
    }
    static public void main(String []arg){
        
        
       
    Scanner s=new Scanner(System.in);
        System.out.println("enter your brithyear");
       int  b=s.nextInt();
        System.out.println("enter your currentyear");
       int    c=s.nextInt();
        
        new age().displayage(b,c);
    }
}
