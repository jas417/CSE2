//Jason Smits
//hw06
//Getting Loopy

import java.util.Scanner;

public class Roulette{

    public static void main(String[] args){
       int nSelect = 23;
       int counter = 0;
       int counter2 = 0;
       

       int totalTotal=0;
       int finalTotal=0;
       int nProfits=0;
       int nLoss=0;
       while(counter2<1000){
           counter2++;
           counter = 0;
           int total = 0;
            while(counter<100){
                counter++;
                int outcome = (int)(Math.random()*38);
                if(outcome==nSelect){
                    total= total +36;
                };
               
       }
       totalTotal = total-100;
      if(totalTotal>0){
          nProfits=nProfits+1;
      }
      if (totalTotal == -100){
          nLoss=nLoss+1;
      };
      finalTotal = finalTotal+totalTotal;
      //System.out.println(+totalTotal);
       }
       System.out.println("the total is $"+finalTotal);
       System.out.println("The total number of total losses was "+nLoss);
       System.out.println("The total number of profitable rounds was "+nProfits);

    }
}
