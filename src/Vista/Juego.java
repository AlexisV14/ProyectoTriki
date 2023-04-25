/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import Controlador.Juego_Control;
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
    
    public JButton jb1,jb2,jb3,jb4,jb5,jb6,jb7,jb8,jb9;
    public JLabel jlNickName1, jlNickName2,jlicono1,jlicono2,jlturno;
    public ArrayList<JButton> botones = new ArrayList(8);
    public int turno;
    public ImageIcon i2 = new ImageIcon(getClass().getResource("/imagenes/circulo.png"));
    public ImageIcon i1 = new ImageIcon(getClass().getResource("/imagenes/equis.png"));
    public String player1 = JugadorvsJugador.jtNickName1.getText();
    public String player2 = JugadorvsJugador.jtNickName2.getText();
   
    
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
        
        Juego_Control jc = new Juego_Control(this);
       
        turno = 1;
       
        jb1 = new JButton();
        jb2 = new JButton();
        jb3 = new JButton();
        jb4 = new JButton();
        jb5 = new JButton();
        jb6 = new JButton();
        jb7 = new JButton();
        jb8 = new JButton();
        jb9 = new JButton();
        jlNickName1 = new JLabel(player1);
        jlNickName2 = new JLabel(player2);
        jlturno = new JLabel("Turno jugador " + player1);
        
        turno = 2;
               
        
        jlicono1 = new JLabel(jc.asignarIcono(i2, i2));
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
        
        
        botones.add(jb1);
        botones.add(jb2);
        botones.add(jb3);
        botones.add(jb4);
        botones.add(jb5);
        botones.add(jb6);
        botones.add(jb7);
        botones.add(jb8);
        botones.add(jb9);
        
        for(int i = 0;i<botones.size();i++){
             botones.get(i).addActionListener(jc);
        }
        
        
    }
    
    
}
