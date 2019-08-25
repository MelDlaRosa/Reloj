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
        objeto1.perimetro= 8;
        Cuadrado objeto2= new Cuadrado();
        objeto2.lados=4;
        Rectangulo objeto3= new Rectangulo();
        objeto3.area=20;
        Rectangulo objeto4= new Rectangulo();
        objeto4.formula="base*altura";
        Triangulo objeto5= new Triangulo();
        objeto5.lados=3;
        Triangulo objeto6= new Triangulo();
        objeto6.perimetro=6;
        Circulo objeto7= new Circulo();
        objeto7.perimetro= 18;
        Circulo objeto8= new Circulo();
        objeto8.area= 28;
        
        System.out.println("El perimetro es:" + " " + "cuadrado:" + objeto1.perimetro + " "+ "triangulo" 
        + " "+ objeto6.perimetro +" "+ "circulo: " + objeto7.perimetro);
        System.out.println("El num de lados es:" + "cuadrado:" + objeto2.lados + " "+"triangulo:" +
                objeto5.lados);
        System.out.println("El area es:" + "Rectangulo:"+ objeto3.area +" "+ "Circulo:" + objeto8.area);
        System.out.println("La formula es:" + objeto4.formula);
    }
    
}
