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
public abstract class Animales extends Intermediario {
    
     private byte consumo_alimento;
     private byte edad;

    public Animales(byte consumo_alimento, byte edad, int[] produccion, byte vida, String nombre) {
        super(produccion, vida, nombre);
        this.consumo_alimento = consumo_alimento;
        this.edad = edad;
    }

    public byte getConsumo_alimento() {
        return consumo_alimento;
    }

    public void setConsumo_alimento(byte consumo_alimento) {
        this.consumo_alimento = consumo_alimento;
    }

    public byte getEdad() {
        return edad;
    }

    public void setEdad(byte edad) {
        this.edad = edad;
    }
     
     

     



        
    }


