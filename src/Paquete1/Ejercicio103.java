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
public class Ejercicio103 {
    public static void main (String [] args){
        Scanner entrada = new Scanner(System.in);
        int determinante=0;
        int valores=0;
        int [][] matriz;
        matriz= new int [2][2];
        for(int i=0; i<2;i++){
            for(int j=0; j<2;j++){
                System.out.println("Inserte los valores de la determinante: ");
                matriz[i][j]= entrada.nextInt();
                valores= matriz[i][j];
            }     
        }
        System.out.println("La matriz es: ");
        for(int i=0; i<2;i++){
            for(int j=0; j<2;j++){
                System.out.print("|" + "" + matriz[i][j] + "" + "|" + "\t");
            }
            System.out.println();
        }
        //for(int i=0; i<2;i++){
           // for(int j=0; j<2; j++){
                determinante=((matriz[0][0]*matriz[1][1])-(matriz[0][1]*matriz[1][0]));
                System.out.println("la determiannte de la matriz es: " + determinante);
            }
        }
    

