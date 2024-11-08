package Ejemplo01;
/**
 * @author Cardeña Adilson
 */
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class EtiquetasGraficas01 extends JFrame{
    
    JFrame ventana = new JFrame();
    JLabel l1 = new JLabel();
    JLabel l2 = new JLabel();
    JLabel l3 = new JLabel();
    JLabel l4 = new JLabel();
    
    JPanel panel = new JPanel();
    
    public EtiquetasGraficas01() {
        // Atributos de ventana
        ventana.setSize(360,180);
        ventana.setResizable(true);
        ventana.setLocationRelativeTo(null);
        ventana.setTitle("Etiquetas Graficas");
        ventana.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ventana.setVisible(true);
        
        // Gestion de etiquetas textuales
        l1.setText("Etiquetas Nro.01");
        l2.setText("Etiquetas Nro.02");
        l3.setText("Etiquetas Nro.03");
        l4.setText("Etiquetas Nro.04");
        
        l1.setBounds(50,10,200,25);
        l2.setBounds(50,40,200,25);
        l3.setBounds(50,70,200,25);
        l4.setBounds(50,100,200,25);
        
        l1.setOpaque(true);
        l2.setOpaque(true);
        l3.setOpaque(true);
        l4.setOpaque(true);
        
        // Establecer colores de las etiquetas
        l1.setForeground(Color.BLUE);
        l2.setForeground(Color.RED);
        l3.setForeground(Color.BLACK);
        l4.setForeground(Color.MAGENTA);
        
        // Establecer el color del fondo de las etiquetas
        l1.setBackground(Color.YELLOW);
        l2.setBackground(Color.GREEN);
        l3.setBackground(Color.WHITE);
        l4.setBackground(Color.CYAN);
        
        // Agregamos etiquetas al panel
        // Atributos de panel
        panel.setBackground(Color.LIGHT_GRAY);
        panel.setBounds(100,50,300,150);
        panel.setLayout(null);
        panel.add(l1);
        panel.add(l2);
        panel.add(l3);
        panel.add(l4);
        
        // Agregamos el panel a la ventana
        ventana.getContentPane().add(panel);
    }
    
}
