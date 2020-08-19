class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
       //List<Integer> list = new ArrayList<>();
        int[] results = new int[nums.length-k+1];
        int start = 0;
        int index = 0;
        
        int max = Integer.MIN_VALUE;
        for(int i = 0; i<k;i++){
            max = Math.max(max,nums[i]);
        }
        results[index++] = max;
        
        for(int end = k; end < nums.length;end++){
            start++;
            max = maximum(start,end,nums);
             results[index++] = max;
        }
        // for(int end = k; end < nums.length;end++){
        //     start++;
        //     max = Math.max(max,nums[end]);
        //     list.add(max);
        // }
       //return list.stream().mapToInt(i->i).toArray();
        return results;
    }
    private int maximum(int begin,int last,int[] arr){
        int max1 = Integer.MIN_VALUE;
        while(begin<=last){
            max1 = Math.max(max1,arr[begin]);
            begin++;
        }
    return max1;
    }
}
​
