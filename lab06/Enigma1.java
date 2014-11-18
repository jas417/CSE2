/* The user is supposed to enter a number between 0 and 99.
 * The program interprets that as a percentage, converts it to
 * a prorportion and then displays the proportion (out of 1) 
 * remaining. It does not always work. Find out when it doesn't
 */

import java.util.Scanner;
public class Enigma1{
  public static void main(String []arg){
    double percent;
    System.out.print("Enter a value for the percent (0, 1,...99)- ");
    double x=((new Scanner(System.in)).nextDouble());
    if(x>=0 && x<=100){
    System.out.println("You entered "+x+"%");
   //print out the proportion remaining for select percentages
   
   System.out.println("the proportion remaining is "+(1-(x/100)));
    }
    else{
      System.out.println("The input is outside of the range");
    }
  
   }
}

/* Error report: 
 *    (Exlain the error(s) that occur here, in this comment,
 *    and fix the errors)
 *    Hint: What kinds of input are unacceptable? What kinds of
 *        acceptable input don't produce the correct answer?
 There was nothing to prevent the user from inputting anything outside of the range of 0-99
 Also because of the coding structure, it would only work for certain numbers.
 It was much easier to code the equation to convert to a proportion in the output.
 * 
 * 
 * 
 * 
 */
