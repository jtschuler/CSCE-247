package decoratordesignpattern;

/**
 * Sports car object of type Vehicle
 * @author Jadon T Schuler
 */
public class SportsCar extends Vehicle {

    /**
     * Creates an instance of SportsCar
     */
    public SportsCar() {
        description = "Sports Car";
    }

    /**
     * The cost of a sports car without modifications
     * @return the double cost
     */
    @Override
    public double getCost() {
        return 30000.0;
    }
}