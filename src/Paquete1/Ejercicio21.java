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
public class Ejercicio21 {
    public static void main (String [] args){
        Scanner entrada = new Scanner(System.in);
        double Celsius=0;
        double Fahrenheit=0;
        double Kelvin=0;
        System.out.print ("La temperatura en °C es: ");
        Celsius= entrada.nextDouble();
        Fahrenheit= ((9*Celsius)+32)/5;
        Kelvin= Celsius + 273.15;
        System.out.println ("La temperatura en °F es: " + Fahrenheit);
        System.out.println ("La temperatura en °K es: " + Kelvin);
                
        
    }
}
