//Jason Smits
//HW 06
//Root

import java.util.Scanner;

public class Root{
    
    public static void main(String[] args){
        //set up the scanner
        Scanner myScanner;
        myScanner = new Scanner(System.in);
        //initiate variables
        double n;
        double low;
        double middle;
        double high;
        System.out.println("Enter a number greater than 0 ");
        if(myScanner.hasNextDouble()){
            n = myScanner.nextDouble();
            low=0;
            high=1+n;
            middle = ((low+high)/2);
            if (n>0){
                while(high-low>.0000001*(1+n)){
                    
                    if((middle*middle)>n){
                      high=middle;  
                    }
                    else{
                        low=middle;
                    }
                }   
                System.out.println("The root is "+low);
            }
            else{
                System.out.println("The number is less than 0");
            }
            
        }
        else{
            System.out.println("Invalid entry");
        }
    }
}