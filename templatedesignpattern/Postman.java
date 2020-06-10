package templatedesignpattern;

public class Postman extends Worker {
    public Postman(String name) {
        super(name);
        System.out.println(name + " is a weather-proof postman.");
    }

    public void work() {
        System.out.println(name + ": It's time to deliver the mail");
    }
}
