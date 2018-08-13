package AbstractFactory_GUI;

interface IGUIFactory {

    public abstract IWindow createWindow();

    public abstract IButton createTrigger();

}
