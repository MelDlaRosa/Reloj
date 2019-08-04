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
public class Ejercicio17 {
    public static void main (String [] args){
        Scanner entrada = new Scanner(System.in);
        int calificacion1=0;
        int calificacion2=0;
        int calificacion3=0;
        int calificacion4=0;
        int calificacion5=0;
        int calificacion6=0;
        int promedio=0;
        System.out.print ("La calificacion 1 es");
        calificacion1= entrada.nextInt();
        System.out.print ("La calificacion 2 es");
        calificacion2= entrada.nextInt();
        System.out.print ("La calificacion 3 es");
        calificacion3= entrada.nextInt();
        System.out.print ("La calificacion 4 es");
        calificacion4= entrada.nextInt();
        System.out.print ("La calificacion 5 es");
        calificacion5= entrada.nextInt();
        System.out.print ("La calificacion 6 es");
        calificacion6= entrada.nextInt();
        promedio= (calificacion1 + calificacion2 + calificacion3 + calificacion4 + calificacion5 + calificacion6)/6;
        System.out.print ("El promedio es" + promedio);
        
    }
    
}
