package iteratordesignpattern;

/**
 * Each Item has a name, description, and price
 * @author Jadon T Schuler
 */
public class Item {
    private String title;
    private String description;
    private double price;

    /**
     * Creates an instance of Item
     * @param title The item's name
     * @param description The item's description
     * @param price The item's price (in USD)
     */
    public Item(String title, String description, double price) {
        this.title = title;
        this.description = description;
        this.price = price;
    }

    /**
     * Getter method for the item's price
     * @return The item's price
     */
    public double getPrice() {
        return price;
    }

    /**
     * Calls toString to print this item's full data
     */
    public void print() {
        System.out.println(toString());
    }

    /**
     * A string containing all properties of the item
     * @return the unique string
     */
    @Override
    public String toString() {
        return "***** " + title + " *****" + "\n" + description + "Price: " + price;
    }
}
