package tourism;

/**
 * Parent class for Hierarchical Inheritance.
 *
 * @author Akash Bhatt
 */
public class TourismActivity {
    protected String activityName;

    /**
     * Creates a tourism activity.
     * @param activityName activity name
     */
    public TourismActivity(String activityName) {
        this.activityName = activityName;
    }

    /** Displays common activity details. */
    public void showActivity() {
        System.out.println("Tourism Activity: " + activityName);
    }
}
