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
public class Ejercicio6 {
    public static void main(String [] args) {
        Scanner entrada = new Scanner(System.in);
        int    Lado1=0;
        int    Perimetro=0;
        int    Area=0;
        System.out.print ("El valor del lado es");
        Lado1 = entrada.nextInt();
        Perimetro= Lado1 + Lado1 + Lado1 + Lado1;
        System.out.print ("El perimetro es" + Perimetro);
        Area= Lado1*Lado1;
        System.out.print ("El area es" + Area);
        
   
          
    }
}
