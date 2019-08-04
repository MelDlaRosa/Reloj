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
public class Ejercicio111 {
    public static void main (String [] args){
        Random entrada= new Random();
       int aleatorio;
       int con1=0;
       int con2=0;
       int con3=0;
       int con4=0;
       int con5=0;
       String nombre;
       String [] arreglo = {"Luis", "Sofia","Alex", "Sandra", "Carla"};
        for (int j=0; j<5; j++){
            aleatorio = (int) (Math.random()*arreglo.length);
            
        }
        for(int j=0; j<5;j++){
            nombre=arreglo[j];
            switch (nombre){
                case "Luis":
                    con1++;
                    break;
                case "Sofia":
                    con2++;
                    break;
                case "Alex":
                    con3++;
                    break;
                case "Sandra":
                    con4++;
                    break;
                case "Carla":
                    con5++;
                    break;
                    
                }
            }
        System.out.println("El nombre de Luis aparece:" + con1);
        System.out.println("El nombre de Sofia aparece:" + con2);
        System.out.println("El nombre de Alex aparece:" + con3);
        System.out.println("El nombre de Sandra aparece:" + con4);
        System.out.println("El nombre de Carla aparece:" + con5);
        }
    
}

