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
public class Ejercicio93 {
    public static void main (String [] args){
        Random entrada = new Random();
        int numero;
        numero= entrada.nextInt(500)+1;
        int [] aleatorio;
        aleatorio = new int [100];
        for (int x=0; x<100; x++){
            numero= entrada.nextInt(500)+1;
            aleatorio[x]=numero;
        System.out.println("El contenido del arreglo es: " + aleatorio[x]);
        }
        
    }
    
}
