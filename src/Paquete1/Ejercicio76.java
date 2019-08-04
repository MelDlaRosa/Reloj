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
public class Ejercicio76 {
    public static void main (String [] args){
        Scanner entrada= new Scanner(System.in);
        int limite1=0;
        int limite2=0;
        System.out.println("El limite 1 es: ");
        limite1= entrada.nextInt();
        System.out.println("El limite 2 es: ");
        limite2= entrada.nextInt();
        for(limite1=limite1; limite1<=limite2; limite1++){
            System.out.println(limite1);
        }
        
    }
    
}
