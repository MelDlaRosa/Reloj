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
public class Ejercicio32 {
    public static void main (String [] args){
        Scanner entrada = new Scanner(System.in);
        int dia=0;
        System.out.print("El numero de día es: ");
        dia= entrada.nextInt();
        if (dia==1)
            System.out.println("El dia es lunes");
        if (dia==2)
            System.out.println("El dia es marte");
        if (dia==3)
            System.out.println("El dia es miercoles");
        if (dia==4)
            System.out.println("El dia es jueves");
        if (dia==5)
            System.out.println("El dia es viernes");
        if (dia==6)
            System.out.println("El dia es sabado");
        if (dia==7)
            System.out.println("El dia es domingo");
    }
}
