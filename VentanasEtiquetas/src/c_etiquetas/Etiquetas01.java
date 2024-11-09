package c_etiquetas;

/**
 *
 * @author Cardeña Adilson
 */
import java.awt.Color;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Etiquetas01 extends JFrame {

    // Declaramos e inicializamos objetos del tipo etiqueta
    JLabel lblA = new JLabel();
    JLabel lblB = new JLabel("", SwingConstants.RIGHT);
    JLabel lbl3 = new JLabel();
    JLabel lbl4 = new JLabel();

    // Declaramos e inicializamos un Panel
    JPanel panel = new JPanel();

    public Etiquetas01() {
        // Establecer posicion y dimensiones a la ventana
        setBounds(200, 100, 720, 480);

        // Establecer titulo de ventana
        setTitle("Uso de etiquetas JLabel");

        // Habilitar opcion de finalizar al cerrar la ventana
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Desactivamos el diseño por defecto del panel
        // Para poder mover sus objetos internos
        panel.setLayout(null);

        // Agregamos el panel a la ventana
        getContentPane().add(panel);

        // Establecer los atributos de las etiquetas
        establecerAtributosEtiquetas();

        // Agregamos las etiquetas al panel
        panel.add(lblA);
        panel.add(lblB);
        panel.add(lbl3);
        panel.add(lbl4);
    }

    private void establecerAtributosEtiquetas() {

        // Establecer texto de las etiquetas
        lblA.setText("Hola Mundo, esto es una etiqueta");
        lblB.setText(" Esta es otra etiqueta...");
        lbl3.setText("Esto tambien es una etiqueta con un texto un poco mas largo...");
        lbl4.setText("Etiqueta corta");

        // Desactivar el diseño por defecto de las etiquetas
        // Para poder cambiar los colores de fondo
        lblA.setOpaque(true);
        lblB.setOpaque(true);
        lbl3.setOpaque(true);
        lbl4.setOpaque(true);

        // Establecer colores de las etiquetas
        lblA.setForeground(Color.BLUE);
        lblB.setForeground(Color.red);
        lbl3.setForeground(Color.BLACK);
        lbl4.setForeground(Color.MAGENTA);

        // Establecer color del fondo de las etiquetas
        lblA.setBackground(Color.YELLOW);
        lblB.setBackground(Color.GREEN);
        lbl3.setBackground(Color.WHITE);
        lbl4.setBackground(Color.ORANGE);

        // Poscionar y dimensionar etiquetas
        lblA.setBounds(50, 25, 250, 25);
        lblB.setBounds(325, 25, 250, 100);
        lbl3.setBounds(100, 100, 150, 200);
        lbl4.setBounds(300, 150, 200, 100);

        // Alinear etiquetas horizontal y/o verticalmente
        lblB.setHorizontalAlignment(SwingConstants.CENTER);
        lbl4.setHorizontalAlignment(SwingConstants.RIGHT);
        lbl4.setVerticalAlignment(SwingConstants.BOTTOM);

        // Establecer tipos de fuente a las etiquetas
        lblA.setFont(new Font("Arial", Font.PLAIN, 22));
        lblB.setFont(new Font("Comics Sand MS", Font.ITALIC, 15));
        lbl3.setFont(new Font("Verdana", 3, 10));
        lbl4.setFont(new Font("Times Courier", 3, 20));
    }

}
