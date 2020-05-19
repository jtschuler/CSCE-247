package decoratordesignpattern;

/**
 * Adding rims to an existing vehicle
 * @author Jadon T Schuler
 */
public class Rims extends VehicleDecorator {
    private Vehicle vehicle;

    /**
     * Creates an instance of rims
     * @param vehicle the vehicle to be decorated
     */
    public Rims(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    /**
     * Adds this decoration to the vehicle
     * @return the newly modified string
     */
    public String toString() {
        return vehicle.toString() + ", cool rims";
    }

    /**
     * Adds the cost of this decoration
     * @return the newly modified cost
     */
    public double getCost() {
        return vehicle.getCost() + 200.0;
    }
}