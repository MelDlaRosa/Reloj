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
public class Ejercicio12 {
    public static void main (String [] args){
        Scanner entrada = new Scanner(System.in);
        int NumerodeLados=0;
        int Lado=0;
        int perimetro=0;
        int apotema=0;
        int area=0;
        System.out.print ("El numero de lados es");
        NumerodeLados= entrada.nextInt();
        System.out.print ("El valor del lado es");
        Lado= entrada.nextInt();
        System.out.print ("El apotema es");
        apotema= entrada.nextInt();
        perimetro= (NumerodeLados)*(Lado);
        System.out.print ("El perimetro es" + perimetro);
        area= (perimetro*apotema)/2;
        System.out.print ("El area es" + area);        
    }
}
