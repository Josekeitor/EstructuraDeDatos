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
public class Circle extends Shape{
    
    private double radius;
    
    public Circle(double r){
        setRadius(r);
    }

    /**
     * @return the radius
     */
    public double getRadius() {
        return radius;
    }

    /**
     * @param radius the radius to set
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
       return Math.PI*radius*radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2* Math.PI * radius;
    }
    
    
    
}
