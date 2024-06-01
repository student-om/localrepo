import java.util.Scanner;
//to find GCD and LCM of two Numbers with complexity O(log(min(A,B)));
class GCDandLCM{
    int gcd;
    int lcm;
 public void lcmandgcd(){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    sc.nextLine();
    int b =  sc.nextInt();
    int c = a>b?a:b;
    int e = a>b?b:a;
    int d = a*b;
    
     for(int i=0;i<c;i+=e){ 
        try{
        if(a%i==0 && b%i==0){
            gcd = i;
        }
        }
        catch(Exception ec){}
    }
    for(int i=c;i<d;i+=c){
        if(i%a==0 && i%b==0){
            lcm =  i;
            break;
        }
    }
    System.out.println(gcd);
     System.out.println(lcm);

    
 }

 public static void main(String args[]){
    GCDandLCM g = new GCDandLCM();
    g.lcmandgcd();
 }

}