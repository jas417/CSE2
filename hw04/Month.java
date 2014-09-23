//Jason Smits
//hw04
//Month

//import
import java.util.Scanner;
import java.util.GregorianCalendar;

//initiate the class
public class Month{
    
    //iniate the main method
    public static void main(String[] args){
        //set up the scanner
        Scanner myScanner;
        myScanner = new Scanner (System.in);
        //set up the calender 
        GregorianCalendar cal = new GregorianCalendar();
        //collect data
        System.out.print("Enter an integer giving the number of the month. ");
        if(myScanner.hasNextInt()){
            int month = myScanner.nextInt();
            if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12){
                System.out.println("The month has 31 days");
                
            }
            else if(month == 4 || month == 6 || month ==9 || month ==11){
                System.out.println("the month has 30 days");
            }
            else if(month == 2){
                System.out.print("Febuary of what year? ");
                int year = myScanner.nextInt();
                if(cal.isLeapYear(year)){
                    System.out.println("The month has 29 days");
                }
                else{
                    System.out.println("The month has 28 days");
                }
            }
            else{
                System.out.println("The number you entered does not correspond to a month");
                return;
                
            }
            }
        
        else{
            System.out.println("You did not enter an integer");
            return;//terminates the program
        }
        
    }
        
    }
