package templatedesignpattern;

public class Policeman extends Worker {
    public Policeman(String name) {
        super(name);
        System.out.println(name + " is a courageous police officer.");
    }

    public void work() {
        System.out.println(name + ": It's time to get the bad guys!");
    }
}
