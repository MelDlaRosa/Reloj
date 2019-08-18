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
public class Ejercicio118 {
    public static void main (String [] args){
        Scanner entrada = new Scanner(System.in);
        String palabra="";
        int conteo=0;
        System.out.println("Escriba la palabra: ");
        palabra= entrada.next();
        for(int x=0; x<palabra.length();x++){
           if(palabra.charAt(x)!='a' && palabra.charAt(x)!='e'&&  palabra.charAt(x)!='i' && palabra.charAt(x)!='o' &&palabra.charAt(x)!='u' ){
               conteo++;
       
}
           
}
      System.out.println("El numero de consonantes es: " +conteo); 
}
}

