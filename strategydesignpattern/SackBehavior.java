package strategydesignpattern;

/**
 * Defines default behavior for sacks
 * @author Jadon T Schuler
 */
public class SackBehavior implements DefenceBehavior {

    /**
     * What happens with sacks
     * @return the string describing the action
     */
    @Override
    public String play()
    {
        return "sacks the quarterback";
    }
}
