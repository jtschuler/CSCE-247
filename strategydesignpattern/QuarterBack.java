package strategydesignpattern;

/**
 * Player of type Quarterback
 * @author Jadon T Schuler
 */
public class QuarterBack extends Player {
    /**
     * Default constructor
     * @param name the player's unique name
     */
    public QuarterBack(String name)
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
        int rand = (int) (Math.random()*2);
        if (rand == 0) {
            super.setOffenseBehavior(new RunBehavior());
        }
        else {
            super.setOffenseBehavior(new PassBehavior());
        }
    }

    /**
     * Sets the default defensive action (none)
     */
    public void setDefenceBehavior()
    {
        super.setDefenseBehavior(null);
    }
}
