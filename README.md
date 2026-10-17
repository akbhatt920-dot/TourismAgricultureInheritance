# TOURISM AND AGRICULTURE – INHERITANCE IN JAVA

**Student Project**  
**Student Name:** Akash Bhatt  
**Roll Number:** 2607  
**Language:** Java

## 1. Project Description

This is a menu-driven Java program that demonstrates five types of inheritance using examples from tourism and agriculture.

## 2. Types of Inheritance

1. **Single Inheritance:** `BeachTourism` extends `TouristPlace`. It inherits tourist place information and displays beach activities.

2. **Multiple Inheritance:** `TourGuide` implements `Bookable` and `GuideService` interfaces to provide tour booking and guiding services.

3. **Multilevel Inheritance:** `TourismService` → `TransportService` → `TourPackage`. Each class inherits from the previous class in the chain.

4. **Hierarchical Inheritance:** `AdventureTourism` and `CulturalTourism` both extend `TourismActivity`, demonstrating multiple child classes sharing one parent.

5. **Hybrid Inheritance:** `OrganicFarm` extends `Farm` and implements `Irrigation` and `OrganicMethods`, combining class inheritance with interfaces.

**Note:** Java does not support multiple inheritance through classes, so interfaces are used to demonstrate it.

## 3. How to Compile

Run from the project root directory:

`javac -d out src/tourism/*.java src/agriculture/*.java src/Main.java`

## 4. How to Run

`java -cp out Main`

Select an option from the menu to view each inheritance example.

## 5. Generate JavaDoc

`javadoc -d docs -sourcepath src -subpackages tourism agriculture`

To include `Main.java` and all source classes:

`javadoc -d docs -sourcepath src src/Main.java src/tourism/*.java src/agriculture/*.java`

Open `docs/index.html` in a browser to view the generated documentation.

## 6. Conclusion

This project demonstrates inheritance, code reuse, and interfaces in Java through simple tourism and agriculture examples.
