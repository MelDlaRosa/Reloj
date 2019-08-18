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
public class Ejercicio128 {
    public static void main (String [] args){
       String operacion;
        int numero1;
        int numero2;
        int suma=0;
        int resta=0;
        operacion= JOptionPane.showInputDialog("Ingrese la operacion a realizar:");
        numero1= Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero:"));
        numero2= Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero:"));
        switch (operacion){
            case "Suma":
                suma= numero1+numero2;
                JOptionPane.showMessageDialog(null, "La suma es: " + suma);
                break;
            case "Resta":
                resta= numero1-numero2;
                JOptionPane.showMessageDialog(null, "La resta es: " + resta);
                break;    
                
                
        }
    }
}
