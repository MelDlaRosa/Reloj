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
public class Ejercicio9 {
    public static void main (String [] args) {
        Scanner entrada = new Scanner(System.in);
        int lado1=0;
        int lado2=0;
        int lado3=0;
        int lado4=0;
        int altura=0;
        int perimetro=0;
        int area=0; 
        System.out.print ("El lado 1 es");
        lado1= entrada.nextInt ();
        System.out.print ("El lado 2 es");
        lado2= entrada.nextInt ();
        System.out.print ("El lado 3 es");
        lado3= entrada.nextInt ();
        System.out.print ("El lado 4 es");
        lado4= entrada.nextInt ();
        System.out.print ("La altura es");
        altura= entrada.nextInt ();
        perimetro = (lado1+lado2+lado3+lado4);
        area = ((lado1 + lado3)/2)*altura;
        System.out.print ("El perimetro es" + perimetro);
        System.out.print ("El area es" + area);
        
       
    }
}
