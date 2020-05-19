package decoratordesignpattern;

/**
 * Abstract vehicle class
 * @author Jadon T Schuler
 */
public abstract class Vehicle {
    protected String description;

    /**
     * A string containing useful information about the vehicle
     * @return this vehicle's description
     */
    @Override
    public String toString()
    {
        return description;
    }

    /**
     * Total cost of the vehicle, to be implemented in children
     * @return the cost of this vehicle
     */
    public abstract double getCost();
}
