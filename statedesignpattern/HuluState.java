package statedesignpattern;

import java.util.ArrayList;
import java.util.List;

public class HuluState implements State {
    private TV tv;
    private List<String> movies;
    private List<String> tvShows;

    public HuluState(TV tv) {
        this.tv = tv;
        movies = new ArrayList<String>();
        tvShows = new ArrayList<String>();
    }

    /**
     * Each method will change state, or display a relevant method if the state is already selected
     */
    @Override
    public void pressHomeButton() {
        System.out.println("Loading the home screen...");
        tv.setState(tv.getHomeState());
    }

    @Override
    public void pressNetflixButton() {
        System.out.println("Loading Netflix...");
        tv.setState(tv.getNetflixState());
    }

    @Override
    public void pressHuluButton() {
        System.out.println("We are already in Hulu");
    }

    @Override
    public void pressMovieButton() {
        System.out.println("Hulu Movies:");
        displayOptions(movies);
    }

    @Override
    public void pressTVButton() {
        System.out.println("Hulu TV Shows:");
        displayOptions(tvShows);
    }

    /**
     * Private helper to display a list of strings
     * @param list the list to be displayed
     */
    private void displayOptions(List<String> list) {
        for (String s : list) {
            System.out.println("- " + s);
        }
    }
}
