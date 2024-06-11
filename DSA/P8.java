//to rotate the array right side bt k times =>

// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Arrays;
class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        int[] arr = {1,2,3,4,5};
        Solution s = new Solution();
        s.rotate(arr,3); // o/p-> [3,4,5,1,2];
         System.out.println(Arrays.toString(arr));

    }
}
class Solution {
    public void rotate(int[] nums, int k) {
        while(k>0){
            int ptr = nums[nums.length-1];
            for(int i=nums.length-1;i>0;i--){
                nums[i]=nums[i-1];
              
            }
              nums[0]=ptr;
            k--;
        }
    }
}
