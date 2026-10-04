package tourism;

/**
 * First level of a multilevel inheritance chain.
 *
 * @author Akash Bhatt
 */
public class TourismService {
    protected String serviceName;

    /**
     * Creates a tourism service.
     * @param serviceName service name
     */
    public TourismService(String serviceName) {
        this.serviceName = serviceName;
    }

    /** Displays service details. */
    public void showService() {
        System.out.println("Tourism Service: " + serviceName);
    }
}
