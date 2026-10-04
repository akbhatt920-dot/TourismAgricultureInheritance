package tourism;

/**
 * Child of TourismActivity.
 * Another branch of Hierarchical Inheritance.
 *
 * @author Akash Bhatt
 */
public class CulturalTourism extends TourismActivity {
    public CulturalTourism() {
        super("Cultural Tourism");
    }

    /** Displays cultural activity. */
    public void showCulture() {
        showActivity();
        System.out.println("Example: Visiting historical places and museums");
    }
}
