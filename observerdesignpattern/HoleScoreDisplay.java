package observerdesignpattern;

/**
 * Keeps track of score for individual rounds
 * @author Jadon T Schuler
 */
public class HoleScoreDisplay implements Observer {
    private Subject golfer;

    /**
     * Constructor
     * @param golfer the subject to be observed
     */
    public HoleScoreDisplay(Golfer golfer)
    {
        this.golfer = golfer;
        golfer.registerObserver(this);
    }

    /**
     * Accepts new hole data
     * @param strokes number of strokes this hole
     * @param par par for this hole
     */
    @Override
    public void update(int strokes, int par) {
        displayHoleScore(strokes, par);
    }

    /**
     * Sends current hole data as output
     * @param strokes number of strokes this hole
     * @param par par for this hole
     */
    private void displayHoleScore(int strokes, int par)
    {
        int difference = Math.abs(strokes - par);

        System.out.println();

        System.out.println("Current round stats");
        System.out.println("Par: " + par);
        System.out.println("Strokes: " + strokes);

        // Determines relationship to par and prints data
        if(strokes < par)
            System.out.println(difference + " under par");
        else if (strokes > par)
            System.out.println(difference + " over par");
        else
            System.out.println("Made par");
    }
}
