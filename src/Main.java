public class Main {
    public static void main(String[] args) {
        printInfo("John Doe");
        printInfo("Jane Doe", 28);
        printInfo("Alice Smith", "New York", 30);
    }

    // Method Overload 1: Takes only a name and prints it
    public static void printInfo(String name) {
        System.out.println("Name: " + name);
    }

    // Method Overload 2: Takes a name and age, then prints them
    public static void printInfo(String name, int age) {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    // Method Overload 3: Takes a name, city, and age, then prints them
    public static void printInfo(String name, String city, int age) {
        System.out.println("Name: " + name + ", City: " + city + ", Age: " + age);
    }
}