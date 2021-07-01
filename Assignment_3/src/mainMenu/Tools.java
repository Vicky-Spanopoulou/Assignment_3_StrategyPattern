/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainMenu;

import paymentMethodStrategy.Bank_Transfer;
import paymentMethodStrategy.Cash;
import paymentMethodStrategy.Context;
import paymentMethodStrategy.Credit_Debit_Card;
import java.util.Random;
import tshirt.Color;
import tshirt.Fabric;
import tshirt.Size;
import tshirt.Tshirt;

/**
 *
 * @author vicky
 */
public class Tools {
    
    
    public static Tshirt tshirtGenerator(){
        Color c = randomColor();
        Size s = randomSize();
        Fabric f = randomFabric();
        
        Tshirt t = new Tshirt(c, s, f);
        return t;
    }
    
    public static Color randomColor(){
        Random r = new Random();
        Color allColors[] = Color.values();
        int random = r.nextInt(allColors.length);
        Color rColor = allColors[random];
        
        return rColor;
    }
    
    public static Size randomSize(){
        Random r = new Random();
        Size allsizes[] = Size.values();
        int random = r.nextInt(allsizes.length);
        Size rSize = allsizes[random];
        
        return rSize;
    }
       
    public static Fabric randomFabric(){
        Random r = new Random();
        Fabric allFabrics[] = Fabric.values();
        int random = r.nextInt(allFabrics.length);
        Fabric rFabric = allFabrics[random];
        
        return rFabric;
    }
    
    public static double payWithCash(Tshirt ts){
         Context context = new Context(new Cash());
         return context.executeStrategy(ts);
    }
    
    public static double payWithCard(Tshirt ts){
         Context context = new Context(new Credit_Debit_Card());
         return context.executeStrategy(ts); 
    }
    
    public static double payWithBankTrsanfer(Tshirt ts){
        Context context = new Context(new Bank_Transfer());
        return context.executeStrategy(ts);
    }
    
    
}
