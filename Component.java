/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HAR18137997
 */
public class Component {
    private String name;
    private String make;
    private int price = 1;
    
    // constructor requires 3 parameters
    public Component(String strName, String make, int intPrice){
    name = strName;
    this.make = make;
    price = intPrice;
    } // constructor
    
    public Component(){
    name = "Unknown";
    this.make = "Unknown manufacturer";
    } // Constructor
    
    public String getName(){
    return name;
    } //getName
    
    public void setName(String strName){
    this.name = strName;
    }//setName
    
    public String getMake(){
    return make;
    }//getMake
    
    public int getPrice(){
    return price;
    }//getPrice
    
    public void setPrice(int price){
    this.price = price;
    }//setPrice
    
    public String noise(){
    return "The name of the product is: " + name;
    }//noise
    
    public String details(){
    return name + "\n" + make + "\n" + price;
    }//details
    
    public String Compare(Component otherComponent) {
    return name + " is different than " + otherComponent.getName() + "\n";
    }//compare
    
} // end of class
