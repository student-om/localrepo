//to print from N to 1 Using Recursion;

class Recursion{
    public void printNos(int n){
        if(n==1){
            System.out.println(n);

            return;
        }
        else if(n<1){
            System.out.println("No b/w 1 to 1000");
        }
        else{
            System.out.println(n);
            printNos(n-1);
        }
    }
    public static void main(String args[]){
        Recursion r = new Recursion();
        r.printNos(1000);
    }
}
