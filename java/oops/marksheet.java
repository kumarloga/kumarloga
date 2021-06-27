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
//public class marksheet {
    
class Student{
 String name;
int age,mat,phy,chem,avg,tot;
static String college;
static int fee;
 void getDetails(){
Scanner s=new Scanner(System.in );
 System.out.println("NAME");
name=s.next();
System.out.println("AGE");
age=s.nextInt();
System.out.println("ENTER THE MARKS");
phy=s.nextInt();
chem=s.nextInt();
mat=s.nextInt();

}
void calculation(){
tot=phy+chem+mat;
avg=tot/3;

}
void display(){
System.out.println("\t\t\t\tPONDICHERRY UNIVERCITY\nNAME="+name+"\nAGE="+age+"\nINSTITUTION="+college+"\n\n\tSubject\t\t\t\tMARK\n\t");
        System.out.println( "\tPHYSIS\t\t\t\t"+phy+"\t\t\t\t\t\t\t\n\tCHEMSTRY\t\t\t"+chem+"\t\t\t\t\n\tMATHS\t\t\t\t"+mat);
System.out.println("\n\nTOTAL\t\t"+tot);
System.out.println("AVERAGE\t\t"+avg);
if(phy>=35&&chem>=35&&mat>=35){
    System.out.println("sussesfully compleyted");}
    else
    
            System.out.println("better luck nexg time");}


public static void main(String []arg){
    college="Pondicherry Engineering college";
    fee=15000;
    Student obj=new Student();
    obj.getDetails();
    obj.calculation();
obj.display();

}
}
    

