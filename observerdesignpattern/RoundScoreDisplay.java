package observerdesignpattern;

/**
 * Keeps track of score over the entire course
 * @author Jadon T Schuler
 */
public class RoundScoreDisplay implements Observer {
    private Subject golfer;
    private int strokes;
    private int par;

    /**
     * Constructor
     *
     * @param golfer the subject to be observed
     */
    public RoundScoreDisplay(Golfer golfer) {
        this.golfer = golfer;
        golfer.registerObserver(this);
        strokes = 0;
        par = 0;
    }

    /**
     * Accepts new hole data
     * @param strokes number of strokes this hole
     * @param par par for this hole
     */
    @Override
    public void update(int strokes, int par) {
        this.strokes += strokes;
        this.par += par;
        displayRoundScore();
    }

    /**
     * Sends current round data as output
     */
    private void displayRoundScore()
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