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
public class Reloj {
    int hh;
    int mm;
    int ss;
    int dd;
    int Mes;
    int Año;
    
    public void ponerhora (int hora)
            
    {
        hh=hora;
    }
            
      public void ponerminutos (int minutos)      
              
      {
          mm=minutos;
      }
      
      public void ponersegundos (int segundos)
              
      {
          ss=segundos;
      }
      
      public void mostrarhora ()
              
      {
          System.out.println ("la hora es:"+hh+":"+mm+":"+ss);

      }
      
      public void ponerdia(int dia)
      
      {
          dd=dia;
      }
      
      public void ponermes (int mes)
              
      {
          Mes=mes;
      }
       
      public void poneraño (int año)
              
      {
          Año=año;
      }
      
      public void mostrarfecha ()
       {
          System.out.println ("la fecha es:"+dd+"/"+Mes+"/"+Año);
       }
}      
