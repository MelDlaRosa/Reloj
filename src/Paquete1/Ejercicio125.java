/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paquete1;

import javax.swing.JOptionPane;

/**
 *
 * @author JARLES
 */
public class Ejercicio125 {
    public static void main (String [] args){
        String cadena;
        int numero1;
        int numero2;
        int suma;
        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero 1:"));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero 2:"));
        suma=numero1+numero2;
        JOptionPane.showMessageDialog(null, "la suma es: " + suma);
    }
}
