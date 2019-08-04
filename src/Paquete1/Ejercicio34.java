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
public class Ejercicio34 {
    public static void main(String [] args){
        Scanner entrada = new Scanner(System.in);
        String nombre;   
        System.out.print("El nombre de la persona es: ");
        nombre= entrada.next();  
        if (nombre.equalsIgnoreCase("Jose"))
            System.out.println("Usted no es bienvenido");
        else
            System.out.println ("Bienvenido a la fiesta");
        
                
            
                
    }
    
}
