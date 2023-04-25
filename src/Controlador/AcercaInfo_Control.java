/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Vista.AcercaInfo;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Alexi
 */
public class AcercaInfo_Control implements ActionListener {
    
    AcercaInfo ac;

    public AcercaInfo_Control(AcercaInfo ac) {
        this.ac = ac;
    }
    

    @Override
    public void actionPerformed(ActionEvent e) {
       if(e.getSource().equals(ac.jbcerrar))
       {
           ac.setVisible(false);
           ac.dispose();
       }
    }
    
}
