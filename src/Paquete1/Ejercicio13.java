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
public class Ejercicio13 {
    public static void main (String [] args){
        Scanner entrada = new Scanner(System.in);
        int precio=0;
        int descuento=0;
        int total=0;
        System.out.print ("El precio es");
        precio= entrada.nextInt();
        descuento= (precio*25)/100;
        System.out.print ("El descuento es de" + descuento + "pesos");
        total= precio - descuento;
        System.out.print ("El precio final es" + total + "pesos");
    }
}
