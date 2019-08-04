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
public class Ejercicio99 {
    public static void main (String [] args){
 Random entrada= new Random();  
 int[ ][ ] matriz; 
  matriz= new int[3][3];  
  for(int i=0; i< 3 ; i++){ 
      for(int j=0; j<3; j++){  
          matriz[i][j]= entrada.nextInt(10); 
  }  
  } 
 
for(int i=0; i< 3 ; i++){ 
 for(int j=0; j< 3; j++){ 
     System.out.print(matriz[i][j]+"\t"); 
 } 
 System.out.println( ); 
} 
    } 
 
    
}
