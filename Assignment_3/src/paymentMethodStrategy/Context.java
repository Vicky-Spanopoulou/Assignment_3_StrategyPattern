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
public class Context {
    
    private final Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }
    
    public double executeStrategy(Tshirt tshirt){
        return strategy.calculatePrice(tshirt);
    }
    
}
