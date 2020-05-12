package strategydesignpattern;

/**
 * Sets the default behavior for offencive blocks
 * @author Jadon T Schuler
 */
public class OBlockBehavior implements OffenceBehavior{
    /**
     * Defines play for OBlockBehavior
     * @return returns the behavior
     */
    public String play() {
        return "blocks defenders";
    }
}
