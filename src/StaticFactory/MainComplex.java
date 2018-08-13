package StaticFactory;

public class MainComplex {

    public static void main(String[] args) {
        
        Complex polar = Complex.newComplexPolar(Math.PI / 6, 3);
        Complex cartesian = Complex.newComplexCartesian(2, 1);

        System.out.println("Polar: " + polar);
        System.out.println("Cartesian: " + cartesian);
        System.out.println("--------------------------");
        System.out.println("Polar AND Cartesian: " + polar.add(cartesian));
    }

}