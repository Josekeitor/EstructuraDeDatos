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
public class Scalene extends Triangle{
    private double side;
    private double side1;
    private double side2;
    
    public Scalene(double side, double side1, double side2){
        setSide(side);
        setSide1(side1);
        setSide2(side2);
    }
    
    @Override
    public double calculateArea() {
        double p =calculatePerimeter();
        return(Math.sqrt(p*(p-getSide())*(p-getSide1())*(p-getSide2())));
    }

    @Override
    public double calculatePerimeter() {
        return(getSide()+getSide1()+getSide2());
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

    /**
     * @return the side1
     */
    public double getSide1() {
        return side1;
    }

    /**
     * @param side1 the side1 to set
     */
    public void setSide1(double side1) {
        this.side1 = side1;
    }

    /**
     * @return the side2
     */
    public double getSide2() {
        return side2;
    }

    /**
     * @param side2 the side2 to set
     */
    public void setSide2(double side2) {
        this.side2 = side2;
    }
    
    
    
}
