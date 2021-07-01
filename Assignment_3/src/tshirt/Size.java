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
public enum Size {

    XS(0), S(0), M(0), L(0), XL(0), XXL(0.5), XXXL(0.5);

    double price;
        
    Size(double p){
        price = p;
    }

    public double getPrice() {
        return price;
    }
    
    
    
    
}
