package b_paneles;
/**
 *
 * @author Cardeña Adilson
 */
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Paneles01 extends JFrame{
    
    public Paneles01() {
        // Dimensionar ventana
        setSize(720,480);
        
        // Posicionar ventana
        setLocationRelativeTo(null);
        
        // Colorear fondo de ventana
        getContentPane().setBackground(Color.PINK);
        
        // Habilitar el cierre de ventana
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        // Cargamos componentes
        cargarComponentes();
    }
    
    private void cargarComponentes() {
        JPanel panel = new JPanel();
        
        // Agregamos el panel a la ventana
        this.getContentPane().add(panel);
        
        // Cambiamos color al panel
        panel.setBackground(Color.CYAN);
        
        panel.setBounds(100,50,300,150);
    }
    
}
