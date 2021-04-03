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
public abstract class Intermediario {
  
 /**
 * Se usará byte porque la vida y consumo sera de un 0
 * a 100, para ahorrar espacio en memoria
 */
    
    private int[] produccion; 
    private byte vida;
    private String nombre;
    
    
    
    public Intermediario(int[] produccion, byte vida, String nombre){
        this.produccion = produccion;
        this.vida = vida;
        this.nombre = nombre;
     
}
    
   //Implentación de métodos que llevarán las clases heredadas
    
    public abstract void produccionGenerada();
  

    public int[] getProduccion() {
        return produccion;
    }

    public void setProduccion(int[] produccion) {
        this.produccion = produccion;
    }

    public byte getVida() {
        return vida;
    }

    public void setVida(byte vida) {
        this.vida = vida;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //Esto nos sirve para llamar todos los atributos
    
    @Override
    public String toString() {
        return "Intermediario{" + "produccion=" + produccion + ", vida=" + vida +  ", nombre=" + nombre + '}';
    }
    
    
       

}
