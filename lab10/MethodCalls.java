//Jason Smits
//lab10
//MethodCalls


public class MethodCalls{
    public static int addDigit(int a, int d){
        if(a<0){
        a=a*-1;
        String I = Integer.toString(d);
        String f = I+a;
        int c = Integer.parseInt(f);
        return -c;  
        }
        else{
        String I = Integer.toString(d);
        String f = I+a;
        int c = Integer.parseInt(f);
        return c;
        }
    }
    
    public static int join(int a, int d){
        if(a<0){
            a=a*-1;
            d=d*-1;
            String I = Integer.toString(d);
            String f = a+I;
            int c = Integer.parseInt(f);
            return c; 
        }
        else{
            String I = Integer.toString(d);
            String f = a+I;
            int c = Integer.parseInt(f);
            return c;
        }
    }
    
    public static void main(String []  arg){
        int a=784,b=22,c;
        c=addDigit(a,3);
        System.out.println("Add 3 to "+a+" to get "+c);
        c=addDigit(addDigit(c,4),5);
        System.out.println("Add 3, 4, and 5 to "+a+" to get "+c);
        System.out.println("Add 3 to -98 to get: "+addDigit(-98,3));
        c=join(a,b);
        System.out.println("Join "+a+" to "+b+" to get "+c);
        System.out.println("Join 87, 42, and 83 to get "+join(87, join(42,83)));
        System.out.println("Join -9 and -90 to get "+join(-9,-90));
    }
    
}  
/*
Add 3 to 784 to get 3784
Add 3, 4, and 5 to 784 to get 543784
Add 3 to -98 to get: -398
Join 784 to 22 to get 78422
Join 87, 42, and 83 to get 874283
Join -9 and -90 to get 990
*/
