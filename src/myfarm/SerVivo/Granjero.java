/*
 * De esta clase no se va heredar nada ya que tienen 
 * diferentes caracterisitcas y funciones con animales
 * y plantas
 */
package myfarm.SerVivo;

/**
 *
 * @author annelis
 */
public abstract class Granjero {
    
    String vidaGranjero;
    byte vidaInicial = 70;
    int Oro = 1000;
    byte comer = 0;
    
    public String getVidaGranjero() {
        return vidaGranjero;
    }

    public void setVidaGranjero(String vidaGranjero) {
        this.vidaGranjero = vidaGranjero;
    } 

    public Granjero() {
    }

    public byte getVidaInicial() {
        return vidaInicial;
    }

    public void setVidaInicial(byte vidaInicial) {
        this.vidaInicial = vidaInicial;
    }

    public int getOro() {
        return Oro;
    }

    public void setOro(int Oro) {
        this.Oro = Oro;
    }

    public byte getComer() {
        return comer;
    }

    public void setComer(byte comer) {
        this.comer = comer;
    }

    
    
}
