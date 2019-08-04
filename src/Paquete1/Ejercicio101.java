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
public class Ejercicio101 {
    public static void main (String [] args){
        Scanner entrada = new Scanner(System.in);
        int calificaciones=0;
        int suma= 0;
        int promedio=0;
        int [][] matriz;
        matriz= new int [5][6];
         for(int i=0;i<5;i++){
            for(int j=0; j<6; j++){
                System.out.println("Inserte la calificación: " + " "+(j+1) + " " + "del alumno " + " " + (i+1));
                matriz [i][j]= entrada.nextInt();
                suma=suma+matriz[i][j];
                suma=promedio;
            }
            promedio=promedio/5;
            }
       for(int i=0; i<5; i++){
           System.out.print("Alumno" +" " + (i+1)+" ");
           for(int j=0; j<5; j++){
               System.out.print( "calificaciones" + " " + matriz[i][j]+ "\t");
           }
           System.out.println();
       }
       for(int j=0; j<6; j++){
               System.out.print("promedio" + " " + matriz[4][j]+ "\t");
           }
        }
        
    }
