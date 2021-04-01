/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myfarm.SerVivo;

/**
 *
 * @author annelis
 */
public abstract class Plantas extends Intermediario {
    
    private byte semillas_sembrar;
    
    public Plantas(byte semillas_sembrar,int produccion, byte vida) {
        super(produccion, vida);
        this.semillas_sembrar = semillas_sembrar; 
    }
    


    @Override
    public void produccionGenerada() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
