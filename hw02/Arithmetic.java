//Jason Smits
//hw02
//Arithmetic Java
//The given method for printing at most two digits is imperfect because it will print no more than two significant digits.

//define the class
public class Arithmetic{
    
    //add a main method
    public static void main(String[] args){
        //intitilze input variablees
        //number of pairs of socks
        int nSocks=3;
        //cost per pair of socks
        double sockCost$=2.58;
        //number of drinking glasses
        int nGlasses=6;
        //cost of the drinking glasses
        double glassCost$=2.29;
        //Number of boxes of envelopes
        int nEnvelopes=1;
        //cost of each box of envelopes
        double envelopeCost$=3.25;
        //sales tax percentage
        double taxPercent=.06;
        //define variables to be solved
        //socks
        double totalSockCost$;
        double totalSockTax$;
        double totalSockTaxCost$;
        //glass
        double totalGlassCost$;
        double totalGlassTax$;
        double totalGlassTaxCost$;
        //envelope
        double totalEnvelopeCost$;
        double totalEnvelopeTax$;
        double totalEnvelopeTaxCost$;
        //calculate the variables
        //calculate the total sock cost
        totalSockCost$=(nSocks*sockCost$);
        totalSockTax$=(((int)(nSocks*sockCost$)*.06)*100)/100.0;
        totalSockTaxCost$=(((int)(totalSockCost$+totalSockTax$))*100)/100.0;
        //calculate the total glass cost
        totalGlassCost$=(((int)(nGlasses*glassCost$+(nGlasses*glassCost$)*.06))*100)/10;
        totalGlassTax$=(((int)(nGlasses*glassCost$)*.06)*100)/100.0;
        totalGlassTaxCost$=(((int)(totalGlassCost$+totalGlassTax$))*100)/100.0;
        //calculate the total cost of envelopes(postage included)
        totalEnvelopeCost$=(((int)(nEnvelopes*envelopeCost$+(nEnvelopes*envelopeCost$)*.06))*100)/100.0;
        totalEnvelopeTax$=(((int)(nEnvelopes*envelopeCost$)*.06)*100)/100.0;
        totalEnvelopeTaxCost$=((int)(totalEnvelopeCost$+totalEnvelopeTax$)*100)/100.0;
        
        
        //print results
        System.out.println(" The cost of the socks is $"+totalSockCost$);
        System.out.println(" The cost of the tax on the socks is $"+totalSockTax$);
        System.out.println(" The total cost of the socks including tax $"+totalSockTaxCost$);
        System.out.println(" The cost of the glasses is $"+totalGlassCost$);
        System.out.println(" The cost of the tax on the glasses is $"+totalGlassTax$);
        System.out.println(" The total cost of the glasses including tax $"+totalGlassTaxCost$);
        System.out.println(" The cost of the envelopes is $"+totalEnvelopeCost$);
        System.out.println(" The cost of the tax on the envelopes is $"+totalEnvelopeTax$);
        System.out.println(" The total cost of the envelopes including tax $"+totalEnvelopeTaxCost$);
        System.out.println("The total cost for all the purchases(pretax) is $"+(totalSockCost$+totalEnvelopeCost$+totalGlassCost$));
        System.out.println("The total cost for the entire purchase with tax is $"+(totalSockTaxCost$+totalEnvelopeTaxCost$+totalGlassTaxCost$));
        
        
    }
    
}