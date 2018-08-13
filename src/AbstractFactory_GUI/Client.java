package AbstractFactory_GUI;

public class Client {

    public static void main(String[] args) {

        IGUIFactory factory_swing = new SwingFactory();
        
        // Every window and/or button that was created in a swing-factory is
        // automatically a swing-window/button.
        IWindow window_swing = factory_swing.createWindow();
        IButton trigger_swing = factory_swing.createTrigger();
        
        window_swing.setTitle("A swing-window");
        trigger_swing.setText("A swing-button");

        // Every window and/or button that was created in a AWT-factory is
        // automatically a AWT-window/button.
        IGUIFactory factory_awt = new AwtFactory();
        
        IWindow window_awt = factory_awt.createWindow();
        IButton trigger_awt_one = factory_awt.createTrigger();
        IButton trigger_awt_two = factory_awt.createTrigger();
        
        window_awt.setTitle("A AWT-window");
        trigger_awt_one.setText("A AWT-button");
        trigger_awt_two.setText("Also a AWT-button");

    }

}
