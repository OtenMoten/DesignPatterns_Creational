package AbstractFactory_GUI;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

class SwingFactory implements IGUIFactory {

    private JFrame mainWindow;
    private JButton trigger;

    @Override
    public IWindow createWindow() {
        this.mainWindow = new SwingWindow();
        this.mainWindow.setBounds(700, 300, 500, 200);
        this.mainWindow.getContentPane().setBackground(Color.YELLOW);
        this.mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.mainWindow.getContentPane().setLayout(new FlowLayout());
        this.mainWindow.setVisible(true);
        return (IWindow) this.mainWindow;
    }

    @Override
    public IButton createTrigger() {
        this.trigger = new SwingButton();
        this.mainWindow.getContentPane().add(this.trigger);
        return (IButton) this.trigger;
    }
    
}