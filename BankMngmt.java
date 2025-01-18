import java.util.Scanner;
import java.util.ArrayList;

public class BankMngmt {

    static class BankAccount {

        //bank account class definition
        //hidden from outside the class ensuring encapsulation
        private int accountNumber;
        private double balance; 
        
        //constructor
        public BankAccount(int accountNumber, double balance){
            this.accountNumber = accountNumber; //assign parameter to field
            this.balance = balance; //assign parameter to field
        }

        //deposit
        public void deposit(double amount){
            if(amount >= 0){
                balance += amount;
            } else {
                System.out.println("thats not a valid deposit amount");
            }
        }

        //withdraw
        public void withdraw(double amount){
            if(balance <= amount && amount >= 0){
                balance -= amount;
            } else {
                System.out.println("thats not a valid withdraw amount");
            }
        }
        
        //check balance
        public double getBalance(){
            return balance;
        }

        //get acc number
        public int getAccountNumber(){
            return accountNumber;
        }

        //helper method to find account 
        public static BankAccount findAccount(ArrayList<BankAccount> accounts, int accountNumber){
            for(int i = 0; i < accounts.size(); i++){
                BankAccount account = accounts.get(i);

                if(account.getAccountNumber() == accountNumber){
                    return account;
            }
        }
        return null;     
        }
    }

    //main function
    public static void main(String[] args) {
        ArrayList<BankAccount> accounts = new ArrayList<>(); //store all accs
        Scanner keyboard = new Scanner(System.in);
        int accountCounter = 1001;

        while(true){
            System.out.println("Bank Management System");
            System.out.println("-----------------------");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Check Balance");
            System.out.println("5. Exit");
            System.out.print("Enter a choice: ");
            int choice = keyboard.nextInt();
            System.out.println("                                    "); 

            switch (choice) {
                case 1:
                    System.out.print("input initial balance: ");
                    double initialBalance = keyboard.nextDouble();
                    BankAccount newAccount = new BankAccount(accountCounter++, initialBalance);
                    accounts.add(newAccount);
                    System.out.println("New account created!");
                    System.out.println("Account number: " + newAccount.getAccountNumber());
                    System.out.println("                                    "); 
                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:

                    break;
                default:
                    System.out.println("thats not a valid choice");
                    break;
            }


        }







        
    }
}
