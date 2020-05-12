package strategydesignpattern;

/**
 * Defines pass behaviors
 * @author Jadon T Schuler
 */
public class PassBehavior implements OffenceBehavior {
    private String[] options = {"slant route","out route","seem route","screen pass", "hail mary"};

    /**
     * Returns a random play
     * @return returns the full string
     */
    @Override
    public String play()
    {
        return "throws a " + selectPlay();
    }

    /**
     * Selects a random pass play
     * @return returns the String for the random play
     */
    private String selectPlay()
    {
        int rand = (int)(Math.random()*5);
        return options[rand];
    }
}
