package java_training_;
public class BitwiseShiftOperators {
    public static void main(String[] args) {
        int a = 10; // Binary: 1010
        int b = 6;  // Binary: 0110

        System.out.println("Value of a = " + a);
        System.out.println("Value of b = " + b);

        // Bitwise Operators
        System.out.println("\nBitwise Operators:");
        System.out.println("a & b = " + (a & b));   // AND
        System.out.println("a | b = " + (a | b));   // OR
        System.out.println("a ^ b = " + (a ^ b));   // XOR
        System.out.println("~a = " + (~a));         // NOT

        // Shift Operators
        System.out.println("\nShift Operators:");
        System.out.println("a << 2 = " + (a << 2)); // Left Shift
        System.out.println("a >> 2 = " + (a >> 2)); // Right Shift
        System.out.println("a >>> 2 = " + (a >>> 2)); // Unsigned Right Shift
    }
}