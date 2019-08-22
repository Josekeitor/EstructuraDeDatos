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
public class Square extends Shape{
    
    private double side;
    
    public Square(double side){
        super();
        setSide(side);
        
    }
   
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
    public double calculatePerimeter() {
        return side*4;
    }

    @Override
    public double calculateArea() {
        return side*side;
    }
    
}
