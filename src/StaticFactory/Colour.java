package StaticFactory;

import java.awt.Color;

public class Colour {

    private Colour() {}

    public static Color createColorFromRGB(int red, int green, int blue) {
        Color color = new Color(red, green, blue);
        return color;
    }

    public static Color createFromHSB() {
        return Color.getHSBColor(3, 7, 10);
    }

}