package decoratordesignpattern;

/**
 * Adding a sound system to an existing vehicle
 * @author Jadon T Schuler
 */
public class SoundSystem extends VehicleDecorator {
    private Vehicle vehicle;

    /**
     * Creates an instance of SoundSystem
     * @param vehicle the vehicle to be decorated
     */
    public SoundSystem(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    /**
     * Adds this decoration to the vehicle
     * @return the newly modified string
     */
    public String toString() {
        return vehicle.toString() + ", awesome sound";
    }

    /**
     * Adds the cost of this decoration
     * @return the newly modified cost
     */
    public double getCost() {
        return vehicle.getCost() + 350.0;
    }
}