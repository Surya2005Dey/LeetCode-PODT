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
class Solution {
    public int pairSum(ListNode head) {
        ArrayList<Integer> numbers = new ArrayList<>();
        ListNode temp=head;
        while(temp!= null){
            numbers.add(temp.val);
            temp=temp.next;
        }
        int n=numbers.size();
        int res=0;
        for(int i=0;i<n;i++){
            int sum= numbers.get(i)+numbers.get(n-1-i);
            res=Math.max(res, sum);
        }
        return res;
    }
}
//done


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
// class Solution {
//     public int pairSum(ListNode head) {
//          Stack<Integer> st = new Stack<>();
//         ListNode temp=head;
//         while(temp!= null){
//             st.push(temp.val);
//             temp=temp.next;
//         }
//         int n = st.size();
//         int res=0;
//         ListNode tem=head;
//         for(int i=0;i<n/2;i++){
//             int sum= tem.val +st.peek();
//             res=Math.max(res, sum);
//             tem=tem.next;
//             st.pop();
//         }
//         return res;
//     }
// }
//done

