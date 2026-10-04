TOURISM AND AGRICULTURE - INHERITANCE IN JAVA

Student Project

This project demonstrates:
1. Single Inheritance
2. Multiple Inheritance using Interfaces
3. Multilevel Inheritance
4. Hierarchical Inheritance
5. Hybrid Inheritance using a combination of class inheritance and interfaces

Theme: Tourism and Agriculture

How to compile:
    javac -d out src/tourism/*.java src/agriculture/*.java src/Main.java

How to run:
    java -cp out Main

How to generate JavaDoc:
    javadoc -d docs -sourcepath src -subpackages tourism agriculture
    javadoc -d docs -sourcepath src src/Main.java

Note:
Java does not support multiple inheritance using two classes. Therefore, interfaces are used to demonstrate multiple inheritance.
