//Jason Smits
//hw04
//Income Tax Calculator

//import
import java.util.Scanner;

//initiate the class
public class IncomeTax{
    
    //iniate the main method
    public static void main(String[] args){
        //initiate the variables
        double r1$= .05;
        double r2$= .07;
        double r3$= .12;
        double r4$= .14;
        //scanner setup
        Scanner myScanner;//name the scanner
        myScanner = new Scanner (System.in);
        System.out.println("Enter your income as an integer giving the number of thousands");
        if (myScanner.hasNextInt()){
            int income$ = myScanner.nextInt();
                if(income$>0&& income$ <20){
                    double rate$= r1$;
                    double tax$= r1$*income$*1000;
                    System.out.println("The tax rate on $" +income$*1000+ " is " +rate$*100+ "% and the total tax is $" +tax$);
                    return;
                }
                if(income$>=20&& income$ <40){
                    double rate$= r2$;
                    double tax$= r2$*income$*1000;
                    System.out.println("The tax rate on $" +income$*1000+ " is " +rate$*100+ "% and the total tax is $" +tax$);
                    return;
                }
                if(income$>=40&& income$ <78){
                    double rate$= r3$;
                    double tax$= r3$*income$*1000;
                    System.out.println("The tax rate on $" +income$*1000+ " is " +rate$*100+ "% and the total tax is $" +tax$);
                    return;
                }
                if(income$ >=78){
                    double rate$= r4$;
                    double tax$= r4$*income$*1000;
                    System.out.println("The tax rate on $" +income$*1000+ " is " +rate$*100+ "% and the total tax is $" +tax$);
                    return;
                }
                
                else{
                    System.out.println("You, sir, are in debt");
                    return;
                }
                
                
                
                }
            else{
                System.out.println("You did not enter an integer");
                return;
            }
        }
        
        
        }


