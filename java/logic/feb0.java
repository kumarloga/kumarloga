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
public class feb0 {
public static void main(String []ags){
int n=10,t1=0,t2=1;
    System.out.println("first"+n+"terms");
for(int i=1;i<=n;i++)
{
    System.out.println(t1+",");
    int sum=t1+t2;
    t1=t2;
    t2=sum;
}
}    

}
