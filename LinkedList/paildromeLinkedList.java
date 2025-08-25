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
    public boolean isPalindrome(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while (fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode secondHalf=reverse(slow);
        ListNode firsthalf=head;
        ListNode check=secondHalf;
        while(check!=null){
            if(firsthalf.val!=check.val){
                return false;
            }
            firsthalf=firsthalf.next;
            check=check.next;
        }
        return true;
        
    }
    private static ListNode reverse(ListNode head){
        ListNode prev=null;
        ListNode curr=head;
        while (curr!=null){
            ListNode nextNode=curr.next;
            curr.next=prev;
            prev=curr;
            curr=nextNode;
        }
        return prev;
    }
    
} 
//or
 public boolean isPalindrome(ListNode head){
    Stack<Integer> stack=new Stack<Integer>();
    Listnode temp=head;
    while (temp!=null){
        stack.push(temp.val);
        temp=temp.next;
    }
    temp=head;
    while (temp!=null){
        if (temp.val!=stack.pop()){
            return false;
        }
    }
    return true;
 }