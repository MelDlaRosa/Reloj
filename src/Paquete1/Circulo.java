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
public class Circulo {
    int lados;
    double medida;
    double area;
    double perimetro;
    
    public Circulo (double medida){
        this.medida=medida;
    }
    public Circulo (){
        this(3);
    }
    public double perimetro(){
        return 2*Math.PI*medida;
    }
    public double area(){
        return Math.PI*Math.sqrt(medida);
    }
}
