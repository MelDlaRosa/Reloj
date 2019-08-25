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
public class Profesor {
    //atributos
    private String nombre;
    private String apellidos;
    private int edad;
    private String curso;
    private int telefono;
    
    public void setEdad(int edad){
       this.edad=edad; 
    }
    public int getEdad(){
        return edad;
    }
    public void setTelefono(int telefono){
        this.telefono=telefono;
    }
    public int getTelefono(){
        return telefono;
    }
}
