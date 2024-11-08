package Ejemplo02;
/**
 * @author Cardeña Adilson
 */
import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class EtiquetasGraficas02 extends JFrame{
    
    JFrame ventana = new JFrame();
    JLabel l1;
    JLabel l2;
    JLabel l3;
    JPanel panel = new JPanel();
    
    public EtiquetasGraficas02() {
        // Atributos de ventana
        ventana.setSize(540,280);
        ventana.setResizable(true);
        ventana.setLocationRelativeTo(null);
        ventana.setTitle("Etiquetas Graficas");
        ventana.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ventana.setVisible(true);
        
        // Agregamos el panel a la ventana
        ventana.getContentPane().add(panel);
        
        panel.setBackground(Color.DARK_GRAY);
        panel.setBounds(100,50,300,150);
        panel.setLayout(null);
        
        // Gestion de etiquetas graficas
        
        l1 = new JLabel(new ImageIcon("img/icoUsuario.png"));
        l1.setText("Etiqueta Grafica 1");
        l1.setBounds(25,50,150,100);
        
        ImageIcon icono2 = new ImageIcon("img/icoConfig.png");
        l2 = new JLabel(icono2);
        l2.setText("Etiqueta grafica 2");
        l2.setBounds(200,50,150,150);
        
        ImageIcon icono3 = new ImageIcon("img/icoFacebook.png");
        l3 = new JLabel(icono3);
        l3.setText("Etiqueta grafica 3");
        l3.setBounds(370,50,150,100);
        l3.setIcon(new ImageIcon(icono3.getImage().getScaledInstance(l3.getWidth(), l3.getHeight(), Image.SCALE_SMOOTH)));
        
        panel.add(l1);
        panel.add(l2);
        panel.add(l3);
    }
    
}
