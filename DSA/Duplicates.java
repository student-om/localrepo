class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        Solution s = new Solution();
        int[] arr = {0,0,1,1,1,2,2,3,3};
        int r = s.removeDuplicates(arr);
        System.out.println(r);//r is 4 i.e 0 1 2 3 _ _ _ _ _(these we dont care)
    }
}

class Solution {
    public int removeDuplicates(int[] nums) {
      
    
        int j=1;

	for(int i=1;i<nums.length;i++){

	 if(nums[i]!=nums[i-1]){

	 nums[j] = nums[i];

	 j++;

	 }

	}
	return j;
    }
}