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
public class Ejercicio110 {
    public static void main (String [] args){
        Scanner entrada = new Scanner(System.in);
       String [] arreglo = new String [10];
       for (int j=0; j<5; j++){
           System.out.println ("Ingrese el nombre "+" "+(j+1));
           String nombre= entrada.next();
           arreglo[j]= nombre;
           
       }
         System.out.println("Datos del arreglo: ");
         for (int j=0; j<5; j++){
             System.out.println(""+arreglo[j]);
         }
        
        
    }
}
