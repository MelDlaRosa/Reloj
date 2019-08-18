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
public class Ejercicio121 {
    public static void main (String [] args){
        Scanner entrada = new Scanner(System.in);
         String x = " Hola, que    tal ";
        String y;     
        y = x.trim();  System.out.println(y);
        y = x.replaceAll(" ", "");  System.out.println(y);
        y = x.replaceAll(" +", " ");  System.out.println(y);
     
}
}
