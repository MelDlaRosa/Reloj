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
public class Alumno {
    //atributos
    private String nombre;
    private String apellidos;
    private int edad;
    private String curso;
    private int telefono;
    
    public void setNombre (String nombre){
        this.nombre=nombre;
        
    }
    public String getNombre(){
        return nombre;
    }
    public void setCurso (String curso){
        this.curso=curso;
       
    }    
    public String getCusrso(){
        return curso;
    }

}
