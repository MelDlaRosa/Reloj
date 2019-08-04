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
public class Ejercicio91 {
    public static void main (String [] args){
        Scanner entrada = new Scanner(System.in);
        int [] calificaciones;
        calificaciones = new int [3];
        for(int x=0; x<3; x++){
            System.out.println("Ingrese la calificación: " + (x+1));
            calificaciones[x]= entrada.nextInt();
        }
        System.out.println("Las calificaciones son: ");
        System.out.println(calificaciones[0]);
        System.out.println(calificaciones[1]);
        System.out.println(calificaciones[2]);
    }
    
}
