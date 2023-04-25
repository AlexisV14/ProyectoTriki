/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Vista.DescripcionyReglas;
import Vista.InfoProgramadores;
import Vista.JugadorvsJugador;
import Vista.ProyectoTriki;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Alexi
 */
public class ProyectoTriki_Control implements ActionListener{

    ProyectoTriki pt;

    public ProyectoTriki_Control(ProyectoTriki pt) {
        this.pt = pt;
    }
   
    

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(pt.jbjugadorvsjugador))
        {
            JugadorvsJugador jvj = new JugadorvsJugador();
            pt.setVisible(false);
        }
        
         if(e.getSource().equals(pt.jbdescripcionjuego))
        {
            DescripcionyReglas dr = new DescripcionyReglas();  
            pt.setVisible(false);
        }
         
          if(e.getSource().equals(pt.jbinfoProgramadores))
        {
            InfoProgramadores ip = new InfoProgramadores();
            pt.setVisible(false);
        }
    }
    
}
