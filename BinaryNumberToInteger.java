/**
 * Convert Binary Number in a Linked List to Integer
 *
 * Given head which is a reference node to a singly-linked list. The value of each node in the linked list is either 0 or 1. The linked list holds the binary representation of a number.
 * Return the decimal value of the number in the linked list.
 * }
 */

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
    public int getDecimalValue(ListNode head) {
        int sum=0;
        Stack<Integer> stack=new Stack<>();
        ListNode ptr=head;
        while(ptr!=null){
            stack.push(ptr.val);
            ptr=ptr.next;
        }
        int i=0;
        while(!stack.empty()){
            sum+=stack.pop()*Math.pow(2,i++);
        }
        return sum;
    }
}