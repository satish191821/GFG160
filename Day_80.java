/*
class Node {
    int data;
    Node left, right;

    Node(int item) {
        data = item;
        left = right = null;
    }
}
*/
class Solution {
    public ArrayList<ArrayList<Integer>> levelOrder(Node root) {
        // Your code here
        ArrayList<ArrayList<Integer>> ans= new ArrayList<>();
        if(root==null){
            return ans;
        }
        Queue<Node>q= new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            ArrayList<Integer>level= new ArrayList<>();
            for(int i= q.size();i>0;i--){
                Node n= q.poll();
                level.add(n.data);
                if(n.left!=null)  q.add(n.left);
                if(n.right!=null)  q.add(n.right);
            }
            ans.add(level);
        }
        return ans;
    }
}
