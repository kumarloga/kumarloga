/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javabasics;

class One{
int a=5;

}
class Two extends One{
void Square(){
    System.out.println("square="+Math.pow(a, 2));
}
}
class Three extends One{
void Cube(){
    System.out.println("cube"+Math.pow(a, 3));
}    

}
public class hirarchical {
    public static void main(String[] args) {
        Two obj=new Two();
        obj.Square();
       
       
      Three c=new Three();
       c.Cube();
    }
    
}
