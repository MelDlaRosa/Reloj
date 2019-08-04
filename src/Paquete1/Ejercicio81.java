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
public class Ejercicio81 {
    public static void main (String [] args){
        Scanner entrada = new Scanner(System.in);
        int con2=0;
        int valor=0;
        System.out.println("limite de asteriscos: ");
        valor= entrada.nextInt();
        for(int x1=0; x1<valor; x1++){
            int con1=0;
            while (con1<=con2){
                System.out.println("*");
                con1++;
            }
            con2++;
            System.out.println("");
        }
    }
}
