/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myfarm.DiferentesAnimalesyPlantas;

import myfarm.SerVivo.Animales;
import myfarm.TiposAnimales.Tipo_Omnivoro;

/**
 *
 * @author annelis
 */
public class Pollo extends Animales implements Tipo_Omnivoro {

    public Pollo(byte consumo_alimento, byte edad, int[] produccion, byte vida, String nombre) {
        super(consumo_alimento, edad, produccion, vida, nombre);
    }

    @Override
    public void produccionGenerada() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void comidaSemillas() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void tiposProduccionOmnivoro() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    
}
