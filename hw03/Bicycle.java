//Jason Smits
//hw03
//bicycle

//import 
import java.util.Scanner;
import java.io.*;
import java.text.*;
//initate the class
public class Bicycle {
    //initiate the main method
    public static void main(String[] args){
        //initiate variables
        double wheelDiameter=27.0, 
        PI=3.14159, 
        feetPerMile=5280, 
        inchesPerFoot=12, 
        secondsPerMinute=60;
        //get the user inputs
        Scanner myScanner;
        myScanner = new Scanner ( System.in );
        System.out.print("Enter the number of seconds :");
        double nSeconds = myScanner.nextDouble();
        System.out.print("Enter the number of counts:");
        int nCounts = myScanner.nextInt();
        //solve for the desired values
        double distance = nCounts*wheelDiameter*PI/inchesPerFoot/feetPerMile;
        double hours = nSeconds/60/60;
        double speed = (distance/hours);
        DecimalFormat decFor = new DecimalFormat("0.00");
        System.out.println("The distance was " +decFor.format(distance)+ " and the time was " +nSeconds/secondsPerMinute+ " minutes");
        System.out.println("The speed was " +decFor.format(speed)+ " miles per hour");
    }
}