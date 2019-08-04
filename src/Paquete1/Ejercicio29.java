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
public class Ejercicio29 {
    public static void main (String [] args){
        Scanner entrada = new Scanner(System.in);
        int numero1=0;
        int numero2=0;
        int numero3=0;
        System.out.print("El numero 1 es: ");
        numero1= entrada.nextInt();
        System.out.print("El numero 2 es: ");
        numero2= entrada.nextInt();
        System.out.print("El numero 3 es: ");
        numero3= entrada.nextInt();
        if (numero1> numero2 && numero1> numero3)
            System.out.println("Numero 1 es mayor que numero 2 y numero 3");
        if (numero2> numero1 && numero2> numero3)
            System.out.println("Numero 2 es mayor que numero 1 y numero 3");
        if (numero3> numero2 && numero3> numero1)
            System.out.println("Numero 3 es mayor que numero 1 y numero 2");
    }
                
                
    
}
