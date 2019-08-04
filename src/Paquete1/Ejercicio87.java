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
public class Ejercicio87 {
    public static void main (String [] args){
        Scanner entrada = new Scanner(System.in);
        double CA=0;
        double CO=0;
        double HIP=0;
        System.out.println("EL valor del CA es:");
        CA= entrada.nextInt();
        System.out.println("El valor de CO es:");
        CO= entrada.nextInt();
        HIP= (Math.sqrt(Math.pow(CA, 2) + (Math.pow(CO, 2))));
        System.out.println("HIP: " + HIP);
        System.out.println("CA: " + CA);
        System.out.println("CO: " + CO);
    }
}
