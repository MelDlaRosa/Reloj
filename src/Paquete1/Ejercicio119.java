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
public class Ejercicio119 {
    public static void main (String [] args){
        Scanner entrada = new Scanner(System.in);
        String palabra="";
        String palabrainvertida="";
        System.out.println("Escriba la palabra: ");
        palabra= entrada.next();
        for(int x=palabra.length()-1; x>=0;x--){
            palabrainvertida+= palabra.charAt(x);
        }
        System.out.println("La palabra original es: " + palabra);
        System.out.println("La palabra invertida es: " + palabrainvertida);
    }
    
}
