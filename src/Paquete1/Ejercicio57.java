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
public class Ejercicio57 {
    public static void main (String [] args){
        Scanner entrada = new Scanner(System.in);
        int numero=0;
        int numero2=0;
        System.out.print("El numero es: ");
        numero= entrada.nextInt();
        while ((numero<=10) && (numero2<=10)){
            System.out.println(numero*numero2);
            numero2=numero2+1;
        }
    }
    
}
