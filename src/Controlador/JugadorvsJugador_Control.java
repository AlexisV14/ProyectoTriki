/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Vista.Juego;
import Vista.JugadorvsJugador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Alexi
 */
public class JugadorvsJugador_Control implements ActionListener{
    
    JugadorvsJugador jvj;

    public JugadorvsJugador_Control(JugadorvsJugador jvj) {
        this.jvj = jvj;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(jvj.jbJugar))
        {
            Juego obj = new Juego();
            jvj.setVisible(false);
        }
    }
    
}
