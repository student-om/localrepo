// The majority element is the element that appears more than ⌊n / 2⌋ 
//times. You may assume that the majority element always exists in the array.
//
 

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


//best approach ->
/*public int majorityElement(int[] nums) {
    int count = 0;
    int candidate = 0;
    
    for (int num : nums) {
        if (count == 0) {
            candidate = num;
        }
        
        if (num == candidate) {
            count++;
        } else {
            count--;
        }
    }
    
    return candidate;
}




Given array: {1, 1, 1, 1, 2, 2, 2} for 1st element-> candidate = 1;b/c initially count=0
 4 times 1,3 times 2 , for (4) 1's  count is 4 ,for next 2's count = 4-3 = 1 !=0 so candidate value will not changed , still 1 and 1 is returned
Iteration through the array:
First element (num = 1):

    Since count is 0, set candidate to 1.
    Increment count to 1.

Second element (num = 1):

    num equals candidate, so increment count to 2.

Third element (num = 1):

    num equals candidate, so increment count to 3.

Fourth element (num = 1):

    num equals candidate, so increment count to 4.
    Now, count is equal to the number of times candidate (1) has appeared consecutively.

Fifth element (num = 2):

    num does not equal candidate, so decrement count to 3.

Sixth element (num = 2):

    num does not equal candidate, so decrement count to 2.

Seventh element (num = 2):

    num does not equal candidate, so decrement count to 1.
*/

