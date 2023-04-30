/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import Controlador.JugadorvsPc_Control;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

/**
 *
 * @author Alexi
 */
public class JugadorvsPc extends JFrame {
    
    static JTextField jtNickName;
    JLabel jlNickName;
    public JButton jbJugar;
    
    public JugadorvsPc(){
        
        super("Ingreso de jugador");
        
        setSize(400, 400);
        setLocationRelativeTo(null);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	setLayout(null);
        PedirNickName();
        
	setVisible(true);
        
    }
      
    
    public void PedirNickName(){
        
        JugadorvsPc_Control jvc = new JugadorvsPc_Control(this);
        
        jlNickName = new JLabel("Ingresa tu Nickname jugador : ");
        jtNickName = new JTextField();
        jbJugar = new JButton("JUGAR");
        
        jlNickName.setBounds(40, 20, 250, 20); 
        jtNickName.setBounds(40, 40, 250, 20);  
        jbJugar.setBounds(40, 100, 250, 20);
        
        jbJugar.addActionListener(jvc);
        
        add(jlNickName);
        add(jtNickName);
        add(jbJugar);
    }
}
