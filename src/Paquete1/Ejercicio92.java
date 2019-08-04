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
public class Ejercicio92 {
    public static void main (String [] args){
        Scanner entrada = new Scanner(System.in);
        double [] calificaciones;
        double suma=0;
        calificaciones = new double[6];
        for (int x=0; x<6; x++){
            System.out.println("Inserte la calificación: " + (x+1));
            calificaciones[x]= entrada.nextDouble();             
        }
        System.out.println("Las calificaciones son: ");
        System.out.println (calificaciones [0]);
        System.out.println(calificaciones [1]);
        System.out.println(calificaciones [2]);
        System.out.println(calificaciones [3]);
        System.out.println(calificaciones [4]);
        System.out.println(calificaciones [5]);
        suma=calificaciones[0]+calificaciones[1]+calificaciones[2]+calificaciones[3]+calificaciones[4]+calificaciones[5];
        System.out.println("El promedio es: " + (suma/6));
    }
    
}
