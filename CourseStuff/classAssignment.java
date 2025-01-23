import java.util.Scanner;

public class classAssignment {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("What is your zodiac? Enter your birthday - Month followed by Day as numbers.");
        int month = keyboard.nextInt();
        int day = keyboard.nextInt();
        boolean isValidDate = false;

        // Check if the month is valid
        if (month > 0 && month <= 12) {
            // Check if the day is valid for the given month
            switch (month) {
                case 4: case 6: case 9: case 11:
                    if (day > 0 && day <= 30) {
                        isValidDate = true;
                    }
                    break;
                case 2:
                    if (day > 0 && day <= 29) {
                        isValidDate = true;
                    }
                    break;
                default:
                    if (day > 0 && day <= 31) {
                        isValidDate = true;
                    }
                    break;
            }
        }

        if (month <= 0 || month > 12) {
            System.out.println("Invalid Month!");
        } else if (!isValidDate) {
                System.out.println("Invalid Day!");
        } else {
          
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

        keyboard.close();
    }
}