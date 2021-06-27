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

public class onlineexam {
    String qustion1,q2,q3,mailid;
    int pass;
Scanner s=new Scanner (System.in);
void login(){
    System.out.println("PLEASE ENTER YOUR EMAIL.ID AND PASSWORD");
    System.out.println("MAIL ID:");
    mailid=s.next();
    System.out.println("PASSWORD:");
    pass=s.nextInt();
    

}
void verification(){
if(mailid.equals("kumar")&&pass==1234){
        System.out.println("LOGIN SUCCESSFULL");
        System.out.println("YOUR TIME :\t\t10min");
    qustions();
    System.out.println("YOUR SUCCESS COMPLITED YOUR EXAM");
    System.out.println("CONGRATULATIONS");
    System.out.println("YOUR RESULT");
    evaluation();
    System.out.println("\n\n\n\t\t\t\t\tTHANK YOU");
}
else 
        System.out.println("YOUR ENTER WRONG PASS OR EMAIL ID");

}

void qustions(){
System.out.println("what is unit of current");
    System.out.println("a)V,\nb)I,\nc)Z");
    qustion1=s.next();
    System.out.println("what is unit of power");
    System.out.println("a)V,\nb)I,\nc)W");
    q2=s.next();
    System.out.println("who is inventing the java prograing");
    System.out.println("a)james gosling ,\nb)jeff bezos,\nc)mark");
    q3=s.next();
    
}
void evaluation(){
    int count=0;
    if(qustion1.equals("a")){
        System.out.println("YOUR ANS IS CORRECT\t"+qustion1);
        count=count+5;
    }
else
        System.out.println("YOUR ANS IS WRONG");
if (q2.equals("a")){
        System.out.println("YOUR ANS IS CORRECT\t"+q2);
        count=count+5;
    }
else
        {System.out.println("YOUR ANS IS WRONG");}
 if(q3.equals("a")){
        System.out.println("YOUR ANS IS CORRECT\t"+q3);
        count=count+5;
    }
else
        {System.out.println("YOUR ANS IS WRONG");}
System.out.println("YOUR SCORE IS "+count);
if(count>10){System.out.println("");}
}

public static void main(String [] arg){
onlineexam s=new onlineexam();

    System.out.println("\t\t\t WELCOM TO ONLINE EXAM");
    s.login();
    
    s.verification();
    
    
    

}




}
