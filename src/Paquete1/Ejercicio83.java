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
public class Ejercicio83 {
    public static void main(String [] args){
        Scanner entrada = new Scanner(System.in);
        int dia=0;
        System.out.println("Inserte el numero");
        dia = entrada.nextInt();
        switch (dia){
            case 1:
                System.out.println("Es Lunes");
                break;
            case 2:
                System.out.println("Es Martes");
                break;
            case 3:
                System.out.println("Es Miercoles");
                break;
            case 4:
                System.out.println("Es Jueves");
                break;
            case 5:
                System.out.println("Es Viernes");
                break;
            case 6:
                System.out.println("Es Sabado");
                break;
            case 7:
                System.out.println("Es Domingo");
                break;
            default:
                System.out.println("Dia no encontrado ");
    }
    }
}
