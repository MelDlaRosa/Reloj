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
public class Ejercicio79 {
    public static void main (String [] args){
        Scanner entrada = new Scanner(System.in);
        int numero1=0;
        int numero2=1;
        System.out.println("La tabla es del: ");
        numero1= entrada.nextInt();
        for(numero1=numero1; numero2<=10; numero2++){
            System.out.println(numero1*numero2);
        }
    }
}
