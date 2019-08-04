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
public class Horno {
    int capacidad;
    int tipohorno;
    int temperatura;
    int tipoconsumo;

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        //this.capacidad = capacidad;
        if(tipohorno==0&&capacidad<=5){
        this.capacidad = capacidad;}
        
        else if(tipohorno==1&&capacidad>5){
            this.capacidad = capacidad;
        }
    }

    public int getTipohorno() {
        return tipohorno;
    
    }

    public void setTipohorno(int tipohorno) {
        
        if(tipohorno==0 || tipohorno==1)
        {
            this.tipohorno = tipohorno;
        }
    }

    public int getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(int temperatura) 
    {
        if((tipohorno==0&&temperatura<=100)){
                    
            this.temperatura = temperatura;
        }
        else if(tipohorno==1&&temperatura>100)
        {
            this.temperatura=temperatura;
        }
            
        
    }
    

    public int getTipoconsumo() {
        return tipoconsumo;
    }

    public void setTipoconsumo(int tipoconsumo) {
        
        if(tipoconsumo==0 || tipoconsumo==1)
        {
          this.tipoconsumo = tipoconsumo;  
        }
    }
}
