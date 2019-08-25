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
public class ProbadorEscuela {
    public static void main(String [] args){
        //creacion de objetos escuela
        Empleado objeto1 = new Empleado();
        objeto1.setNombre("Juan");        
        Empleado objeto2 = new Empleado();
        objeto2.setApellidos("Lopez");
        Profesor objeto3= new Profesor();
        objeto3.setEdad(35);
        Profesor objeto4 = new Profesor();
        objeto4.setTelefono(9860245);
        Alumno objeto5 = new Alumno();
        objeto5.setNombre("Sonia");
        Alumno objeto6= new Alumno();
        objeto6.setCurso("Programación");
        
        System.out.println("El nombre es: " + objeto1.getNombre());
        System.out.println("El apellido es: " + objeto2.getApellidos());
        System.out.println("La edad es: " + objeto3.getEdad());
        System.out.println("El telefono es: " + objeto4.getTelefono());
        System.out.println("El nombre es: " + objeto5.getNombre());
        System.out.println("El curso es: " + objeto6.getCusrso());
        
        
    }
}
