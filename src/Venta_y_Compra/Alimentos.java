/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Venta_y_Compra;

import myfarm.enums.Estado_dinero;


/**
 *
 * @author annelis
 */
public abstract class Alimentos extends ProductosDisponibles {
    
    private byte semillas; // 30
    private byte bayas;    // 50
    private byte hierba;   // 45

    public Alimentos(byte semillas, byte bayas, byte hierba, Estado_dinero dinero, short cantidadProducto, short Oro) {
        super(dinero, cantidadProducto, Oro);
        this.semillas = semillas;
        this.bayas = bayas;
        this.hierba = hierba;
    }

    public byte getSemillas() {
        return semillas;
    }

    public void setSemillas(byte semillas) {
        this.semillas = semillas;
    }

    public byte getBayas() {
        return bayas;
    }

    public void setBayas(byte bayas) {
        this.bayas = bayas;
    }

    public byte getHierba() {
        return hierba;
    }

    public void setHierba(byte hierba) {
        this.hierba = hierba;
    }


    
    
    
}
