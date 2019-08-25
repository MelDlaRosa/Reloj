package Paquete1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JARLES
 */
public class Empleado {
    //atributos
   private String nombre;
   private String apellidos;
   private int edad;
   private String puesto;
   private int telefono;
   
   public void setNombre(String nombre){
       this.nombre = nombre;   
   }
   public String getNombre(){
       return nombre;
   }
   
   public void setApellidos(String apellidos){
       this.apellidos = apellidos;
   }
   public String getApellidos(){
       return apellidos;
   }
    
}
