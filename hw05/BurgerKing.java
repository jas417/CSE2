//Jason Smits
//hw05
//BurgerKing
//30 September 2014

//import
import java.util.Scanner;

public class BurgerKing{

    public static void main(String[] args){
        //set up scanner
        Scanner myScanner;
        myScanner = new Scanner ( System.in);
        //collect data
        System.out.println("Enter a letter to indicate a choice of");//Present the options to the user
        System.out.println("Burger (B or b)");
        System.out.println("Soda (S or s)");
        System.out.println("Fries (F or f)");
        if(myScanner.hasNext()){//scan for the options for general order
            char answer = myScanner.next().charAt(0);
                switch(answer){//set up the switch statement to give the user further options based on input
                    case 'B':
                    case 'b':
                    System.out.println("How would you like your burger?");
                    System.out.println("Enter A or a for all the fixins"); //collect 
                    System.out.println("C or c for cheese");
                    System.out.println("N or n for none of the above");
                       if(myScanner.hasNext()){
                        char fix = myScanner.next().charAt(0);
                            switch(fix){//switch for burger options
                                case 'A':
                                case 'a':
                                System.out.println("You ordered a burger with all the fixings");
                                return;
                                case 'C':
                                case 'c':
                                System.out.println("You ordered a burger with cheese");
                                return;
                                case 'N':
                                case 'n':
                                System.out.println("You ordered a plain burger");
                                return;
                                
                            }
                    }
                    break;
                    case 'S':
                    case 's':
                    System.out.println("Do you want Pepsi (P or p), Sprite(S or s), or Mountain Dew(M or m");//collect soda data
                         if(myScanner.hasNext()){
                        char soda = myScanner.next().charAt(0);
                            switch(soda){//switch for soda options
                                case 'P':
                                case 'p':
                                System.out.println("You ordered a Pepsi");
                                return;
                                case 'S':
                                case 's':
                                System.out.println("You ordered a Sprite");
                                return;
                                case 'M':
                                case 'm':
                                System.out.println("You ordered a Mountain Dew");
                                return;
                                
                            }
                    }
                    break;
                    case'F':
                    case'f':
                    System.out.println("Do you want a large or small order of fries? (L, l, S, s)");
                     if(myScanner.hasNext()){//switch for fry options
                        char fry = myScanner.next().charAt(0);
                            switch(fry){
                                case 'L':
                                case 'l':
                                System.out.println("You ordered a large fries");
                                return;
                                case 'S':
                                case 's':
                                System.out.println("You ordered a small fries");
                                return;
                                }
                    }    
                }
                    
        }
        
        
        
    } //end of main method
    
} //end of class
