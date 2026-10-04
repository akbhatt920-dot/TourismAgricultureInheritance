package tourism;

/**
 * Base class for a tourist place.
 * This class is used for Single Inheritance.
 *
 * @author Akash Bhatt
 */
public class TouristPlace {
    protected String placeName;
    protected String location;

    /**
     * Creates a tourist place.
     * @param placeName name of the place
     * @param location location of the place
     */
    public TouristPlace(String placeName, String location) {
        this.placeName = placeName;
        this.location = location;
    }

    /** Displays tourist place details. */
    public void showPlace() {
        System.out.println("Place: " + placeName);
        System.out.println("Location: " + location);
    }
}
