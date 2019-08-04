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
public class Ejercicio41 {
    public static void main (String [] args){
        Scanner entrada = new Scanner(System.in);
        int Juan=0;
        int Erik=0;
        int Miguel=0;
        System.out.println("Donato tiene 8 años y tiene un gemelo llamado Luis");
        System.out.println("Erik es dos años mas chico que Donato. La edad de Erik es:" );
        Erik=entrada.nextInt();
        System.out.println ("Miguel tiene el doble de la edad de Erik. La edad de Miguel es:" );
        Miguel=entrada.nextInt();
        Juan= 16+Erik+Miguel;
        System.out.println("La edad de Juan es: " + Juan);
    }
}
