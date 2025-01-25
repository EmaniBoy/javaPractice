package CourseStuff;
//Karthik Emani 1325-005

import java.util.Scanner;
//Karthik Emani 1325-005

public class classAssignment {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("What is your zodiac? Enter your birthday - Month followed by Day as numbers.");
        int month = keyboard.nextInt();
        int day = keyboard.nextInt();
        boolean isValidDate = false;

        // Validate that the entered month is between 1 and 12
        if (month > 0 && month <= 12) {
            // Check if the day is valid for the given month
            switch (month) {
                //months with 30 days
                case 4: case 6: case 9: case 11:
                    if (day > 0 && day <= 30) {
                        isValidDate = true;
                    }
                    break;
                //feburary with 29 days
                case 2:
                    if (day > 0 && day <= 29) {
                        isValidDate = true;
                    }
                    break;
                //months with 31 days
                default:
                    if (day > 0 && day <= 31) {
                        isValidDate = true;
                    }
                    break;
            }
        }

        // Print error messages for invalid month or day
        if (month <= 0 || month > 12) {
            System.out.println("Invalid Month!");
        } else if (!isValidDate) {
                System.out.println("Invalid Day!");
        } else {

          // Determine the zodiac sign based on the date
            if (month == 1 && day >= 20 || month == 2 && day <= 18) {
                System.out.println("You are Aquarius!");
            } else if (month == 2 && day >= 19 || month == 3 && day <= 20) {
                System.out.println("You are Pisces!");
            } else if (month == 3 && day >= 21 || month == 4 && day <= 19) {
                System.out.println("You are Aries!");
            } else if (month == 4 && day >= 20 || month == 5 && day <= 20) {
                System.out.println("You are Taurus!");
            } else if (month == 5 && day >= 21 || month == 6 && day <= 20) {
                System.out.println("You are Gemini!");
            } else if (month == 6 && day >= 21 || month == 7 && day <= 22) {
                System.out.println("You are Cancer!");
            } else if (month == 7 && day >= 23 || month == 8 && day <= 22) {
                System.out.println("You are Leo!");
            } else if (month == 8 && day >= 23 || month == 9 && day <= 22) {
                System.out.println("You are Virgo!");
            } else if (month == 9 && day >= 23 || month == 10 && day <= 22) {
                System.out.println("You are Libra!");
            } else if (month == 10 && day >= 23 || month == 11 && day <= 21) {
                System.out.println("You are Scorpio!");
            } else if (month == 11 && day >= 22 || month == 12 && day <= 21) {
                System.out.println("You are Sagittarius!");
            } else {
                System.out.println("You are Capricorn!");
            }
        }
        // Close the scanner to prevent resource leaks
        keyboard.close();
    }
}