/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import Controlador.JuegoPc_Control;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

/**
 *
 * @author Alexi
 */
public class JuegoPc extends JFrame {
    
    public JButton jb1,jb2,jb3,jb4,jb5,jb6,jb7,jb8,jb9,jbReiniciar;
    public JLabel jlNickName1,jlNickName2,jlPc,jlicono1,jlicono2;
    public ArrayList<JButton> botones = new ArrayList(8);
    public ImageIcon i2 = new ImageIcon(getClass().getResource("/imagenes/circulo.png"));
    public ImageIcon i1 = new ImageIcon(getClass().getResource("/imagenes/equis.png"));
    public String player1 = JugadorvsPc.jtNickName.getText();
    public String player2 = "Pc";
    
   
    
    public JuegoPc(){
        
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
        
         JuegoPc_Control jpc = new JuegoPc_Control(this);
        
       
       
        jb1 = new JButton();
        jb2 = new JButton();
        jb3 = new JButton();
        jb4 = new JButton();
        jb5 = new JButton();
        jb6 = new JButton();
        jb7 = new JButton();
        jb8 = new JButton();
        jb9 = new JButton();
        jbReiniciar = new JButton("Reiniciar juego");
        jlNickName1 = new JLabel(player1);
        jlNickName2 = new JLabel(player2);
               
        
     jlicono1 = new JLabel(jpc.asignarIcono(i1, i2));
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
        jbReiniciar.setBounds(250, 280, 120, 25);
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
        add(jbReiniciar);
        
        
        botones.add(jb1);
        botones.add(jb2);
        botones.add(jb3);
        botones.add(jb4);
        botones.add(jb5);
        botones.add(jb6);
        botones.add(jb7);
        botones.add(jb8);
        botones.add(jb9);
        
        jbReiniciar.addActionListener(jpc);
        
        for(int i = 0;i<botones.size();i++){
             botones.get(i).addActionListener(jpc);
        }
        
    }
    
      
   
    
    
}

