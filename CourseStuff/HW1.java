package CourseStuff;
// Karthik Emani 1325-005

import java.util.Scanner;

public class HW1{

    // Method to convert binary string to decimal manually
    public static int convertBinaryToDecimal(String binary) {
        int decimal = 0;  // store the decimal result
        int power = 1;    // start with the least significant bit (2^0 = 1)

        // for loop for processing the binary string from right to left
        for (int i = binary.length() - 1; i >= 0; i--) {
            char bit = binary.charAt(i);

            // Convert character '0' or '1' to an integer
            int bitValue = bit - '0';

            // Multiply by power of 2 and accumulate the result
            decimal += bitValue * power;

            // Update power of 2 
            power *= 2;
        }
        return decimal;
    }

    // Main method
    public static void main(String[] args) {

        // Initialize the Scanner
        Scanner keyboard = new Scanner(System.in);

        //recieve user input for 4-bit binary values
        System.out.println("Enter a 4-bit binary number ");
        String binaryString1 = keyboard.nextLine();

        System.out.println("Enter another 4-bit binary number");
        String binaryString2 = keyboard.nextLine();
        

        //call conversion method to convert each 4-bit binary values
        int decimalValue1 = convertBinaryToDecimal(binaryString1);
        int decimalValue2 = convertBinaryToDecimal(binaryString2);

        //calculate sum of both values 
        int sum = decimalValue1 + decimalValue2;
        
        //print results 
        System.out.println("The first number is " + decimalValue1);
        System.out.println("The second number is " + decimalValue2);
        System.out.println("Added together is " + sum);

        //close scanner to avoid resource leak
        keyboard.close(); 
    }
}