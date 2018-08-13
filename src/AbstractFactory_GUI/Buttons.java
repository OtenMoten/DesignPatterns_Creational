package AbstractFactory_GUI;

import java.awt.Button;
import javax.swing.JButton;

class AwtButton extends Button implements IButton {

    @Override
    public void setText(String newLabel) {
        super.setLabel(newLabel);
    }
    
}

class SwingButton extends JButton implements IButton {

    @Override
    public void setText(String newLabel) {
        super.setText(newLabel);
    }
    
}