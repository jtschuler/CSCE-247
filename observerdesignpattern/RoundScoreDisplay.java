package observerdesignpattern;

/**
 * Keeps track of score over the entire course
 * @author Jadon T Schuler
 */
public class RoundScoreDisplay implements Observer {
    private Subject golfer;
    private int strokesTotal;
    private int parTotal;

    /**
     * Constructor
     * @param golfer the subject to be observed
     */
    public RoundScoreDisplay(Golfer golfer) {
        this.golfer = golfer;
        golfer.registerObserver(this);
        strokesTotal = 0;
        parTotal = 0;
    }

    /**
     * Accepts new hole data
     * @param strokes number of strokes this hole
     * @param par par for this hole
     */
    @Override
    public void update(int strokes, int par) {
        this.strokesTotal += strokes;
        this.parTotal += par;
        displayRoundScore();
    }

    /**
     * Sends current round data as output
     */
    private void displayRoundScore()
    {
        int difference = Math.abs(strokesTotal - parTotal);

        System.out.println();

        System.out.println("Current round stats");
        System.out.println("Par: " + parTotal);
        System.out.println("Strokes: " + strokesTotal);

        // Determines relationship to par and prints data
        if(strokesTotal < parTotal)
            System.out.println(difference + " under par");
        else if (strokesTotal > parTotal)
            System.out.println(difference + " over par");
        else
            System.out.println("Made par");
    }
}