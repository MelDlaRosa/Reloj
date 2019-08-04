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
public class Ejercicio70 {
    public static void main (String [] args){
        Scanner entrada= new Scanner (System.in);
        int numerocalificaciones=6;
        int calificacion=0;
        int sumacalificaciones=0;
        int promedio=0;
        int c;
        for(c=1;c<=numerocalificaciones;c++){
            System.out.println("Teclea la calificacion; " + c );
            calificacion= entrada.nextInt();
            sumacalificaciones= sumacalificaciones+calificacion;
   
        }
        promedio=sumacalificaciones/numerocalificaciones;
        System.out.println("El promedio es " + promedio);
        
         if(promedio>=90 && promedio<=100){
       System.out.println("El rango es: A");
         }
       if(promedio>=80 && promedio<=89){
       System.out.println("El rango es: B");
       }
       if(promedio>=60 && promedio<=79){
       System.out.println("El rango es: C");
       }
       if(promedio>=50 && promedio<=59){
       System.out.println("El rango es: D");
       }
       if(promedio<=49){
       System.out.println("El rango es: E   ");
       }
    }
}

