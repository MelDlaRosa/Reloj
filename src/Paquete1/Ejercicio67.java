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
public class Ejercicio67 {
    public static void main (String [] args){
        Scanner entrada = new Scanner(System.in);
        int numero1=0;
        int numero2=1;
        System.out.println("El numero es: ");
                 numero1=entrada.nextInt();
     do{
         
                 System.out.println(numero1*numero2);
        numero2=numero2+1;
     }while(numero2<=10);
    }
    
}
