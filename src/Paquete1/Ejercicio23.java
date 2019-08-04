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
public class Ejercicio23 {
    public static void main (String [] args){
        Scanner entrada = new Scanner(System.in);
        double A=0;
        double B=0;
        double C=0;
        double X1=0;
        double X2=0;
        System.out.print("El valor de A es:" );
        A= entrada.nextDouble();
        System.out.print("El valor de B es:" );
        B= entrada.nextDouble();
        System.out.print("EL valor de C es:" );
        C= entrada.nextDouble();
        X1= (-(B)+ (Math.sqrt((Math.pow(B, 2)-(4*A*C)))))/(2*A);
        X2= (-(B) - (Math.sqrt((Math.pow(B, 2)-(4*A*C)))))/(2*A);
        System.out.println("El valor de X1 es: " + X1);
        System.out.println("El valor de X2 es: " + X2);
    }
}
