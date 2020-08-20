/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
//         ListNode list = head;
         
//          while(list!=null) {
//              if(list.next==null)
//                  break;
//           if (list.val == list.next.val) 
//               list.next = list.next.next;
//              else
//              list = list.next;
             
//          }
//   return head;
        
        //two pointeer
        if(head == null || head.next == null)
            return head;
        ListNode temp = head;
        ListNode current = head.next;
        while(current!=null){
            if(current.val != temp.val){
                temp.next =  current;
                temp  = current;
            }
            current = current.next;
        }
        temp.next = current;
        return head;
    }
}
