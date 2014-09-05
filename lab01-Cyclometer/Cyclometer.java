//Jason Smits
//Lab-02
//Cyclometer progam

//Define the class
public class Cyclometer {
    //main method
    public static void main(String[] args){
      int secsTrip1=480; //seconds for trip one
      int secsTrip2=3220; //seconds for trip two
      int countsTrip1=1561; // rotation count trip 1
      int countsTrip2=9037; //rotation count trip 2
      int wheelDiameter=27; //diameter of the wheel
      double pi=3.14159; // pi constant
      int feetPerMile=5280; //number of feet in a mile
      int inchesPerFoot=12; //number of inches in a foot
      int secondsPerMinute=60; // 
      double distanceTrip1, distanceTrip2, totalDistance; //
        System.out.println("Trip 1 took "+ (secsTrip1/secondsPerMinute)+" minutes and had "+countsTrip1+" counts."); 
        System.out.println("Trip 2 took "+(secsTrip2/secondsPerMinute)+" minutes and had "+countsTrip2+" counts.");
        //run the calculations; store the values. Document your //calculation here. What are you calculating?
        //
        //
        distanceTrip1=countsTrip1*wheelDiameter*pi;
        // Above gives distance in inches
        //(for each count, a rotation of the wheel travels
        //the diameter in inches times PI) 
        distanceTrip1/=inchesPerFoot*feetPerMile; // Gives distance in miles 
        distanceTrip2=countsTrip2*wheelDiameter*pi/inchesPerFoot/feetPerMile;
        totalDistance=distanceTrip1+distanceTrip1;
        //print out the output data
        System.out.println("Trip 1 was "+distanceTrip1+" miles");
        System.out.println("Trip 2 was "+distanceTrip2+" miles"); 
        System.out.println("The total distance was "+totalDistance+" miles");
    }//end of main method 
}//end of class

 