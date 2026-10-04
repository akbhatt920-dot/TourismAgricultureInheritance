package tourism;

/**
 * Child class of TouristPlace.
 * Demonstrates Single Inheritance.
 *
 * @author Akash Bhatt
 */
public class BeachTourism extends TouristPlace {
    private String activity;

    /**
     * Creates a beach tourism object.
     * @param placeName name of beach
     * @param location location
     * @param activity main activity
     */
    public BeachTourism(String placeName, String location, String activity) {
        super(placeName, location);
        this.activity = activity;
    }

    /** Displays beach tourism details. */
    public void showBeachTourism() {
        showPlace();
        System.out.println("Activity: " + activity);
    }
}
