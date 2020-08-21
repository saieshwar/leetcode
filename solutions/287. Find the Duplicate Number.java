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
        
        
        
//         //Another approach by knowledge center
//         int maxidx = 0;
//         int curr_max = 0;
//         int n = nums.length;
//         for(int i = 0; i < nums.length;i++){
//             int id = nums[i]%n;//going tp tje indewx firectly by moduling by length
//             nums[id]+=n; //adding length to that index based element
//         }
//         //now find max element 
//         for(int i = 0 ; i < n;i++){
//             if(nums[i]>curr_max){
//                 curr_max = nums[i];
//                 maxidx = i;
//             }
//             nums[i]%=5;
//         }
        
//         return maxidx;
    }
}
