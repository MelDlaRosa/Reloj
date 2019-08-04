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
public class Ejercicio30 {
   public static void main (String [] args){
        Scanner entrada = new Scanner(System.in); 
        double hora=0;
        System.out.print ("La hora es: ");
        hora= entrada.nextDouble();
        if (hora <= 11.59)
            System.out.println("Buenos dias");
        if (hora >=12.00 && hora <= 18.59)
            System.out.println("Buenas tardes");
        if (hora >=19.00 && hora <= 24.00)
            System.out.println("Buenas noches");
        
   }
            
}
