/*linked list node
class Node {
    int data;
    Node next;
    Node random;

    Node(int x) {
        data = x;
        next = null;
        random = null;
    }
}
*/
class Solution {
    public Node cloneLinkedList(Node head) {
        if(head==null){
            return null;
        }
        Node curr= head;
        while(curr!=null){
            Node copy= new Node(curr.data);
            copy.next=curr.next;
            curr.next= copy;
            curr= copy.next;
        }
        curr=head;
        while(curr!=null){
            if(curr.random!=null){
                curr.next.random=curr.random.next;
            }
                curr=curr.next.next;
            }
            curr= head;
            Node local=new Node(0);
            Node x=local;
            while(curr!=null){
                Node y=curr.next.next;
                Node copy=curr.next;
                x.next=copy;
                x=x.next;
                curr.next=y;
                curr=y;
            }
            return local.next;
            }
        
    }



