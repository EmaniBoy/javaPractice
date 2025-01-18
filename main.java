import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        String userName = System.getProperty("user.name");
        System.out.println("Hello " + userName + "!");

        

        while(true){
        System.out.println("                    ");
        System.out.println("Mini-games Menu: ");
        System.out.println("                    ");
        System.out.println("1. Calculator");
        System.out.println("2. Random Number Guess");
        System.out.println("3. To-Do List");
        System.out.println("4. Exit");
        String Option = keyboard.nextLine();


        switch (Option) {
            case "1":
                Calculator.main(new String[]{});
                break;
            case "2":
                RandNumGuess.main(new String[]{});
                break;
            case "3":
                Todo.main(new String[]{});
                break;
            default:
                break;
            }
        } 
        
    

    }
}
