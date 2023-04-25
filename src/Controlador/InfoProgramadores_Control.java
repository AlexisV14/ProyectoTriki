/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Vista.AcercaInfo;
import Vista.InfoProgramadores;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Alexi
 */
public class InfoProgramadores_Control implements ActionListener{
    
    InfoProgramadores i;

    public InfoProgramadores_Control(InfoProgramadores i) {
        this.i = i;
    }
    
    

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(i.jbAcerca))
        {
            AcercaInfo ac = new AcercaInfo(i);
        }
    }
    
}
