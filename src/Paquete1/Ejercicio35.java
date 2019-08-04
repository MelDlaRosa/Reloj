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
public class Ejercicio35 {
    public static void main (String [] args){
        Scanner entrada = new Scanner(System.in);
        double articulo1;
        double articulo2;
        double articulo3;
        double precio;
        double total;
        System.out.print("El precio del articulo 1 es: ");
        articulo1= entrada.nextDouble();
        System.out.print("El precio del articulo 2 es: ");
        articulo2= entrada.nextDouble();
        System.out.print("El precio del articulo 3 es: ");
        articulo3= entrada.nextDouble();
        precio= articulo1 + articulo2 + articulo3;
        if (precio>=2000){
            total= (precio * .7);
        }
        else
        {
            total= (articulo1*.95)+(articulo2*.95)+(articulo3*.95);
        }
            System.out.println("El precio final es: " + total);
    }
        
        
        
            

                    
       
}
