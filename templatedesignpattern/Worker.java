// Copyright 2020 Jadon T Schuler

package templatedesignpattern;

/**
 * Abstract overarching class for all worker types
 * @author Jadon T Schuler
 */
public abstract class Worker {
    protected String name;

    /**
     * Creates a new worker
     * @param name the worker's name
     */
    public Worker(String name) {
        this.name = name;
    }

    /**
     * Performs the worker's daily routine
     */
    public void dailyRoutine() {
        wakeUp();
        eatBreakfast();
        goToWork();
        work();
        comeHome();
        eat();
        sleep();
    }

    /**
     * Wake-up method
     */
    public void wakeUp() {
        System.out.println(name + ": It's time to get out of bed sleepyhead");
    }

    /**
     * Breakfast method
     */
    public void eatBreakfast() {
        System.out.println(name + ": It's time to eat some yummy breakfast");
    }

    /**
     * Traveling method
     */
    public void goToWork() {
        System.out.println(name + ": It's time to drive to work");
    }

    /**
     * Abstract work method, to be implemented by children
     */
    public abstract void work();

    /**
     * Traveling method
     */
    public void comeHome() {
        System.out.println(name + ": It's time to drive home, YAY");
    }

    /**
     * Eating method
     */
    public void eat() {
        System.out.println(name + ": It's time to eat, yum yum yum");
    }

    /**
     * Sleeping method
     */
    public void sleep() {
        System.out.println(name + ": It's time to go back to bed...zzzzz");
    }


}
