class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if(k <=1 )
            return 0;
        int start=0,end=0,count = 0,product=1;
        for( end = 0 ; end <nums.length ;end++){
             product = product *nums[end];
            while(product >= k){
                product=product/nums[start];
                start++;
            }
            count = count + end-start+1;
        }
        return count;
    }
}
