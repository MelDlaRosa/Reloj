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
public class Ejercicio115 {
    public static void main (String [] args){
       Scanner entrada = new Scanner(System.in);
       String palabra="";
       char letra;
       String posicion="";
       System.out.println("Escriba la palabra: ");
       palabra = entrada.nextLine();
       System.out.println("El caracter a contar es: ");
       letra= entrada.next().charAt(0);
       for(int i=0; i<palabra.length();i++){
           if(String.valueOf(palabra.charAt(i)).toUpperCase().
          equals(String.valueOf(letra).toUpperCase())){
               posicion +=i+",";
               System.out.println("La letra se repite:" + posicion);
               
               
           }
           
       }
           
    }
    
}
