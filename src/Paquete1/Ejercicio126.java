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
public class Ejercicio126 {
    public static void main (String [] args){
        int numero1;
        int numero2=0;
        int multiplicacion;
        numero1= Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero:"));
         while ((numero1<=10) && (numero2<=9)){
             numero2=numero2+1;
             JOptionPane.showMessageDialog(null, "La tabla de multiplicar es: " + numero1*numero2);
         }
         
    }
}
