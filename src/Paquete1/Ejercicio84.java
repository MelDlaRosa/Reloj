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
public class Ejercicio84 {
    public static void main (String [] args){
        Scanner entrada = new Scanner(System.in);
        String carita;
        System.out.println("Inserte el emoticono");
        carita= entrada.next();
        switch (carita){
            case ":)":
            System.out.println("Feliz");
            break;
            case ":(":
                System.out.println("Triste");
                break;
            case ":$":
                System.out.println("Apenado");
              break;
            default:
                System.out.println("Cara no encontrada");
            
        }
    }
    
}
