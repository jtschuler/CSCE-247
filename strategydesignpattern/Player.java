package strategydesignpattern;

public abstract class Player {
    String name;
    boolean defence;
    DefenceBehavior defenceBehavior;
    OffenceBehavior offenceBehavior;

    public Player(String name)
    {
        this.name = name;
        defence = false;
    }

    public void setDefenseBehavior(DefenceBehavior db)
    {
        defenceBehavior = db;
    }
    public void setOffenseBehavior(OffenceBehavior ob)
    {
        offenceBehavior = ob;
    }

    public String play()
    {
        if (defence)
            if(defenceBehavior != null)
                return defenceBehavior.play();
            else
                return "not playing";
        else
            return offenceBehavior.play();
    }

    public void turnover()
    {
        defence = !defence;
    }

    public String toString() {
        return this.name;
    }
}
