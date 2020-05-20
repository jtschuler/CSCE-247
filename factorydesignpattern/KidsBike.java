package factorydesignpattern;

/**
 * Unique data for kids bikes
 * @author Jadon T Schuler
 */
public class KidsBike extends Bike {
    /**
     * Stores the data for kids bikes in this instance
     */
    public KidsBike() {
        name = "Kids Bike";
        price = 80.99;
        numWheels = 2;
        hasTrainingWheels = true;
        hasPedals = true;
    }
}