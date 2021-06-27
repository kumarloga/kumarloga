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
public class series {
    static void fseries( int t1,int t2){
        for(int i=1;i<=10;i++){
        int sum=t1+t2;
    t1=t2;
    t2=sum;
            System.out.print(sum+",");
        }
    }
    public static void main(String []arg){
  Scanner s=new Scanner (System.in); 
        System.out.println("enter t1");
        int t1=s.nextInt();
        System.out.println("enter t2");
        int t2=s.nextInt();
        new series().fseries(t1,t2);
    }
    
}
