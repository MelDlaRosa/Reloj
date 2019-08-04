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
public class Ejercicio26 {
    public static void main (String [] args){
        Scanner entrada = new Scanner(System.in);
        int numero1=0;
        int numero2=0;
        System.out.print("El numero 1 es: ");
        numero1= entrada.nextInt();
        System.out.print ("El numero 2 es: ");
        numero2= entrada.nextInt();
        if (numero1 == numero2)
            System.out.println("Los numeros son iguales");
        else
            System.out.println("Los numeros no son iguales");

        
    }
            
    
}
