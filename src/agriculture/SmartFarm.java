package agriculture;

/**
 * Extends a class and implements two interfaces.
 * This combination demonstrates Hybrid Inheritance.
 *
 * @author Akash Bhatt
 */
public class SmartFarm extends CropProducer implements Irrigation, OrganicFarming {
    private String farmName;

    /**
     * Creates a smart farm.
     * @param farmName farm name
     * @param cropName crop name
     */
    public SmartFarm(String farmName, String cropName) {
        super(cropName);
        this.farmName = farmName;
    }

    /** Provides irrigation. */
    public void provideWater() {
        System.out.println("Smart irrigation is providing water to " + farmName + ".");
    }

    /** Uses organic farming methods. */
    public void useOrganicMethod() {
        System.out.println("Organic manure is used for " + cropName + ".");
    }

    /** Displays smart farm details. */
    public void showFarm() {
        System.out.println("Farm: " + farmName);
        growCrop();
        provideWater();
        useOrganicMethod();
    }
}
