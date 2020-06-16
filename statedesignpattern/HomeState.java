package statedesignpattern;

public class HomeState implements State {
    private TV tv;

    public HomeState(TV tv) {
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
