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
public class Ejercicio24 {
    public static void main (String [] args){
        Scanner entrada = new Scanner(System.in);
        double pesos=0;
        double dolares=0;
        System.out.print ("Valor en dolares: " );
        dolares= entrada.nextDouble();
        pesos= (dolares*19.62);
        System.out.println("Valor en pesos: " + pesos);
    }
    
}
