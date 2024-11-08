package Ejemplo03;
/**
 *
 * @author Cardeña Adilson
 */
import java.awt.Color;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class EtiquetasCasillas extends JFrame {

    JFrame ventana = new JFrame();
    JLabel l1 = new JLabel();
    JLabel l2 = new JLabel();
    JLabel l3 = new JLabel();

    JTextField txt1 = new JTextField();
    JTextField txt2 = new JTextField();
    JTextField txt3 = new JTextField();
    JTextField txt4 = new JTextField();

    JPanel panel = new JPanel();

    public EtiquetasCasillas() {
        // Atributos de ventanas
        ventana.setSize(480, 280);
        ventana.setLocationRelativeTo(null);
        ventana.setTitle("Etiquetas y Casillas");
        ventana.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ventana.setVisible(true);

        // Establecer el texto de las 3 etiquetas
        l1.setText("Etiqueta Nro.01");
        l2.setText("Etiqueta Nro.01");
        l3.setText("Etiqueta Nro.02");

        // Establecer y dimensionar las etiquetas
        l1.setBounds(50, 10, 100, 25);
        l2.setBounds(50, 40, 100, 25);
        l3.setBounds(50, 70, 100, 25);

        l1.setOpaque(true);
        l2.setOpaque(true);
        l3.setOpaque(true);

        l1.setBackground(Color.PINK);
        l2.setBackground(Color.PINK);
        l3.setBackground(Color.PINK);

        // Establecer el texto vacio de las etiquetas
        txt1.setText("");
        txt2.setText("");
        txt3.setText("");

        // Establecer tipo de fuente de la casilla 4
        txt4.setFont(new Font(" Comic Sans MS ", Font.ITALIC, 30));

        // Posicionar y dimensionar las caisllas de texto
        txt1.setBounds(200, 10, 200, 25);
        txt2.setBounds(200, 40, 200, 25);
        txt3.setBounds(200, 70, 200, 25);
        txt4.setBounds(50, 110, 350, 100);

        // Establecer opacidad de las casillas de texto
        txt1.setForeground(Color.BLUE);
        txt2.setForeground(Color.RED);
        txt3.setForeground(Color.BLACK);
        txt4.setForeground(Color.DARK_GRAY);

        // Establecemos el color del fondo de las etiquetas
        txt1.setBackground(Color.YELLOW);
        txt2.setBackground(Color.GREEN);
        txt3.setBackground(Color.WHITE);
        txt4.setBackground(Color.LIGHT_GRAY);

        panel.setBackground(Color.CYAN);
        panel.setBounds(50, 50, 50, 25);

        panel.setLayout(null);
        panel.add(l1);
        panel.add(txt1);
        panel.add(l2);
        panel.add(txt2);
        panel.add(l3);
        panel.add(txt3);
        panel.add(txt4);

        // Agregamos el panal a la ventana
        ventana.getContentPane().add(panel);
    }

}
