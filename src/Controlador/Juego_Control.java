/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Vista.Juego;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;

/**
 *
 * @author Alexi
 */
public class Juego_Control implements ActionListener{
    
    Juego j;

    public Juego_Control(Juego j) {
        this.j = j;
    }
    
    

    @Override
    public void actionPerformed(ActionEvent e) {
        for(int i = 0;i<j.botones.size();i++){
        
        if(e.getSource().equals(j.botones.get(i)))
        
            
         if(j.turno == 1)
        {
            j.botones.get(i).setIcon(j.jlicono2.getIcon());
            j.botones.get(i).setEnabled(false);
            j.jlturno.setText( "turno jugador " + j.player1);
           
            j.turno = 2;
        }
        else
        {
            j.botones.get(i).setIcon(j.jlicono1.getIcon());
            j.botones.get(i).setEnabled(false);
            j.jlturno.setText( "turno jugador " + j.player2);
            j.turno=1;
        }
        }
    }
        

    public ImageIcon asignarIcono(ImageIcon a, ImageIcon b) {
        
        ImageIcon elementos[] = {a,b};
        
        int aleatorio =(int) (Math.random()*(2));
        
        ImageIcon c= elementos[aleatorio];
        
        return c;
    }
    
}
