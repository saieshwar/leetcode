class Solution {
    public int longestOnes(int[] A, int k) {
        int start = 0;
        //int end = 0;
        int max = Integer.MIN_VALUE;
        int zeroCount=0;
        for(int end = 0 ;end<A.length;end++){
            if(A[end]==0)
                zeroCount++;
            while(zeroCount>k){
                if(A[start]==0)
                    zeroCount--;
                start++;
            }
            max = Math.max(max,end-start+1);
        }
    
    return max;
    }
}
