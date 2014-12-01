//Jason Smits
//CSE 002
//HW10
//17 November 2014

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class PokerOdds{
  public static void main(String [] arg){
    showHands();
    simulateOdds();
  }
  public static void showHands(){
      Scanner scan = new Scanner(System.in);
      String input = "y";
      while(input.equals("y")||input.equals("Y")){
          //int count=0;
          //int count1=0;
          //String output=null;
          for(int count=0; count<4; count++){
              int i=(int)(Math.random()*4);
              int n=(int)((Math.random()*13)+2);
              String output = Integer.toString(i);
              String secondaryOutput = Integer.toString(n);
              switch(output){
                case "0": output= "Clubs"; 
                break;
                case "1": output= "Diamonds";
                break;
                case "2": output = "Hearts";
                break;
                case "3": output = "Spades";
                break;
              }
              switch(secondaryOutput){
                  case "11": secondaryOutput="J";
                  break;
                  case "12": secondaryOutput="Q";
                  break;
                  case "13": secondaryOutput="K";
                  break;
                  case "14": secondaryOutput="A";
                  break;
              }
              System.out.println(output+": "+secondaryOutput);
          }
          System.out.println("Go again? Enter 'y' or 'Y', anything else to quit");
          input = scan.nextLine();
      }
      
  }
  public static void simulateOdds(){
      System.out.print("Rank   "); System.out.print("Frequency of exactly one pair");
      int x = 0;
      int [] deck;
      for(int count3=0; count3<=10000; count3++){
         for(int count=0; count<4; count++){
              int n=(int)((Math.random()*13)+2);
              String secondaryOutput = Integer.toString(n);
              
              switch(secondaryOutput){
                  case "11": secondaryOutput="J";
                  break;
                  case "12": secondaryOutput="Q";
                  break;
                  case "13": secondaryOutput="K";
                  break;
                  case "14": secondaryOutput="A";
                  break;
              }
              int two, three, four, five, six, seven, eight, nine, ten, jack, queen, king, ace;
              two = three = four = five = six = seven = eight = nine = ten = jack = queen = king = ace = 0;
              if(secondaryOutput.equals("2")){
               two++;
              }
              else{
                three++;
              }
      }
  }
  System.out.println("2    " +two+"  " +three);
  }
}
