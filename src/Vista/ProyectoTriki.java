/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Vista;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author Alexi
 */
public class ProyectoTriki extends JFrame {
    
    JLabel jlselecciona;
    JButton jbjugadorvsjugador;
    JButton jbjugadorvspc;
    JButton jbdescripcionjuego;
    JButton jbinfoProgramadores;
    
    
    public ProyectoTriki(){
        super("Menu principal");
		setSize(400, 400);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

                
		setLayout(null);
                crearMenu();
				
		setVisible(true);
    }
    
    public void crearMenu(){
        jlselecciona = new JLabel("Selecciona una modalidad de juego: ");
        jbjugadorvsjugador = new JButton("Jugador vs Jugador");
        jbjugadorvspc = new JButton("Jugador vs Pc");
        jbdescripcionjuego = new JButton("Descripcion y Reglas ");
        jbinfoProgramadores = new JButton("Informacion Programadores");
         
        jlselecciona.setBounds((500-300)/2, 30, 250, 20);     
        jbjugadorvsjugador.setBounds((500-300)/2, 70, 200, 30);       
        jbjugadorvspc.setBounds((500-300)/2, 110,200, 30);
        jbdescripcionjuego.setBounds((500-300)/2, 150, 200, 30);
        jbinfoProgramadores.setBounds((500-300)/2, 190, 200, 30);
        
        
        eventoNickName(jbjugadorvsjugador);
        eventoDescripcionyReglas(jbdescripcionjuego);
        eventoInfoprogrmadores(jbinfoProgramadores);
        
        
        add(jlselecciona);
        add(jbjugadorvsjugador);
        add(jbjugadorvspc);
        add(jbdescripcionjuego);
        add(jbinfoProgramadores);
        
    }
    
  public void eventoNickName(JButton boton){
        
        boton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JugadorvsJugador obj = new JugadorvsJugador();
                
                
            }
            
        });
        
    }
    // Este evento llama la clase DescripcionyReglas
    
    public void eventoDescripcionyReglas(JButton boton1){
        boton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              DescripcionyReglas ob = new DescripcionyReglas();  
            }
        });
        
        
    
        
    }
    
    // Este evento llama la clase infoprogramadore y Acercainfo
    
    public void eventoInfoprogrmadores(JButton bot){
        bot.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Infoprogramadores ob = new Infoprogramadores();
            }
        });
    }
        
    
    
    public static void main(String[] args) {
        ProyectoTriki pt = new ProyectoTriki();
    }
    
}
