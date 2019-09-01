/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paquete1;

/**
 *
 * @author JARLES
 */
public class Rectangulo {
   public int lados;
   public int medida;
   public int area;
   public int perimetro;
   
   public Rectangulo (int lados, int medida){
       this.lados=lados;
       this.medida= medida;
   }
   public Rectangulo (){
       this (5,3);
   }
   public int area (){
       return lados*medida;
   }
   public int perimetro(){
       return ((2*lados)+(2*medida));
   }
   
}
