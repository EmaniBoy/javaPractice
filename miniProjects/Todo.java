import java.util.Scanner;
import java.util.ArrayList;

public class Todo {
    public static void main(String[] args) {
        
        //new array and scanner
        ArrayList<String> tasks = new ArrayList<>();
        Scanner keyboard = new Scanner(System.in);

        String input;

        while(true){

            //menu with options
            System.out.println("to do list menu: ");
            System.out.println("1. add a task");
            System.out.println("2. remove a task");
            System.out.println("3. view your tasks");
            System.out.println("4. exit");
            System.out.print("choose an option: ");
            input = keyboard.nextLine();


           //case switch
            switch (input) {
                case "1":
                    System.out.print("enter your new task: ");
                    String newTask = keyboard.nextLine();
                    tasks.add(newTask);
                    System.out.println("Task added!");
                    break;

                case "2":
                    System.out.print("enter the index of task you want to remove: ");
                    int index = Integer.parseInt(keyboard.nextLine());
                    if(index >= 0 && index < tasks.size()){
                        tasks.remove(index);
                        System.out.println(" task number " + index + " removed. ");
                    } else {
                        System.out.println("thats not a valid index");
                    }
                    
                    break;

                case "3":
                    System.out.println("current tasks: ");
                    for(int i = 0; i < tasks.size(); i++){
                        System.out.println(i + ": " + tasks.get(i));
                    }
                    break;

                case "4":
                    System.out.println("Exiting To-Do List, returning to main menu...");
                    return;

                default:
                    System.out.println("thats not a valid choice");
                    break;
            }
        }
    }
    
       
}
