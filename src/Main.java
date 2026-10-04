import tourism.*;
import agriculture.*;
import java.util.Scanner;

/**
 * Main class for the Tourism and Agriculture Inheritance project.
 * It provides a menu to demonstrate different types of inheritance.
 *
 * @author Akash Bhatt
 */
public class Main {
    /**
     * Starts the program and displays the inheritance menu.
     * @param args command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n====================================");
            System.out.println(" TOURISM AND AGRICULTURE INHERITANCE");
            System.out.println("====================================");
            System.out.println("1. Single Inheritance - Tourism");
            System.out.println("2. Multiple Inheritance - Tourism");
            System.out.println("3. Multilevel Inheritance - Tourism");
            System.out.println("4. Hierarchical Inheritance - Tourism");
            System.out.println("5. Hybrid Inheritance - Agriculture");
            System.out.println("6. Farm Tourism Example");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    // Single Inheritance: BeachTourism inherits TouristPlace
                    BeachTourism beach = new BeachTourism(
                            "Baga Beach", "Goa", "Water Sports");
                    beach.showBeachTourism();
                    break;

                case 2:
                    // Multiple Inheritance: one class implements two interfaces
                    TourGuide guide = new TourGuide("Rahul");
                    guide.bookService();
                    guide.provideGuide();
                    break;

                case 3:
                    // Multilevel: TourismService -> TransportService -> TourPackage
                    TourPackage tour = new TourPackage(
                            "Goa Tour Package", "Tourist Bus", 3);
                    tour.showPackage();
                    break;

                case 4:
                    // Hierarchical: AdventureTourism and CulturalTourism inherit TourismActivity
                    AdventureTourism adventure = new AdventureTourism();
                    CulturalTourism culture = new CulturalTourism();
                    adventure.showAdventure();
                    System.out.println();
                    culture.showCulture();
                    break;

                case 5:
                    // Hybrid: class inheritance + multiple interfaces
                    SmartFarm farm = new SmartFarm("Green Valley Farm", "Rice");
                    farm.showFarm();
                    break;

                case 6:
                    // Tourism and agriculture are combined in this example
                    FarmTourism farmTourism = new FarmTourism("Goa Organic Farm");
                    farmTourism.showFarmTourism();
                    break;

                case 0:
                    System.out.println("Program ended.");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 0);

        sc.close();
    }
}
