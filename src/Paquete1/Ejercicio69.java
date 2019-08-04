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
public class Ejercicio69 {
    public static void main (String [] args){
        Scanner entrada= new Scanner (System.in);
        double numerocalificaciones=0;
        double calificacion=0;
        double sumacalificaciones=0;
        double promedio=0;
        int c;
        System.out.print("EL numero de calificaciones es: ");
        numerocalificaciones= entrada.nextDouble();
        for(c=1;c<=numerocalificaciones;c++){
            System.out.println("Teclea la calificacion; " + c );
            calificacion= entrada.nextDouble();
            sumacalificaciones= sumacalificaciones+calificacion;
            
        }
        promedio=sumacalificaciones/numerocalificaciones;
            System.out.println("El promedio es " + promedio);
    }
    
}
