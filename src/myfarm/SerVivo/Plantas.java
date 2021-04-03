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

    public Plantas(byte semillas_sembrar, int[] produccion, byte vida, String nombre) {
        super(produccion, vida, nombre);
        this.semillas_sembrar = semillas_sembrar;
        }

    public byte getSemillas_sembrar() {
        return semillas_sembrar;
    }

    public void setSemillas_sembrar(byte semillas_sembrar) {
        this.semillas_sembrar = semillas_sembrar;
    }
    
    
    }
    

