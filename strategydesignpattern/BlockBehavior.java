package strategydesignpattern;

/**
 * Defines the block behaviors
 * @author Jadon T Schuler
 */
public class BlockBehavior implements DefenceBehavior {
    private String[] options = {"kick","punt","pass","catch"};

    /**
     * Returns a random play
     * @return selects a random play and returns the full string
     */
    @Override
    public String play()
    {
        return "blocks a " + selectPlay();
    }

    /**
     * Selects one of the four options
     * @return selects an option and returns its string
     */
    private String selectPlay()
    {
        int rand = (int)(Math.random()*4);
        return options[rand];
    }
}
