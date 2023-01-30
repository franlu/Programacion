
import javax.swing.*;
import java.awt.*;
/**
 *
 * @author Fran
 */
public class 00gui {

    public static void main(String args[]) {      
        
        JFrame frame = new JFrame("Mi primera GUI");      
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);      
        frame.setSize(300, 300);      
        
        frame.setLayout(new FlowLayout());
        JLabel etiqueta = new JLabel("Nombre: ");
        JTextField texto = new JTextField(20);
        JButton boton = new JButton("Saludar");
        frame.add(etiqueta);
        frame.add(texto);
        frame.add(boton);
        
        frame.setVisible(true);  
    }
}
