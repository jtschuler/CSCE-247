package observerdesignpattern;

/**
 * Interface for subjects
 */
public interface Subject {
    /**
     * Adds new observers
     * @param observer the new observer to be added
     */
    public void registerObserver(Observer observer);

    /**
     * Removes observers
     * @param observer the observer to be removed
     */
    public void removeObserver(Observer observer);

    /**
     * Updates observers with current data
     */
    public void notifyObservers();
}
