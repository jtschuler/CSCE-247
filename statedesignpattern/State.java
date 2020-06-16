package statedesignpattern;

/**
 * Interface for all states
 * @author jtschuler
 */
public interface State {
    /**
     * Each method will change state, or display a relevant method if the state is already selected
     */
    public void pressHomeButton();
    public void pressNetflixButton();
    public void pressHuluButton();
    public void pressMovieButton();
    public void pressTVButton();
}
