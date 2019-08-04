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
public class Ejercicio116 {
    public static void main (String [] args){
        Scanner entrada = new Scanner(System.in);
        String palabra;
        String vocal="";
        String palabrafinal="";
        System.out.println("Escriba la frase: ");
        palabra= entrada.next();
        System.out.println("Ingrese la vocal: ");
        vocal= entrada.next();
        switch (vocal){
            case "a":
            System.out.println(palabra.replace('a','4'));  
                break;
            case "e": 
                 System.out.println(palabra.replace('e','3'));   
                break;
            case "i": 
                 System.out.println(palabra.replace('i','1'));   
                break;   
            case "o": 
                 System.out.println(palabra.replace('o','0'));   
                break; 
            case "u": 
                 System.out.println(palabra.replace('u','2'));   
                break;
        }
        
    }
}
