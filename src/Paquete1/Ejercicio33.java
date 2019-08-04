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
public class Ejercicio33 {
   public static void main (String [] args){
        Scanner entrada = new Scanner(System.in);
        int edad=0;
        System.out.print("La edad de la persona es: ");
        edad= entrada.nextInt();
        if (edad==6 || edad<=12)
            System.out.println("La persona es un niño");
        if (edad==13 || edad<=17)
            System.out.println("La persona es un adolescente");
        if (edad==18 || edad<=59)
            System.out.println("La persona es un adulto");
        if (edad>=60)
            System.out.println("La persona es un adulto mayor");
   }
    
}