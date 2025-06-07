package observer;

import java.awt.Color;

public class ColorChangeNotifier {
	private Color color;

	//setter
    public void setColor(Color color) {
        this.color = color;
    }
    //getter
    public Color getColor() {
        return color;
    }
}
