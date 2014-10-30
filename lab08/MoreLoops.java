//Jason Smits
//CSE 002
//lab08- MoreLoops

import java.util.Scanner;
public class MoreLoops{
	public static void main(String[] arg){
    Scanner scan=new Scanner(System.in);
    int n=0;

  /*  System.out.print("Enter an int- ");
    while(!scan.hasNextInt()){
    	scan.next(); //get rid of the junk entered by user
    	System.out.print("You did not enter an int; try again- ");
    }*/
    
    System.out.println("Enter an integer- ");
    do{
        scan.next();//get rid of the junk entered by the user
        System.out.println("You did not enter an int, please try again- ");
    }while(!scan.hasNextInt());
    n= scan.nextInt();
    /*for(int j=0;j<n && j<40;j++){
    	for(int k=0;k<j+1;k++){
   	 System.out.print('*');
    	}
    	System.out.println();*/
    int j = 0;
    while(j<n && j<40){
        j++;
        int k=0;
        while(k<j+1){
        System.out.println("*");
        k++;
    }
    System.out.println();
    }
        int k=4;

    /*do{
    	System.out.println("k="+k);
    	k++;
    }
     	while(k<4);*/
     while(k<=4){
         System.out.println("k="+k);
         k++;
     }
     /*int count=0;
    	while(true){
    	switch(n){
    	default: System.out.println(n + " is > 5 or <1");
   	 break;
    	case 1:
    	case 2: System.out.print("Case 2 ");
   	 continue;
    	case 3: break;
    	case 4: System.out.println("Case 4");
    	case 5: System.out.println("Case 5");
   	 break;
    	}
    	count++;
    	if(count>10)
   	 break;*/
   	 for(int count=1;count>0 && count<=n;count++){
   	 if(count==3){
   	     break;
   	     }
   	else if(count==1){
   	    
   	}
   	else{
   	    System.out.println("Case "+count);
   	}
   	 }
   	     

    
    
    }
}
    

