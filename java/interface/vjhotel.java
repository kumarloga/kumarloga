
package javabasics;
import java.util.*;
interface Hotel{
void breakfast();
void lunch();
void dinner();
}
class Menu implements Hotel{
public void breakfast(){
    System.out.println("idly=\tRs.5");
    System.out.println("vada=\tRs.10");
    System.out.println("puri=\tRs.10");
}
public void lunch(){
    System.out.println("briyani=\tRs.250");
    System.out.println("meals=\tRs.200");
    
}
public void dinner(){
    System.out.println("chapatti=\tRs.30");
    System.out.println("parotta=\tRs.50");
}
}
public class vjhotel {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in );
        System.out.println("ENTER YOUR OPTION");
        System.out.println("1)BREAKFAST\n2)LUNCH\n3)DINNER");
       int option=s.nextInt();
                if(option==1){
                    System.out.println("breakfast menu");
                new Menu().breakfast();
                }
                else if(option==2){
                    System.out.println("lunch menu");
                new Menu().lunch();
                
                }
                else if(option==3){
                    System.out.println("dinner menu");
                
                new Menu().dinner();
                }
                else
                {System.out.println("INVAILD OPTION");}
                }
    }
    
    

