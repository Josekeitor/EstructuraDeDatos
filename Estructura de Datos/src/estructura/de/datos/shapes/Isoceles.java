/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructura.de.datos.shapes;

/**
 *
 * @author JC
 */
public class Isoceles extends Triangle {
    private double side;
    /**
     * @return the side
     */
    public double getSide() {
        return side;
    }

    /**
     * @param side the side to set
     */
    public void setSide(double side) {
        this.side = side;
    }
    
    @Override
    public double calculateArea() {
        return (getBase()*getHeight())/2;
    }

    @Override
    public double calculatePerimeter() {
        return (getSide()*2)*getBase();
    }
    
    
    
}
