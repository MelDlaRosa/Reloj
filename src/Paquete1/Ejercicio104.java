/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paquete1;

import java.util.Random;

/**
 *
 * @author mely_
 */
public class Ejercicio104 {
    public static void main (String [] args){
        Random entrada = new Random();
        int [][] matriz;
        int determinante;
        matriz= new int [2][2];
        for (int i=0; i<2; i++){
            for(int j=0; j<2; j++){
                matriz [i][j]= (int) (Math.random()*(20-10+1)+1);
            }
    }
        System.out.println("La matriz es: ");
        for(int i=0; i<2;i++){
            for(int j=0; j<2;j++){
                System.out.print("|" + "" + matriz[i][j] + "" + "|" + "\t");
            }
            System.out.println();
    }
        determinante=((matriz[0][0]*matriz[1][1])-(matriz[0][1]*matriz[1][0]));
                System.out.println("la determiannte de la matriz es: " + determinante);
}
}
