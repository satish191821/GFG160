class Solution {
    
    static Node reverse(Node head){
        Node prev=null;
        Node curr=head;
        Node next;
        while(curr!=null){
            next= curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
    static Node addTwoLists(Node num1, Node num2) {
       num1=reverse(num1);
        num2=reverse(num2);
        Node dummy=new Node(0);
        Node tail=dummy;
        int carry=0;
         while(num1!=null || num2!=null || carry!=0){
             int sum = carry;
             if(num1!=null){
                 sum=sum+ num1.data;
                 num1=num1.next;
             }
             if(num2!=null){
                 sum += num2.data;
                 num2=num2.next;
             }
             carry=sum/10;
             tail.next = new Node(sum%10);
             tail=tail.next;
         }
         Node ans= reverse(dummy.next);
         while(ans!=null && ans.data==0 && ans.next!=null){
             ans = ans.next;
         }
         return ans;
    }
}
