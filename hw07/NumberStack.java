//Jason Smits
//CSE 002
//HW 07-NumberStack

//Import the Scanner

import java.util.Scanner;

//Initiate the class
public class NumberStack{
    //initiate the main method
    public static void main(String[] args){
        //Scanner myScanner;
        Scanner myScanner = new Scanner(System.in);
        
        System.out.println("Enter an integer between 1 and 9");
        if(myScanner.hasNextInt()){
            int k= myScanner.nextInt();
            if(k>=1&&k<=9){
            System.out.println("Using for loops:");//using for loops
            for(int n=1; n>=1 && n<=k; n=n+1){//outside for loop 
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
            //using while loops
          System.out.println("Using while loops:");
          int n=1;
          while(n>=1 && n<=k){//top while loop 
                //n++;
                int j=1;
                while(j>=1 && j<=n){
                    
                    int f=1;
                    while(f>=1 && f<=n+(n-1)){
                      //  f++;
                    System.out.print(+n );
                    f++;
                    }
                    System.out.println("");
                    j++;
                }
                System.out.println("");
                int l=1;
            while(l>=1 && l<=(n+(n-1))){
                //l++;
                System.out.print("-");
                l++;
                }
                System.out.println("");
                n++;
            }
            //using do-while loops
            System.out.println("Using do-while loops");
            n=1;
            do{//top do-while loop 
                
                int j=1;
                do{
                    int f=1;
                    do{
                      //  f++;
                    System.out.print(+n );
                    f++;
                    }while(f>=1 && f<=n+(n-1));
                    System.out.println("");
                    j++;
                }while(j>=1 && j<=n);
                System.out.println("");
                int l=1;
            do{
                //l++;
                System.out.print("-");
                l++;
                }while(l>=1 && l<=(n+(n-1)));
                System.out.println("");
                n++;
            }while(n>=1 && n<=k);
            }
            else{
                System.out.println("the value entered does not meet the paremeters given");
            }
        }
        
        else{
            System.out.println("Invalid entry");
        }
        
        
    }
}