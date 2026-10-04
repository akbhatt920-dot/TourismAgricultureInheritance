package tourism;

/**
 * Child of TransportService.
 * Demonstrates the third level of Multilevel Inheritance.
 *
 * @author Akash Bhatt
 */
public class TourPackage extends TransportService {
    private int days;

    /**
     * Creates a tour package.
     * @param serviceName service name
     * @param vehicle vehicle
     * @param days number of days
     */
    public TourPackage(String serviceName, String vehicle, int days) {
        super(serviceName, vehicle);
        this.days = days;
    }

    /** Displays complete tour package details. */
    public void showPackage() {
        showTransport();
        System.out.println("Number of Days: " + days);
    }
}
