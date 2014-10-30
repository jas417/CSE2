//Jason Smits
//CSE 002
//lab 07 Loop the Loop
//9 October 2014

//import the scaner 
import java.util.Scanner;

//define the main class
public class LoopTheLoop{
    //define the main mehtod
    public static void main (String args[]){
        Scanner myScanner;
        myScanner = new Scanner (System.in);
        int n = 0;
        String j;
        String f="*";
        
        System.out.println("Enter y or Y if you want to go agian");  
        if(myScanner.hasNextLine()){
            String Start = myScanner.nextLine();
            while(Start.equals("Y")||Start.equals("y")){
                System.out.println("Enter y or Y if you want to go agian");  
                if(myScanner.hasNextLine()){
                    
                    System.out.println("Please enter an interger between 1 and 15");
                    if(myScanner.hasNextInt()){
                        int nStars =  myScanner.nextInt();
                    if(nStars>=1&&nStars<=15){
                    while(n<nStars){
                        n++;
                        System.out.print(f);
                    } 
                    int g=0;
                    while(g<nStars){
                    g++;
                     System.out.println("");
                    int counter=0;
                    while(counter<g){
                        counter++;
                        System.out.print(f);
        }
        }
                }
                else{
                    System.out.println("Your value was not between 1 and 15");
                    return;
                }
        
        }
        else{
            System.out.println("invalid entry");
            return;
        }
        }
        else{
            System.out.println("invalid entry2");
            return;
        }
        Start = myScanner.nextLine();
        }
      
    
        }
        else{
            System.out.println("Invalid entry");
            return;
        }
    }
}