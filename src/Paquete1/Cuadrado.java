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
public class Cuadrado {
   public int lados;
   public int medida;
   
   
   public Cuadrado (int lados, int medida) {
       this.lados=lados;
       this.medida=medida;
   }
   public Cuadrado (){
       this(4,4);
       
   }
   public int perimetro (){
       return lados*medida;
   }
   public int lados (){
       return lados;
   }
}
