class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        
        Arrays.sort(nums);
       for(int i = 0; i < nums.length-2;i++){
            if(i == 0 || nums[i] != nums[i-1]){
            int begin = i+1,last= nums.length-1;
            while(begin < last){
                int sum = nums[i]+nums[begin]+nums[last];
                if(sum == 0){
                    result.add(Arrays.asList(nums[i],nums[begin],nums[last]));
                    while(begin < last && nums[last] == nums[last-1])
                        last--;
                    while(begin < last && nums[begin] == nums[begin+1])
                        begin++;
                    last--;
                    begin++;
                }
                else if(sum > 0)      
                        last--;
                else 
                    begin++;      
            }
        }
    }
        return result;
    }
}
