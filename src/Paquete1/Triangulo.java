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
public class Triangulo {
   public int lados;
    public int medida;
    public int area;
    public int perimetro;
    
   public Triangulo (int lados, int medida){
       this.lados=lados;
       this.medida=medida;
   } 
   public Triangulo(){
    this(3,5);
}
   public int perimetro (){
       return lados*medida;
   }
   public int lados(){
       return lados;
   }
}
