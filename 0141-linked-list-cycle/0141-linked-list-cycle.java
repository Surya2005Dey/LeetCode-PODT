/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            
            if(slow==fast) return true;
        }
        return false;
    }
}



//  // Arraylist -- contains()> O(N), add> O(1) space-O(N), overall--O(n^2)
// public class Solution {
//     public boolean hasCycle(ListNode head) {
//         List<ListNode> val=new ArrayList<>();
//         ListNode temp=head;
//         while(temp!=null){
//             if(val.contains(temp)){
//                 return true;
//             }else{
//                 val.add(temp);
//                 temp=temp.next;
//             }
//         }
//         return false;
//     }
// }




// //Hashset-- contains()>> O(1), add()>> O(1), space-O(N), overall--O(n)
// public class Solution {
//     public boolean hasCycle(ListNode head) {
//         HashSet<ListNode> set = new HashSet<>();

//         while (head != null) {
//             if (set.contains(head)) {
//                 return true;
//             }

//             set.add(head);
//             head = head.next;
//         }

//         return false;
//     }
// }