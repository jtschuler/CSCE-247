package decoratordesignpattern;

/**
 * Adding paint decoration to an existing vehicle
 * @author Jadon T Schuler
 */
public class Paint extends VehicleDecorator {
    private Vehicle vehicle;

    /**
     * Creates an instance of paint
     * @param vehicle the vehicle to be decorated
     */
    public Paint(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    /**
     * Adds this decoration to the vehicle
     * @return the newly modified string
     */
    public String toString() {
        return vehicle.toString() + ", fancy paint";
    }

    /**
     * Adds the cost of this decoration
     * @return the newly modified cost
     */
    public double getCost() {
        return vehicle.getCost() + 150.0;
    }
}