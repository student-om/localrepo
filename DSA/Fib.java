class Solution {
    public int fib(int n) {
        int a=0;
        int b=1,c=0;
        int counter = 1;
        if(n==0){
            return a;
        }
        if(n==1){
            return b;
        }
        while(counter<n){
           c=a+b;
           a=b;
           b=c; 
           counter++;
        }
        return b;
    }

    public static void main(String args[]){
        Solution s = new Solution();
        int a = s.fib(4);
        System.out.println(a);
    }
}