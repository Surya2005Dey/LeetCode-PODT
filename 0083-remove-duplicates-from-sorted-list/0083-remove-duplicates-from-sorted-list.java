/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

 //USING TWO POINTER

class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null||head.next==null) return head;
        ListNode temp=head.next;
        ListNode first=head;

        while(temp!=null){
            if(first.val==temp.val){
                first.next=temp.next;
                temp=temp.next;
            }else{
                first=temp;
                temp=temp.next;
                
            }

        }
        return head;
    }
}

//USING ONE POINTER

// class Solution {
//     public ListNode deleteDuplicates(ListNode head) {
//         if (head == null) return null;
        
//         ListNode current = head;
//         while (current != null && current.next != null) {
//             if (current.val == current.next.val) {
//                 current.next = current.next.next;
//             } else {
//                 current = current.next;
//             }
//         }
//         return head;
//     }
// }
