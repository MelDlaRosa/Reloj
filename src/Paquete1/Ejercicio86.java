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
public class Ejercicio86 {
    public static void main (String [] args){
        Scanner entrada = new Scanner(System.in);
        String nombre= "";
        boolean bandera;
        
        do{
            System.out.println("Inserte el nombre: ");
        nombre= entrada.next();
        switch (nombre){
            case "Adriana":
                System.out.println("Bienvenida, amiga favorita");
                break;
            case "Mariana":
                System.out.println("Bienvenida, amiga favorita");
                break;
            case "Katheryn":
                System.out.println("Bienvenida, amiga favorita");
                break;
            case "Anna":
                System.out.println("Bienvenida, amiga favorita");
                break; 
            case "Yazmin":
                System.out.println("Bienvenida, amiga favorita");
                break;
            case "Alan":
                System.out.println("Bienvenida, amigo favorito");
                break;  
            case "Luis":
                System.out.println("Bienvenida, amigo favorito");
                break;
            case "Victor":
                System.out.println("Bienvenida, amigo favorito");
                break; 
            case "Angel":
                System.out.println("Bienvenida, amigo favorito");
                break;
            case "Roberto":
                System.out.println("Bienvenida, amigo favorito");
                break;
            case "Fabricio":
                System.out.println("Bienvenida, amigo favorito");
                break;
            case "Julio":
                System.out.println("Bienvenida, amigo favorito");
                break;
            case "-1":
                bandera=false;
            default:
                System.out.println("Bienvenido" + nombre);
        }
    }while(bandera=true);
        }    
    
}
