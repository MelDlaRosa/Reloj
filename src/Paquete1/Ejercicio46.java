/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paquete1;

import java.util.Random;


/**
 *
 * @author mely_
 */
public class Ejercicio46 {
    public static void main (String [] args){
        Random entrada = new Random();
        int numero;
        numero= entrada.nextInt(700-(20+1)+20);
        System.out.println("El peso es: " + numero);
        if (numero > 400)
                System.out.println("El elevador no puede operar");
        else
            System. out.println ("El elevador puede operar");
       
        
        
        
        
    }
    
}
