package decoratordesignpattern;

/**
 * Sedan object of type Vehicle
 * @author Jadon T Schuler
 */
public class Sedan extends Vehicle {

    /**
     * Creates an instance of Sedan
     */
    public Sedan() {
        description = "sedan";
    }

    /**
     * The cost of a sedan without modifications
     * @return the double cost
     */
    public double getCost() {
        return 20000.0;
    }
}
