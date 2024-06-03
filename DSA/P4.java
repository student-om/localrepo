/*Input: N = 3
Output: 1 2
Explanation: The first factorial number is 
1 which is less than equal to N. The second 
number is 2 which is less than equal to N,
but the third factorial number is 6 which 
is greater than N. So we print only 1 and 2. */
import java.util.Scanner;
class Recursion{
            int fact=1;
        
    public void factorialNumbers(int n){
        int a=1;
             if(n>=1){
               boolean flag=true;
                while(fact<=n){
                    fact = fact * (a);
                    if(fact<=n){
                        flag=true;
                    }
                    else{
                        flag=false;
                    }
                    if(flag==true){
                   System.out.println(fact);
                    }
                    a++;
                }
             }
             else{
                System.out.println("cannot given the input");
             }
    }
    public static void main(String args[]){
        Recursion r = new Recursion();
        r.factorialNumbers(24);
                         

    }
}
