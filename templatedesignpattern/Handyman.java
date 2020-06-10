// Copyright 2020 Jadon Schuler

package templatedesignpattern;

/**
 * A child of the Worker class. This class defines behavior specific to handymen.
 * @author Jadon T Schuler
 */
public class Handyman extends Worker {
    /**
     * Creates a new handyman, as well as printing a job description
     * @param name the handyman's name
     */
    public Handyman(String name) {
        super(name);
        System.out.println(name + " is a strong handyman");
    }

    /**
     * Defines this child's specific work behavior
     */
    public void work() {
        System.out.println(name + ": It's time to fix stuff");
    }
}
