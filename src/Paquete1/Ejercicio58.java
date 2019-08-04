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
public class Ejercicio58 {
    public static void main (String [] args){
        Scanner entrada= new Scanner (System.in);
        int comando=0;
        String nombre1;
        String nombre2;
        String juego;
        boolean bandera;
        
  do{
      System.out.println("Inserte un comando:" );
        comando= entrada.nextInt();
           switch (comando){
            case 1:
                System.out.println("EL nombre del jugador y juego es:");
               nombre1= entrada.next();
               juego= entrada.next();
               System.out.println("Hola, "  + nombre1  + " vas a jugar " + juego);
              
            break;
            case 2:
                System.out.println("EL nombre de los jugadores son y el jusgo es");
                nombre1= entrada.next();
                nombre2= entrada.next();
                juego= entrada.next();
                System.out.println("Hola: "+  nombre1 + "y " + nombre2  + "Van a jugar" +  juego);
            break;
            case 3:
                System.out.println("El juego esta actualizado");
            break;
            case 4:
                System.out.println("Gracias por jugar");
                bandera=false;
            break;     
        }
  }while(bandera=true);
        
        }
          
           }
               
             
