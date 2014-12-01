//Jason Smits
//CSE 002
//lab11

import java.util.Scanner;
import java.util.Arrays;

public class Arrays{
    public static void main(String[] args){
        //create the array
        int [] array1;
        array1 = new int[10]; //Allows the array to hold 10 ints
        Scanner scan = new Scanner(System.in);
        int count=0;
        System.out.println("Enter 10 ints");
        while(count<=9){
            if(scan.hasNextInt()){        
            array1[count]=scan.nextInt();
            count++;
            }
            else{
                System.out.println("Your input was not an int, please try again");
            }
        }
        int min = array1[0];
        int max = array1[0];
        int sum=0;
        for(int n=0; n<array1.length; n++){
            if(array1[n]<min){
                min = array1[n];
            }  
        }
         for(int n=0; n<array1.length; n++){
            if(array1[n]>max){
                max = array1[n];
            }  
        }
        for(int n=0; n<array1.length; n++){
           sum=sum+array1[n];
           
        }
        System.out.println("The smallest number is "+min);
        System.out.println("The largest number is " +max);
        System.out.println("The sum of the array is " +sum);
        System.out.println("");
        int m=0;
        while(m<=9){
        System.out.println(+array1[m]+" "+array1[9-m]);
        m++;
        }
    }
}