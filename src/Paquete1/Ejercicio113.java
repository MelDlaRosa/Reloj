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
public class Ejercicio113 {
    public static void main (String [] args){
        Scanner entrada = new Scanner(System.in);
        String cadena;
        int caracteres=10;
        System.out.println("Ingrese la cadena: ");
        cadena= entrada.next();
        if ((cadena.length()==10) && ((cadena.contains("A")||cadena.contains("E")||cadena.contains("I")||cadena.contains("O")||cadena.contains("U"))
                &&((cadena.contains("0")||cadena.contains("1")||cadena.contains("2")||cadena.contains("3")||cadena.contains("4")
                ||cadena.contains("5")||cadena.contains("6")||cadena.contains("7")||cadena.contains("8")||cadena.contains("9"))
                ))){
            System.out.println("La cadena es valida: ");
            
        }
        else 
            System.out.println("La cadena no es valida");
        
    } 
}
