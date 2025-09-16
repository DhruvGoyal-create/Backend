public class operator {
    public static void main(String[] args) {
        // Arithmetic Operators: +, -, *, /, %
        int a = 10, b = 3;
        System.out.println("Addition: " + (a + b)); // Adds two numbers
        System.out.println("Subtraction: " + (a - b)); // Subtracts second from first
        System.out.println("Multiplication: " + (a * b)); // Multiplies two numbers
        System.out.println("Division: " + (a / b)); // Divides first by second (integer division)
        System.out.println("Modulus: " + (a % b)); // Gives remainder of division

        // Relational Operators: >, <, >=, <=, ==, !=
        System.out.println("Is a > b? " + (a > b)); // Checks if a is greater than b
        System.out.println("Is a == b? " + (a == b)); // Checks if a is equal to b

        // Logical Operators: &&, ||, !
        boolean x = true, y = false;
        System.out.println("x && y: " + (x && y)); // Returns true if both are true
        System.out.println("x || y: " + (x || y)); // Returns true if at least one is true
        System.out.println("!x: " + (!x)); // Returns true if x is false

        // Assignment Operators: =, +=, -=, *=, /=
        int c = 5;
        c += 2; // Adds 2 to c (c = c + 2)
        System.out.println("c after += 2: " + c);
        c *= 3; // Multiplies c by 3 (c = c * 3)
        System.out.println("c after *= 3: " + c);

        // Increment and Decrement Operators: ++, --
        int d = 7;
        d++; // Increases d by 1
        System.out.println("d after increment: " + d);
        d--; // Decreases d by 1
        System.out.println("d after decrement: " + d);
    }
}

/*
Explanation:
1. Arithmetic operators perform basic mathematical operations like addition, subtraction, multiplication, division, and modulus.
2. Relational operators compare two values and return a boolean result (true/false).
3. Logical operators are used to combine multiple conditions or invert a boolean value.
4. Assignment operators assign values and can also perform arithmetic operations during assignment.
5. Increment and decrement operators increase or decrease a variable's value by one.
*/