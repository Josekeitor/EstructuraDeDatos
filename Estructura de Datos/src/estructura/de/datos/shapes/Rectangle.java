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
public class Rectangle extends Shape {
    private double base;
    private double height;

    public Rectangle(double base, double height){
        setHeight(height);
        setBase(base);
    }
    
    /**
     * @return the base
     */
    public double getBase() {
        return base;
    }

    /**
     * @param base the base to set
     */
    public void setBase(double base) {
        this.base = base;
    }

    /**
     * @return the height
     */
    public double getHeight() {
        return height;
    }

    /**
     * @param height the height to set
     */
    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return getBase() * getHeight();
    }

    @Override
    public double calculatePerimeter() {
        return (getBase()*2) + (getHeight()*2); 
    }
    
    
    
}
