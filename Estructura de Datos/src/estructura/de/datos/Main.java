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

import estructura.de.datos.shapes.*;

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
                in.nextLine();
                break;
            case"2":
                System.out.println("Dame el radio del círculo: ");
                double radius = in.nextDouble();
                shape = new Circle(radius);
                in.nextLine();
                break;
            case "3":
                System.out.println("Dame la base del rectángulo: ");
                double base = in.nextDouble();
                System.out.println("Dame la altura del rectángulo: ");
                double height = in.nextDouble();
                
                shape = new Rectangle(base, height);
                in.nextLine();
                break;
            case "4":
                System.out.println("¿Qué tipo de triángulo quieres calcular?");
                System.out.println(" ");
                System.out.println("1) Isóceles  2) Equilátero  3) Escaleno");
                String triangleType = in.nextLine();
                
                switch(triangleType){
                    case("1"):
                        System.out.println("Dame la base del triángulo:");
                        double baseIso = in.nextDouble();
                        System.out.println("Dame 1 de los otros lados del triángulo: ");
                        double sideIso = in.nextDouble();
                        shape = new Isoceles(baseIso, sideIso);
                        break;
                    case("2"):
                        System.out.println("Dame un lado del triángulo: ");
                        double sideEqui = in.nextDouble();
                        shape = new Equilateral(sideEqui);
                        break;
                    case("3"):
                        System.out.println("Dame los 3 lados del triángulo separados por un espacio ");
                        
                        String[] sides = in.nextLine().split(" ");
                        shape = new Scalene(Double.parseDouble(sides[0]), Double.parseDouble(sides[1]), Double.parseDouble(sides[2]));
                        break;
                    default:
                        System.out.println("Dame la base del triángulo:");
                        double baseIsoDefault = in.nextDouble();
                        System.out.println("Dame 1 de los otros lados del triángulo: ");
                        double sideIsoDefault = in.nextDouble();
                        shape = new Isoceles(baseIsoDefault, sideIsoDefault);
                        break;
                    
                }
                break;
            default:
                System.out.println("Dame el lado del cuadrado: ");
                double side1 = in.nextDouble();
                
                shape = new Square(side1);
                break;
        }
        
        System.out.println("¿Que deseas calcular?   1) Perímetro     2) Área");
        
        String selectedCalc = in.nextLine();
        
        
        switch(selectedCalc){
            case "1":
                System.out.println(" ");
                System.out.println("Resultado: "+ shape.calculatePerimeter());
                System.out.println(" ");
                break;
            case "2":
                System.out.println(" ");
                System.out.println("Resultado: "+ shape.calculateArea());
                System.out.println(" ");
                break;
                
        }
        
        selectedOption = askShape(in);
    }
        
        
        
        in.close();
        
    }
    
    public static String askShape(Scanner in){
        System.out.println("Elige la figura: 1) Cuadradado   2) Círculo  3) Rectángulo 4) Triángulo  o bien 0) D"
                + "etener el programa");
        String option = in.nextLine();
        return option;
    }
}
