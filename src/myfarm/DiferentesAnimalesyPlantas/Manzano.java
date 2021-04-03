/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myfarm.DiferentesAnimalesyPlantas;

import myfarm.SerVivo.Plantas;
import myfarm.TiposPlantas.Tipo_Fruta;

/**
 *
 * @author annelis
 */
public class Manzano extends Plantas implements Tipo_Fruta{

    public Manzano(byte semillas_sembrar, int[] produccion, byte vida, String nombre) {
        super(semillas_sembrar, produccion, vida, nombre);
    }

    @Override
    public void produccionGenerada() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void siembraFruta() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
