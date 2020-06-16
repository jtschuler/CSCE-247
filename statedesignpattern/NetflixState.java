package statedesignpattern;

import java.util.ArrayList;
import java.util.List;

public class NetflixState implements State {
    private TV tv;
    private List<String> movies;
    private List<String> tvShows;

    public NetflixState(TV tv) {
        this.tv = tv;

        movies = new ArrayList<String>();
        movies.add("The Land Before Time");
        movies.add("Frozen");
        movies.add("The Little Mermaid");
        movies.add("Ice Age");

        tvShows = new ArrayList<String>();
        tvShows.add("Peppa Pig");
        tvShows.add("My Little Pony");
        tvShows.add("Garfield");
        tvShows.add("Teenage Mutant Ninja Turtles");
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
        System.out.println("We are already in Netflix\n");
    }

    @Override
    public void pressHuluButton() {
        System.out.println("Loading Hulu...\n");
        tv.setState(tv.getHuluState());
    }

    @Override
    public void pressMovieButton() {
        System.out.println("Netflix Movies:");
        displayOptions(movies);
    }

    @Override
    public void pressTVButton() {
        System.out.println("Netflix TV Shows:");
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
