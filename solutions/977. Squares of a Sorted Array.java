class Solution {
    public int[] sortedSquares(int[] A) {
        // for(int i = 0; i < A.length;i++){
        //     A[i] = A[i] *A[i];
        // }
        // Arrays.sort(A);
        // return A;
        int start = 0;
        int end = A.length-1;
        int index = A.length-1;
        int ans[] = new int[A.length];
        while(start <= end){
            int power1 = A[start] * A[start];
            int power2 = A[end] * A[end];
            if(power2>power1){
                ans[index--] = power2;
                end--;
            }
            else{
                ans[index--] = power1;
                start++;
            }
        }
        return ans;
    }
}
