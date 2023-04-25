
package Vista;

import java.net.URL;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JScrollPane;


public class DescripcionyReglas extends JFrame{
    
    JEditorPane editor;
    
    public DescripcionyReglas(){
        super("Descripcion y Reglas");
        setSize(400, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        
        setLayout(null);
        crearGUI();
        
        setVisible(true);
        
    }
    
     public void crearGUI(){
         editor = new JEditorPane();
         editor.setContentType("text/html");
         URL url = getClass().getResource("../imagenes/triki.png");
         
         editor.setText(
            "<br><div align ='center'><font face='Tahoma' size='3' color='red'><strong>Descripción</font></div><br>"+
            "<size'2'>Es un juego de estrategia que se juega en un tablero de tres por tres casillas. El juego se juega entre dos jugadores, uno usa \"X\" y el otro \"O\"."
            + " Los jugadores  buscan poner su respectiva ficha de forma secuencial, ya sea en filas, columnas o digonales,"
            + " esto les permitira ganar antes que el otro jugador complete su secuencia."+
            "<br><br><div align ='center'><font face='Tahoma' size='3' color='red'><strong>Reglas</font><div>"+
            "<br>1. Cada jugador se le asiga una figura aleatoria en el juego."+"<br>"
            +"2. Un jugador solo debe tirar una vez por turno y no sobre una casilla ya jugada.<br>"
            +"3. El contrincate debe evitar que el jugador complete su serie y gane.<br>"
            +"4. Sigue alternando movimientos hasta que uno de los jugadores complete la serie de 3 o hasta que ninguno gane.<br>"
            +"5. Gana el primero que forme la serie.<br><br>"
            + "<div aling = 'center'><img src='" + url +"' width= 200 height = 200></div>"        
            +"<div align ='center'><strong>Diviertete! ");
         
       
         
         
         editor.setEditable(false);
         
         JScrollPane js = new JScrollPane(editor);
         js.setBounds(60, 30, 250, 250);
         
         add(js);
    }
    
     
    }
    
    
    
  
