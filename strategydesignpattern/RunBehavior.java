package strategydesignpattern;

public class RunBehavior implements OffenceBehavior {
    private String[] options = {"drive (up the gut)","draw","pitch","reverse"};

    public String play()
    {
        return "runs a " + selectPlay();
    }

    private String selectPlay()
    {
        int rand = (int)(Math.random()*4);
        return options[rand];
    }
}
