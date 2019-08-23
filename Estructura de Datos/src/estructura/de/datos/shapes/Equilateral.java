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
public class Equilateral extends Triangle{
    private double side;
    
    public Equilateral(double side){
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
    public double calculateArea() {
        
       return (getSide()*getHeight())/2;
    }

    @Override
    public double calculatePerimeter() {
        return getSide()*3;
    }
    
    public double getHeight(){
        return((getSide()*Math.sqrt(3))/2);
    }
    
    
    
}
