class Solution {
    public int findDuplicate(int[] nums) {
       //tortoise approach
        int tortoise = nums[0];
        int rabbit = nums[0];
        tortoise = nums[tortoise];
        rabbit = nums[nums[rabbit]];
        while(tortoise!=rabbit){
            tortoise = nums[tortoise];
            rabbit = nums[nums[rabbit]];
        }
        
        int apointer = nums[0];
        int bpointer = tortoise; // or rabbit anything is same pointed
        while(apointer != bpointer){
            apointer = nums[apointer];
            bpointer = nums[bpointer];
        }
        return bpointer;
            
        
       
    }
}
