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
public class Ejercicio18 {
    public static void main (String [] args){
        Scanner entrada = new Scanner(System.in);
        int lado=0;
        double volumen=0;
        System.out.print ("El valor del lado es");
        lado= entrada.nextInt();
        volumen= Math.pow(lado,3);
        System.out.print ("El valor del volumen es " + volumen);
  
        
    }
    
}
