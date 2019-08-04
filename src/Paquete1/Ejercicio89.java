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
public class Ejercicio89 {
    public static void main (String [] args){
        Scanner entrada = new Scanner(System.in);
        int botellas=0;
        int minutos=0;
        System.out.println("Inserte el tiempo de ducha: ");
        minutos= entrada.nextInt();
        botellas=minutos*12;
        System.out.println("El numero de botellas es: " + botellas);
    }
    
}
