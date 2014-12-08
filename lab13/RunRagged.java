//Jason Smits
//CSE 002
//lab13- Arrays that run you ragged
import java.util.Random;
import java.util.Arrays;

public class RunRagged{
    public static void main(String [] args){
        int [][] array = new int[5][];
        array[0]= new int[5];
        array[1]= new int[8];
        array[2]= new int[11];
        array[3]= new int[14];
        array[4]= new int[17];
        for(int n=0; n<=4; n++){
            for(int m=0; m<array[n].length; m++){
                array[n][m] = (int)(Math.random()*40);
            }
        }
        //for(i=0; i<5; i++){
            //for(j=0; j<array[i][].length; j++){
                System.out.println("The array before sorting");
                System.out.println(Arrays.deepToString(array));
            //}
        //}
        int [][] orderedArray = new int[5][];
        orderedArray[0]= new int[5];
        orderedArray[1]= new int[8];
        orderedArray[2]= new int[11];
        orderedArray[3]= new int[14];
        orderedArray[4]= new int[17];
        int k;
        int n;
        int holder;
        //for(n=0; n<array.length; n++){
            for(int i=0; i<array[0].length; i++){
            array[0][i];
            for(k=i-1; (k>=0)&&(array[0][i]<holder); k--){
               array[0][k+1] = array[0][k];
                
            }
            
           array[0][k+1] = holder;    
        }
         System.out.println("The array after sorting");
         System.out.println(Arrays.deepToString(array));
        
    }
}