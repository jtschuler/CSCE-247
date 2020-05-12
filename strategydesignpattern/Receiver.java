package strategydesignpattern;

/**
 * Player of type receiver
 * @author Jadon T Schuler
 */
public class Receiver extends Player {

    /**
     * Default constructor
     * @param name player's unique name
     */
    public Receiver(String name)
    {
        super(name);
        setDefenceBehavior();
        setOffenceBehavior();
    }

    /**
     * Sets the default offensive action
     */
    public void setOffenceBehavior()
    {
        super.setOffenseBehavior(new ReceiveBehavior());
    }

    /**
     * Sets the default defensive action (none)
     */
    public void setDefenceBehavior()
    {
        super.setDefenseBehavior(null);
    }
}