package decoratordesignpattern;

/**
 * Basics of what a car decoration must do
 * @author Jadon T Schuler
 */
public abstract class VehicleDecorator extends Vehicle{
    /**
     * Append this particular decoration to the car
     * @return the newly modified description string
     */
    public abstract String toString();
}
