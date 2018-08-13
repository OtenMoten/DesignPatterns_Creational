/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SimpleFactory;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class CarFactory_3 {

    Car createCar(String newBrand, String newType, int newPS) {
        		
        Car myNewCar = null;
        try {
            String classPackageString = getClass().getPackage().getName();
  
            //  Get the constructor of the current car of this class-object.
            Constructor<Car> carConstructor = (Constructor<Car>) Class.forName(classPackageString + "." + newBrand).
                    getConstructor(String.class, Integer.TYPE);
            
            //  Create a car and define attributes instantly because we have a constructor from above.
            myNewCar = (Car) carConstructor.newInstance(newType, newPS);

        } catch (ClassNotFoundException | IllegalAccessException | IllegalArgumentException | InstantiationException | NoSuchMethodException | SecurityException | InvocationTargetException objException) {
            System.out.println("Fehler " + objException.getMessage());
        }

        return myNewCar;
    }
    
}