import java.util.Scanner;

public class output {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input section
        System.out.print("Enter your name: ");
        String name = sc.nextLine();   // read full line (name)

        System.out.print("Enter your age: ");
        int age = sc.nextInt();        // read age (number)

        // Output section
        System.out.println("\n--- User Details ---");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);

        // Greeting
        System.out.println("Hello " + name + "! You are " + age + " years old. Nice to meet you!");

        sc.close();
    }
}

