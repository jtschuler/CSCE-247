package strategydesignpattern;

/**
 * Controls the behavior of Lineman objects
 * @author Jadon T Schuler
 */
public class Lineman extends Player {

    /**
     * Sets default values
     * @param name The player's name
     */
    public Lineman(String name)
    {
        super(name);
        setDefenceBehavior();
        setOffenceBehavior();
    }

    /**
     * Sets the default offencive behavior
     */
    public void setOffenceBehavior()
    {
        super.setOffenseBehavior(new OBlockBehavior());
    }

    /**
     * Selects from one of three random defencive behaviors
     */
    public void setDefenceBehavior()
    {
        int rand = (int) (Math.random()*3);
        if (rand == 0) {
            super.setDefenseBehavior(new BlockBehavior());
        }
        else if (rand == 1) {
            super.setDefenseBehavior(new StripBehavior());
        }
        else {
            super.setDefenseBehavior(new SackBehavior());
        }
    }
}