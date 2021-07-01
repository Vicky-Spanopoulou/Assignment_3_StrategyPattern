/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paymentMethodStrategy;

import tshirt.Tshirt;

/**
 *
 * @author vicky
 */
public class Cash implements Strategy{

    double cashPrice = 10;
    
    @Override
    public double calculatePrice(Tshirt ts) {
        double price = cashPrice + ts.getColor().getPrice() 
                                 + ts.getFabric().getPrice() 
                                 + ts.getSize().getPrice();
        return price;
    }
    
    
    
}
