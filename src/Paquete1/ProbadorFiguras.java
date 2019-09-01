/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paquete1;

/**
 *
 * @author JARLES
 */
public class ProbadorFiguras {
    public static void main (String [] args){
        Cuadrado objeto1= new Cuadrado();
        
        Cuadrado objeto2= new Cuadrado();
        
        Rectangulo objeto3= new Rectangulo();
        
        Rectangulo objeto4= new Rectangulo();
        
        Triangulo objeto5= new Triangulo();
       
        Triangulo objeto6= new Triangulo();
        
        Circulo objeto7= new Circulo();
        
        Circulo objeto8= new Circulo();
        
        
        System.out.println("El perimetro del cuadrado es: "  + objeto1.perimetro());
        System.out.println("El perimetro del triangulo es: " + objeto6.perimetro());
       System.out.println("El perimetro del circulo es: " + objeto7.perimetro());
       System.out.println("El perimetro del rectangulo:" + objeto4.perimetro());
        System.out.println("El num de lados del cuadrado:" + objeto2.lados());
        System.out.println("El numero de lados del triangulo: "  +  objeto5.lados());
        System.out.println("El area del Rectangulo:"+ objeto3.area());
        System.out.println("El area del Circulo es:" + objeto8.area());
        
    }
    
}
