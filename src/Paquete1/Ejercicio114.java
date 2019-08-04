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
public class Ejercicio114 {
    public static void main (String [] args){
 Scanner entrada = new Scanner (System.in);
     String palabra, alreves="";
     System.out.println("Escribe la palabra: ");
     palabra= entrada.nextLine();
     for (int x=palabra.length()-1; x>=0; x--){
         alreves+=palabra.charAt(x);
     
     } 
     if(palabra.equals(alreves)){
         System.out.println("La palabra es un palindromo");
         
     
     }
     else
         System.out.println("La palabra no es un palindromo");
 }
    
}
