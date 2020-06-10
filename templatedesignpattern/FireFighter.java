// Copyright 2020 Jadon Schuler

package templatedesignpattern;

/**
 * A child of the Worker class. This class defines behavior specific to firefighters.
 * @author Jadon T Schuler
 */
public class FireFighter extends Worker {
    /**
     * Creates a new firefighter, as well as printing a job description
     * @param name the firefighter's name
     */
    public FireFighter(String name) {
        super(name);
        System.out.println(name + " is a brave fire fighter.");
    }

    /**
     * Defines this child's specific work behavior
     */
    public void work() {
        System.out.println(name + ": It's time to water down the fires");
    }
}
