package strategydesignpattern;

/**
 * Defines the different run behaviors
 * @author Jadon T Schuler
 */
public class RunBehavior implements OffenceBehavior {
    private String[] options = {"drive (up the gut)","draw","pitch","reverse"};

    /**
     * Defines the behavior
     * @return the string of the chosen action
     */
    @Override
    public String play()
    {
        return "runs a " + selectPlay();
    }

    /**
     * Chooses which action
     * @return action selected
     */
    private String selectPlay()
    {
        int rand = (int)(Math.random()*4);
        return options[rand];
    }
}
