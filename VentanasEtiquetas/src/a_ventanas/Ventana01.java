package a_ventanas;
/**
 *
 * @author Cardeña Adilson
 */
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JFrame;

public class Ventana01 extends JFrame{
    
    public Ventana01() {
        
        // Establecer el ancho y largo de la ventana
        setSize(1024,768);
        
        // Habilitar la opcion de finalizar app al cerar ventana
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        // Establecer titulo de ventana
        setTitle("Esta es mi ventana de prueba");
        
        // Establecer el tamaño minimo de la ventana
        setMinimumSize(new Dimension(420,280));
        
        // Posicionar ventana al cargarla
        setLocation(200,400); //(posX, posY)
        
        // Establecer tamaño y posicion de la ventana
        setBounds(100,50,800,600); // (posX,posY,ancho,alto)
        
        // Centrar la ventana en el centro de la pantalla
        setLocationRelativeTo(null);
        
        // Establecer un color de fondo
        getContentPane().setBackground(Color.GREEN);
    }
    
}
