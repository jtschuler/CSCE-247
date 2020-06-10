package templatedesignpattern;

public class FireFighter extends Worker {
    public FireFighter(String name) {
        super(name);
        System.out.println(name + " is a brave fire fighter.");
    }

    public void work() {
        System.out.println(name + ": It's time to water down the fires");
    }
}
