JavaMethodOverloadingExample

This project demonstrates the concept of method overloading in Java. Method overloading allows multiple methods to share the same name but differ in the parameters they accept. This example showcases overloaded methods named printInfo, which accept different types and numbers of parameters to display information.
Project Structure

    JavaMethodOverloadingExample.java: Contains the main method and the overloaded versions of printInfo.

Code Overview
Methods

    printInfo(String name)
        Description: Prints the name of a person.
        Parameters: String name - the name of the person.
        Example: printInfo("John Doe") will print Name: John Doe.

    printInfo(String name, int age)
        Description: Prints the name and age of a person.
        Parameters:
            String name - the name of the person.
            int age - the age of the person.
        Example: printInfo("Jane Doe", 28) will print Name: Jane Doe, Age: 28.

    printInfo(String name, String city, int age)
        Description: Prints the name, city, and age of a person.
        Parameters:
            String name - the name of the person.
            String city - the city of residence.
            int age - the age of the person.
        Example: printInfo("Alice Smith", "New York", 30) will print Name: Alice Smith, City: New York, Age: 30.

Usage

Compile and run the program with the following commands:

    javac JavaMethodOverloadingExample.java
    java JavaMethodOverloadingExample

Expected output:

    Name: John Doe
    Name: Jane Doe, Age: 28
    Name: Alice Smith, City: New York, Age: 30

Key Concepts

    Method Overloading: Allows multiple methods with the same name but different parameters, enhancing readability and flexibility.
    Parameter Polymorphism: Overloaded methods can accept different types and numbers of parameters, making code more adaptable.

Author

This project is a basic Java example to demonstrate method overloading for educational purposes.

