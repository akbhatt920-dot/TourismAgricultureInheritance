package agriculture;

/**
 * Base agriculture class used in the Hybrid Inheritance example.
 *
 * @author Akash Bhatt
 */
public class CropProducer {
    protected String cropName;

    /**
     * Creates a crop producer.
     * @param cropName crop name
     */
    public CropProducer(String cropName) {
        this.cropName = cropName;
    }

    /** Displays crop information. */
    public void growCrop() {
        System.out.println("Growing crop: " + cropName);
    }
}
