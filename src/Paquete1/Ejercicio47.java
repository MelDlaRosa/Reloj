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
public class Ejercicio47 {
    public static void main (String [] args){
        Scanner entrada = new Scanner(System.in);
        double edad;
        double cuenta;
        double descuento;
        System.out.println("La edad de la persona es: ");
        edad= entrada.nextDouble();
        System.out.println("La cuenta es: ");
        cuenta= entrada.nextDouble();
        if (edad < 15 || edad > 60)
                descuento= (cuenta*.8);
        else
            descuento=cuenta;
        System.out.println("La cuenta es: " + descuento);
        
    }
    
}
