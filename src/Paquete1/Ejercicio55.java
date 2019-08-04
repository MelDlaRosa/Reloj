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
public class Ejercicio55 {
    public static void main (String [] args){
        Scanner entrada = new Scanner(System.in);
        String nombre="";
        while(!nombre.equals("Katheryn")){
        System.out.println("El nombre del invitado es: ");
        nombre= entrada.next();
        
            System.out.println(nombre);
        }
            
    }
    
}
