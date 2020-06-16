package statedesignpattern;

public class NetflixState implements State {
    private TV tv;

    public NetflixState(TV tv) {
        this.tv = tv;
    }

    /**
     * Each method will change state, or display a relevant method if the state is already selected
     */
    @Override
    public void pressHomeButton() {

    }

    @Override
    public void pressNetflixButton() {

    }

    @Override
    public void pressHuluButton() {

    }

    @Override
    public void pressMovieButton() {

    }

    @Override
    public void pressTVButton() {

    }
}
