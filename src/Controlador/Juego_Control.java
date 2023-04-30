/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Vista.Juego;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
/**
 *
 * @author Alexi
 */
public class Juego_Control implements ActionListener{
    
    Juego j;
    
    public ArrayList<Integer> jugada = new ArrayList(8);
    

    public Juego_Control(Juego j) {
        this.j = j;
        
        jugada.add(0);
        jugada.add(0);
        jugada.add(0);
        jugada.add(0);
        jugada.add(0);
        jugada.add(0);
        jugada.add(0);
        jugada.add(0);
        jugada.add(0);
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) 
    {
        
        boolean gano = false;
        
        if(e.getSource().equals(j.jbReiniciar))
            {
                new Juego();
            }
        
        for(int i = 0;i<j.botones.size();i++)
        {
             
        
             if(e.getSource().equals(j.botones.get(i)))
            {

                if(j.turno == 1)
               {
                   jugada.set(i, j.turno);
                   j.botones.get(i).setIcon(j.jlicono2.getIcon());
                   j.botones.get(i).setEnabled(false);
                   j.jlturno.setText( "Turno jugador: " + j.player1);

                   j.turno = 2;
               }
               else
               {

                   jugada.set(i, j.turno);
                   j.botones.get(i).setIcon(j.jlicono1.getIcon());
                   j.botones.get(i).setEnabled(false);
                   j.jlturno.setText( "Turno jugador: " + j.player2);
                   j.turno=1;
               }
            }
           
        }
        
        gano = ganar();
        
        if(gano == true)
        {
            for(int i = 0;i<j.botones.size();i++)
            {
                j.botones.get(i).setEnabled(false);
               
            }  
        }
       
    }
        

  public ImageIcon asignarIcono(ImageIcon a, ImageIcon b) 
  {
        
        ImageIcon elementos[] = {a,b};
        
        int aleatorio =(int) (Math.random()*(2));
        
        ImageIcon c= elementos[aleatorio];
        
        return c;
    }
  
    
    
    public boolean ganar()
    {
        boolean gano = false;
        int o = 1;
        int x = 2;
        
        System.out.println(jugada);
        
               
           if(
           jugada.get(0).equals(x) && jugada.get(1).equals(x) && jugada.get(2).equals(x)||
           jugada.get(3).equals(x) && jugada.get(4).equals(x) && jugada.get(5).equals(x)||
           jugada.get(6).equals(x) && jugada.get(7).equals(x) && jugada.get(8).equals(x)||
           jugada.get(0).equals(x) && jugada.get(3).equals(x) && jugada.get(6).equals(x)||
           jugada.get(1).equals(x) && jugada.get(4).equals(x) && jugada.get(7).equals(x)||
           jugada.get(2).equals(x) && jugada.get(5).equals(x) && jugada.get(8).equals(x)||
           jugada.get(0).equals(x) && jugada.get(4).equals(x) && jugada.get(8).equals(x)||
           jugada.get(2).equals(x) && jugada.get(4).equals(x) && jugada.get(6).equals(x) )
           {
               JOptionPane.showMessageDialog(j, "EL JUGADOR " + j.player1 + " GANÓ", "Ganaste", 1);
               gano = true;
               
           }
           else
           {
              if(
                jugada.get(0).equals(o) && jugada.get(1).equals(o) && jugada.get(2).equals(o)||
                jugada.get(3).equals(o) && jugada.get(4).equals(o) && jugada.get(5).equals(o)||
                jugada.get(6).equals(o) && jugada.get(7).equals(o) && jugada.get(8).equals(o)||
                jugada.get(0).equals(o) && jugada.get(3).equals(o) && jugada.get(6).equals(o)||
                jugada.get(1).equals(o) && jugada.get(4).equals(o) && jugada.get(7).equals(o)||
                jugada.get(2).equals(o) && jugada.get(5).equals(o) && jugada.get(8).equals(o)||
                jugada.get(0).equals(o) && jugada.get(4).equals(o) && jugada.get(8).equals(o)||
                jugada.get(2).equals(o) && jugada.get(4).equals(o) && jugada.get(6).equals(o) )
                {
                    JOptionPane.showMessageDialog(j, "EL JUGADOR " + j.player2 + " GANÓ", "Ganaste", 1);
                    gano = true;
                }
           }  
        return gano;
            
    }
       
       
    }
    

