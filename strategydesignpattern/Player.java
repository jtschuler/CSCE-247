package strategydesignpattern;

/**
 * Abstract class for all Player types
 * @author Jadon T Schuler
 */
public abstract class Player {
    String name;
    boolean defence;
    DefenceBehavior defenceBehavior;
    OffenceBehavior offenceBehavior;

    /**
     * Default Constructor
     * @param name the player's unique name
     */
    public Player(String name)
    {
        this.name = name;
        defence = false;
    }

    /**
     * Sets default defense behavior
     * @param db object that determines player's defensive action
     */
    public void setDefenseBehavior(DefenceBehavior db)
    {
        defenceBehavior = db;
    }

    /**
     * Sets default offensive behavior
     * @param ob object that determines player's offensive action
     */
    public void setOffenseBehavior(OffenceBehavior ob)
    {
        offenceBehavior = ob;
    }

    /**
     * Returns this player's unique play
     * @return returns the full string describing the player's action this turn
     */
    public String play()
    {
        if (defence)
            if(defenceBehavior != null)
                return defenceBehavior.play();
            else
                return "not playing";
        else
            return offenceBehavior.play();
    }

    /**
     * Switches sides
     */
    public void turnover()
    {
        defence = !defence;
    }

    /**
     * This player's unique name
     * @return name
     */
    public String toString() {
        return this.name;
    }
}
