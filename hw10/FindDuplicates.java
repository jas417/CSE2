//Jason Smits
//CSE 002
//14 November 2014

import java.util.Scanner;
public class FindDuplicates{
  public static void main(String [] arg){
    Scanner scan=new Scanner(System.in);
    int num[]=new int[10];
    String answer="";
    do{
      System.out.print("Enter 10 ints- ");
      for(int j=0;j<10;j++){
        num[j]=scan.nextInt();
      }
      String out="The array ";
      out+=listArray(num); //return a string of the form "{2, 3, -9}"   
      if(hasDups(num)){
        out+="has ";
      }
      else{
        out+="does not have ";
      }
      out+="duplicates.";
      System.out.println(out);
      out="The array ";
      out+=listArray(num);    
      if(exactlyOneDup(num)){
        out+="has ";
      }
      else{
        out+="does not have ";
      }
      out+="exactly one duplicate.";
      System.out.println(out);
System.out.print("Go again? Enter 'y' or 'Y', anything else to quit- ");
      answer=scan.next();
    }while(answer.equals("Y") || answer.equals("y"));
  }

  public static String listArray(int num[]){
    String out="{";
    for(int j=0;j<num.length;j++){
      if(j>0){
        out+=", ";
      }
      out+=num[j];
    }
    out+="} ";
    return out;
  }
  
  public static boolean hasDups(int num[]){
    for(int count = 0; count<10; count ++){
      for(int count1 = count+1; count1<10; count1++){
        if(num[count] == num[count1]){
          return true;
        }
      }
    }
    return false;

}

public static boolean exactlyOneDup(int num[]){
  int n = 0;
   for(int count = 0; count<10; count ++){
      for(int count1 = count+1; count1<10; count1++){
        if(num[count] == num[count1]){
          n++;
        }
      }
    }
    if(n>1){
    return false;
    }
    else if(n==1){
      return true;
    }
    else{
      return false;
    }
}
}