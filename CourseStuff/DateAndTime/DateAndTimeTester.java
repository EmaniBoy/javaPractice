// Karthik Emani 1325-005

package DateAndTime;
import java.util.Scanner;

public class DateAndTimeTester {

    //run method
    public void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the date and time (MM/DD HH:MM): ");
        String input = scanner.nextLine();
        

        //if statement to check if user input is valid or not 
        if(isValid(input)){
            System.out.println("The date and time is valid");
        } else {
            System.out.println("The date and time is invalid");
        }
    }
//Method to check if the input is valid
    public boolean isValid(String input){
        String [] parts = input.split(" ");
        if (parts.length != 2){
            return false;
        }
        String date = parts[0];
        String time = parts[1];
        return isValidDate(date) && isValidTime(time);
    }


    public boolean isValidDate(String date){
        String [] parts = date.split("/");
        // if statement to check part[0] which is the month and part[1] which is the day if they are valid
        if (parts.length != 2){
            return false;
        }
        int month = Integer.parseInt(parts[0]);
        int day = Integer.parseInt(parts[1]);
        if (month < 1 || month > 12){
            return false;
        }
        if (day < 1 || day > 31){
            return false;
        }
        if (month == 2 && day > 28){
            return false;
        }
        if ((month == 4 || month == 6 || month == 9 || month == 11) && day > 30){
            return false;
        }
        return true;
    }

//Method to check if the time is valid
    public boolean isValidTime(String time){
        String[] parts = time.split(":");
        if (parts.length != 2){
            return false;
        }
        int hour = Integer.parseInt(parts[0]);
        int minute = Integer.parseInt(parts[1]);
        // if statement to check part[0] which is the hour and part[1] which is the minute if they are valid
        if(hour < 0 || hour > 23){
            return false;
        }
        if(minute < 0 || minute > 59){
            return false;
        }
        return true;
    }

//Methods to get the month, day, hour, and minute from the date and time
    public int getMonth(String date){
        return Integer.parseInt(date.split("/")[0]);
    } 

    public int getDay(String date){
        return Integer.parseInt(date.split("/")[1]);
    }

    public int getHour(String time){
        return Integer.parseInt(time.split(":")[0]);
    }

    public int getMinute(String time){
        return Integer.parseInt(time.split(":")[1]);
    }
    
    
}


// Karthik Emani 1325-005
