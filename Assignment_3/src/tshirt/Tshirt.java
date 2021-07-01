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
public class Tshirt {
    Color color;
    Size size;
    Fabric fabric;
    
    
    public Tshirt() {
    }

    public Tshirt(Color color, Size size, Fabric fabric) {
        this.color = color;
        this.size = size;
        this.fabric = fabric;
    }

    public Color getColor() {
        return color;
    }

    public Size getSize() {
        return size;
    }

    public Fabric getFabric() {
        return fabric;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("color: ").append(color);
        sb.append("\nsize: ").append(size);
        sb.append("\nfabric: ").append(fabric);
        return sb.toString();
    }

   
    
  
    
    
    
}//end of class Tshirt

