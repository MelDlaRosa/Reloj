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
public class Ejercicio11 {
    public static void main (String [] args){
        Scanner entrada = new Scanner(System.in);
        double radio=0;
        double perimetro=0;
        double area=0;
        System.out.print ("El radio es");
        radio= entrada.nextDouble ();
        perimetro= 3.14*(radio*2);
        area= 3.14*(radio*radio);
        System.out.print ("El perimetro es" + perimetro);
        System.out.print ("El area es" + area);
      
    }
   
}
