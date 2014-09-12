//Jason Smits
//Lab-03
//BigMac calculator

//import the scanner
import java.util.Scanner;
//initiate the class
public class BigMac {
    //initiate the main method
    public static void main(String[] args){
        Scanner myScanner;
        myScanner = new Scanner ( System.in );
        System.out.print("Enter the desired number of Big Macs (integer>1) ");
        int nBigMacs= myScanner.nextInt();
        System.out.print("Enter the cost per Big Mac as"  + " a double (in the form xx.xx) " );
        double bigMac$ = myScanner.nextDouble();
        System.out.print("Enter the percent tax as a whole number (xx): ");
        double taxRate = myScanner.nextDouble();
        taxRate/=100; //converting from percent to proportion
        double cost$;
        int dollars, //whole dollar amount
        dimes, pennies; //amount of cents
        cost$=nBigMacs*bigMac$*(1+taxRate);
        //drop the decimal
        dollars = (int)cost$;
        dimes = (int)(cost$*10)%10;
        pennies = (int)(cost$*100)%10;
        System.out.println("The total cost of " + nBigMacs +" per big mac, with a sales tax of "
        + (int) (taxRate*100)+"%, is $" +dollars+'.'+dimes+pennies);
        
    }//end of main mehtod
}//end of class