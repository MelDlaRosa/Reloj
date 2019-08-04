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
public class Ejercicio94 {
    public static void main (String [] args){
        Scanner entrada = new Scanner (System.in);
        int calificaciones=0;
        int suma= 0;
        int promedio=0;
        System.out.println("Inserte el numero de calificaciones: ");
        calificaciones= entrada.nextInt();
        int [] valor;
        valor = new int [calificaciones];
        for(int x=0; x<calificaciones; x++){
            System.out.println ("Ingrese la calificación: " + (x+1));
            valor[x]= entrada.nextInt();
            suma=suma+valor[x];
        }
        
        
       
       promedio=suma/calificaciones;
       System.out.println("El promedio es: "+ promedio);
       
    }
}
