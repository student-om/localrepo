// The majority element is the element that appears more than ⌊n / 2⌋ 
//times. You may assume that the majority element always exists in the array.

 

// Example 1:

// Input: nums = [3,2,3]
// Output: 3

// Example 2:

// Input: nums = [2,2,1,1,1,2,2]
// Output: 2





class Solution {
    public int majorityElement(int[] nums) {
        double k = (double)nums.length/2;
        int n = (int)Math.ceil(k);
        int flag = 0;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    flag++;
                }
            }
            if(flag>=n){
                return  nums[i];
               
            }
            else{
                flag=0;
            }
        }
        return 0;
    }
}

