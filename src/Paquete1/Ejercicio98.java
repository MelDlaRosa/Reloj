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
public class Ejercicio98 {
   public static void main (String [] args){
   Scanner entrada = new Scanner(System.in);
   int arreglo[];
   int calificaciones=0;
   int aux;
   System.out.println("Numero de Calificaciones; ");
   calificaciones= entrada.nextInt();
   arreglo = new int [calificaciones];
   for (int i=0; i<calificaciones;i++){
       System.out.println("Inserte la calificacion" + " " + (i+1));
       arreglo[i]= entrada.nextInt();
   }
     for (int i=0; i<(calificaciones-1);i++){
         for(int j=0; j<((calificaciones-1));j++){
             if(arreglo[j]>arreglo[j+1]){
                 aux = arreglo[j];
                 arreglo[j] = arreglo [j+1];
                 arreglo[j+1] = aux;
             }
         }
     }
     System.out.println("Calificaciones en orden descendente; ");
     for(int i=(calificaciones-1); i>=0;i--){
         System.out.println(arreglo[i]);
     }
     System.out.println("");
    } 
}

