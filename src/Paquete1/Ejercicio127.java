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
public class Ejercicio127 {
    public static void main (String [] args){
        Scanner entrada = new Scanner(System.in);
        int tamaño;
        int matriz [][];
        int suma=0;
        System.out.println("Ingrese el tamaño de la matriz: ");
        tamaño= entrada.nextInt();
        matriz= new int [tamaño][tamaño];
        for(int x=0; x<(tamaño); x++){
            for(int y=0; y<(tamaño-1); y++){
                System.out.println("Inserte los numeros: ");
                matriz[x][y]= entrada.nextInt();
                suma= suma+ matriz[x][y];
            }
            matriz[x][tamaño-1]=suma;
            suma=0;
        }
         System.out.println("La matriz es: ");
        for (int i=0; i<tamaño; i++){
            for(int j=0; j<tamaño; j++){
                System.out.print("|" + "" + matriz [i][j] + "" + "|" + "\t");
            }
            System.out.println();
    }
    
}
}
