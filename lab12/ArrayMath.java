//Jason Smits
//CSE 002
//lab12-ArrayMath

public class ArrayMath{
  public static void main(String [] arg){
    double x[]={2.3, 3, 4, -2.1, 82, 23},
      y[]={2.3, 3, 4, -2.1, 82, 23},
      z[]={2.3, 13, 14},
      w[]={2.3, 13, 14, 12}, 
      v[],
      u[]={2.3, 12, 14};
    v=addArrays(x,y);
    System.out.println(display(x)+" \n  + " + display(y) + "\n   = " +display(v));
    System.out.println(display(x)+" \n  + " + display(z) + "\n   = " 
                         +display(addArrays(x,z)));
    System.out.println("It is " + equals(x,y)+" that "+display(x)+
                       " == "+display(y));
    System.out.println("It is " + equals(z,w)+" that "+display(z)+
                       " == "+display(w));
    System.out.println("It is " + equals(u,z)+" that "+display(u)+
                       " == "+display(z));

  }
  
  public static boolean equals(double [] x, double [] y){ //compare the lengths and content of arrays x and y
      if(x.length == y.length){ 
          for(int n=0; n<x.length; n++){// checks if there are any anomalies between the two arrays
              if(x[n] != y[n]){
                  return false;//returns false when there is no anomoly
              }
          }
          return true;//return true for equal lengths and no anomolies are found
      }
      else{
          return false; // return false otherwise
      }
  }
  
  public static double [] addArrays(double [] x, double [] y){//method for adding the arrays
      //double total[];
      if(x.length>=y.length){ //if the x array is larger than or equal to the y array
          double yExt[] = new double[x.length];//creates an array to extend the shorter array
          for(int n=0; n<y.length; n++){//adds the values of the shorter array into the new array
              yExt[n] = y[n];
          } 
          for(int n=y.length+1; n<yExt.length; n++){//adds zeros to any empty slots in the new array
              yExt[n] = 0;
          }
          double total [] = new double[x.length]; //creates a new array to hold the added arrays
          for(int n=0; n<x.length; n++){ //adds the arrays, putting the added value into the 'total' array
              total[n] = x[n] + yExt[n]; 
             }
          return total; //returns the 'total' array.
      }
      else{//iff the y array is larger than the x array
           double xExt[] = new double[y.length];//creates array to extend the shorter array 
          for(int n=0; n<x.length; n++){//adds the vaues of the shoter array into the new array
              xExt[n] = x[n];
          } 
          for(int n=x.length+1; n<xExt.length; n++){//puts zeros into the empty slots in the new array
              xExt[n] = 0;
          }
          double total [] = new double[y.length];//creates an array for the values when the arrays are added
          for(int m=0; m<y.length; m++){//adds the arrays, putting the addded value into the 'total array'
              total[m] = xExt[m] + y[m];
              }
              return total;//returns the total
      }
  }
  
  public static String display(double [] x){
    String out="{";
    for(int j=0;j<x.length;j++){
      if(j>0){
        out+=", ";
      }
      out+=x[j];
    }
    return out+"}";
  }
}

//output:

/*OUTPUT: {2.3, 3.0, 4.0, -2.1, 82.0, 23.0} 
  + {2.3, 3.0, 4.0, -2.1, 82.0, 23.0}
   = {4.6, 6.0, 8.0, -4.2, 164.0, 46.0}
{2.3, 3.0, 4.0, -2.1, 82.0, 23.0} 
  + {2.3, 13.0, 14.0}
   = {4.6, 16.0, 18.0, -2.1, 82.0, 23.0}
It is true that {2.3, 3.0, 4.0, -2.1, 82.0, 23.0}
   == {2.3, 3.0, 4.0, -2.1, 82.0, 23.0}
It is false that {2.3, 13.0, 14.0}
   == {2.3, 13.0, 14.0, 12.0}
It is false that {2.3, 12.0, 14.0}
   == {2.3, 13.0, 14.0}*/


