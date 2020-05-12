package strategydesignpattern;

public class ReceiveBehavior implements OffenceBehavior {
    private String[] options = {"slant route","out route","seem route","screen pass", "hail mary"};

    public String play()
    {
        return "runs a " + selectPlay();
    }

    private String selectPlay()
    {
        int rand = (int)(Math.random()*5);
        return options[rand];
    }
}
