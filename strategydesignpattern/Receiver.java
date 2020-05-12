package strategydesignpattern;

public class Receiver extends Player {

    public Receiver(String name)
    {
        super(name);
        setDefenceBehavior();
        setOffenceBehavior();
    }

    public void setOffenceBehavior()
    {
        super.setOffenseBehavior(new ReceiveBehavior());
    }
    public void setDefenceBehavior()
    {
        super.setDefenseBehavior(null);
    }
}