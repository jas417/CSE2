//Jason Smits
//lab04
//Random Games

//import
import java.util.Scanner;

//initiate the class
public class RandomGames{
    
    //initiate the main method
    public static void main(String[] args){
        //set up the scanner
        Scanner myScanner;
        myScanner = new Scanner (System.in);
        //intitate variables
        String R =null;
        String r =null;
        String C =null;
        String c =null;
        String P =null;
        String p =null;
        //collect the information
        System.out.println("Enter R or r for roulette, C or c for craps or P or p for pick a card");
        if(myScanner.hasNextLine()){
            String game= myScanner.nextLine();
            if(game.equals("R")||game.equals("r")){
                //program for roulette
                int outcome =(int)(Math.random()*38);//generate a random number between 0 and 37
                //if the outcome is 37, automatically set it to 00
                //if(outcome==37){
                String Output = Integer.toString(outcome);
                switch (Output){
                    case "37": Output= "00";
                    break;
                }
                
                    //System.out.println("Roulette: 00"); 
                    System.out.println("Roulette: "+Output);
                }
                //In any other case, simply print the ouput
                
                    
                
            
            else if(game.equals("C")||game.equals("c")){
                //program for craps
                int outcome =(int)(Math.random()*7);
                int outcome1 =(int)(Math.random()*7);
                int finalOutcome= outcome1+outcome;
                System.out.println("Craps: "+outcome+"+"+outcome1+ "=" +finalOutcome);
            }
            else if(game.equals("P")||game.equals("p")){/*
                int suit =(int)(Math.random()*4)+1;
                int card=(int)(Math.random()*13)+1;
                in == 
                if(suit==1){
                    
                }
                else if(suit==2){
                    
                }
                else if(suit==3){
                    
                }
                else{
                    
                }*/
            System.out.println("This option has yet to be implemented");
            }
            else{
                System.out.println(game+" is not 'R','r','C','c','P',or'p'");
                return;
            }
        }
        else{
            System.out.println("Invalid input");
            return;
        }
    
}
}