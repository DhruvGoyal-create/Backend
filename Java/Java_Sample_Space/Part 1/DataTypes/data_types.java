public class data_types {
    public static void main(String[] args) {
    
    // Primitive data types
    
        byte b = 10;
        // byte is used to save memory in large arrays, mainly in place of integers
        // byte data type is 8-bit signed two's complement integer

        short s = 200;
        // short is also used to save memory in large arrays, mainly in place of integers
        // short data type is 16-bit signed two's complement integer

        int i = 1000;
        // int is the most commonly used data type
        // int data type is 32-bit signed two's complement integer

        long l = 100000L;
        // long data type is used when int is not large enough
        // long data type is 64-bit signed two's complement integer

        float f = 12.34f;
        // float data type is used to save memory in large arrays of floating point numbers
        // float data type is 32-bit IEEE 754 floating point

        double d = 123.456;
        // double data type is generally used as the default data type for decimal values
        // double data type is 64-bit IEEE 754 floating point

        char c = 'Z';
        // char data type is used to store a single character
        // char data type is 16-bit Unicode character

        boolean bool = false;
        // boolean data type is used to store true or false values
        // boolean data type is not precisely defined in terms of size

    // Non-primitive data type
        
        String str = "Hello, World!";
        // String is used to store a sequence of characters
        // String is not a primitive data type, it is a class in Java

        System.out.println("byte: " + b);
        System.out.println("short: " + s);
        System.out.println("int: " + i);
        System.out.println("long: " + l);
        System.out.println("float: " + f);
        System.out.println("double: " + d);
        System.out.println("char: " + c);
        System.out.println("boolean: " + bool);
        System.out.println("String: " + str);
    }
}