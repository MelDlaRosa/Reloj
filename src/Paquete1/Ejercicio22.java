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
public class Ejercicio22 {
    public static void main (String [] args){
        Scanner entrada = new Scanner(System.in);     
        int KMxH=0;
        int MxS=0;
        System.out.print("La velocidad en km/h es: "  );
        KMxH= entrada.nextInt ();
        MxS= (KMxH*1000)/3600;
        System.out.println("La velocidad en m/s es: " +MxS);
                
        
    }
    
}
