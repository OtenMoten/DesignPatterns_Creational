package StaticFactory;

import javax.swing.JFrame;

public class MainColour {

    public static void main(String[] args) {
        
        JFrame frame = new JFrame();
        
        frame.setSize(200, 100);

        frame.getContentPane().setBackground(Colour.createFromHSB());

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        frame.setVisible(true);
        
    }

}
