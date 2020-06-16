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
        movies.add("Cars");
        movies.add("WALL-E");
        movies.add("Cinderella");
        movies.add("ET");

        tvShows = new ArrayList<String>();
        tvShows.add("Sesame Street");
        tvShows.add("Care Bears");
        tvShows.add("Looney Tunes");
    }

    /**
     * Each method will change state, or display a relevant method if the state is already selected
     */
    @Override
    public void pressHomeButton() {
        System.out.println("Loading the home screen...\n");
        tv.setState(tv.getHomeState());
    }

    @Override
    public void pressNetflixButton() {
        System.out.println("Loading Netflix...\n");
        tv.setState(tv.getNetflixState());
    }

    @Override
    public void pressHuluButton() {
        System.out.println("We are already in Hulu\n");
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
        System.out.println();
    }
}
