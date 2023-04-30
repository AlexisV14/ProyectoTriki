/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Vista.JuegoPc;
import Vista.JugadorvsPc;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Alexi
 */
public class JugadorvsPc_Control implements ActionListener{
    
    JugadorvsPc jvj;

    public JugadorvsPc_Control(JugadorvsPc jvj) {
        this.jvj = jvj;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(jvj.jbJugar))
        {
            JuegoPc obj = new JuegoPc();
            jvj.setVisible(false);
        }
    }
    
}
