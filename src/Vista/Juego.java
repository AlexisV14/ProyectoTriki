/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Alexi
 */
public class Juego extends JFrame {
    
    JButton jb1,jb2,jb3,jb4,jb5,jb6,jb7,jb8,jb9;
    JLabel jlNickName1, jlNickName2,jlicono1,jlicono2,jlturno;
    ArrayList<JButton> botones = new ArrayList(8);
    int turno;
    ImageIcon i2 = new ImageIcon(getClass().getResource("/imagenes/circulo.png"));
    ImageIcon i1 = new ImageIcon(getClass().getResource("/imagenes/equis.png"));
    String player1 = JugadorvsJugador.jtNickName1.getText();
    String player2 = JugadorvsJugador.jtNickName2.getText();
   
    
    public Juego(){
        
        super("Triki Game");
        
        setSize(400, 400);
        setLocationRelativeTo(null);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	setLayout(null);
        tablero();
        
	setVisible(true);
        
    }
    
    public void tablero()
    {
       
        turno = 1;
       
        jb1 = new JButton("0");
        jb2 = new JButton("1");
        jb3 = new JButton("2");
        jb4 = new JButton("3");
        jb5 = new JButton("4");
        jb6 = new JButton("5");
        jb7 = new JButton("6");
        jb8 = new JButton("7");
        jb9 = new JButton("8");
        jlNickName1 = new JLabel(player1);
        jlNickName2 = new JLabel(player2);
        jlturno = new JLabel("turno jugador " + player1);
        
        turno = 2;
               
        
        jlicono1 = new JLabel(asignarIcono(i1, i2));
        if(jlicono1.getIcon().equals(i1))
            {jlicono2 = new JLabel(i2);}
            else{jlicono2 = new JLabel(i1);}
        
        
        
        jb1.setBounds(20, 20, 80, 80);
        jb2.setBounds(100, 20, 80, 80);
        jb3.setBounds(180, 20, 80, 80);
        jb4.setBounds(20, 100, 80, 80);
        jb5.setBounds(100, 100, 80, 80);
        jb6.setBounds(180, 100, 80, 80);
        jb7.setBounds(20, 180, 80, 80);
        jb8.setBounds(100, 180, 80, 80);
        jb9.setBounds(180, 180, 80, 80);
        jlturno.setBounds(20, 280, 250, 30);
        jlNickName1.setBounds(280, 20, 100, 48);
        jlNickName2.setBounds(280, 80, 100, 48);
        jlicono1.setBounds(300, 20, 115, 48);
        jlicono2.setBounds(300, 80, 115, 48);
        
        add(jb1);
        add(jb2);
        add(jb3);
        add(jb4);
        add(jb5);
        add(jb6);
        add(jb7);
        add(jb8);
        add(jb9);
        add(jlNickName1);
        add(jlNickName2);
        add(jlicono1);
        add(jlicono2);
        add(jlturno);
        
        
        jb1.addActionListener(new BotonPulsadoListener());
        jb2.addActionListener(new BotonPulsadoListener());
        jb3.addActionListener(new BotonPulsadoListener());
        jb4.addActionListener(new BotonPulsadoListener());
        jb5.addActionListener(new BotonPulsadoListener());
        jb6.addActionListener(new BotonPulsadoListener());
        jb7.addActionListener(new BotonPulsadoListener());
        jb8.addActionListener(new BotonPulsadoListener());
        jb9.addActionListener(new BotonPulsadoListener());
        
        botones.add(jb1);
        botones.add(jb2);
        botones.add(jb3);
        botones.add(jb4);
        botones.add(jb5);
        botones.add(jb6);
        botones.add(jb7);
        botones.add(jb8);
        botones.add(jb9);
        
        
        
    }
    
    private class BotonPulsadoListener implements ActionListener{		

    public void actionPerformed(ActionEvent e) {
        
        int botonPulsado = Integer.parseInt(e.getActionCommand());
        botones.get(botonPulsado).setEnabled(false);
        
        
        ganador();
        
        if(turno == 1)
        {
            botones.get(botonPulsado).setText("");
            botones.get(botonPulsado).setIcon(i1);
            jlturno.setText( "turno jugador " + player1);
           
            turno=2;
        }
        else
        {
            botones.get(botonPulsado).setText("");
            botones.get(botonPulsado).setIcon(i2);
            jlturno.setText( "turno jugador " + player2);
            turno=1;
        }
         }
    }
    
    
    
   public void eventoOprimir(JButton boton)
    {
        
       boton.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               if(turno == 1)
               {
                   boton.setIcon(i1);
               }
               else
               {
                   boton.setIcon(i2);
               }
               
               boton.setEnabled(false);
           }
       });
        
   }
    
    public ImageIcon asignarIcono(ImageIcon a,ImageIcon b)
    {
        ImageIcon elementos[] = {a,b};
        
        int aleatorio =(int) (Math.random()*(2));
        
        ImageIcon c= elementos[aleatorio];
        
        return c;
        
    }    
    
    public void ganador()
    {
        if
        (botones.get(1).getText().equals("1"))
        {
            System.out.println("ganaste");
        }
    }
    
    
    
}
