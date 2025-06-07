package aspects;

import observer.ColorChangeNotifier;
import java.awt.Color;
import javax.swing.JOptionPane;

public aspect ColorChangeAspect {

    private int contador = 0;

    // Se ejecuta después de llamar a setColor(Color)
    after(Color c): call(void observer.ColorChangeNotifier.setColor(Color)) && args(c) {
        contador++;
        System.out.println(">> Color de fondo cambiado a: " + colorToString(c));

        if (contador == 5) {
            JOptionPane.showMessageDialog(null,
                "Has cambiado el color 5 veces.",
                "Notificación",
                JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private String colorToString(Color c) {
        if (Color.RED.equals(c)) return "Rojo";
        if (Color.GREEN.equals(c)) return "Verde";
        if (Color.BLUE.equals(c)) return "Azul";
        return "Desconocido";
    }
}
