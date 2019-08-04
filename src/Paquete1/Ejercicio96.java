/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paquete1;


import java.util.*;

/**
 *
 * @author mely_
 */
public class Ejercicio96 {
    public static void main (String [] args){
        Scanner entrada = new Scanner(System.in);
        Random aleatorio = new Random();
        int alumnos=0;
        int calificaciones=0;
        int numero=0;
        int suma=0;
        int promedio=0;
        int variable;
        int confinal=0;
        System.out.println("Inserte el numero de alumnos: ");
        alumnos= entrada.nextInt();
        int [] valor;
        valor= new int[alumnos];
        for(int x=0; x<alumnos; x++){
            System.out.println("Ingrese la calificacion del alumno:  ");
            calificaciones= entrada.nextInt();
       valor[x]=calificaciones;
            
            
                suma=suma+valor[x];
                
                
            }
            promedio=suma/alumnos;
            
            for(int y=0; y<alumnos; y++){
            variable=valor[y];
            switch (variable){
               
               
                case 7:
                confinal++;
                break;
                case 8:
                confinal++;
                break;     
                case 9:
                confinal++;
                break;
                case 10:
                confinal++;
                break;
            }
            
            }
            System.out.println("La cantidad de alumnos que pasan " + confinal);
            System.out.println("El promedio general es: " + promedio);
    }
                
        }
    

    
