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
public class Ejercicio90 {
    public static void main (String [] args){
        Scanner entrada = new Scanner(System.in);
        int altura=0;
        int con2=0;
        System.out.println("Introduzca la altura: ");
        altura= entrada.nextInt();
        for(int x1=0; x1<altura; x1++){
            int con1=0;
            while(con1<=con2){
              System.out.println("#");
              con1++;
                      
            }
            con2++;
            System.out.println("");
        }
        
    }
    
}
