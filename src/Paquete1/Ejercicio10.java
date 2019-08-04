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
public class Ejercicio10 {
    public static void main (String [] args) {
        Scanner entrada = new Scanner (System.in);
        int lado1=0;
        int diametromayor=0;
        int diametromenor=0;
        int perimetro=0;
        int area=0;
        System.out.print ("El lado 1 es");
        lado1= entrada.nextInt();
        System.out.print ("El diameto mayor");
        diametromayor= entrada.nextInt();
        System.out.print ("El diametro menor");
        diametromenor= entrada.nextInt();
        perimetro= lado1*4;
        area=diametromenor*diametromayor;
        System. out.print ("El perimetro es" + perimetro);
        System. out.print ("El area es" + area);
    }
}
