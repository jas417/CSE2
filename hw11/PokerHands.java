//Jason Smits
//CSE 002
//hw11-Poker Hand

import java.util.Scanner;
import java.util.Arrays;

public class PokerHands{
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 'y' or 'Y' to enter another hand");
        String [][] pokerArray= new String[5][2];
        if(scan.hasNextLine()){
            String again = scan.nextLine();
            if(again.equals("Y") || again.equals("y")){
                //System.out.println("Enter the suit:'c,' 'd,' 'h,' or 's' ");
                //String suit = "g"; //scan.nextLine();
                for(int count=0; count<5; count++){
                 System.out.println("Enter the suit: 'c,' 'd,' 'h,' or 's' "); 
                 String suit = scan.nextLine();
                if(suit.equals("c") || suit.equals("d") || suit.equals("h") || !suit.equals("s")){
                    pokerArray[count][0] = suit;
            System.out.println("Enter one of 'a', 'k', 'q', 'j', '10', ...'2'");
                    String card = scan.nextLine();
                    pokerArray[count][1] = card;
                }
            else{
           
                    
                     System.out.println("You did not enter a valid response.");
                    System.out.println("Enter the suit: 'c,' 'd,' 'h,' or 's' ");
                    suit = scan.nextLine();
            }
            
                }
          
        }
        }
        else{
            System.out.println("You did not enter a valid response, please try again");
        }
        for(int n=0; n<pokerArray[n].length; n++){
            for(int m=0; m<2; m++){
                System.out.println(pokerArray[n][m]);
            }
        }
        
    }   
}