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
        description = "Compact";
    }

    /**
     * The cost of a compact car without modifications
     * @return the double cost
     */
    public double getCost() {
        return 15000.0;
    }
}