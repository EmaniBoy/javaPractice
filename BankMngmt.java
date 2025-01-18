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
            if(amount >= 0 && balance >= amount){
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
                    System.out.print("Input initial balance: ");
                    double initialBalance = keyboard.nextDouble();
                    BankAccount newAccount = new BankAccount(accountCounter++, initialBalance);
                    accounts.add(newAccount);
                    System.out.println("New account created!");
                    System.out.println("Account number: " + newAccount.getAccountNumber());
                    System.out.println("                                    "); 
                    break;
                case 2:
                    System.out.print("Enter account number: ");
                    int accNumDeposit = keyboard.nextInt();
                    BankAccount depositAccount = BankAccount.findAccount(accounts, accNumDeposit);
                    if(depositAccount != null){
                        System.out.print("Enter deposit number: ");
                        double depositAmount = keyboard.nextDouble();
                        depositAccount.deposit(depositAmount);
                        System.out.println("Deposit Successful!");
                        System.out.println("New balence: " + depositAccount.getBalance());
                        System.out.println("                                    ");
                    } else {
                        System.out.println("Error invalid account number");
                        System.out.println("                                    ");
                    }
                    break;
                case 3:
                    System.out.print("Enter account number: ");
                    int accNumWithdraw = keyboard.nextInt();
                    BankAccount withdrawAccount = BankAccount.findAccount(accounts, accNumWithdraw);
                    if(withdrawAccount != null){
                        System.out.print("Enter withdraw amount: ");
                        double withdrawAmount = keyboard.nextDouble();
                        withdrawAccount.withdraw(withdrawAmount);
                        System.out.println("Withdraw Successful!");
                        System.out.println("New balence: " + withdrawAccount.getBalance());
                        System.out.println("                                    ");
                    } else {
                        System.out.println("Error invalid account number");
                        System.out.println("                                    ");
                    }
                    break;
                case 4:
                    System.out.print("Enter account number: ");
                    int accNumCheck = keyboard.nextInt();
                    BankAccount balAccount = BankAccount.findAccount(accounts, accNumCheck);
                    if(balAccount != null){
                        System.out.println("Your current balance for account " + accNumCheck + ": " + balAccount.getBalance());
                    } else {
                        System.out.println("Error invalid account number");
                    }
                    break;
                case 5:
                    System.out.println("Goodbye!");
                    keyboard.close();
                    return;
                default:
                    System.out.println("thats not a valid choice");
                    break;
            }


        }


        
    }
}
