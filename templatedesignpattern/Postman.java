// Copyright 2020 Jadon Schuler

package templatedesignpattern;

/**
 * A child of the Worker class. This class defines behavior specific to postmen.
 * @author Jadon T Schuler
 */
public class Postman extends Worker {
    /**
     * Creates a new postman, as well as printing a job description
     * @param name the postman's name
     */
    public Postman(String name) {
        super(name);
        System.out.println(name + " is a weather-proof postman.");
    }

    /**
     * Defines this child's specific work behavior
     */
    public void work() {
        System.out.println(name + ": It's time to deliver the mail");
    }
}
