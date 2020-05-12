package strategydesignpattern;

public class QuarterBack extends Player {

    public QuarterBack(String name)
    {
        super(name);
        setDefenceBehavior();
        setOffenceBehavior();
    }

    public void setOffenceBehavior()
    {
        int rand = (int) (Math.random()*2);
        if (rand == 0) {
            super.setOffenseBehavior(new RunBehavior());
        }
        else {
            super.setOffenseBehavior(new PassBehavior());
        }
    }
    public void setDefenceBehavior()
    {
        super.setDefenseBehavior(null);
    }
}
