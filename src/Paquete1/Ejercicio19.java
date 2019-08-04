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
public class Ejercicio19 {
    public static void main (String [] args){
        Scanner entrada = new Scanner(System.in);
        double radio=0;
        double altura=0;
        double volumen=0;
        System.out.print ("El radio es");
        radio= entrada.nextDouble();
        System.out.print ("La altura es");
        altura= entrada.nextDouble();
        volumen= Math.PI*(Math.pow(radio, 2))*altura;
        System.out.println ("El volumen es " + volumen);
    }         
    }
