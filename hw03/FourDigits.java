//Jason Smits
//hw03
//bicycle

//import 
import java.util.Scanner;

//define the class
public class FourDigits{
    //define the main method
    public static void main(String[] args){
        //initiate the scanner
        Scanner myScanner;
        myScanner = new Scanner (System.in);
        //collect the value
        System.out.print("Enter a double and I will display the four digits to the right of the decimal point ");
        double value = myScanner.nextDouble();
        int digits = ((-1)(int)((int)value*10000-value*10000)));
        System.out.println("The right four digits are " +digits);
    }
}