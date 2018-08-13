package StaticFactory;

public class MainLocation {

    public static void main(String[] args) {
        
        try {
            
            Location location_1 = Location.createLocation("01237", "Dresden");
            System.out.println(location_1);
            
            Location location_2 = Location.createLocation("06766", "Wolfen");
            System.out.println(location_2);
            
        } catch (Exception exceptionObject) {
            System.out.println(exceptionObject.getMessage());
        }
        
    }
    
}