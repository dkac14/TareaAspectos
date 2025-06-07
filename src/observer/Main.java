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

        JButton cyan = new JButton("Cyan");
        JButton pink = new JButton("Rosado");
        JButton yellow = new JButton("Amarillo");

        cyan.addActionListener(e -> changeBackground(Color.CYAN));
        pink.addActionListener(e -> changeBackground(Color.pink));
        yellow.addActionListener(e -> changeBackground(Color.YELLOW));

        panel.add(cyan);
        panel.add(pink);
        panel.add(yellow);

        add(panel);
        setVisible(true);
    }

    private void changeBackground(Color color) {
        panel.setBackground(color);
        notifier.setColor(color);
    }

    public static void main(String[] args) {
        new Main();
    }
}
