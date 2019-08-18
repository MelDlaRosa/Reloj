/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paquete1;

import java.util.Scanner;

/**
 *
 * @author JARLES
 */
public class Ejercicio124 {
    public static void main (String [] args){
        Scanner entrada = new Scanner(System.in);
        int [][] matriz;
        int valor=0;
        boolean res=false;
        int posicion=0;
        matriz = new int [3][3];
    
            for (int j=0; j<9; j++){
             
                do{
                System.out.println("Inserte la posición: ");
                posicion= entrada.nextInt();
                switch (posicion){
                    case 1:
                        if(matriz[0][0]==0){
                System.out.println("Inserte el numero: ");
                matriz [0][0]= entrada.nextInt();
                res=true;
                    } else{
                        System.out.println("Ya esta ocupado, escoga otra posicion");
                        res=false;                        }
                        break;
                    case 2:
                        if(matriz[0][1]==0){
                System.out.println("Inserte el numero: ");
                matriz [0][1]= entrada.nextInt();
                res=true;
                    } else{
                        System.out.println("Ya esta ocupado, escoga otra posicion");
                        res=false;
                        }
                        break;
                    case 3:
                        if(matriz[0][2]==0){
                System.out.println("Inserte el numero: ");
                matriz [0][2]= entrada.nextInt();
                res=true;
                    } else{
                        System.out.println("Ya esta ocupado, escoga otra posicion");
                        res=false;
                        }break;
                    case 4:
                        if(matriz[1][0]==0){
                System.out.println("Inserte el numero: ");
                matriz [1][0]= entrada.nextInt();
                res=true;
                    } else{
                        System.out.println("Ya esta ocupado, escoga otra posicion");
                        res=false;
                        } break;
                    case 5:
                        if(matriz[1][1]==0){
                System.out.println("Inserte el numero: ");
                matriz [1][1]= entrada.nextInt();
                res=true;
                    } else{
                        System.out.println("Ya esta ocupado, escoga otra posicion");
                        res=false;
                        }
                        break;
                    case 6:
                        if(matriz[1][2]==0){
                System.out.println("Inserte el numero: ");
                matriz [1][2]= entrada.nextInt();
                res=true;
                    } else{
                        System.out.println("Ya esta ocupado, escoga otra posicion");
                        res=false;
                        }
                        break;
                    case 7:
                        if(matriz[2][0]==0){
                System.out.println("Inserte el numero: ");
                matriz [2][0]= entrada.nextInt();
                res=true;
                    } else{
                        System.out.println("Ya esta ocupado, escoga otra posicion");
                        res=false;
                        }break;
                    case 8:
                        if(matriz[2][1]==0){
                System.out.println("Inserte el numero: ");
                matriz [2][1]= entrada.nextInt();
                    } else
                        System.out.println("Ya esta ocupado, escoga otra posicion");
                        break;
                    case 9:
                        if(matriz[2][2]==0){
                System.out.println("Inserte el numero: ");
                matriz [2][2]= entrada.nextInt();
                res=true;
                    } else{
                        System.out.println("Ya esta ocupado, escoga otra posicion");
                        res=false;
                        } break;          
                }
                }while(res!=true);
            }
            
            
            for(int a=0;a<3;a++){
                for(int b=0;b<3;b++){
                    System.out.print( matriz [a][b] + " ");
                }
                System.out.println();
                
            } 
             if((matriz[0][0]==1)&&(matriz[1][1]==1)&&(matriz[2][2]==1)){
            System.out.println("Gano el jugador 1");
        }else{
            System.out.println("Gano el jugador 2");
                }
            }
}
