import java.util.Scanner;

public class practice2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("welcome to a calculator");
        int number1 = 0;
        int number2 = 0;
        int result = 0;
        String choice = "";

        System.out.println("enter your first number: ");
        number1 = scanner.nextInt();
        System.out.println("enter your second number: ");
        number2 = scanner.nextInt();

        scanner.nextLine();

        System.out.println("What calculation? 'multiply' 'divide': ");
        choice = scanner.nextLine();

        System.out.println("your first number is " + number1 + " your second number is " + number2 + " your choice is " + choice);

        if(choice.equals("multiply")){
            result = number1 * number2;
        }
        if(choice.equals("divide")){
            result = number1 / number2;
        }

        System.out.println("the result is: " + result);

        scanner.close();
        
    }
}
