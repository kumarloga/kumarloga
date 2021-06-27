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
public class atm {
    int pinno,avaibal,amount,withdraw;
    long  accountno;
    String bankname,location,accountholder;
    static int availableamount=20000;
    void getdetails(){
        Scanner s=new Scanner(System.in);
        System.out.println("ENTER THE BANK NAME");
        bankname=s.next();
        System.out.println("ENTER THE BANK LOCATION");
        location=s.next();
        System.out.println("ENTER THE ACCOUNT HOLDER NAME");
        accountholder=s.next();
         System.out.println("ENTER THE ACCOUNT NO.");
        accountno=s.nextInt();
         System.out.println("ENTER THE PIN NO.");
        pinno=s.nextInt();
         System.out.println("ENTER THE AMOUNT WITHDRRAW");
        amount=s.nextInt();
        
    
    }
    void calculation(){
    if(pinno==1234){
    withdraw=availableamount-amount;
        //System.out.println("withdraw="+withdraw);
        
    }
    if(pinno!=1234){System.out.println("INCORRECT PASSWORD");}
    if(amount>20000){
        System.out.println("INSUFFICIENT BALANCE");}
    }
    void display(){
        System.out.println("\t\t\tVANDU MURUGAN  ATM\n\t\t\t-------------------------");
        System.out.println("BANKNAME="+bankname);
        System.out.println("ACCOUNT HOLEDER NAME"+accountholder);
        //System.out.println("");
        System.out.println("AVAILABLE BALANCE="+withdraw); 
        System.out.println("WITHDRAW AMOUNT"+amount);
        System.out.println("\n\t\t\t haann haann po pooo pooo");
    

    }
    public static void main(String [] arg){
    atm obj=new atm();
    obj.getdetails();
    obj.calculation();
    obj.display();
    }
    
    
    
}





