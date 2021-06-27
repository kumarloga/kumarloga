
package javabasics;
import java.util.*;

public class basic {
    public static void main(String []arg){
    Scanner s=new Scanner (System.in);
    int stock;
    System.out.println("Enter the  total number of stock ");
    stock=s.nextInt();
    String stockData[][]=new String[stock][2];
    for (int i=0 ;i<stock;i++ ){
    System.out.println("Enter the stock details" );
    for (int j=0;j<2;j++){
    stockData[i][j]=s.next();
    
    }
    }System.out.println("Enter the product name to search");
    String productName=s.next();
    for ( int i=0;i<stock;i++){
    if (productName.equals(stockData[i][0])){
    System.out.println(productName+"\t\t"+stockData[i][1]);
    
    }
    }
   
        System.out.println("1.ADD TO CART");
        System.out.println("2.REMOVE FROM CART");
        
    product obj=new product();
            int option=s.nextInt();

            if (option == 1) {
                ();
            }
            else if (option == 2) {
                ();
            }
            else if (option == 3) {
                ();
            } 
          
            else {
                System.out.println("Error. Please choose again.");
            }
           
    }
    
    
}
