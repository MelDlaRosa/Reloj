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
public class Ejercicio107 {
    public static void main (String [] args){
        Random entrada = new Random();
        int[][] matriz;
        int par=0;
        int impar=0;
        int valores=0;
        matriz = new int [6][6];
        for(int i=0; i<6; i++){
            for(int j=0; j<6; j++){
                matriz [i][j]= (int) (Math.random()*(100+1)+1);
                valores= matriz [i][j];
                 if((valores % 2) ==0){
             par++;
         } else{
             impar++;
            
            }
            }
        }
        System.out.println("La matriz es: ");
        for(int i=0; i<6;i++){
            for(int j=0; j<6;j++){
                System.out.print("|" + "" + matriz[i][j] + "" + "|" + "\t");
            }
            System.out.println();
               
    }
        
            
     
      System.out.println("Numeros de valores pares: " + par);
         System.out.println("Numero de valores impares: " + impar);  
    
}
}
