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
public class Ejercicio3 {
    public static void main (String [] args){
        Scanner entrada = new Scanner(System.in);
        double numero1 = 0;
        double numero2 = 0;
        double numero3 = 0;
        double resultado = 0;
        System.out.print ("Ingresa un numero entero");
            numero1 = entrada.nextDouble();
        System.out.print ("Ingresa un numero entero");
            numero2 = entrada.nextDouble();
        System.out.print ("Ingresa un numero entero");
            numero3 = entrada.nextDouble();
            resultado= numero1 + numero2 + numero3;
        System.out.print ("El resultado es:"  + resultado);
            
            
        
    }
}
