//Jason Smits
//lab04
//BigMacAgain
//17 September 2014

//import
import java.util.Scanner;

public class BigMacAgain{

    public static void main(String[] args){
        //set up scanner
        Scanner myScanner;
        myScanner = new Scanner ( System.in);
        //define constants
        double burgerCost$= 2.22;
        double friesCost$= 2.15;
        //collect data
        System.out.print("How many Big Macs would you like? ");
        //int nBigMacs= myScanner.nextInt();
        //check for int
        if(myScanner.hasNextInt()) {
            //find number of big macs
            int nBigMacs= myScanner.nextInt();
            //if there is a number of big macs ordered
            if(nBigMacs>0){
                //find the total cost if fries are ordered
                double totalCost$=(nBigMacs*burgerCost$)+friesCost$;//compute the total cost of the meal
                double totalBurgerCost$= nBigMacs*burgerCost$;//compute the total cost of the burgers
                int nDollars,nDimes,nPennies;//initiate dimes and pennies
                nDollars = (int)totalBurgerCost$;//find the number of dollars
                nDimes = (int)(totalBurgerCost$*10)%10;//find the tens place of cents
                nPennies = (int)(totalBurgerCost$*100)%10;//find the ones place of cents
                System.out.println("You ordered 5 big macs for a cost of"+nBigMacs+" X "+burgerCost$+ " = "+nDollars+"."+nDimes+nPennies);//state how many burgers ordered and at what cost
                System.out.println("Would you like French Fries? (Y/y/N/n)");//ask if they want fries
                String answer=myScanner.next();
                //check if user entered a valid answer
                if(answer.equals("Y")||answer.equals("y")||answer.equals("N")||answer.equals("n"))
                //if the answer is yes
                    if(answer.equals("Y")||answer.equals("y")){
                        //calculations
                        int dollars,dimes,pennies;//initiate dollars dimes and pennies
                         dollars = (int)totalCost$;//find the number of dollars
                        dimes = (int)(totalCost$*10)%10;//find the number of cents in the tens place
                        pennies = (int)(totalCost$*100)%10;//find the number of cents in the ones place
                        //print results
                        System.out.println("Fries cost $"+friesCost$);//print the cost of just the fries
                        System.out.println("Your meal will cost $"+dollars+"."+dimes+pennies);//print the cost of the meal
                    }
                    //if no fries are ordered
                    else{
                        System.out.println("Your meal will cost $"+nBigMacs*burgerCost$);
                        return;//terminate the program
                    }
                //if the fry entry is invalid
                else{
                    System.out.println("Invalid entry");
                    return;//terminate the program
                }
            }
            //if an invalid amount of burgers is ordered
            else{
                System.out.println("The number is equal to or less than zero");
                return;//terminate the program 
            }
        }
            
            
        
        
        else{
            System.out.println("You did not enter an integer");
            return; //terminates the program
        }
        
    } //end of main method
    
} //end of class
