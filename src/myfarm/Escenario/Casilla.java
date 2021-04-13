/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myfarm.Escenario;

import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 *
 * @author annelis
 */
public class Casilla {
    
    Random tierra = new Random();
    int tierraAleatoria;
    
    public void Casilla(){
        
        tierraAleatoria = tierra.nextInt(100);
        
        if (tierraAleatoria <=40) {
         CasillaTierra.setIcon(new ImageIcon("grama.jpg"));        
        } else if (tierraAleatoria <=11+75){    
        CasillaAgua.setIcon(new ImageIcon("agua.jpg"));
        } else if (tierraAleatoria <=76+100) {
        CasillaDesierto.setIcon(new ImageIcon("desierto.jpg"));    
        }
   
}


    
}
