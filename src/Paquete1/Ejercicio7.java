/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paquete1;

import java.util.Scanner;

/**
 *
 * @author mely_
 */
public class Ejercicio7 {
    public static void main(String [] args) {
        Scanner entrada = new Scanner(System.in);
        int Lado1=0;
        int Lado2=0;
        int Perimetro=0;
        int Area=0;
    System.out.print ("El valor del lado 1 es");
    Lado1 = entrada.nextInt();
    System.out.print ("El valor del lado 2 es");
    Lado2 = entrada.nextInt();
    Perimetro= (2*Lado1) + (2*Lado2);
    System.out.print ("El perimetro es" + Perimetro);
    Area= Lado1 * Lado2;
    System.out.print ("El area es" + Area);
            
        
        
    }
    
}
