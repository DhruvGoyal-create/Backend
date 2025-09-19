import java.util.Scanner;

// User class (Blueprint)
class User {
    String name;
    int age;

    // Constructor
    User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to greet
    void greet() {
        if (age < 13) {
            System.out.println("Hello " + name + "! You are a kid, enjoy your childhood!");
        } else if (age < 20) {
            System.out.println("Hello " + name + "! You are a teenager, full of energy!");
        } else if (age < 60) {
            System.out.println("Hello " + name + "! You are an adult, keep working hard!");
        } else {
            System.out.println("Hello " + name + "! You are wise and experienced, enjoy your life!");
        }
    }
}

// Main class
// Method to create object and call method here in main class 

public class com {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input
        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        // Create object of User
        User u1 = new User(name, age);

        // Call method
        u1.greet();

        sc.close();
    }
}

