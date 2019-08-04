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
public class Ejercicio85 {
    public static void main (String [] args){
        Scanner entrada = new Scanner(System.in);
        int numerocalificaciones=6;
        int calificacion=0;
        int promedio=0;
        int suma=0;
        int c;
        for (c=1; c<=numerocalificaciones; c++){
            System.out.println("Teclea la calificación");
            calificacion = entrada.nextInt();
            suma=suma+calificacion;
        }
        promedio=suma/numerocalificaciones;
        System.out.println("El promedio es: " + promedio);
        switch (promedio){
            case 10:
                System.out.println("Excelente");
                break;
        case 9:
                System.out.println("Muy Bien");
                break;
        case 8:
                System.out.println("Bien");
                break;
        case 7:
                System.out.println("Regular");
                break;
        case 6:
                System.out.println("Puedes Mejorar");
                break;
        default:
            System.out.println("Reprobado");
    }
    }
}
