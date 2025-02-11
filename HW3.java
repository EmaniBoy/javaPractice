import java.util.Scanner;

public class HW3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userName = System.getProperty("user.name");
        System.out.println("hello " + userName);
        String response = scanner.nextLine();
        if(response.equals("hello")){
            System.out.println("Hello " + userName + "!");
        } else {
            System.out.println("Goodbye " + userName + "!");
        }
        
        scanner.close();
    }
}
