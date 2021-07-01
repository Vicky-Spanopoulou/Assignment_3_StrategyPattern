/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tshirt;

/**
 *
 * @author vicky
 */

public enum Color {
    
    RED(0.50), ORANGE(0.50), YELLOW(0.50), GREEN(0.60), 
    BLUE(0.60), INDIGO(0.60), VIOLET(0.80);

    double price;
        
    Color(double p){
        price = p;
    }

    public double getPrice() {
        return price;
    }
        

       
       
       
}

 
