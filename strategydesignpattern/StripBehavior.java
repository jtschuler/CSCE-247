package strategydesignpattern;

/**
 * Defines strip behavior
 * @author Jadon T Schuler
 */
public class StripBehavior implements DefenceBehavior {

    /**
     * Defines the strip action
     * @return string describing action
     */
    public String play()
    {
        return "strips a ball from runner's hands";
    }
}
