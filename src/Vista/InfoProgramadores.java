
package Vista;

import Controlador.InfoProgramadores_Control;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author Manuel
 */
public class InfoProgramadores extends JFrame{
    
   public JButton jbAcerca;
    
    public InfoProgramadores(){
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
        
        InfoProgramadores_Control ic = new InfoProgramadores_Control(this);
        jbAcerca = new JButton("Información..");
        jbAcerca.setBounds(100, 100, 200, 30);
        
       jbAcerca.addActionListener(ic);
   
        add(jbAcerca);
        
    }
   
    
    
}
