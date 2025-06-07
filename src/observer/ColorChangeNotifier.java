package observer;

import java.awt.Color;

public class ColorChangeNotifier {
	private Color color;

    public void setColor(Color color) {
        this.color = color;
        // Aquí no hay print... lo hace el aspecto
    }

    public Color getColor() {
        return color;
    }
}
