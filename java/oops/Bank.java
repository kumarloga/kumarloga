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
public class Bank {
    String user,name,type,bankname,ifsc,current,savings,yes;
    int accountbalance,pin,withdraw,deposit;
    long accountnumber;
    
    void createaccount(){
        Scanner s=new Scanner (System.in);
        System.out.println("ENTER THE BANK NAME");
        bankname=s.next();
        System.out.println("ENTER THE ACCOUNT HOLDER NAME");
        name=s.next();
        System.out.println("ENTER YOUR IFSC CODE");
        ifsc=s.next();
        System.out.println("ENTER YOUR ACCOUNT NUMBER");
        accountnumber=s.nextLong();
        System.out.println("ENTER YOUR ACCOUNT TYPE");
        type=s.next();
       
    } 
    
    void deposit(){
       
        Scanner s=new Scanner(System.in);
        System.out.println("ENTER YOUR ACCOUNT NO.");
                accountnumber=s.nextLong();
        System.out.println("ENTER YOUR PIN NO");
        pin=s.nextInt();
    if(accountnumber==this.accountnumber &&pin==this.pin){    
    System.out.println("DEPOSIT YOUR AMOUNT");
     deposit=s.nextInt();
     accountbalance+=deposit;
    }
    }
    void withdraw(){
        
    Scanner s=new Scanner(System.in);
        System.out.println("ENTER YOUR PIN NO.");
        pin=s.nextInt();
    if(pin==this.pin){
        System.out.println("ENTER YOUR WITHDRAW AMOUNT");
    withdraw=s.nextInt();
    if(accountbalance>withdraw)
    accountbalance=accountbalance-withdraw;
    else
      System.out.println("INSIFFICIENT BALANCE");  
    }
   
        
    
    
    }
    void balanceenqurie(){
  Scanner s=new Scanner(System.in);
        System.out.println("ENTER YOUR PIN NO.");
        pin=s.nextInt();
        if(pin==this.pin){
        System.out.println("YOUR AVILABLE BALANCE="+accountbalance);
        }
        
        System.out.println("YOUR TRANS="+withdraw);
    }
    public static void main(String []arg){
        String yes,user;        
        
    Scanner s=new Scanner (System.in);
    Bank obj=new Bank();    
    for(int i=0;i<5;i++){
    System.out.println("ARE YOU NEW USER? OR OLD USER?");
        
       
        
        user=s.next();
        if(user.equals("yes")){
        obj.createaccount();        
                }
        else
        {if(obj.accountnumber==0){
                    System.out.println("INVALID OPTION");
        }
        else
        {System.out.println("press 1 for withdraw");
            System.out.println("press 2 for deposit");
            System.out.println("press 3 for balance enqurie");
                int option=s.nextInt();
                if(option==1){
                obj.withdraw();
                }
                else if(option==2){
                obj.deposit();
                
                }
                else if(option==3){
                
                obj.balanceenqurie();
                }
                else
                {System.out.println("INVAILD OPTION");}
                }
        }
        }
       
        
        
    
    }
}
