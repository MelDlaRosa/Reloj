/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paquete1;

/**
 *
 * @author mely_
 */
public class PruebaReloj {
public static void main (String[] args)
   
{
        Reloj Argentina;
        Reloj Mexico;
        Reloj Canada;
        
     Argentina= new Reloj();
        Argentina.ponerhora(12);
        Argentina.ponerminutos(10);
        Argentina.ponersegundos(05);
        Argentina.mostrarhora();
        Argentina.ponerdia(24);
        Argentina.ponermes(02);
        Argentina.poneraño(2019);
        Argentina.mostrarfecha();
        
     Mexico= new Reloj();
        Mexico.ponerhora(0);
        Mexico.ponerminutos(0);
        Mexico.ponersegundos(0);
        Mexico.mostrarhora();
        Mexico.ponerdia(0);
        Mexico.ponermes(0);
        Mexico.poneraño(0);
        Mexico.mostrarfecha();
        
     Canada= new Reloj();
        Canada.ponerhora(0);
        Canada.ponerminutos(0);
        Canada.ponersegundos(0);
        Canada.mostrarhora();
        Canada.ponerdia(0);
        Canada.ponermes(0);
        Canada.poneraño(0);
        Canada.mostrarfecha();
}
    
    
}
