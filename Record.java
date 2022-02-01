
public class Record {
    int matches;
    boolean isBowler;
    boolean isBatsman;
    boolean isAllRounder;
    int runs_scored;
    int wicket_taken;

    public Record(int matches, boolean isBowler, boolean isBatsman,
                  boolean isAllRounder, int runs_scored, int wicket_taken
    ) {

        this.matches = matches;
        this.isBowler = isBowler;
        this.isBatsman = isBatsman;
        this.isAllRounder = isAllRounder;
        this.runs_scored = runs_scored;
        this.wicket_taken = wicket_taken;

    }
    public void showStatistics()
    {
        System.out.println("Showing player Record.......");
        System.out.println("MATCHES =             "+matches);
        System.out.println("ISBOWLER =            "+isBowler);
        System.out.println("ISBATSMAN =           "+isBatsman);
        System.out.println("ISALLROUNDER =        "+isAllRounder);
        System.out.println("RUNS SCORED =         "+runs_scored);
        System.out.println("WICKET TAKEN =        "+wicket_taken);
    }
}
