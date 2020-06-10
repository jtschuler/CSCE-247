// Copyright 2020 Jadon Schuler

package templatedesignpattern;

/**
 * A child of the Worker class. This class defines behavior specific to police officers.
 * @author Jadon T Schuler
 */
public class Policeman extends Worker {
    /**
     * Creates a new police officer, as well as printing a job description
     * @param name the police officer's name
     */
    public Policeman(String name) {
        super(name);
        System.out.println(name + " is a courageous police officer.");
    }

    /**
     * Defines this child's specific work behavior
     */
    public void work() {
        System.out.println(name + ": It's time to get the bad guys!");
    }
}
