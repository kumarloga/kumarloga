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
    public class ItemForSale {
  //instance variables
  private String name; //the basic searchable name of the item
  private String description; //longer description to print for the customer
  private int pricePerUnit;
  private int numberOfUnits;  //quantity selected
  
  //constructor method
  public ItemForSale(String n, String d, int p, int q) {
    name = n;
    description = d;
    if (p < 0) {
      throw new IllegalArgumentException("price per unit must be non-negative");
    }
    else {
      pricePerUnit = p;
    }
    if (q <=0) {
      throw new IllegalArgumentException("quantity of item must be positive");
    }
    else {
      numberOfUnits = q;
    }  
  }
  
  //print the item's name and description
  public void printDescription() {
    System.out.println("Item: " + name);
    System.out.println("Description: " + description);
  }
  
  //some "getter" methods
  public String getName() {
    return name;
  }
  
  public String getDescription() {
    return description;
  }
  
  public int getPrice() {
    return pricePerUnit;
  }
  TEST ITEMS STARTER CODE:
/*
 * a test client to work with the ItemForSale class and its objects
 */

import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;

public class TestItems {
  public static void main(String[] args) throws FileNotFoundException {
    Scanner fileScan = new Scanner(new File("items.txt"));
    //read through the text file and create objects for each item with the given info
    //add the items to a "cart", i.e., an ArrayList
    ArrayList<ItemForSale> shoppingCart = new ArrayList<ItemForSale>();
    while (fileScan.hasNext()) {
      //read in the item's name, description, price, and quantity, in that order
      String n = fileScan.nextLine();
      String d = fileScan.nextLine();
      int p = fileScan.nextInt();
      int q = fileScan.nextInt();
      fileScan.nextLine(); //flush the end-of-line character
      ItemForSale item = new ItemForSale(n, d, p, q); //create an ItemForSale object with given info
      shoppingCart.add(item);
    }
    
    //print out all the info from the shopping cart
    //use an enhanced for-loop to step through each ItemForSale object
    for (ItemForSale item : shoppingCart) {
      item.printDescription();
      int cents = item.totalCostOfItem();
      int dollars = cents / 100;
      cents = cents % 100;
      System.out.println("Price per unit: " + item.getPrice() + " cents per unit.");
      System.out.println("Quantity ordered: " + item.getQuantity());
      System.out.println("Total Cost of item: $" + dollars + "." + cents);
    }
    
    fileScan.close();
  }
}

  public int getQuantity() {
    return numberOfUnits;
  }
  
  //returns the total cost of this item at the selected quantity at the price per unit
  //returned value is cost in cents
  public int totalCostOfItem() {
    return pricePerUnit * numberOfUnits;
  }
}
    
}
