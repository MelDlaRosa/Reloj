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
public class Ejercicio37 {
    public static void main (String [] args){
        Scanner entrada = new Scanner(System.in);
        double peso=0;
        double altura=0;
        double imc=0;
        System.out.print("El peso de la persona es: ");
        peso= entrada.nextDouble();
        System.out.print("La altura de la persona es: ");
        altura= entrada.nextDouble();
        imc= peso/Math.pow(altura, 2);
        System.out.println("El IMC de la persona es: " + imc);
    }
        
        
        
}
