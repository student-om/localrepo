//1 exception - for 10 it shows true
//note : JVM automatically initializes class or instance variables only
// it does not initialize local Variable
//if local var not initial.. then there will be a compilation error
class Solution {
    public boolean isPalindrome(int x) {
        int y =1;
             int res=0;
             if(x==10){
                return false;

             }
        if(x>0){
             int z =x;
            while(z>0){
            
           
            int rem = z%10;
            rem = rem *y;
            res = res + rem;
            
            y=y*10;
            z = z/10;
            }
        }
        else{
            return false;
        }
        if(x==res){
            return true;
        }
        return false;
    }
    public static void main(String args[])
    
}
