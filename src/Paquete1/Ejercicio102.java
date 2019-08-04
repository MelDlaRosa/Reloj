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
public class Ejercicio102 {
    public static void main (String [] args){
        Scanner entrada = new Scanner(System.in);
        int alumnos=0;
        int suma=0;
        int promedio=0;
        System.out.println("Inserte el numero de alumnos: ");
        alumnos= entrada.nextInt();
        int [][] matriz;
        matriz= new int [alumnos][6];
        for(int i=0; i<alumnos; i++){
            for(int j=0; j<6; j++){
                System.out.println("Inserte la calificación: " + " "+(j+1) + " " + "del alumno " + " " + (i+1));
                matriz [i][j]= entrada.nextInt();
                suma=suma+matriz[i][j];
                suma=promedio;
            }
             promedio=promedio/alumnos;
        }
        for(int i=0; i<alumnos; i++){
           for(int j=0; j<6; j++){
               System.out.print("Alumno" +" " + (i+1) + " " + "promedio" + " " + matriz[i][j]+ "\t");

    }
    System.out.println();
    }
    }
}

