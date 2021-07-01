/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainMenu;

import static mainMenu.Tools.payWithBankTrsanfer;
import static mainMenu.Tools.payWithCard;
import static mainMenu.Tools.payWithCash;
import static mainMenu.Tools.tshirtGenerator;
import tshirt.Tshirt;


/**
 *
 * @author vicky
 */
public class Menus {
    public static final String ANSI_CYAN = "\u001B[36m";
    

    public static void printSomeTshirts(int number){
        
        for(int i = 1; i <= number; i++){
            System.out.println(ANSI_CYAN + "----* T-shirt " + i +" *----");
            Tshirt ts = tshirtGenerator();
            System.out.println(ts.toString());
            //payment method
            System.out.println(choosePaymentMethod(ts));
            System.out.println("-----------------------------------\n");
        }
        
    }
    
    public static String choosePaymentMethod(Tshirt ts){
        
        StringBuilder sb = new StringBuilder();
        sb.append("\nPay with:");
        sb.append("\n1. Credit or Debit Card: ").append(payWithCard(ts)).append("€");
        sb.append("\n2. Bank Transfer: ").append(payWithBankTrsanfer(ts)).append("€");
        sb.append("\n3. Cash: ").append(payWithCash(ts)).append("€");
        
        return sb.toString();
    }
    
}
