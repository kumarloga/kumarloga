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
public class SplitName {
    public static void main(String[] args) {
        String input;
        Scanner s=new Scanner (System.in);
        System.out.println("ENTER YOUR NAME");
        input=s.nextLine();
        StringTokenizer st=new StringTokenizer(input);
        while(st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }
    }
    
}
