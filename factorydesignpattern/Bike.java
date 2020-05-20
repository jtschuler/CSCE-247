package factorydesignpattern;

/**
 * All bikes follow the rules outlined in this abstract class
 * @author Jadon T Schuler
 */
public abstract class Bike {
    protected String name;
    protected double price;
    protected int numWheels;
    protected boolean hasPedals;
    protected boolean hasTrainingWheels;

    /**
     * Calls helper methods to create the frame, add wheels, and add pedals
     */
    public void createBike() {
        createFrame();
        addWheels();
        addPedals();
        getPrice();
    }

    /**
     * Creates the frame
     */
    private void createFrame() {
        System.out.println("Assembling " + name + " frame");
    }

    /**
     * Adds wheels and training wheels, if any
     */
    private void addWheels() {
        if (numWheels > 0)
            System.out.println("Adding " + numWheels + " wheel(s)");
        if(hasTrainingWheels)
            System.out.println("Adding training wheels");
    }

    /**
     * Adds pedals, if they exist
     */
    private void addPedals() {
        if(hasPedals)
            System.out.println("Adding pedals");
    }

    /**
     * Gets the price of this bike
     */
    public void getPrice() {
        System.out.println("Price: $" + price);
    }
}
