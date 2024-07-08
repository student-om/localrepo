//leetcode Q.1823
import java.util.ArrayList;
class Solution {
    public int findTheWinner(int n, int k) {
        ArrayList<Integer> list = new ArrayList<Integer>(n);
        int a = 1;
        int pointer = 0;
        
         for(int i=0;i<n;i++){
                list.add(a);
                a++;
            }
        while(n>1){
             pointer =  (pointer+k-1)%list.size();
            list.remove(pointer);
           //size automaticatically kam ho jayegi.
            n--;

        }
        return list.get(0);
    }

    public static void main(String[] args) {
        
        ArrayList<Integer> list = new ArrayList<Integer>();
       

     
       Solution s = new Solution();
       int a = s.findTheWinner(5, 2);
        System.out.println(a);
    }
}
