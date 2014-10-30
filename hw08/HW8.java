//Jason Smits
//CSE 002
//HW8

import java.util.Scanner;
public class HW8{
  
  public static char getInput(Scanner scan, String s){
      char input= scan.next().charAt(0);
      Character c;
      Character C;
      if(input == 'C' || input == 'c'){
      return input;
      }
      else{
          System.out.println("You did not enter a character from the list 'Cc,' please try again");
           return 0;
                  
      }
     
  }
  
  public static char getInput(Scanner scan1, String s, int x ){
     char input= scan1.next().charAt(0);
      Character Y;
      Character y;
      Character N;
      Character n;
      if(input == 'Y' || input == 'y'){
        return input;
        }
      else if(input == 'N' || input == 'n'){
        return input;
      }
      else{
        System.out.println("You did not enter a character from the list 'yYnN'; try again");
        return 0;
      }
     
  }
  public static char getInput(Scanner scan, String s, String S){
    char input = scan.next().charAt(0);
    switch (input){
      case '1': 
        return input;
      
      case '2': 
        return input;
      
      case '3':
        return input;
      
      case '4':
        return input;
      
      case '5':
        return input;
      
      case '6':
        return input;
      
      case '7':
        return input;
      
      case '8':
        return input;
      
      case '9':
        return input;
      
      //defult: return 0;
      
    }
   return 0;
  }
  
  public static void main(String []arg){
	  char input;
	  Scanner scan=new Scanner(System.in);
	  System.out.print("Enter 'C' or 'c' to continue, anything else to quit- ");
	  input=getInput(scan,"Cc");
	  System.out.println("You entered '"+input+"'");
	  int counter =0;
	  System.out.print("Enter 'y', 'Y', 'n', or 'N'- ");
	  while(counter<5){
	  input=getInput(scan,"yYnN",5); //give up after 5 attempts
	  if(input=='y' || input == 'Y' || input =='n' || input == 'N'){
	    break;
	  }
	  counter++;
	  }
	  	input=getInput(scan,"Choose a digit.","0123456789");
    if(input!=' '){
   	  System.out.println("You entered '"+input+"'");
	  }

	System.out.println("You entered '"+input+"'");
  }  
  
}

