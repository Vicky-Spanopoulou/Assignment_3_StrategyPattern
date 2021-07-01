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
public class Credit_Debit_Card implements Strategy{
    
    double cardPrice = 10;

    @Override
    public double calculatePrice(Tshirt ts) {
        double price = cardPrice + ts.getColor().getPrice() 
                                 + ts.getFabric().getPrice() 
                                 + ts.getSize().getPrice();
        return price;
    }
    
    
}
