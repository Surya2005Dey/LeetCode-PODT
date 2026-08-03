/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode tempA=headA;
        ListNode tempB=headB;

        while(tempA!=tempB){
            if(tempA==null) tempA=headB;
            else tempA=tempA.next;

            if(tempB==null) tempB=headA;
            else tempB=tempB.next;
        }
        return tempA;
    }
}

//same rule but using diff operation

// public class Solution {
//     public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

//         ListNode p1 = headA;
//         ListNode p2 = headB;

//         while (p1 != p2) {
//             p1 = (p1 == null) ? headB : p1.next;
//             p2 = (p2 == null) ? headA : p2.next;
//         }

//         return p1;
//     }
// }



// public class Solution {
//     public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
//         Stack<ListNode> stackA=new Stack<>();
//         Stack<ListNode> stackB=new Stack<>();
//         ListNode tempA=headA;
//         ListNode tempB=headB;
//         while(tempA!=null){
//             stackA.push(tempA);
//             tempA=tempA.next;
//         }
//         while(tempB!=null){
//             stackB.push(tempB);
//             tempB=tempB.next;
//         }
//         ListNode tem=null;
//         while(!stackA.isEmpty() && !stackB.isEmpty()){
//             ListNode a=stackA.pop();
//             ListNode b=stackB.pop();
//             if(a!=b) return tem;
//             tem=a;
//         }
//         return tem;
//     }
// }

// public class Solution {
//     public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
//         Stack<ListNode> stackA = new Stack<>();
//         Stack<ListNode> stackB = new Stack<>();

//         for (; headA != null; headA = headA.next)
//             stackA.push(headA);

//         for (; headB != null; headB = headB.next)
//             stackB.push(headB);

//         ListNode ans = null;
//         while (!stackA.isEmpty() && !stackB.isEmpty()
//                 && stackA.peek() == stackB.peek()) {
//             ans = stackA.pop();
//             stackB.pop();
//         }

//         return ans;
//     }
// }



//done