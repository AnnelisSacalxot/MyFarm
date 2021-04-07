/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myfarm.Escenario;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

/**
 *
 * @author annelis
 */
class Casilla extends JButton implements ActionListener {
    
    public Casilla(int posx, int posy, int ancho, int alto){
        setBounds(posx,posy,ancho,alto);
        addActionListener(this);
    }
    
    //Mostrar los terrenos de manera aleatorio con sus probabilidades
    public void terrenosCasilla(int x, int y){
        setText( (x+1)+"-"+(y+1) );
    }
    
    //Que es lo que va hacer cada botón, son las acciones
    @Override
    public void actionPerformed(ActionEvent e) {
       setBackground(Color.ORANGE);
    }

    void setTerrenosCasilla(int fila, int columna) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
