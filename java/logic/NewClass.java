/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kumar
 */
import java.util.*;
public class NewClass {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str=s.next();
        int count=0;
        for(int i=str.length();i>=0;i++)
            count++;
        System.out.println(count);
    }
    
}
