/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectotriki;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Alexi
 */
public class JugadorvsJugador extends JFrame{
    
    JTextField jtNickName1,jtNickName2;
    JLabel jlNickName1,jlNickName2;
    JButton jbJugar;
    
    public JugadorvsJugador(){
        
        super("Ingreso de jugadores");
        
        setSize(500, 500);
        setLocationRelativeTo(null);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	setLayout(null);
        PedirNickName();
        
	setVisible(true);
        
    }
      
    
    public void PedirNickName(){
        
        jlNickName1 = new JLabel("Ingresa tu Nickname jugador 1: ");
        jtNickName1 = new JTextField();
        jlNickName2 = new JLabel("Ingresa tu Nickname jugador 2: ");
        jtNickName2 = new JTextField();
        jbJugar = new JButton("JUGAR");
        
        jlNickName1.setBounds(20, 20, 250, 20); 
        jtNickName1.setBounds(20, 40, 250, 20);  
        jlNickName2.setBounds(20, 60, 250, 20); 
        jtNickName2.setBounds(20, 80, 250, 20); 
        jbJugar.setBounds(20, 100, 250, 20); 
        
        add(jlNickName1);
        add(jtNickName1);
        add(jlNickName2);
        add(jtNickName2);
        add(jbJugar);
    }
    
}
