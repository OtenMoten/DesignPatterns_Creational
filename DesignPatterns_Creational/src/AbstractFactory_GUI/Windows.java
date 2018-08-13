package AbstractFactory_GUI;

import java.awt.Frame;
import javax.swing.JFrame;

class AwtWindow extends Frame implements IWindow {

    @Override
    public void setTitle(String newLabel) {
        super.setTitle(newLabel);
    }

}

class SwingWindow extends JFrame implements IWindow {

    @Override
    public void setTitle(String newLabel) {
        super.setTitle(newLabel);
    }
    
}