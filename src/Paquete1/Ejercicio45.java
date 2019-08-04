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
public class Ejercicio45 {
    public static void main (String [] args){
        Scanner entrada = new Scanner (System.in);
        double temperatura=0;
        double personas=0;
        double tiempo=0;
        boolean bandera;
        System.out.print("La temperatura es; ");
        temperatura= entrada.nextDouble();
        System.out.print("Las personas son; ");
        personas= entrada.nextDouble();
        System.out.print("El tiempo es; ");
        tiempo= entrada.nextDouble();
        if ((temperatura>=35 ) || (personas>15) || (tiempo>=14 && tiempo<=19))
            System.out.println("El clima esta prendido");
        else
            System.out.println("El clima esta apagado");
    }
                
    
}
