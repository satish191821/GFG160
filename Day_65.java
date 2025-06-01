// function Template for Java

/* linked list node class:

class Node {
    int data;
    Node next;
    Node(int value) {
        this.value = value;
    }
 

*/
// reverse a LL 
class Solution {
    Node reverseList(Node head) {
        
       Node curr=head;
       Node prev=null;
       Node next;
       while(curr!=null){
           next=curr.next;
           curr.next=prev;
           prev=curr;
           curr=next;
       }
       Node revHead=prev;
       return revHead;
    }
}      

