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
public class Ejercicio14 {
    public static void main (String [] args){
        Scanner entrada = new Scanner(System.in);
        int velocidad=0;
        int distancia=0;
        int tiempo=0;
        System.out.print ("La velocidad es");
        velocidad= entrada.nextInt();
        System.out.print ("La distancia es");
        distancia= entrada.nextInt();
        tiempo= distancia/velocidad;
        System.out.print ("El tiempo es" + tiempo);
       
    }
}
