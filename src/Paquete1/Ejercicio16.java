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
public class Ejercicio16 {
    public static void main (String [] args){
        Scanner entrada = new Scanner(System.in);
        String Nombre;
        String ApellidoPaterno;
        String ApellidoMaterno;
        System.out.print("Nombre: ");
        Nombre= entrada.next();
        System.out.print ("Apellido Paterno: ");
        ApellidoPaterno= entrada.next();
        System.out.print("Apellido Materno: ");
        ApellidoMaterno= entrada.next();
        System.out.print("Hola, " + Nombre+" " + ApellidoPaterno +" " + ApellidoMaterno);
     
    }
}
