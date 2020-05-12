package strategydesignpattern;

public class BlockBehavior implements DefenceBehavior {
    private String[] options = {"kick","punt","pass","catch"};

    public String play()
    {
        return "blocks a " + selectPlay();
    }

    private String selectPlay()
    {
        int rand = (int)(Math.random()*4);
        return options[rand];
    }
}
