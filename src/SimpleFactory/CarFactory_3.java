/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SimpleFactory;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class CarFactory_3 {

    Car erzeugeAuto(String newBrand, String newType, int newPS) {
        
        //  if (marke.equals("volvo")) auto = new Volvo(typ, kw);
        //  if (marke.equals("opel")) auto = new Opel(typ, kw);
        //
        // better method		
        Car myNewCar = null;
        try {
            String pack = getClass().getPackage().getName();
  
            Constructor<Car> c = (Constructor<Car>) Class.forName(pack + "." + newBrand).
                    getConstructor(String.class, Integer.TYPE);
            myNewCar = (Car) c.newInstance(newType, newPS);
            
            myNewCar.type = newType;
            myNewCar.ps= newPS;

        } catch (ClassNotFoundException | IllegalAccessException | IllegalArgumentException | InstantiationException | NoSuchMethodException | SecurityException | InvocationTargetException e) {
            System.out.println("Fehler " + e.getMessage());
        }

		

        return myNewCar;
    }
}
