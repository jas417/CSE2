//Jason Smits
//CSE 002
//HW09- BlockedAgain

import java.util.Scanner;

public class BlockedAgain{
    
    public static int getInt(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an integer between 1 and 9, inclusive: t");
        String input = scan.nextLine();
        while (checkInt(input)==false){ //continues loop until method reads true
            System.out.println("You did not enter an int, try again.");
            input = scan.nextLine();
            checkInt(input); //calls the check-for-int method
        }
        while (checkRange(input) == false){
            
            System.out.println("Your integer was not between 1 and 9, please try again");
            input = scan.nextLine();
            checkRange(input); //calls the check-for-int method
        }
        System.out.println("a");
        int p= Integer.parseInt(input);
        return p;
    }
    
    public static boolean checkInt(String input){
        try{
            Integer.parseInt(input);
        }
        catch(NumberFormatException e){
            return false;
        }
        return true;
        
    }
    
    public static boolean checkRange(String input){
        int n= Integer.parseInt(input);
        if(n<1 || n>9){
            return false;
        }
        else{
            return true;
        }
    }
     
     public static void allBlocks(int m){
         for(int n=1; n>=1 && n<=m; n=n+1){//outside for loop 
                for(int j=1;j>=1 && j<=n; j=j+1){
                    for(int f=1; f>=1 && f<=n+(n-1); f=f+1){
                    System.out.print(+n );
                    }
                    System.out.println("");
                }
                System.out.println("");
            for(int j=1;j>=1 && j<=n+(n-1); j=j+1){
                System.out.print("-");
                }
                System.out.println("");
            }
     }
     
    public static void main(String []s){
        int m;
        //force user to enter int in range 1-9, inclusive.
        m = getInt(); 
        allBlocks(m);
        }
}


