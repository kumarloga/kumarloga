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
public class lastdigit {
    public static void main(String []arg){
    
    int m,n,sum=0;
    Scanner s=new Scanner (System.in);
    System.out.println("enter the number");
    m=s.nextInt();
    if (m!=0){
    n=m%10;
    sum=sum+n;
    m=m/10;
    }
    System.out.println(sum);
    }
    
}
