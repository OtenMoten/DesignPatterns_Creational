package AbstractFactory_GUI;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class AwtFactory implements IGUIFactory {

    private Frame mainFrame;
    private Button trigger;

    @Override
    public IWindow createWindow() {
        
        this.mainFrame = new AwtWindow();
        this.mainFrame.setBounds(100, 300, 500, 200);
        this.mainFrame.setBackground(Color.GRAY);
        this.mainFrame.setLayout(new FlowLayout());
        this.mainFrame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        this.mainFrame.setVisible(true);
        return (AwtWindow) this.mainFrame;
        // return (IWindow) this.mainFrame; // works also
        
    }

    @Override
    public IButton createTrigger() {
        
        this.trigger = new AwtButton();
        this.mainFrame.add(this.trigger);
        return (AwtButton) this.trigger;
        // return (IButton) this.trigger; // works also
        
    }
    
}