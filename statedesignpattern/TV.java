package statedesignpattern;

/**
 * Class TV. Controlled via the "buttons" (see last 4 methods) on a remote.
 */
public class TV {
    private State state;
    private State homeState;
    private State netflixState;
    private State huluState;

    /**
     * Creates a new TV object and instantiates its state objects, and sets the current state to home
     */
    public TV() {
        homeState = new HomeState(this);
        netflixState = new NetflixState(this);
        huluState = new HuluState(this);

        state = homeState;
    }

    /**
     * Sets the current state of the TV
     * @param state the new state
     */
    public void setState(State state) {
        this.state = state;
    }

    /**
     * Accessors for the different states owned by this TV
     */
    public State getHomeState(){
        return homeState;
    }

    public State getNetflixState() {
        return netflixState;
    }

    public State getHuluState() {
        return huluState;
    }

    /**
     * Each method calls the relevant button in the current state
     */
    public void pressHomeButton() {
        state.pressHomeButton();
    }

    public void pressNetflixButton() {
        state.pressNetflixButton();
    }

    public void pressHuluButton() {
        state.pressHuluButton();
    }

    public void pressMovieButton() {
        state.pressMovieButton();
    }

    public void pressTVButton() {
        state.pressTVButton();
    }
}
