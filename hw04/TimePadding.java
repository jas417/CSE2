//Jason Smits
//hw04
//Time Padding

//import
import java.util.Scanner;

//initiate the class
public class TimePadding{
    
    //iniate the main method
    public static void main(String[] args){
        //set up the scanner
        Scanner myScanner;
        myScanner = new Scanner (System.in);
        //collect data
        System.out.println("Enter the number of seconds that have passed today");
        if(myScanner.hasNextInt()){
            double seconds= myScanner.nextInt();
            if(seconds<86400){
                double minutes= seconds/60;
                int iMinutes=(int)minutes;
                double hours = minutes/60;
                int nHours = (int)hours;
                int nMinutes = (int)((60*(hours-nHours)));
                int nSeconds = (int)((60*(minutes-iMinutes)));
                if(nMinutes<10){
                    if(nSeconds<10){
                        System.out.println("The time is "+nHours+":0"+nMinutes+":0"+nSeconds);
                    }
                    else{
                  System.out.println("The time is "+nHours+":0"+nMinutes+":"+nSeconds);  
                }
                }
                else if(nSeconds<10){
                    System.out.println("The time is "+nHours+":"+nMinutes+":0"+nSeconds);
                }
                else{
                System.out.println("The time is "+nHours+":"+nMinutes+":"+nSeconds);
                }
                
            }
            else{
                System.out.println("Over a day has passed");
                return;
            }
        }
        else{
            System.out.println("Please enter an integer value");
            return;
        }
    }
}