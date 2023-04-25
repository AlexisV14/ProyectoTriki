
package Vista;

import Vista.AcercaInfo;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author Manuel
 */
public class Infoprogramadores extends JFrame{
    JButton jbAcerca;
    public Infoprogramadores(){
        super("Programadores y versión de la App");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        
        setLayout(null);
        crearGUI();
        
        setVisible(true);
        
    }
    
    private void crearGUI(){
        jbAcerca = new JButton("Información..");
        jbAcerca.setBounds(100, 100, 200, 30);
        jbAcerca.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                evento_jbAcerca();
                
            }

           
        });
        add(jbAcerca);
        
    }
    
     private void evento_jbAcerca() {
          AcercaInfo ac = new AcercaInfo(this);      
            }
    
    
}
