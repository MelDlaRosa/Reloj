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
public class Ejercicio112 {
    public static void main (String [] args){
       Scanner entrada = new Scanner(System.in);
       String correo= "";
      // System.out.println("Ingrese la cadena: ");
      // correo= entrada.next();
       
           System.out.println("Ingrese la cadena: ");
       correo= entrada.next();
       if (correo.contains("@")&& correo.endsWith(".com")){
           System.out.println("La cadena es un correo");
           
       }
      else
          System.out.println("La cadena no es un correo");
    }
    
}


