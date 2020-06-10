package templatedesignpattern;

public abstract class Worker {
    protected String name;

    public Worker(String name) {
        this.name = name;
    }

    public void dailyRoutine() {
        wakeUp();
        eatBreakfast();
        goToWork();
        work();
        comeHome();
        eat();
        sleep();
    }

    public void wakeUp() {
        System.out.println(name + ": It's time to get out of bed sleepyhead");
    }

    public void eatBreakfast() {
        System.out.println(name + ": It's time to eat some yummy breakfast");
    }

    public void goToWork() {
        System.out.println(name + ": It's time to drive to work");
    }

    public abstract void work();

    public void comeHome() {
        System.out.println(name + ": It's time to drive home, YAY");
    }

    public void eat() {
        System.out.println(name + ": It's time to eat, yum yum yum");
    }

    public void sleep() {
        System.out.println(name + ": It's time to go back to bed...zzzzz");
    }


}
