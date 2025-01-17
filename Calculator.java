import java.util.Scanner;

public class Calculator{
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);


        System.out.print("what operation do you want to do? select from '+' '-' '*' '/': " );
        String operation = keyboard.nextLine();

        System.out.print("enter first num: ");
        int num1 = keyboard.nextInt();

        System.out.print("enter second num: ");
        int num2 = keyboard.nextInt();

        int Result;

        switch (operation) {
            case "+":
                Result = num1 + num2;
                System.out.println("your result is: " + Result);
                break;
            case "-":
                Result = num1 - num2;
                System.out.println("your result is: " + Result);
                break;
            case "*":
                Result = num1 * num2;
                System.out.println("your result is: " + Result);
                break;
            case "/":
                if(num2 != 0){
                    Result = num1 / num2;
                System.out.println("your result is: " + Result);
                } else {
                    System.out.println("division by zero is not allowed");
                }
                
                break;
            default:
                System.out.println("thats not a valid operation");
                break;
        }
        keyboard.close();
    }
}