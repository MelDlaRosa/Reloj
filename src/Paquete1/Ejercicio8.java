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
public class Ejercicio8 {
    public static void main (String [] args) {
        Scanner entrada = new Scanner(System.in);
        int base=0;
        int altura=0;
        int perimetro=0;
        int area=0; 
        System.out.print ("El valor de la base es");
        base= entrada.nextInt();
        System.out.print ("El valor de la altura es");
        altura= entrada.nextInt();
        perimetro= (3*base);
        area= (base * altura)/2;
        System.out.print ("El perimetro es" + perimetro);
        System.out.print ("El area es" + area);
    }
    
}
