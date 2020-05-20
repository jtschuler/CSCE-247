package factorydesignpattern;

/**
 * Unique data for tricycles
 * @author Jadon T Schuler
 */
public class Tricycle extends Bike {
    /**
     * Stores the data for tricycles in this instance
     */
    public Tricycle() {
        name = "Tricycle";
        price = 54.95;
        numWheels = 3;
        hasTrainingWheels = false;
        hasPedals = true;
    }
}
