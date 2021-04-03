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
public abstract class Abono extends ProductosDisponibles {
    
    private byte abonoUniversal; // 100 Oro
    private byte abonoOrganico;  // 200 Oro
    private byte abonoMineral;   // 250 Oro

    public Abono(byte abonoUniversal, byte abonoOrganico, byte abonoMineral, Estado_dinero dinero, short cantidadProducto, short Oro) {
        super(dinero, cantidadProducto, Oro);
        this.abonoUniversal = abonoUniversal;
        this.abonoOrganico = abonoOrganico;
        this.abonoMineral = abonoMineral;
    }

    public byte getAbonoUniversal() {
        return abonoUniversal;
    }

    public void setAbonoUniversal(byte abonoUniversal) {
        this.abonoUniversal = abonoUniversal;
    }

    public byte getAbonoOrganico() {
        return abonoOrganico;
    }

    public void setAbonoOrganico(byte abonoOrganico) {
        this.abonoOrganico = abonoOrganico;
    }

    public byte getAbonoMineral() {
        return abonoMineral;
    }

    public void setAbonoMineral(byte abonoMineral) {
        this.abonoMineral = abonoMineral;
    }


    
    

    
    
    
}
