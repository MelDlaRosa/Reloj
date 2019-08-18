/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paquete1;

import java.util.Scanner;

/**
 *
 * @author JARLES
 */
public class Ejercicio122 {
    public static void main (String [] args){
        Scanner entrada = new Scanner(System.in);
        int [][] matriz;
        int valor=0;
        matriz = new int [3][3];
        for (int i=0; i<3; i++){
            for (int j=0; j<3; j++){
                System.out.println("Inserte el numero: ");
                matriz [i][j]= entrada.nextInt();
            }
        }
        System.out.println("El gato es: ");
        for (int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                System.out.print("|" + "" + matriz [i][j] + "" + "|" + "\t");
            }
            System.out.println();
        }
    }
    
}
