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
public class Ejercicio36 {
    public static void main(String [] args){
        Scanner entrada = new Scanner(System.in);
        double hora=0;
        double minutos=0;
        double segundos=0;
        boolean bandera;
        System.out.print("La hora es; ");
        hora= entrada.nextDouble();
        System.out.print("Los minutos son; ");
        minutos= entrada.nextDouble();
        System.out.print("Los segundos son; ");
        segundos= entrada.nextDouble();
        if (hora>=00 && hora<=23 ){
            if (minutos>=00 && minutos <=59)
            {
                if (segundos>=00 && segundos<=59)
                {
                    bandera=true;
                }
                else
                {
                    bandera=false;
                }
            }
            else
            {
                bandera=false;
            }
                
        }
        else
        {
            bandera=false;
        }
        if(bandera)
        {
            System.out.println("La hora es valida");
        }
        else
        {
            System.out.println("La hora no es valida");
        }
        
    }
    
}
