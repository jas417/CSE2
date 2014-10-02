//Jason Smits
//hw05
//BoolaBoola

//imports
import java.util.Scanner;


//initiate the class
public class BoolaBoola{
    
    //intitate the main method
    public static void main(String[] args){
        
        //set up the scanner
        Scanner myScanner;
        myScanner = new Scanner(System.in);
        //Ask the user for their guess
        int n1 = (int)(Math.random()*2+1);//generates a random number between 1 and 2
        String N1 = Integer.toString(n1); //change the int into a string
        int n2 = (int)(Math.random()*2+1);//generates a random number between 1 and 2
        String N2 = Integer.toString(n2); //change the int into a string
        int n3 = (int)(Math.random()*2+1);//generates a random number between 1 and 2
        String N3 = Integer.toString(n3);//changes the int to a string
        int v1 = (int)(Math.random()*2+1);//generates a random number between 1 and 2
        String V1 = Integer.toString(v1); //change the int into a string
        int v2 = (int)(Math.random()*2+1);//generates a random number between 1 and 2
        String V2 = Integer.toString(v2); //change the int into a string
        //randomize the statement 
        switch(N1){
            case "1":       
            N1="true";
            break;
            case "2":
            N1="false";
            break;
        }
       
         switch(N2){
            case "1": N2="true";
            break;
            case "2": N2="false";
            break;
         }
          /*switch(N3){
            case "1": N3="true";
            break;
            case "2": N3="false";
            break;
        }*/
        
         switch(V1){
            case "1": V1="||";
            break;
            case "2":V1="&&";
            break;
        }
         switch(V2){
            case "1": V2="||";
            break;
            case "2": V2="&&";
            break;
        }
        System.out.println("Does "+N1+ " "+V1+ " "+N2+" "+V2+" "+N1+" have the value true(t/T) or false(f/F)?");
        //Collect the user input
        if(myScanner.hasNext){
            char answer = myScanner.next().charAt(0);//collect the user input
                switch(answer){
                    case "t":
                    case "T":
                    if(N1.equals("false")&&N2.equals("true")&&V1.equals("&&")&&V1.equals("&&")){
                        System.out.println("You are correct");
                    }    
                }
        }
        
    }
    
}