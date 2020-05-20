package factorydesignpattern;

/**
 * Unique data for Striders
 * @author Jadon T Schuler
 */
public class Strider extends Bike {
    /**
     * Stores the data for Striders in this instance
     */
    public Strider() {
        name = "Strider";
        price = 65.99;
        numWheels = 2;
        hasTrainingWheels = false;
        hasPedals = false;
    }
}