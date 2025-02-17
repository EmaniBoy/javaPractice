import java.util.Scanner;

public class practice1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = "";
        int age = 0;
        int x = 3;
        int y = 0;

        System.out.println("What is your name? ");
        name = scanner.nextLine();
        System.out.println("your name is " + name);

        System.out.println("what is your age?");
        age = scanner.nextInt();
        System.out.println("your age is: " + age);

        //for loop
        for(int i = 0; i < 5; i++){
            System.out.println(name);
        }

        //while loop
        while(x > 0){
            System.out.println("x is " + x);
            x--;
        }


        //do while loop
        do{
            System.out.println("y is " + y);
            y++;
        }while(y < 10);

        

       
    }
}
