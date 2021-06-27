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
public class cartoops {
    String product,nameofpoduct,webname,company,price,cart;
    void listproduct(){
        Scanner s=new Scanner (System.in);
    int product;
        System.out.println("ENTER THE WEBSITE NAME");
        webname=s.next();
  
        System.out.println("ENTER THE TOTAL NUMBER OF PRODUCT");
        product=s.nextInt();
        String productData[][]=new String [product][3];
        
        for(int i=0;i<product;i++){
            System.out.println("ENTER THE PRODUCT DETAILS");
        for(int j=0;j<3;j++){
            productData[i][j]=s.next();
    }
    }
        
    }
    
    void calculate(){
    
    
    }
    
    
    
    
}
