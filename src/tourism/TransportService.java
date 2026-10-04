package tourism;

/**
 * Child of TourismService.
 * Second level of multilevel inheritance.
 *
 * @author Akash Bhatt
 */
public class TransportService extends TourismService {
    protected String vehicle;

    /**
     * Creates a transport service.
     * @param serviceName service name
     * @param vehicle vehicle used
     */
    public TransportService(String serviceName, String vehicle) {
        super(serviceName);
        this.vehicle = vehicle;
    }

    /** Displays transport details. */
    public void showTransport() {
        showService();
        System.out.println("Vehicle: " + vehicle);
    }
}
