package observer;

import java.awt.Color;

public class ColorChangeNotifier {
	private Color color;

    public void setColor(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }
}
