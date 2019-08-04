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
public class Ejercicio38 {
    public static void main (String [] args){
        Scanner entrada = new Scanner(System.in);
        double kg=0;
        double newton=0;
        System.out.print("La masa es: ");
        kg= entrada.nextDouble();
        newton=kg*9.8;
        System.out.println("El valor en Newtons es: " + newton);
    }
}
