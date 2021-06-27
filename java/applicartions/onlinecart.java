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
public class onlinecart {
    public static void main (String arg[]){
    Scanner s=new Scanner (System.in);
    int product;
        System.out.println("ENTER THE TOTAL NUMBER OF PRODUCT");
        product=s.nextInt();
        String productData[][]=new String [product][3];
        
        for(int i=0;i<product;i++){
            System.out.println("ENTER THE PRODUCT DETAILS");
        for(int j=0;j<3;j++){
            productData[i][j]=s.next();
    }
    }
    
        System.out.println("ENTER PRODUCT NAME TO BUY");
       
        String productName=s.next();
        
        
        
        for(int i=0;i<product;i++){
        if(productName.equals(productData[i][0])){
        
            System.out.println("COMPANEY\t"+productData[i][1]);
            System.out.println("price\t"+productData[i][2]);
        }
        }
}
}
