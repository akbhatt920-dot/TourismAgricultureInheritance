package tourism;

/**
 * Implements two interfaces at the same time.
 * This demonstrates Multiple Inheritance using interfaces.
 *
 * @author Akash Bhatt
 */
public class TourGuide implements Bookable, GuideService {
    private String guideName;

    /**
     * Creates a tour guide.
     * @param guideName name of guide
     */
    public TourGuide(String guideName) {
        this.guideName = guideName;
    }

    /** Books a guide service. */
    public void bookService() {
        System.out.println(guideName + " - Tour guide service booked.");
    }

    /** Provides guide information. */
    public void provideGuide() {
        System.out.println(guideName + " is providing a local tour guide service.");
    }
}
