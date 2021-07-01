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

public enum Fabric {
    
    WOOL(2), COTTON(2), POLYESTER(0.50), 
    RAYON(0.50), LINEN(2.5), CASHMERE(3), SILK(5);
        
    double price;
        
    Fabric(double p){
        price = p;
    }

    public double getPrice() {
        return price;
    }
    
    
    
    
}
