//Jason Smits
//hw04
//Course number

//import
import java.util.Scanner;

//initiate the class
public class CourseNumber{
    
    //iniate the main method
    public static void main(String[] args){
        //set up the scanner
        Scanner myScanner;
        myScanner = new Scanner (System.in);
        //collect data
        System.out.print("Enter a six digit number giving the course semeseter. ");
        if(myScanner.hasNextInt()){
            int course = myScanner.nextInt();
            if(course>=186510 && course<=201440){
                int courseNum = course%100;
                int courseYear = course/100;
                if(courseNum==10){
                    System.out.println("This course was offered in the Spring semester of "+courseYear+".");
                }
                else if(courseNum==20){
                    System.out.println("This course was offered in the Summer I semester of "+courseYear+".");
                }
                else if(courseNum==30){
                    System.out.println("This course was offered in the Summer II semester of "+courseYear+".");
                }
                else if(courseNum==40){
                    System.out.println("This course was offered in the Fall semester of "+courseYear+".");
                }
                else{
                    System.out.println("An invalid semester code was inputted");
                }
            }
            else{
                System.out.println("Out of accepted range [186510,201440]");
                return;
            }
        }
        else{
            System.out.println("invalid entry");
            return;
        }
        
        
        
    }
}