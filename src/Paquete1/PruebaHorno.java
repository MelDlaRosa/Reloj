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
public class PruebaHorno {
    public static void main(String[] args) {
        
      Horno Beko;
      Horno Cata;
      Horno AEG;
      
      Beko=new Horno();
      Beko.setTipohorno(0);
      Beko.setCapacidad(2);
      Beko.setTemperatura(80);
      Beko.setTipoconsumo(0);
      
      Cata=new Horno();
      Cata.setTipohorno(1);
      Cata.setCapacidad(8);
      Cata.setTemperatura(150);
      Cata.setTipoconsumo(1);
      
      AEG=new Horno();
      AEG.setTipohorno(0);
      AEG.setCapacidad(3);
      AEG.setTemperatura(50);
      AEG.setTipoconsumo(0);
      
        System.out.println(Beko.getCapacidad());
    }
}

