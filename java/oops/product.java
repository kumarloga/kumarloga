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

public class product {

    public static Scanner keyboard = new Scanner(System.in);
    public static boolean stay = true;


     void stock() {
        System.out.println("ADD CART");
        Scanner s=new Scanner (System. in);
        int product;
         System.out.println("ENTER THE TOTAL NO OF PRODUCT");
         product=s.nextByte();
         String productData[][]=new String [product][3];
         
         for(int i=0;i<product;i++){
         
             System.out.println("ENTER THE PRODUCT DETAIL");
             
         
               for(int j=0;j<2;j++){
             productData[i][j]=s.next();
         }
        
         }
        
        
        
        
        
    }
     void billing(){
     
     if(productData)
     }

     void removecart() {
        System.out.println("REMOVE CART");
    }

     void viewcart() {
        System.out.println("VIEW CART");
    }

    


    public static void main(String[] args) {

        Scanner s=new Scanner (System.in);    

    

            System.out.println("ONLINE SHOPPING");
            System.out.println();

            System.out.println("1. ADD PRODUCT TO Order");
            System.out.println("2. REMOVE PRODUCT FROM ORDER");
            System.out.println("3. VIEW YOUR ORDER");
        
        
            System.out.print("Please enter your choice: ");

            product obj=new product();
            int option=s.nextInt();

            if (option == 1) {
                obj.stock();
            }
            else if (option == 2) {
                obj.removecart();
            }
            else if (option == 3) {
                obj.viewcart();
            } 
          
            else {
                System.out.println("Error. Please choose again.");
            }
           
        }

    }
  

