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
public class Ejercicio39 {
  public static void main (String [] args){
        Scanner entrada = new Scanner(System.in);
        int resistencia1=0;
        int resistencia2=0;
        int resistencia3=0;
        int resistenciasuma=0;
        int intensidadtotal=0;
        System.out.print("El valor de la resistencia 1 es: ");
        resistencia1= entrada.nextInt();
        System.out.print("El valor de la resistencia 2 es: ");
        resistencia2= entrada.nextInt();
        System.out.print("El valor de la resistencia 3 es: ");
        resistencia3= entrada.nextInt();
        resistenciasuma= (resistencia1) + (resistencia2) + (resistencia3); 
        System.out.println("La suma de resistencias es: " + resistenciasuma);
        intensidadtotal= 15/resistenciasuma;
        System.out.println("La intensidad total es: " + intensidadtotal);
        
        
  }
}
