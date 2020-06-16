package statedesignpattern;

import java.util.ArrayList;
import java.util.List;

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
        System.out.println("TV is already on the home screen\n");
    }

    @Override
    public void pressNetflixButton() {
        System.out.println("Loading Netflix...\n");
        tv.setState(tv.getNetflixState());
    }

    @Override
    public void pressHuluButton() {
        System.out.println("Loading Hulu...\n");
        tv.setState(tv.getHuluState());
    }

    @Override
    public void pressMovieButton() {
        System.out.println("You must pick an app to show movies.\n");
    }

    @Override
    public void pressTVButton() {
        System.out.println("You must pick an app to show tv shows.\n");
    }
}
