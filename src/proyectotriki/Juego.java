/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectotriki;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author Alexi
 */
public class Juego extends JFrame{
    
    JButton jb1,jb2,jb3,jb4,jb5,jb6,jb7,jb8,jb9;
    
    
    public Juego(){
        
        super("Triki Game");
        
        setSize(500, 500);
        setLocationRelativeTo(null);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	setLayout(null);
        tablero();
        
	setVisible(true);
        
    }
    
    public void tablero()
    {
        jb1 = new JButton();
        jb2 = new JButton();
        jb3 = new JButton();
        jb4 = new JButton();
        jb5 = new JButton();
        jb6 = new JButton();
        jb7 = new JButton();
        jb8 = new JButton();
        jb9 = new JButton();
        
        jb1.setBounds(20, 20, 80, 80);
        jb2.setBounds(100, 20, 80, 80);
        jb3.setBounds(180, 20, 80, 80);
        jb4.setBounds(20, 100, 80, 80);
        jb5.setBounds(100, 100, 80, 80);
        jb6.setBounds(180, 100, 80, 80);
        jb7.setBounds(20, 180, 80, 80);
        jb8.setBounds(100, 180, 80, 80);
        jb9.setBounds(180, 180, 80, 80);
        
        add(jb1);
        add(jb2);
        add(jb3);
        add(jb4);
        add(jb5);
        add(jb6);
        add(jb7);
        add(jb8);
        add(jb9);
        
    }
    
    
    
}
