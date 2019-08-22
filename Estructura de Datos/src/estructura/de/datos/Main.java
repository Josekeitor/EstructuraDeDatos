/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructura.de.datos;

/**
 *
 * @author JC
 */

import estructura.de.datos.shapes.Circle;
import estructura.de.datos.shapes.Shape;
import estructura.de.datos.shapes.Square;
import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        System.out.println("In code we trust");
        Scanner in = new Scanner(System.in);
        
        String selectedOption = askShape(in);
        while(!selectedOption.equals("0")){
            
        
        
        
        Shape shape;
        
        switch(selectedOption){
            case "1":
                System.out.println("Dame el lado del cuadrado: ");
                double side = in.nextDouble();
                
                shape = new Square(side);
                break;
            case"2":
                System.out.println("Dame el radio del círculo: ");
                double radius = in.nextDouble();
                shape = new Circle(radius);
            default:
                System.out.println("Dame el lado del cuadrado: ");
                double side1 = in.nextDouble();
                
                shape = new Square(side1);
                break;
        }
        in.nextLine();
        System.out.println("¿Que deseas calcular?   1) Perímetro     2) Área");
        
        String selectedCalc = in.nextLine();
        
        
        switch(selectedCalc){
            case "1":
                System.out.println("Resultado: "+ shape.calculatePerimeter());
                break;
            case "2":
                System.out.println("Resultado: "+ shape.calculateArea());
                break;
                
        }
        
        selectedOption = askShape(in);
    }
        
        
        
        in.close();
        
    }
    
    public static String askShape(Scanner in){
        System.out.println("Elige la figura: 1) Cuadradado   2) Círculo");
        String option = in.nextLine();
        return option;
    }
}
