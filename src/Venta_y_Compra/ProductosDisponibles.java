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
public abstract class ProductosDisponibles {
    
 private Estado_dinero dinero;
 private short cantidadProducto;
 private short Oro;

    public ProductosDisponibles(Estado_dinero dinero, short cantidadProducto, short Oro) {
        this.dinero = dinero;
        this.cantidadProducto = cantidadProducto;
        this.Oro = Oro;
    }
    
    //Metodos que heredaran las demás clases
    
    public abstract void intercambioProductos();

    public Estado_dinero getDinero() {
        return dinero;
    }

    public void setDinero(Estado_dinero dinero) {
        this.dinero = dinero;
    }

    public short getCantidadProducto() {
        return cantidadProducto;
    }

    public void setCantidadProducto(short cantidadProducto) {
        this.cantidadProducto = cantidadProducto;
    }

    public short getOro() {
        return Oro;
    }

    public void setOro(short Oro) {
        this.Oro = Oro;
    }
    
    
 
 
    
}
