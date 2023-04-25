
package Vista;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.SwingConstants;


public class AcercaInfo extends JDialog{
    JButton jbcerrar;
    JLabel jlImg;
    
    public AcercaInfo(Infoprogramadores I){
        super(I, "Información..", true);
        setSize(400, 300);
        setLocationRelativeTo(I);
        setLayout(null);
        crearGUI();
        
        
        setVisible(true);
        
    }

    private void crearGUI() {
        ImageIcon ii = new ImageIcon(getClass().getResource("../imagenes/img1.png"));
        jlImg = new JLabel(ii);
        jlImg.setBounds(80, 20, 70, 70); 
        jlImg.setToolTipText("Jugador 1");
        add(jlImg);
        
        ImageIcon ii2 = new ImageIcon(getClass().getResource("../imagenes/img2.png"));
        jlImg = new JLabel(ii2);
        jlImg.setBounds(230, 20, 70, 70); 
        jlImg.setToolTipText("Jugador 2");
        add(jlImg);
        
        
                    
        JLabel jl = new JLabel("Manuel Antonio Vidales");
        jl.setBounds(20, 50, 200, 100);
        jl.setHorizontalAlignment(SwingConstants.CENTER);
        add(jl);
        
        JLabel j2 = new JLabel("Codigo: 202155481");
        j2.setBounds(20, 70, 200, 100);
        j2.setHorizontalAlignment(SwingConstants.CENTER);
        add(j2);
        
        JLabel j3 = new JLabel("manuel.vidales@correouni..");
        j3.setBounds(10, 90, 200, 100);
        j3.setHorizontalAlignment(SwingConstants.CENTER);
        add(j3);
        
        
         JLabel j4 = new JLabel("Wilian Alexis Valdes");
        j4.setBounds(160, 50, 200, 100);
        j4.setHorizontalAlignment(SwingConstants.CENTER);
        add(j4);
        
        JLabel j5 = new JLabel("Codigo: 201963151");
        j5.setBounds(160, 70, 200, 100);
        j5.setHorizontalAlignment(SwingConstants.CENTER);
        add(j5);
        
        JLabel j6 = new JLabel("wilian.valdes@correouni..");
        j6.setBounds(170, 90, 200, 100);
        j6.setHorizontalAlignment(SwingConstants.CENTER);
        add(j6);
        
        
        
        JLabel j7 = new JLabel("Versión App:");
        j7.setBounds(90, 130, 200, 100);
        j7.setHorizontalAlignment(SwingConstants.CENTER);
        add(j7);
        
        
        jbcerrar = new JButton("Cerrar");
        jbcerrar.setBounds(100, 200, 200, 30);
        jbcerrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                evento_jbcerrrar();
            }

            
        });
        add(jbcerrar);
        
    }
    
    private void evento_jbcerrrar() {
           setVisible(false);
           dispose();
           
        }
    
}
