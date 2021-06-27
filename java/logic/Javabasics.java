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
public class Javabasics {

    /**
     * @param args the command line arguments z                                                                                       
     */
    public static void main(String[] args) {
        int[] n={1,2,3,4,2,7,8,8,3};
        for(int i=0;i<n.length;i++)
        {
        for(int j=i+1;j<n.length;j++)
            if(n[i]==n[j])
                System.out.println(n[j]);
        }
        // TODO code application logic here
    }
    
}
