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
public class aggreturn {
    static void displaySeries(){
    int iteration =5,a=22,b=21;
    String res="";
    for(int i=1;i<=iteration;i++){
        res=res+a+","+b+",";
         a++;
         b++;
       
    }
     System.out.println(res);
    }
    public static void main(String[]main){
    displaySeries();
    
    }
}
