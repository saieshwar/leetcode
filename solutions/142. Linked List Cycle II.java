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
        if(head==null)
            return null;
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
