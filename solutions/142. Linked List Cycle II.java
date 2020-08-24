/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        // ListNode slow = head;
        // ListNode fast = head;
//         try{
//         do{ 
//             slow= slow.next;
//             fast = fast.next.next;
//         }while(fast!=slow);  
//         slow = head;
//         while(slow!=fast){
//             slow = slow.next;
//             fast = fast.next;
//         }
// }
// catch(NullPointerException e) {
//             return null;
// }
        
//         return fast;
        
//     }
        //another approach
        ListNode hare = head;
        ListNode tortoise = head;
        ListNode start =head;
        while(hare!=null && hare.next!=null) {
            tortoise = tortoise.next;
            hare = hare.next.next;
            if(tortoise==hare) {
                 // there is a cycle, find the start of the loop
                while(start != tortoise) {
                    start = start.next;
                    tortoise = tortoise.next;
                }
                return start;
            }
        }
        return null;
}
}
​
