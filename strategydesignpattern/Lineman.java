package strategydesignpattern;

public class Lineman extends Player {

    public Lineman(String name)
    {
        super(name);
        setDefenceBehavior();
        setOffenceBehavior();
    }

    public void setOffenceBehavior()
    {
        super.setOffenseBehavior(new OBlockBehavior());
    }
    public void setDefenceBehavior()
    {
        int rand = (int) (Math.random()*3);
        if (rand == 0) {
            super.setDefenseBehavior(new BlockBehavior());
        }
        else if (rand == 1) {
            super.setDefenseBehavior(new StripBehavior());
        }
        else {
            super.setDefenseBehavior(new SackBehavior());
        }
    }
}