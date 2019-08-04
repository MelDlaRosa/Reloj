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
public class Ejercicio95 {
    public static void main (String [] args){
        Random entrada = new Random();
        int numero;
        int variable;
        int con1=0;
        int con2=0;
        int con3=0;
        int con4=0;
        int con5=0;
        int con6=0;
        int suma=0;
        int [] aleatorio;
        aleatorio= new int [100];
        for(int x=0; x<100; x++){
            numero= entrada.nextInt(10-(5-1)+5);
            aleatorio[x]=numero;
            variable= aleatorio[x];
            switch (variable){
                case 5:
                con1++;
                break;
                case 6:
                con2++;
                break;
                case 7:
                con3++;
                break;
                case 8:
                con4++;
                break;     
                case 9:
                con5++;
                break;
                case 10:
                con6++;
                break;
            }
            
        }
        suma=con1+con2+con3+con4+con5+con6;
            System.out.println(suma);
            System.out.println("La calificacion 5 aparece: " + con1);
            System.out.println("La calificacion 6 aparece: " + con2);
            System.out.println("La calificacion 7 aparece: " + con3);
            System.out.println("La calificacion 8 aparece: " + con4);
            System.out.println("La calificacion 9 aparece: " + con5);
            System.out.println("La calificacion 10 aparece: " + con6);
    }
}
