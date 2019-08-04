/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paquete1;

import static java.lang.System.out;
import java.util.Scanner;

/**
 *
 * @author mely_
 */
public class Ejercicio48 {
    public static void main (String [] args){
        Scanner entrada= new Scanner(System.in);
        int residuo=0;
        int numero=0;
        System.out.print("El numero es: ");
        numero= entrada.nextInt();
        residuo= numero%10; 
        if (residuo==0)
            System.out.println("EL numero es multiplo de 10");
        else
            System.out.println("El numero no es multiple de 10");
            
            
            
        
        
    }
    
}
