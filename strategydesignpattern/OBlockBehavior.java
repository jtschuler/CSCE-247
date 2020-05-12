package strategydesignpattern;

public class OBlockBehavior implements OffenceBehavior{
    public String play() {
        return "blocks defenders";
    }
}
