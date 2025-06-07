package observer;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main extends JFrame{
	private JPanel panel;
    private ColorChangeNotifier notifier;

    public Main() {
        setTitle("Observer con AspectJ");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel = new JPanel();
        notifier = new ColorChangeNotifier();

        JButton rojo = new JButton("Rojo");
        JButton verde = new JButton("Verde");
        JButton azul = new JButton("Azul");

        rojo.addActionListener(e -> changeBackground(Color.RED));
        verde.addActionListener(e -> changeBackground(Color.GREEN));
        azul.addActionListener(e -> changeBackground(Color.BLUE));

        panel.add(rojo);
        panel.add(verde);
        panel.add(azul);

        add(panel);
        setVisible(true);
    }

    private void changeBackground(Color color) {
        panel.setBackground(color);
        notifier.setColor(color); // Dispara la "notificación"
    }

    public static void main(String[] args) {
        new Main();
    }
}
