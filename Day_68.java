/*node class of the linked list
class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
}

*/

class Solution {
    public static Node reverseKGroup(Node head, int k) {
        // code here
        if(head==null || k<=1){
            return head;
        }
      Node dummy = new Node(0);
      dummy.next= head;
      Node prevTail= dummy;
      while(true){
          Node kth= getKthNode(prevTail,k);
          if(kth==null){
              if(prevTail.next==null){
                  break;
              }
              Node currStart= prevTail.next;
              Node prev= null;
              Node curr= currStart;
              while(curr!=null){
                  Node temp = curr.next;
                  curr.next=prev;
                  prev= curr;
                  curr= temp;
              }
              prevTail.next= prev;
              break;
          }
          Node gNext= kth.next;
          Node prev=kth.next;
          Node curr= prevTail.next;
          while(curr!=gNext){
              Node temp=curr.next;
              curr.next= prev;
              prev= curr;
              curr= temp;
          }
          Node temp_old_head= prevTail.next;
          prevTail.next= kth;
          prevTail=temp_old_head;
      }
      return dummy.next;
}
    public static Node getKthNode(Node curr, int k){
        Node chacha=curr;
        for(int i=0;i<k;i++){
            if(chacha == null || chacha.next== null){
                return null;
            }
            chacha = chacha.next;
        }
        return chacha;
    }

}
