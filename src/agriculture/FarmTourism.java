package agriculture;

import tourism.TourismActivity;

/**
 * Agriculture tourism class.
 * Extends TourismActivity and adds agriculture functionality.
 * It is another practical example of combining the two domains.
 *
 * @author Akash Bhatt
 */
public class FarmTourism extends TourismActivity {
    private String farmName;

    /**
     * Creates a farm tourism activity.
     * @param farmName farm name
     */
    public FarmTourism(String farmName) {
        super("Farm Tourism");
        this.farmName = farmName;
    }

    /** Displays farm tourism details. */
    public void showFarmTourism() {
        showActivity();
        System.out.println("Farm: " + farmName);
        System.out.println("Visitors can experience farming activities.");
    }
}
