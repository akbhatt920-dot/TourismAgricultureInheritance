package tourism;

/**
 * Child of TourismActivity.
 * One branch of Hierarchical Inheritance.
 *
 * @author Akash Bhatt
 */
public class AdventureTourism extends TourismActivity {
    public AdventureTourism() {
        super("Adventure Tourism");
    }

    /** Displays adventure activity. */
    public void showAdventure() {
        showActivity();
        System.out.println("Example: Trekking and river rafting");
    }
}
