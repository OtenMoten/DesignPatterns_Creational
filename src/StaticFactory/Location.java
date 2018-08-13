package StaticFactory;

public class Location {

    private static String zipCode, cityName;

    public static Location createLocation(String newZipCode, String newCityName) {
        
        //  First, check whether zipcode contains only digits and exists exactly of five(5) digits.
        if (isZIPvalid(newZipCode)) {
            return new Location(newZipCode, newCityName);
        } else {
            throw new IllegalArgumentException("illegal ZIPCODE");
        }
        
    }

    //  Private constructor that only a function of the same class can read.
    //  In our case, the "createLocation"-function uses it.
    private Location(String newZipCode, String newCityName) {
        Location.zipCode = newZipCode; //   Direct access because of static keyword
        Location.cityName = newCityName; //   Direct access because of static keyword
    }

    //  Define the guidelines for a zipcode.
    private static boolean isZIPvalid(String inputZipCode) {
        return inputZipCode.matches("[0-9]{5}");
    }

    @Override
    public String toString() {
        return Location.zipCode + " " + Location.cityName;
    }

}