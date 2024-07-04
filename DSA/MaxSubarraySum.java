class MaxSubarraySum{
    public static void main(String[] args) {
       int[] a = {-2,1,-3,4,-1,2,1,-5,4};
//{-2,-3,3,4,5,-2,7,-1,-2}  {-2,-3}
MaxSubarraySum t = new MaxSubarraySum();
    int c = t.maxSubarraySum(a);
 System.out.println(c);


}

public int maxSubarraySum(int[] a){
    int ans = Integer.MIN_VALUE;
                                        //-2 1 -3 4 -1 2 1 -5 4
                                        //-1 0 1 2 3 4 5 6 <- ans is 6(maximum sum)
    for(int i=0;i<a.length;i++){
        int sum=0;                 
        for(int j=i;j<a.length;j++){
            sum+=a[j];
            ans = Math.max(sum,ans);
        }
       
    }
    return ans;
}

}