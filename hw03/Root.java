//Jason Smits
//hw03
//bicycle

//import 
import java.util.Scanner;

//define the class
public class Root {
    //define the main method
    public static void main(String[] args){
        //initiate the scanner
        Scanner myScanner;
        myScanner = new Scanner (System.in);
        //collect the value
        System.out.print("Enter the value to be guessed ");
        double value = myScanner.nextDouble();
        double guess1 = value/3;
        double guess2 = (2*guess1*guess1*guess1+value)/(3*guess1*guess1);
        double guess3 = (2*guess2*guess2*guess2+value)/(3*guess2*guess2);
        double guess4 = (2*guess3*guess3*guess3+value)/(3*guess3*guess3);
        double guess5 = (2*guess4*guess4*guess4+value)/(3*guess4*guess4);
        double guess6 = (2*guess5*guess5*guess5+value)/(3*guess5*guess5);
        System.out.println("Is the cube root of your value "+guess1+"?");
        System.out.println("Is the cube root of your value "+guess2+"?");
        System.out.println("Is the cube root of your value "+guess3+"?");
        System.out.println("Is the cube root of your value "+guess4+"?");
        System.out.println("Is the cube root of your value "+guess5+"?");
        System.out.println("Is the cube root of your value "+guess6+"?");
    }
}