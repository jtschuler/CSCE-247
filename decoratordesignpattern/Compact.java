package decoratordesignpattern;

/**
 * Compact car object of type Vehicle
 * @author Jadon T Schuler
 */
public class Compact extends Vehicle {

    /**
     * Creates an instance of Compact
     */
    public Compact() {
        description = "Compact Car";
    }

    /**
     * The cost of a compact car without modifications
     * @return the double cost
     */
    @Override
    public double getCost() {
        return 15000.0;
    }
}