package strategydesignpattern;

/**
 * Defines behavior of receivers
 * @author Jadon T Schuler
 */
public class ReceiveBehavior implements OffenceBehavior {
    private String[] options = {"slant route","out route","seem route","screen pass", "hail mary"};

    /**
     * Sets the offensive action
     * @return the full string
     */
    @Override
    public String play()
    {
        return "runs a " + selectPlay();
    }

    /**
     * Selects the random play
     * @return random string
     */
    private String selectPlay()
    {
        int rand = (int)(Math.random()*5);
        return options[rand];
    }
}
