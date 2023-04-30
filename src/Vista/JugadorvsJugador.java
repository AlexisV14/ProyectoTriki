/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import Controlador.JugadorvsJugador_Control;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Alexi
 */
public class JugadorvsJugador extends JFrame{
    
    static JTextField jtNickName1,jtNickName2;
    JLabel jlNickName1,jlNickName2;
    public JButton jbJugar;
    
    public JugadorvsJugador(){
        
        super("Ingreso de jugadores");
        
        setSize(400, 400);
        setLocationRelativeTo(null);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	setLayout(null);
        PedirNickName();
        
	setVisible(true);
        
    }
      
    
    public void PedirNickName(){
        
        JugadorvsJugador_Control jvjc = new JugadorvsJugador_Control(this);
        
        jlNickName1 = new JLabel("Ingresa tu Nickname jugador 1: ");
        jtNickName1 = new JTextField();
        jlNickName2 = new JLabel("Ingresa tu Nickname jugador 2: ");
        jtNickName2 = new JTextField();
        jbJugar = new JButton("JUGAR");
        
        jlNickName1.setBounds(40, 20, 250, 20); 
        jtNickName1.setBounds(40, 40, 250, 20);  
        jlNickName2.setBounds(40, 60, 250, 20); 
        jtNickName2.setBounds(40, 80, 250, 20); 
        jbJugar.setBounds(40, 140, 250, 20);
        
        jbJugar.addActionListener(jvjc);
        
        add(jlNickName1);
        add(jtNickName1);
        add(jlNickName2);
        add(jtNickName2);
        add(jbJugar);
    }
    
     
}
