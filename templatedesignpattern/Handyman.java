package templatedesignpattern;

public class Handyman extends Worker {
    public Handyman(String name) {
        super(name);
        System.out.println(name + " is a strong handyman.");
    }

    public void work() {
        System.out.println(name + ": It's time to fix stuff");
    }
}
