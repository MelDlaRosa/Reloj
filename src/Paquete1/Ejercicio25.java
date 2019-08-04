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
public class Ejercicio25 {
    public static void main (String [] args){
        Scanner entrada = new Scanner(System.in);
      int numero=0;
      System.out.print("El numero es: ");
      numero= entrada.nextInt();
      if (numero % 2 == 0)
        System.out.println("Es Par");
      else
         System.out.println("Es Impar");
              
      
    }
    
}
