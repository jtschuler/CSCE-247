package observerdesignpattern;

import java.util.ArrayList;

/**
 * Golfer
 * @author Jadon T Schuler
 */
public class Golfer implements Subject {
    private String name;
    private int strokes;
    private int par;
    private ArrayList<Observer> observers;

    /**
     * Constructor
     * @param name Golfer's name
     */
    public Golfer(String name) {
        this.name = name;
        strokes = 0;
        par = 0;
    }

    /**
     * Add an observer to observers
     * @param observer The observer to be added
     */
    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    /**
     * Remove an observer from observers
     * @param observer The observer to be removed
     */
    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    /**
     * Sends score of last hole to observers
     */
    @Override
    public void notifyObservers() {
        for(Observer observer: observers) {
            observer.update(strokes, par);
        }
    }

    /**
     * Updates strokes and par, then updates observers
     * @param strokes the number of strokes in the last hole
     * @param par par number of strokes for last hole
     */
    public void enterScore(int strokes, int par)
    {
        this.strokes = strokes;
        this.par = par;
        notifyObservers();
    }

    /**
     * Retrieves the name of this golfer
     * @return name
     */
    public String getName() {
        return name;
    }
}
