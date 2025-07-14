// User function Template for Java

class Solution {
    public void isSafe(int col,int n,int[] row,boolean [] usedRow,boolean [] diag1,boolean diag2[],ArrayList<ArrayList<Integer>>res){
       if(col==n){
           ArrayList<Integer> board= new ArrayList<>();
           for(int i=0;i<n;i++){
               board.add(row[i]+1);
           }
           res.add(board);
           return;
       } 
       for(int r=0;r<n;r++){
           if(!usedRow[r] && !diag1[r+col] && !diag2[r-col+n-1]){
               row[col]=r;
               usedRow[r]=true;
               diag1[r+col]=true;
               diag2[r-col+n-1]=true;
               isSafe(col+1,n,row,usedRow,diag1,diag2,res);
               usedRow[r]=false;
               diag1[r+col]=false;
               diag2[r-col+n-1]=false;
           }
       }
    }
    public ArrayList<ArrayList<Integer>> nQueen(int n) {
        ArrayList<ArrayList<Integer>>res= new ArrayList<>();
        int row[]= new int[n];
        boolean[] usedRow= new boolean[n];
        boolean diag1[]= new boolean[2*n-1];
        boolean diag2[]= new boolean[2*n-1];
        isSafe(0,n,row,usedRow,diag1,diag2,res);
        return res;
        
    }
}
