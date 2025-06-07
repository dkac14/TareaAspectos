package observer;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main extends JFrame{
	private JPanel panel;
    private ColorChangeNotifier notifier;

    public Main() {
    	//Creo interfaz con componentes de JFrame
        setTitle("Observer con AspectJ");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //Inicializo panel e instancia de clase ColorChangeNotifier
        panel = new JPanel();
        notifier = new ColorChangeNotifier();

        //Creo 3 botones para los colores
        JButton cyan = new JButton("Cyan");
        JButton pink = new JButton("Rosado");
        JButton yellow = new JButton("Amarillo");

        //Llamo a listener para asignar función de cada botón
        cyan.addActionListener(e -> changeBackground(Color.CYAN));
        pink.addActionListener(e -> changeBackground(Color.pink));
        yellow.addActionListener(e -> changeBackground(Color.YELLOW));

        //Agrego botones al panel
        panel.add(cyan);
        panel.add(pink);
        panel.add(yellow);

        add(panel);
        setVisible(true);
    }

    //Método para cambiar el color del panel
    private void changeBackground(Color color) {
        panel.setBackground(color);
        notifier.setColor(color);
    }

    //Para ejecutar nuestra ventana
    public static void main(String[] args) {
        new Main();
    }
}
